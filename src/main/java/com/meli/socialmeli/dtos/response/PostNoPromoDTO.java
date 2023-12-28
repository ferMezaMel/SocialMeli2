package com.meli.socialmeli.dtos.response;

import com.meli.socialmeli.utilities.CustomLocalDateValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.validation.Valid;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PostNoPromoDTO {
    @NotNull(message = "El  campo 'user_id' no puede estar vacío.")
    @Min(value= 1, message= "El campo 'user_id' debe ser mayor a cero")
    private Integer user_id;
    private Integer post_id;
    @NotNull(message = "El campo 'date' no puede estar vacío.")
    @CustomLocalDateValidation(message = "Fecha inválida. El formato debe ser yyyy-MM-dd")
    private String date;
    @NotNull(message = "El campo 'product' no puede estar vacío.")
    private @Valid ProductDTO product;
    @NotNull(message = "El campo 'category' no puede estar vacío.")
    private Integer category;
    @NotNull(message = "El  campo 'price' no puede estar vacío.")
    @DecimalMin(value="0", message= "El precio mínimo por producto es de 0")
    @DecimalMax(value="10000000", message= "El precio máximo por producto es de 10.000.000")
    private Double price;
}
