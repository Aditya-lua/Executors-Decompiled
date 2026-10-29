package p311nm;

import com.roblox.universalapp.cookie.JNICookieProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nm.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lnm/b;", "", "<init>", "()V", "Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;", "onSetCookieHandler", "", "a", "(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getUpdateOnSetCookieHandlerDelegate", "()Lkotlin/jvm/functions/Function1;", "setUpdateOnSetCookieHandlerDelegate", "(Lkotlin/jvm/functions/Function1;)V", "updateOnSetCookieHandlerDelegate", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9495b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9495b f34166a = new C9495b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super JNICookieProtocol.OnSetCookieHandler, Unit> updateOnSetCookieHandlerDelegate;

    /* JADX INFO: renamed from: nm.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function1<JNICookieProtocol.OnSetCookieHandler, Unit> {
        public a(Object obj) {
            super(1, obj, JNICookieProtocol.class, "updateOnSetCookieHandler", "updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m37432d(JNICookieProtocol.OnSetCookieHandler onSetCookieHandler) {
            ((JNICookieProtocol) this.receiver).updateOnSetCookieHandler(onSetCookieHandler);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JNICookieProtocol.OnSetCookieHandler onSetCookieHandler) {
            m37432d(onSetCookieHandler);
            return Unit.f29331a;
        }
    }

    static {
        JNICookieProtocol jNICookieProtocolM15987a = JNICookieProtocol.m15987a();
        Intrinsics.checkNotNullExpressionValue(jNICookieProtocolM15987a, "sharedInstance(...)");
        updateOnSetCookieHandlerDelegate = new a(jNICookieProtocolM15987a);
    }

    /* JADX INFO: renamed from: a */
    public static final void m37431a(@NotNull JNICookieProtocol.OnSetCookieHandler onSetCookieHandler) {
        Intrinsics.checkNotNullParameter(onSetCookieHandler, "onSetCookieHandler");
        updateOnSetCookieHandlerDelegate.invoke(onSetCookieHandler);
    }
}
