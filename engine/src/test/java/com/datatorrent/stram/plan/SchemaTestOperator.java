/**
 * Copyright (C) 2015 DataTorrent, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.stram.plan;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.api.annotation.InputPortFieldAnnotation;

import com.datatorrent.stram.engine.GenericTestOperator;

public class SchemaTestOperator extends GenericTestOperator
{
  @InputPortFieldAnnotation(schemaRequired = true)
  final public transient InputPort<Object> schemaRequiredPort = new DefaultInputPort<Object>()
  {
    @Override
    final public void process(Object payload)
    {
    }
  };
}
