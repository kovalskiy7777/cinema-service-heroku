package mate.academy.spring.service.impl;

import mate.academy.spring.dao.RoleDao;
import mate.academy.spring.model.Role;
import mate.academy.spring.model.enums.RoleEnum;
import mate.academy.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(RoleEnum name) {
        return roleDao.getRoleByName(name);
    }
}
