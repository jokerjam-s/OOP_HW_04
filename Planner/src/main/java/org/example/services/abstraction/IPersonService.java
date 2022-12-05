package org.example.services.abstraction;

import org.example.data.abstractions.APerson;

public interface IPersonService<P extends APerson> {
    P askPerson();
}
