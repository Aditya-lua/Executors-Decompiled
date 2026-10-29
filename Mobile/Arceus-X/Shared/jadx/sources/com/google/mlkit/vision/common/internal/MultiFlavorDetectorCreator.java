package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.ClientPriority;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p305n9.C8953m;
import p575yf.InterfaceC13188b;

/* JADX INFO: loaded from: classes2.dex */
public class MultiFlavorDetectorCreator {
    private final Map zza = new HashMap();

    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
        @NonNull
        DetectorT create(@NonNull OptionsT optionst);
    }

    public interface DetectorOptions<DetectorT> {
    }

    public interface MultiFlavorDetector {
    }

    public static class Registration {
        private final Class zza;
        private final InterfaceC13188b zzb;

        @ClientPriority
        private final int zzc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull InterfaceC13188b<? extends DetectorCreator<DetectorT, OptionsT>> interfaceC13188b, @ClientPriority int i10) {
            this.zza = cls;
            this.zzb = interfaceC13188b;
            this.zzc = i10;
        }

        @ClientPriority
        public final int zza() {
            return this.zzc;
        }

        public final InterfaceC13188b zzb() {
            return this.zzb;
        }

        public final Class zzc() {
            return this.zza;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull InterfaceC13188b<? extends DetectorCreator<DetectorT, OptionsT>> interfaceC13188b) {
            this(cls, interfaceC13188b, 100);
        }
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Registration registration = (Registration) it.next();
            Class clsZzc = registration.zzc();
            if (!this.zza.containsKey(clsZzc) || registration.zza() >= ((Integer) C8953m.m36047l((Integer) map.get(clsZzc))).intValue()) {
                this.zza.put(clsZzc, registration.zzb());
                map.put(clsZzc, Integer.valueOf(registration.zza()));
            }
        }
    }

    @NonNull
    public static synchronized MultiFlavorDetectorCreator getInstance() {
        return (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
    }

    @NonNull
    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(@NonNull OptionsT optionst) {
        return (DetectorT) ((DetectorCreator) ((InterfaceC13188b) C8953m.m36047l((InterfaceC13188b) this.zza.get(optionst.getClass()))).get()).create(optionst);
    }
}
