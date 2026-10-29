package com.roblox.universalapp.achievement;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl.InterfaceC11392b;

/* JADX INFO: renamed from: com.roblox.universalapp.achievement.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "Lsl/b;", "a", "()Lsl/b;", "Lsl/b;", "dao", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3346b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3346b f12730a = new C3346b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile InterfaceC11392b dao;

    /* JADX INFO: renamed from: b */
    public static final void m15963b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (dao != null) {
            Log.w("rbx.achievement", "onAppCreate called twice");
            return;
        }
        dao = AchievementDatabase.INSTANCE.m15925a(context).mo15924Z();
        if (JNIAchievement.f12705a.m15932c()) {
            Log.i("rbx.achievement", "Achievements registered");
        } else {
            Log.i("rbx.achievement", "Achievements JNI failed to register");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC11392b m15964a() {
        return dao;
    }
}
