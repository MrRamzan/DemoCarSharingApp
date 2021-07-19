package kg.megacom.DemoCarRentApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "car_description")
public class CarDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transmission;
    private String fuel;
    private String side;
    @Column(name = "type_of_driver")
    private String typeOfDriver;
    @Column(name = "fuel_consumption")
    private Float fuelConsumption;
}
