package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o9.p;
import o9.w;
import o9.x;
import o9.y;
import o9.z;
import tb.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzwr {
    private final y zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    public zzwr(Context context, String str) {
        this.zza = x.b(context, z.a().b("mlkit:vision").a());
    }

    public static zzwr zza(Context context) {
        return new zzwr(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j10, Exception exc) {
        this.zzb.set(j10);
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.zzb;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.zza.g(new w(0, Arrays.asList(new p(i10, i11, 0, j10, j11, null, null, 0, -1)))).e(new f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwq
            @Override // tb.f
            public final void onFailure(Exception exc) {
                this.zza.zzb(jElapsedRealtime, exc);
            }
        });
    }
}
