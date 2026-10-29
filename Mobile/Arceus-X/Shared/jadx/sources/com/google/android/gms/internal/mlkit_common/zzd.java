package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import p261l2.C7980g;

/* JADX INFO: loaded from: classes.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z10) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || C7980g.m33039b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
