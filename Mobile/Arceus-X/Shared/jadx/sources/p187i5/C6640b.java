package p187i5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p119f5.InterfaceC5360c;
import p145g5.InterfaceC6009d;

/* JADX INFO: renamed from: i5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m31665d2 = {"Li5/b;", "Lf5/c;", "Lg5/d;", "openHelper", "<init>", "(Lg5/d;)V", "", "fileName", "Li5/a;", "c", "(Ljava/lang/String;)Li5/a;", "a", "Lg5/d;", "", "b", "()Z", "hasConnectionPool$annotations", "()V", "hasConnectionPool", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6640b implements InterfaceC5360c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d openHelper;

    public C6640b(@NotNull InterfaceC6009d openHelper) {
        Intrinsics.checkNotNullParameter(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    @Override // p119f5.InterfaceC5360c
    /* JADX INFO: renamed from: b */
    public boolean mo24698b() {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;)Lf5/b; */
    @Override // p119f5.InterfaceC5360c
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6639a mo24697a(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String name = this.openHelper.getName();
        if (name == null) {
            if (!Intrinsics.m31980c(fileName, ":memory:")) {
                throw new IllegalArgumentException(("This driver is configured to open an in-memory database but a file-based named '" + fileName + "' was requested.").toString());
            }
        } else if (!Intrinsics.m31980c(name, fileName) && !Intrinsics.m31980c(StringsKt.m32161e1(name, '/', null, 2, null), StringsKt.m32161e1(fileName, '/', null, 2, null))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + this.openHelper.getName() + "' but '" + fileName + "' was requested.").toString());
        }
        return new C6639a(this.openHelper.mo6885t2());
    }
}
