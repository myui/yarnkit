/*
 * Hivemall: Hive scalable Machine Learning Library
 *
 * Copyright (C) 2015 Makoto YUI
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
package yarnkit.appmaster;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.hadoop.conf.Configuration;

import yarnkit.container.ContainerLaunchParameters;

/**
 * The parameters used by {@code ApplicationMasterService} to launch an Yarn Application.
 */
public interface ApplicationMasterParameters {

    @Nonnull
    public Configuration getConfiguration();

    @Nonnull
    public String getHostname();

    public int getClientPort();

    @Nullable
    public String getTrackingUrl();

    public int getAllowedFailures();

    @Nonnull
    public ContainerLaunchParameters getContainerLaunchParameters();

}
