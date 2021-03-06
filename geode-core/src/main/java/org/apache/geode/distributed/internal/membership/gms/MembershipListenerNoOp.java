/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.distributed.internal.membership.gms;

import java.util.List;
import java.util.Set;

import org.apache.geode.distributed.internal.membership.gms.api.MemberIdentifier;
import org.apache.geode.distributed.internal.membership.gms.api.MembershipListener;
import org.apache.geode.distributed.internal.membership.gms.api.MembershipView;

public class MembershipListenerNoOp<ID extends MemberIdentifier> implements MembershipListener<ID> {
  @Override
  public void viewInstalled(final MembershipView<ID> view) {

  }

  @Override
  public void quorumLost(final Set<ID> failures, final List<ID> remainingMembers) {

  }

  @Override
  public void newMemberConnected(final ID m) {

  }

  @Override
  public void memberDeparted(final ID id, final boolean crashed, final String reason) {

  }

  @Override
  public void memberSuspect(final ID suspect, final ID whoSuspected, final String reason) {

  }

  @Override
  public void membershipFailure(final String reason, final Throwable t) {

  }

  @Override
  public void saveConfig() {

  }
}
