package io.kinguin.reactor;

import io.kinguin.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class MonoExamplesTest {

    MonoExamples sut;

    Person examplePerson;

    @BeforeEach
    void setup() {
        this.sut = new MonoExamples();
        this.examplePerson = new Person("Jacek", "Placek", "M", new Person.Address("PL", "Poznań", "60-666", "Grunwaldzka", 63));
    }

    @Test
    void getElementFromMono_returnsSingleElementFromMonoStream() {
        Person received = sut.getElementFromMono(Mono.just(examplePerson));
        Assertions.assertNotNull(received);
        Assertions.assertEquals(examplePerson, received);
    }
}