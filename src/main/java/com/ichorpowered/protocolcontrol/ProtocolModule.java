/*
 * This file is part of ProtocolControl, licensed under the MIT License (MIT).
 *
 * Copyright (c) IchorPowered <http://ichorpowered.com>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ichorpowered.protocolcontrol;

import com.ichorpowered.protocolcontrol.channel.ChannelInitializer;
import com.ichorpowered.protocolcontrol.channel.ChannelProfile;
import com.ichorpowered.protocolcontrol.packet.PacketRemapper;
import com.ichorpowered.protocolcontrol.service.ProtocolService;
import com.ichorpowered.protocolcontrol.service.SimpleProtocolService;
import net.kyori.violet.AbstractModule;

public final class ProtocolModule extends AbstractModule {
  @Override
  protected void configure() {
    this.bind(ChannelInitializer.class);
    this.bind(PacketRemapper.class);
    this.bind(ProtocolEvent.class);
    this.bind(ProtocolInjector.class);
    this.bind(ProtocolService.class).to(SimpleProtocolService.class);
    this.installFactory(ChannelProfile.Factory.class);
  }
}
