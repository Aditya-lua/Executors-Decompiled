package p506w3;

import android.content.Context;
import hu.InterfaceC6576l;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087du.InterfaceC4691a;
import p256ku.InterfaceC7906p0;
import p440t3.InterfaceC11486g;
import p440t3.InterfaceC11490i;
import p457u3.C11789b;
import p534x3.AbstractC12645f;
import p534x3.C12644e;

/* JADX INFO: renamed from: w3.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m31665d2 = {"Lw3/c;", "Ldu/a;", "Landroid/content/Context;", "Lt3/i;", "Lx3/f;", "", "name", "Lu3/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Lt3/g;", "produceMigrations", "Lku/p0;", "scope", "<init>", "(Ljava/lang/String;Lu3/b;Lkotlin/jvm/functions/Function1;Lku/p0;)V", "thisRef", "Lhu/l;", "property", "b", "(Landroid/content/Context;Lhu/l;)Lt3/i;", "a", "Ljava/lang/String;", "Lu3/b;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lku/p0;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lt3/i;", "INSTANCE", "datastore-preferences_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12299c implements InterfaceC4691a<Context, InterfaceC11490i<AbstractC12645f>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final C11789b<AbstractC12645f> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Context, List<InterfaceC11486g<AbstractC12645f>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public volatile InterfaceC11490i<AbstractC12645f> INSTANCE;

    /* JADX INFO: renamed from: w3.c$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function0<File> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Context f43580i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C12299c f43581j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C12299c c12299c) {
            super(0);
            this.f43580i = context;
            this.f43581j = c12299c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f43580i;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return C12298b.m45689a(applicationContext, this.f43581j.name);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends t3.g<x3.f>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12299c(@NotNull String name, @Nullable C11789b<AbstractC12645f> c11789b, @NotNull Function1<? super Context, ? extends List<? extends InterfaceC11486g<AbstractC12645f>>> produceMigrations, @NotNull InterfaceC7906p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = c11789b;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;Lhu/l;)Ljava/lang/Object; */
    @Override // p087du.InterfaceC4691a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC11490i<AbstractC12645f> getValue(@NotNull Context thisRef, @NotNull InterfaceC6576l<?> property) {
        InterfaceC11490i<AbstractC12645f> interfaceC11490i;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        InterfaceC11490i<AbstractC12645f> interfaceC11490i2 = this.INSTANCE;
        if (interfaceC11490i2 != null) {
            return interfaceC11490i2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C12644e c12644e = C12644e.f44968a;
                    C11789b<AbstractC12645f> c11789b = this.corruptionHandler;
                    Function1<Context, List<InterfaceC11486g<AbstractC12645f>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = c12644e.m47099b(c11789b, function1.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                interfaceC11490i = this.INSTANCE;
                Intrinsics.checkNotNull(interfaceC11490i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC11490i;
    }
}
