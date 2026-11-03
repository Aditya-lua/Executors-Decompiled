package pp;

import android.content.Context;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<IntentSenderRequest>> f28998a;
    public final dt.i<Context> b;

    public j(dt.i<g.c<IntentSenderRequest>> iVar, dt.i<Context> iVar2) {
        this.f28998a = iVar;
        this.b = iVar2;
    }

    public static j a(dt.i<g.c<IntentSenderRequest>> iVar, dt.i<Context> iVar2) {
        return new j(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.permissions.a c(g.c<IntentSenderRequest> cVar, Context context) {
        return new com.withpersona.sdk2.inquiry.permissions.a(cVar, context);
    }

    public com.withpersona.sdk2.inquiry.permissions.a b() {
        return c(this.f28998a.get(), this.b.get());
    }
}
