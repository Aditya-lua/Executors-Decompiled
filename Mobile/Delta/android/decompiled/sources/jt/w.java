package jt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Ljt/w;", "", "", "data", "b", "(I)I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "e", "(I)Ljava/lang/String;", "a", "I", "getData$annotations", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements Comparable<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int data;

    public /* synthetic */ w(int i10) {
        this.data = i10;
    }

    public static final /* synthetic */ w a(int i10) {
        return new w(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).getData();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(w wVar) {
        return f0.a(getData(), wVar.getData());
    }

    public boolean equals(Object other) {
        return c(this.data, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    public int hashCode() {
        return d(this.data);
    }

    @NotNull
    public String toString() {
        return e(this.data);
    }
}
