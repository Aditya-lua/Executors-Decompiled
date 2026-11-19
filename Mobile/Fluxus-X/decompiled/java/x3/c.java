package x3;

import android.content.Context;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.m;
import xu.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lx3/c;", "Ltu/a;", "Landroid/content/Context;", "Lu3/i;", "Ly3/f;", BuildConfig.FLAVOR, "name", "Lv3/b;", "corruptionHandler", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lu3/g;", "produceMigrations", "Lav/p0;", "scope", "<init>", "(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)V", "thisRef", "Lxu/l;", "property", "b", "(Landroid/content/Context;Lxu/l;)Lu3/i;", "a", "Ljava/lang/String;", "Lv3/b;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lav/p0;", BuildConfig.FLAVOR, "e", "Ljava/lang/Object;", "lock", "f", "Lu3/i;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements tu.a<Context, u3.i<y3.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final v3.b<y3.f> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Context, List<u3.g<y3.f>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile u3.i<y3.f> INSTANCE;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements Function0<File> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f36154i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c f36155j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f36154i = context;
            this.f36155j = cVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f36154i;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f36155j.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull String name, @Nullable v3.b<y3.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends u3.g<y3.f>>> produceMigrations, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // tu.a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u3.i<y3.f> getValue(@NotNull Context thisRef, @NotNull l<?> property) {
        u3.i<y3.f> iVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        u3.i<y3.f> iVar2 = this.INSTANCE;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    y3.e eVar = y3.e.f37235a;
                    v3.b<y3.f> bVar = this.corruptionHandler;
                    Function1<Context, List<u3.g<y3.f>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = eVar.b(bVar, function1.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                iVar = this.INSTANCE;
                Intrinsics.checkNotNull(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
