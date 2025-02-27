/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.submarine.serve.seldon;

import com.google.gson.annotations.SerializedName;

public class SeldonPredictor {
  @SerializedName("name")
  private String name = "default";

  @SerializedName("replicas")
  private Integer replicas = 1;

  @SerializedName("graph")
  private SeldonGraph seldonGraph = new SeldonGraph();

  public SeldonPredictor(String name, Integer replicas, SeldonGraph graph) {
    setName(name);
    setReplicas(replicas);
    setSeldonGraph(graph);
  }

  public SeldonPredictor(){};

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public SeldonGraph getSeldonGraph() {
    return seldonGraph;
  }

  public void setSeldonGraph(SeldonGraph seldonGraph) {
    this.seldonGraph = seldonGraph;
  }
}
