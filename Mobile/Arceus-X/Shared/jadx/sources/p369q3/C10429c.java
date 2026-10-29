package p369q3;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q3.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lq3/c;", "", "<init>", "()V", "", "a", "Ljava/util/ArrayList;", "Lq3/b;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "customview-poolingcontainer_release"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C10429c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC10428b> listeners = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m40140a() {
        for (int iM31894m = C7699p.m31894m(this.listeners); -1 < iM31894m; iM31894m--) {
            this.listeners.get(iM31894m).m40139a();
        }
    }
}
