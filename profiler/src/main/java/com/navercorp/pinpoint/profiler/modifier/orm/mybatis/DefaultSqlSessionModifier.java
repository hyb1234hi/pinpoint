/*
 * Copyright 2014 NAVER Corp.
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

package com.navercorp.pinpoint.profiler.modifier.orm.mybatis;

import com.navercorp.pinpoint.bootstrap.Agent;
import com.navercorp.pinpoint.bootstrap.instrument.ByteCodeInstrumentor;
import com.navercorp.pinpoint.bootstrap.instrument.matcher.Matcher;
import com.navercorp.pinpoint.bootstrap.instrument.matcher.Matchers;

/**
 * @author Hyun Jeong
 */
public class DefaultSqlSessionModifier extends MyBatisClientModifier {

    public static final String TARGET_CLASS_NAME = "org/apache/ibatis/session/defaults/DefaultSqlSession";

    public DefaultSqlSessionModifier(ByteCodeInstrumentor byteCodeInstrumentor, Agent agent) {
        super(byteCodeInstrumentor, agent, DefaultSqlSessionModifier.class);
    }

    @Override
    public Matcher getMatcher() {
        return Matchers.newClassNameMatcher(TARGET_CLASS_NAME);
    }

}
