package hm;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lhm/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, Payload.INSTANT, BuildConfig.FLAVOR, "a", "(Z)V", "Lhm/i$a;", "mode", "b", "(Lhm/i$a;Leu/b;)Ljava/lang/Object;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lhm/i$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DEFERRED,
        BACKGROUND;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ hu.a f18295d = hu.b.a(a());
    }

    void a(boolean instant);

    @Nullable
    Object b(@NotNull a aVar, @NotNull eu.b<? super Unit> bVar);
}
