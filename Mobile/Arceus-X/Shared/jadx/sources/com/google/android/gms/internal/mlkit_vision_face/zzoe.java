package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p305n9.C8961p;
import p305n9.C8965r;
import p305n9.InterfaceC8963q;
import sb.InterfaceC11254f;

/* JADX INFO: loaded from: classes.dex */
public final class zzoe {
    private final InterfaceC8963q zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    public zzoe(Context context, String str) {
        this.zza = C8961p.m36064b(context, C8965r.m36068a().m36071b("mlkit:vision").m36070a());
    }

    public static zzoe zza(Context context) {
        return new zzoe(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j10, Exception exc) {
        this.zzb.set(j10);
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzb.get() != -1 && jElapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.zza.mo36065c(new TelemetryData(0, Arrays.asList(new MethodInvocation(i10, i11, 0, j10, j11, null, null, 0)))).mo11891e(new InterfaceC11254f() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzod
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                this.zza.zzb(jElapsedRealtime, exc);
            }
        });
    }
}
