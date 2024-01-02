package com.meli.socialmeli.controllers;

import com.meli.socialmeli.services.IProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    IProductService productService;

    @InjectMocks
    ProductController productController;

    @Test
    @DisplayName("T-0009: Verificar la corecta creación del producto. (US-0005)")

    void newPostTest (){

        //Arrange
        int userId = 1100;
        //Act

        //Assert
    }
}
