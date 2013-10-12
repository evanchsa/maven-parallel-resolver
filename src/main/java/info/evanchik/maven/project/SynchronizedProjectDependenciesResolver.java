package info.evanchik.maven.project;

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

import org.apache.maven.project.DefaultProjectDependenciesResolver;
import org.apache.maven.project.DependencyResolutionException;
import org.apache.maven.project.DependencyResolutionRequest;
import org.apache.maven.project.DependencyResolutionResult;
import org.apache.maven.project.ProjectDependenciesResolver;

import org.codehaus.plexus.component.annotations.Component;

/**
 * @author Stephen Evanchik
 */
@Component( role = ProjectDependenciesResolver.class )
public class SynchronizedProjectDependenciesResolver extends DefaultProjectDependenciesResolver
{

    public DependencyResolutionResult resolve( DependencyResolutionRequest request )
        throws DependencyResolutionException
    {
        synchronized ( SynchronizedProjectDependenciesResolver.class )
        {
            return super.resolve( request );
        }
    }
}
