package p441t4;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t4.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"Lt4/d;", "", "<init>", "()V", "Lt4/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "a", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "b", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"ClassVerificationFailure"})
public final class C11514d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11514d f40793a = new C11514d();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final GetTopicsRequest m43080a(@NotNull C11512b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = C11513c.m43079a().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.getShouldRecordObservation()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final GetTopicsRequest m43081b(@NotNull C11512b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = C11513c.m43079a().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
