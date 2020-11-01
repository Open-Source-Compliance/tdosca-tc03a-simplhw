/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc03a.main is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package de.fodina.tdosca.tc3;

public class Main {
  public static void main(String[] args) {
    GreetingService service = new GreetingService();
    System.out.println("de.fodina.tdosca.tc3.Main says 'hello'.");
    System.out.println("license:MIT");
    if ((args == null) || (args.length == 0)){
      service.greet();
    }
    else {
      service.greet(args[0]);
    }
    System.out.println("de.fodina.tdosca.tc3.Main says 'bye bye'");
  }
}
