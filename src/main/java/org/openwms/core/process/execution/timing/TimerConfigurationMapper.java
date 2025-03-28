/*
 * Copyright 2005-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openwms.core.process.execution.timing;

import jakarta.validation.constraints.NotNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openwms.core.process.execution.timing.api.TimerConfigurationVO;

/**
 * A TimerConfigurationMapper.
 *
 * @author Heiko Scherrer
 */
@Mapper
public interface TimerConfigurationMapper {

    @Mapping(target = "persistentKey", source = "pKey")
    TimerConfiguration convert(TimerConfigurationVO vo);

    @Mapping(target = "pKey", source = "persistentKey")
    TimerConfigurationVO convertToVO(@NotNull TimerConfiguration eo);
}
