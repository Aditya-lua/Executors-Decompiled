package yn;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lyn/p;", "Lyn/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "Ljt/h;", "d", "()Landroid/content/SharedPreferences;", "prefs", "", "value", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "deviceId", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h prefs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String deviceId;

    public p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = jt.i.b(new Function0() { // from class: yn.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.e(this.f36008a);
            }
        });
    }

    public static final SharedPreferences e(p pVar) {
        return pVar.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    @Override // yn.a
    public void a(@Nullable String str) {
        if ((!Intrinsics.c(str, this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            d().edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }

    @Override // yn.a
    @Nullable
    public String b() {
        String str = this.deviceId;
        return str == null ? d().getString("DEVICE_ID", null) : str;
    }

    public final SharedPreferences d() {
        return (SharedPreferences) this.prefs.getValue();
    }
}
