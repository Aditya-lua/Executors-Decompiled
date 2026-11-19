package t4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lt4/b;", BuildConfig.FLAVOR, "<init>", "()V", "Lt4/a;", "deletionRequest", BuildConfig.FLAVOR, "a", "(Lt4/a;Leu/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Leu/b;)Ljava/lang/Object;", "Lt4/i;", "request", "f", "(Lt4/i;Leu/b;)Ljava/lang/Object;", "Lt4/j;", "g", "(Lt4/j;Leu/b;)Ljava/lang/Object;", "Lt4/h;", "d", "(Lt4/h;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "b", "(Leu/b;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t4.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lt4/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lt4/b;", "a", "(Landroid/content/Context;)Lt4/b;", BuildConfig.FLAVOR, "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t4.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lt4/c;", "a", "(Landroid/content/Context;)Lt4/c;"}, k = 3, mv = {1, 8, 0})
        public static final class C0641a extends m implements Function1<Context, c> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Context f32106i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0641a(Context context) {
                super(1);
                this.f32106i = context;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new c(this.f32106i);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            q4.a aVar = q4.a.f29773a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new f(context);
            }
            if (aVar.b() >= 9) {
                return (b) q4.b.f29776a.a(context, "MeasurementManager", new C0641a(context));
            }
            return null;
        }

        public Companion() {
        }
    }

    @Nullable
    public abstract Object a(@NotNull a aVar, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object b(@NotNull eu.b<? super Integer> bVar);

    @Nullable
    public abstract Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object d(@NotNull h hVar, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object e(@NotNull Uri uri, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object f(@NotNull i iVar, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object g(@NotNull j jVar, @NotNull eu.b<? super Unit> bVar);
}
