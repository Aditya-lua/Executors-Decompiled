package p311nm;

import com.roblox.universalapp.externalcontentsharing.JNIExternalContentSharingProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7744k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nm.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, m31665d2 = {"Lnm/c;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "c", "a", "d", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getGetShareTextIdDelegate", "()Lkotlin/jvm/functions/Function0;", "setGetShareTextIdDelegate", "(Lkotlin/jvm/functions/Function0;)V", "getShareTextIdDelegate", "getGetShareUrlIdDelegate", "setGetShareUrlIdDelegate", "getShareUrlIdDelegate", "getGetShareImageIdDelegate", "setGetShareImageIdDelegate", "getShareImageIdDelegate", "e", "getGetShareVideoIdDelegate", "setGetShareVideoIdDelegate", "getShareVideoIdDelegate", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9496c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9496c f34168a = new C9496c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getShareTextIdDelegate = b.f34174a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getShareUrlIdDelegate = c.f34175a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getShareImageIdDelegate = a.f34173a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getShareVideoIdDelegate = d.f34176a;

    /* JADX INFO: renamed from: nm.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final a f34173a = new a();

        public a() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareImageId", "getShareImageId()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareImageId();
        }
    }

    /* JADX INFO: renamed from: nm.c$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final b f34174a = new b();

        public b() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareTextId", "getShareTextId()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareTextId();
        }
    }

    /* JADX INFO: renamed from: nm.c$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final c f34175a = new c();

        public c() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareUrlId", "getShareUrlId()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareUrlId();
        }
    }

    /* JADX INFO: renamed from: nm.c$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final d f34176a = new d();

        public d() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareVideoId", "getShareVideoId()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareVideoId();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m37433a() {
        return getShareImageIdDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m37434b() {
        return getShareTextIdDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m37435c() {
        return getShareUrlIdDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m37436d() {
        return getShareVideoIdDelegate.invoke();
    }
}
