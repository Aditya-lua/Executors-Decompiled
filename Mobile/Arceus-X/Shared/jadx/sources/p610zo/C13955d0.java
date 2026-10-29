package p610zo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr.InterfaceC9553a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zo.d0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m31665d2 = {"Lzo/d0;", "", "<init>", "()V", "", "a", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13955d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13955d0 f48737a = new C13955d0();

    /* JADX INFO: renamed from: a */
    public final void m50456a() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.types.ModelBackedExtractor");
            ((InterfaceC9553a) objNewInstance).m37696a();
        } catch (ClassNotFoundException unused) {
        }
    }
}
