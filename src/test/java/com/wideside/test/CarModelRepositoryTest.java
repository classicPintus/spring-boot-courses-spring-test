package com.wideside.test;

import com.wideside.test.entity.CarModel;
import com.wideside.test.repository.CarModelRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
@ActiveProfiles("test")
public class CarModelRepositoryTest {
    
    @Autowired
    private CarModelRepository carModelRepository;

    @Test
    public void testSomeMethod() {
        List<CarModel> models = carModelRepository.getModelsByManufacturer(1L);
        Assert.assertTrue(models.size() == 4);
    }
    
}
