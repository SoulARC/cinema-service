package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleType(Role.RoleType.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleType(Role.RoleType.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
