/*
 * Copyright 2015 Ben Manes. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.benmanes.caffeine.cache.simulator.policy.sampling;

import akka.actor.UntypedActor;

import com.github.benmanes.caffeine.cache.simulator.BasicSettings;
import com.github.benmanes.caffeine.cache.simulator.policy.sampling.AbstractSamplingPolicy.Sample;

/**
 * @author ben.manes@gmail.com (Ben Manes)
 */
final class SamplingSettings extends BasicSettings {

  public SamplingSettings(UntypedActor actor) {
    super(actor);
  }

  public int sampleSize() {
    return config().getInt("simulator.sampling.size");
  }

  public Sample sampleStrategy() {
    return Sample.valueOf(config().getString("simulator.sampling.strategy").toUpperCase());
  }
}
