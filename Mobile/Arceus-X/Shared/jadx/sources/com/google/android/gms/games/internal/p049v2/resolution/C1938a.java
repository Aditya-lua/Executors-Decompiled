package com.google.android.gms.games.internal.p049v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.gms.games.internal.v2.resolution.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1938a {
    /* JADX INFO: renamed from: a */
    public static C1938a m9453a() {
        return new C1938a();
    }

    /* JADX INFO: renamed from: b */
    public static final Task m9454b(Activity activity, PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        Intent intent = new Intent(activity, (Class<?>) GamesResolutionActivity.class);
        intent.putExtra("pendingIntent", pendingIntent);
        intent.putExtra("resultReceiver", zzaVar);
        activity.startActivity(intent);
        return zzaVar.m9455a();
    }
}
