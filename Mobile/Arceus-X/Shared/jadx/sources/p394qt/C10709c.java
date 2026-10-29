package p394qt;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qt.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lqt/c;", "", "T", "Lqt/a;", "Lkotlin/collections/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", "e", "(I)Ljava/lang/Enum;", "element", "", "d", "(Ljava/lang/Enum;)Z", "f", "(Ljava/lang/Enum;)I", "g", "b", "[Ljava/lang/Enum;", "()I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10709c<T extends Enum<T>> extends AbstractC7675d<T> implements InterfaceC10707a<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final T[] entries;

    public C10709c(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    @Override // kotlin.collections.AbstractC7671b
    /* JADX INFO: renamed from: b */
    public int get_size() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractC7671b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m40806d((Enum) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m40806d(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) C7693m.m31846O(this.entries, element.ordinal())) == element;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // kotlin.collections.AbstractC7675d, java.util.List
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        AbstractC7675d.INSTANCE.m31750b(index, this.entries.length);
        return this.entries[index];
    }

    /* JADX INFO: renamed from: f */
    public int m40808f(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C7693m.m31846O(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m40809g(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return m40808f(element);
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m40808f((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m40809g((Enum) obj);
        }
        return -1;
    }
}
