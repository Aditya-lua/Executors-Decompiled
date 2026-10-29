package p294mj;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294mj.InterfaceC8549j0;

/* JADX INFO: renamed from: mj.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001 B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00028\u00000)j\b\u0012\u0004\u0012\u00028\u0000`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+¨\u0006-"}, m31665d2 = {"Lmj/v;", "Lmj/j0;", "T", "", "Lmj/v$a;", "notificationMatcher", "<init>", "(Lmj/v$a;)V", "notification", "", "f", "(Lmj/j0;)V", "", "id", "g", "(Ljava/lang/String;)Lmj/j0;", "", InquiryField.DateField.TYPE, "h", "(J)V", "", "i", "()I", "index", "b", "(I)Lmj/j0;", "", "c", "()Ljava/util/List;", "", "e", "()Z", "a", "()V", "n1", "n2", "d", "(Lmj/j0;Lmj/j0;)Z", "Lmj/v$a;", "getNotificationMatcher", "()Lmj/v$a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "notifications", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8562v<T extends InterfaceC8549j0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a<T> notificationMatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<T> notifications;

    /* JADX INFO: renamed from: mj.v$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lmj/v$a;", "T", "", "o1", "o2", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a<T> {
        /* JADX INFO: renamed from: b */
        boolean mo30012b(@Nullable T o8, @Nullable T o10);
    }

    public C8562v(@NotNull a<T> notificationMatcher) {
        Intrinsics.checkNotNullParameter(notificationMatcher, "notificationMatcher");
        this.notificationMatcher = notificationMatcher;
        this.notifications = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m34491a() {
        synchronized (this.notifications) {
            this.notifications.clear();
            Unit unit = Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final T m34492b(int index) {
        T t8;
        synchronized (this.notifications) {
            if (index >= 0) {
                if (index < this.notifications.size()) {
                    T t10 = this.notifications.get(index);
                    Intrinsics.checkNotNullExpressionValue(t10, "get(...)");
                    t8 = t10;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.notifications.size());
        }
        return t8;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<T> m34493c() {
        ArrayList arrayList;
        synchronized (this.notifications) {
            arrayList = new ArrayList(this.notifications);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m34494d(T n10, T n11) {
        return this.notificationMatcher.mo30012b(n10, n11);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m34495e() {
        boolean zIsEmpty;
        synchronized (this.notifications) {
            zIsEmpty = this.notifications.isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX INFO: renamed from: f */
    public final void m34496f(@NotNull T notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        synchronized (this.notifications) {
            try {
                ArrayList<T> arrayList = this.notifications;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        i10 = -1;
                        break;
                    }
                    T t8 = arrayList.get(i11);
                    i11++;
                    if (m34494d(notification, t8)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    this.notifications.set(numValueOf.intValue(), notification);
                    Unit unit = Unit.f29331a;
                } else {
                    this.notifications.add(notification);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final T m34497g(@NotNull String id2) {
        T tRemove;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.notifications) {
            try {
                ArrayList<T> arrayList = this.notifications;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        i10 = -1;
                        break;
                    }
                    T t8 = arrayList.get(i11);
                    i11++;
                    if (Intrinsics.m31980c(t8.mo34422b(), id2)) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                tRemove = null;
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    tRemove = this.notifications.remove(numValueOf.intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tRemove;
    }

    /* JADX INFO: renamed from: h */
    public final void m34498h(long date) {
        synchronized (this.notifications) {
            try {
                Iterator<T> it = this.notifications.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    if (it.next().mo34421a() <= date) {
                        it.remove();
                    }
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m34499i() {
        int size;
        synchronized (this.notifications) {
            size = this.notifications.size();
        }
        return size;
    }
}
