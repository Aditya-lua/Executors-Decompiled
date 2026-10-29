package p069d6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: d6.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Ld6/l;", "Ld6/e;", "", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lh6/b;)V", "m", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "l", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "k", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4461l extends AbstractC4454e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4461l(@NotNull Context context, @NotNull InterfaceC6292b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // p069d6.AbstractC4454e
    @NotNull
    /* JADX INFO: renamed from: k */
    public IntentFilter mo22375k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p069d6.AbstractC4454e
    /* JADX INFO: renamed from: l */
    public void mo22376l(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        AbstractC12732w.m47441e().mo47444a(C4462m.f18476a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    m22391h(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                m22391h(Boolean.TRUE);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: f()Ljava/lang/Object; */
    @Override // p069d6.AbstractC4457h
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean mo22374f() {
        Intent intentRegisterReceiver = getAppContext().registerReceiver(null, mo22375k());
        boolean z10 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z10 = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
