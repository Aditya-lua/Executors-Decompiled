package nb;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class he implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me f25586a;

    public he(me meVar) {
        Objects.requireNonNull(meVar);
        this.f25586a = meVar;
    }

    @Override // nb.ue
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f25586a.b().t(new ge(this, str, str2, bundle));
            return;
        }
        me meVar = this.f25586a;
        if (meVar.x0() != null) {
            meVar.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
