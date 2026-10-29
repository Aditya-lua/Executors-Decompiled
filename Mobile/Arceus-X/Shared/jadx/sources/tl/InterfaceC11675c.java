package tl;

import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: tl.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022(\u0010#\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\"\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H\u0096@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, m31665d2 = {"Ltl/c;", "", "", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "g", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "adTracingId", "adUnitId", "Ltl/j;", "listener", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl/j;)V", "Lorg/json/JSONObject;", "params", "Ltl/f;", "j", "(Ljava/lang/String;Lorg/json/JSONObject;Ltl/f;)V", "Ltl/k;", "b", "(Ljava/lang/String;Ltl/k;)V", "d", "()V", "destroy", "initializeAdUnitId", "Ljt/n;", "c", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ltl/a;", "adFormat", "Lkotlin/Function2;", "Lnt/b;", "serveAd", "i", "(Ltl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "a", "(Ltl/a;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "method", "l", "(Ljava/lang/String;)Ljava/lang/Object;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11675c {
    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m43829e(InterfaceC11675c interfaceC11675c, String str, InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        return interfaceC11675c.m43832l("initializeSDK");
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m43830f(InterfaceC11675c interfaceC11675c, EnumC11671a enumC11671a, String str, String str2, Function2<? super String, ? super InterfaceC9557b<? super C7347n<String>>, ? extends Object> function2, InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        return interfaceC11675c.m43832l("getQueryInfoAndLoadAd");
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m43831k(InterfaceC11675c interfaceC11675c, EnumC11671a enumC11671a, String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
        interfaceC11675c.m43832l("destroyAd");
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo15965a(@NotNull EnumC11671a enumC11671a, @NotNull String str, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m43831k(this, enumC11671a, str, interfaceC9557b);
    }

    /* JADX INFO: renamed from: b */
    void mo15966b(@NotNull String adTracingId, @NotNull InterfaceC11690k listener);

    @Nullable
    /* JADX INFO: renamed from: c */
    default Object mo15967c(@NotNull String str, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        return m43829e(this, str, interfaceC9557b);
    }

    /* JADX INFO: renamed from: d */
    void mo15968d();

    void destroy();

    /* JADX INFO: renamed from: g */
    void mo15969g(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback);

    /* JADX INFO: renamed from: h */
    void mo15970h(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull InterfaceC11689j listener);

    @Nullable
    /* JADX INFO: renamed from: i */
    default Object mo15971i(@NotNull EnumC11671a enumC11671a, @NotNull String str, @NotNull String str2, @NotNull Function2<? super String, ? super InterfaceC9557b<? super C7347n<String>>, ? extends Object> function2, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        return m43830f(this, enumC11671a, str, str2, function2, interfaceC9557b);
    }

    /* JADX INFO: renamed from: j */
    void mo15972j(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull InterfaceC11681f listener);

    /* JADX INFO: renamed from: l */
    default Object m43832l(String method) {
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new UnsupportedOperationException(method + " not supported")));
    }
}
