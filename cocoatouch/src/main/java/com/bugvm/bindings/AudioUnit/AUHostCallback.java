/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package com.bugvm.bindings.AudioUnit;

import com.bugvm.apple.corefoundation.OSStatus;
import com.bugvm.rt.bro.ptr.BooleanPtr;
import com.bugvm.rt.bro.ptr.DoublePtr;
import com.bugvm.rt.bro.ptr.FloatPtr;
import com.bugvm.rt.bro.ptr.IntPtr;

public interface AUHostCallback {

    OSStatus getBeatAndTempo(DoublePtr currentBeat, DoublePtr currentTempo);

    OSStatus getMusicalTimeLocation(IntPtr deltaSampleOffsetToNextBeat, FloatPtr timeSigNumerator,
            IntPtr timeSigDenominator, DoublePtr currentMeasureDownBeat);

    OSStatus getTransportState(BooleanPtr isPlaying, BooleanPtr transportStateChanged,
            DoublePtr currentSampleInTimeLine, BooleanPtr isCycling, DoublePtr cycleStartBeat, DoublePtr cycleEndBeat);

    OSStatus getTransportState2(BooleanPtr isPlaying, BooleanPtr isRecording, BooleanPtr transportStateChanged,
            DoublePtr currentSampleInTimeLine, BooleanPtr isCycling, DoublePtr cycleStartBeat, DoublePtr cycleEndBeat);

}
