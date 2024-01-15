/*
* File: App.java
* Author: Szilágyi Levente
* Copyright: 2024, Szilágyi Levente
* Group: Szoft II/1/E
* Date: 2023-01-15
* Github: https://github.com/Levi8383/paclient
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class DataService {
    String url;
    Client client;

    public DataService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        return client.get(url);
    }
}
