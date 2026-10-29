package p441t4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t4.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0011¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lt4/o;", "Lt4/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lt4/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", Payload.RESPONSE, "Lt4/e;", "d", "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public final class C11525o extends C11529s {
    /* JADX WARN: Illegal instructions before constructor call */
    public C11525o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) C11523m.m43096a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(C11524n.m43097a(systemService));
    }

    @Override // p441t4.C11529s
    @NotNull
    /* JADX INFO: renamed from: c */
    public GetTopicsRequest mo43094c(@NotNull C11512b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return C11514d.f40793a.m43080a(request);
    }

    @Override // p441t4.C11529s
    @NotNull
    /* JADX INFO: renamed from: d */
    public C11515e mo43095d(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return C11518h.f40796a.m43086b(response);
    }
}
