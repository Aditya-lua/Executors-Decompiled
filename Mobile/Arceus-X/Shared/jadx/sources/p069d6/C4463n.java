package p069d6;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026b6.NetworkState;
import p161h6.InterfaceC6292b;

/* JADX INFO: renamed from: d6.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m31665d2 = {"Ld6/n;", "", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "Ld6/h;", "", "batteryChargingTracker", "Ld6/c;", "batteryNotLowTracker", "Lb6/h;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lh6/b;Ld6/h;Ld6/c;Ld6/h;Ld6/h;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Ld6/h;", "()Ld6/h;", "Ld6/c;", "()Ld6/c;", "d", "e", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4463n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC4457h<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C4452c batteryNotLowTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final AbstractC4457h<NetworkState> networkStateTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC4457h<Boolean> storageNotLowTracker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4463n(@NotNull Context context, @NotNull InterfaceC6292b taskExecutor, @NotNull AbstractC4457h<Boolean> batteryChargingTracker, @NotNull C4452c batteryNotLowTracker, @Nullable AbstractC4457h<NetworkState> abstractC4457h, @NotNull AbstractC4457h<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = abstractC4457h;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC4457h<Boolean> m22404a() {
        return this.batteryChargingTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4452c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final AbstractC4457h<NetworkState> m22407d() {
        return this.networkStateTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final AbstractC4457h<Boolean> m22408e() {
        return this.storageNotLowTracker;
    }

    public /* synthetic */ C4463n(Context context, InterfaceC6292b interfaceC6292b, AbstractC4457h abstractC4457h, C4452c c4452c, AbstractC4457h abstractC4457h2, AbstractC4457h abstractC4457h3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        AbstractC4457h c4450a;
        C4452c c4452c2;
        AbstractC4457h abstractC4457h4;
        AbstractC4457h c4461l;
        AbstractC4457h<NetworkState> abstractC4457hM22393a;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            c4450a = new C4450a(applicationContext, interfaceC6292b);
        } else {
            c4450a = abstractC4457h;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            c4452c2 = new C4452c(applicationContext2, interfaceC6292b);
        } else {
            c4452c2 = c4452c;
        }
        if ((i10 & 16) != 0) {
            if (Build.VERSION.SDK_INT < 28) {
                Context applicationContext3 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                abstractC4457hM22393a = C4459j.m22393a(applicationContext3, interfaceC6292b);
            } else {
                abstractC4457hM22393a = null;
            }
            abstractC4457h4 = abstractC4457hM22393a;
        } else {
            abstractC4457h4 = abstractC4457h2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
            c4461l = new C4461l(applicationContext4, interfaceC6292b);
        } else {
            c4461l = abstractC4457h3;
        }
        this(context, interfaceC6292b, c4450a, c4452c2, abstractC4457h4, c4461l);
    }
}
