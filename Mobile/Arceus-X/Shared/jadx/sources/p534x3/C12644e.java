package p534x3;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7906p0;
import p440t3.C11492j;
import p440t3.C11499o;
import p440t3.InterfaceC11483e0;
import p440t3.InterfaceC11486g;
import p440t3.InterfaceC11490i;
import p457u3.C11789b;
import p477ut.C11966k;

/* JADX INFO: renamed from: x3.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lx3/e;", "", "<init>", "()V", "Lu3/b;", "Lx3/f;", "corruptionHandler", "", "Lt3/g;", "migrations", "Lku/p0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lt3/i;", "b", "(Lu3/b;Ljava/util/List;Lku/p0;Lkotlin/jvm/functions/Function0;)Lt3/i;", "Lt3/e0;", "storage", "a", "(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;", "datastore-preferences-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12644e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12644e f44968a = new C12644e();

    /* JADX INFO: renamed from: x3.e$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function0<File> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0<File> f44969i;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function0<? extends java.io.File> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends File> function0) {
            super(0);
            this.f44969i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f44969i.invoke();
            if (Intrinsics.m31980c(C11966k.m44658p(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC11490i<AbstractC12645f> m47098a(@NotNull InterfaceC11483e0<AbstractC12645f> storage, @Nullable C11789b<AbstractC12645f> corruptionHandler, @NotNull List<? extends InterfaceC11486g<AbstractC12645f>> migrations, @NotNull InterfaceC7906p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new C12643d(C11492j.f40576a.m42994b(storage, corruptionHandler, migrations, scope));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC11490i<AbstractC12645f> m47099b(@Nullable C11789b<AbstractC12645f> corruptionHandler, @NotNull List<? extends InterfaceC11486g<AbstractC12645f>> migrations, @NotNull InterfaceC7906p0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new C12643d(m47098a(new C11499o(C12647h.f44973a, null, new a(produceFile), 2, null), corruptionHandler, migrations, scope));
    }
}
