package p610zo;

import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zo.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, m31665d2 = {"Lzo/w;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "a", "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "c", "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "d", "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V", "getOnEventListener$inquiry_dynamic_feature_release$annotations", "onEventListener", "b", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13986w {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile C13986w f48857c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public OnInquiryEventListener onEventListener;

    /* JADX INFO: renamed from: zo.w$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lzo/w$a;", "", "<init>", "()V", "Lzo/w;", "a", "()Lzo/w;", "INSTANCE", "Lzo/w;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: zo.w.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C13986w m50534a() {
            C13986w c13986w;
            C13986w c13986w2 = C13986w.f48857c;
            if (c13986w2 != null) {
                return c13986w2;
            }
            synchronized (this) {
                c13986w = C13986w.f48857c;
                if (c13986w == null) {
                    c13986w = new C13986w();
                    C13986w.f48857c = c13986w;
                }
            }
            return c13986w;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final OnInquiryEventListener getOnEventListener() {
        return this.onEventListener;
    }

    /* JADX INFO: renamed from: d */
    public final void m50533d(@Nullable OnInquiryEventListener onInquiryEventListener) {
        this.onEventListener = onInquiryEventListener;
    }
}
