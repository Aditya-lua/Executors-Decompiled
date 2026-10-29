package mm;

import com.roblox.universalapp.messagebus.MessageBus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR4\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmm/f;", "", "<init>", "()V", "", "domainName", "messageName", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "getGetMessageIdDelegate", "()Lkotlin/jvm/functions/Function2;", "setGetMessageIdDelegate", "(Lkotlin/jvm/functions/Function2;)V", "getMessageIdDelegate", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f24426a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function2<? super String, ? super String, String> getMessageIdDelegate = a.f24427a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24427a = new a();

        public a() {
            super(2, MessageBus.class, "getMessageId", "getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return MessageBus.getMessageId(str, str2);
        }
    }

    @NotNull
    public final String a(@NotNull String domainName, @NotNull String messageName) {
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(messageName, "messageName");
        return getMessageIdDelegate.invoke(domainName, messageName);
    }
}
