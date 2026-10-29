package p582yn;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: yn.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lyn/p;", "Lyn/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "Ljt/h;", "d", "()Landroid/content/SharedPreferences;", "prefs", "", "value", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "deviceId", "device_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13253p implements InterfaceC13234a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h prefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String deviceId;

    public C13253p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = C7342i.m30456b(new Function0() { // from class: yn.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13253p.m49006e(this.f46604a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final SharedPreferences m49006e(C13253p c13253p) {
        return c13253p.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    @Override // p582yn.InterfaceC13234a
    /* JADX INFO: renamed from: a */
    public void mo48948a(@Nullable String str) {
        if ((!Intrinsics.m31980c(str, this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            m49007d().edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }

    @Override // p582yn.InterfaceC13234a
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo48949b() {
        String str = this.deviceId;
        return str == null ? m49007d().getString("DEVICE_ID", null) : str;
    }

    /* JADX INFO: renamed from: d */
    public final SharedPreferences m49007d() {
        return (SharedPreferences) this.prefs.getValue();
    }
}
