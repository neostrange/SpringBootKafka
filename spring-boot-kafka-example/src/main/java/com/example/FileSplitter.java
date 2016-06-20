/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author Gary Russell
 *
 */
public class FileSplitter {

	public Iterator<String> split(final File file) throws IOException {
		return new Iterator<String>() {

			BufferedReader reader = new BufferedReader(new FileReader(file));

			@Override
			public boolean hasNext() {
				try {
					boolean ready = reader.ready();
					if (!ready) {
						reader.close();;
					}
					return ready;
				}
				catch (IOException e) {
					try {
						reader.close();
					}
					catch (IOException e1) {}
					throw new RuntimeException(e);
				}
			}

			@Override
			public String next() {
				try {
					return reader.readLine();
				}
				catch (IOException e) {
					try {
						reader.close();
					}
					catch (IOException e1) {}
					throw new RuntimeException(e);
				}
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}