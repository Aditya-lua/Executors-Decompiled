package p441t4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t4.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lt4/l;", "Lt4/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lt4/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public final class C11522l extends C11529s {
    /* JADX WARN: Illegal instructions before constructor call */
    public C11522l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        Intrinsics.checkNotNullExpressionValue(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // p441t4.C11529s
    @NotNull
    /* JADX INFO: renamed from: c */
    public GetTopicsRequest mo43094c(@NotNull C11512b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return C11514d.f40793a.m43080a(request);
    }
}
