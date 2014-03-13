/*
 * Copyright [13/03/2014] [Einar Meyerson Uriarte]
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.upc.eetac.dsa.emeyerson.Ejercicio1Arboles;

public class Arbol {

	int altura;
	String nombre;

	Arbol(int altura) {

		this.altura = altura;

		System.out.println("Un arbol de " + altura + " metros");

	}

	Arbol(String nombre) {
		this.nombre = nombre;
		System.out.println("Un " + nombre);
	}

	Arbol() {
		System.out.println("Un arbol gen�rico");
	}

	Arbol(int altura, String nombre) {
		this.altura = altura;
		this.nombre = nombre;
		System.out.println("Un " + nombre + " de" + altura + " metros");
	}
}
