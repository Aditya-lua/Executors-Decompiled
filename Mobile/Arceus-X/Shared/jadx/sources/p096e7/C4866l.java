package p096e7;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;

/* JADX INFO: renamed from: e7.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lxu/l;", "Lxu/h0;", "file", "", "mustCreate", "", "a", "(Lxu/l;Lxu/h0;Z)V", "directory", "c", "(Lxu/l;Lxu/h0;)V", "", "d", "(Lxu/h0;)Ljava/lang/String;", "extension", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4866l {
    /* JADX INFO: renamed from: a */
    public static final void m23469a(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0, boolean z10) {
        if (z10) {
            C4861h0.m23441h(abstractC12938l.sink(c12931h0, true));
        } else {
            if (abstractC12938l.exists(c12931h0)) {
                return;
            }
            C4861h0.m23441h(abstractC12938l.sink(c12931h0));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23470b(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m23469a(abstractC12938l, c12931h0, z10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m23471c(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0) throws IOException {
        try {
            IOException iOException = null;
            for (C12931h0 c12931h1 : abstractC12938l.list(c12931h0)) {
                try {
                    if (abstractC12938l.metadata(c12931h1).getIsDirectory()) {
                        m23471c(abstractC12938l, c12931h1);
                    }
                    abstractC12938l.delete(c12931h1);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m23472d(@NotNull C12931h0 c12931h0) {
        return StringsKt.m32157c1(c12931h0.m48125e(), '.', "");
    }
}
