package np;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lnp/f0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f26305a = new f0();

    public final void a() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.types.ModelBackedExtractor");
            ((cs.a) objNewInstance).a();
        } catch (ClassNotFoundException unused) {
        }
    }
}
