package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 &2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\t&B\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lmv/y;", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "a", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "index", "c", "(I)Ljava/lang/String;", "g", BuildConfig.FLAVOR, "d", "()Ljava/util/Set;", BuildConfig.FLAVOR, "h", "(Ljava/lang/String;)Ljava/util/List;", BuildConfig.FLAVOR, "iterator", "()Ljava/util/Iterator;", "Lmv/y$a;", "e", "()Lmv/y$a;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "size", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements Iterable<Pair<? extends String, ? extends String>>, qu.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final y f24791c = new y(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] namesAndValues;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmv/y$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "line", "c", "(Ljava/lang/String;)Lmv/y$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lmv/y$a;", "e", "Lmv/y;", "headers", "b", "(Lmv/y;)Lmv/y$a;", "d", "i", "j", "g", "(Ljava/lang/String;)Ljava/lang/String;", "f", "()Lmv/y;", BuildConfig.FLAVOR, "Ljava/util/List;", "h", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return nv.k.b(this, name, value);
        }

        @NotNull
        public final a b(@NotNull y headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return nv.k.c(this, headers);
        }

        @NotNull
        public final a c(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iM0 = StringsKt.m0(line, ':', 1, false, 4, null);
            if (iM0 != -1) {
                String strSubstring = line.substring(0, iM0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iM0 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                d(BuildConfig.FLAVOR, line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            d(BuildConfig.FLAVOR, strSubstring3);
            return this;
        }

        @NotNull
        public final a d(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return nv.k.d(this, name, value);
        }

        @NotNull
        public final a e(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            nv.k.s(name);
            d(name, value);
            return this;
        }

        @NotNull
        public final y f() {
            return nv.k.e(this);
        }

        @Nullable
        public final String g(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return nv.k.g(this, name);
        }

        @NotNull
        public final List<String> h() {
            return this.namesAndValues;
        }

        @NotNull
        public final a i(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return nv.k.n(this, name);
        }

        @NotNull
        public final a j(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return nv.k.o(this, name, value);
        }
    }

    /* JADX INFO: renamed from: mv.y$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmv/y$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "namesAndValues", "Lmv/y;", "a", "([Ljava/lang/String;)Lmv/y;", "EMPTY", "Lmv/y;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final y a(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return nv.k.j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public Companion() {
        }
    }

    public y(@NotNull String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.namesAndValues = namesAndValues;
    }

    @NotNull
    public static final y f(@NotNull String... strArr) {
        return INSTANCE.a(strArr);
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return nv.k.i(this.namesAndValues, name);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    @NotNull
    public final String c(int index) {
        return nv.k.l(this, index);
    }

    @NotNull
    public final Set<String> d() {
        TreeSet treeSet = new TreeSet(p001kotlin.text.x.G(p001kotlin.jvm.internal.g0.f21582a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(c(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final a e() {
        return nv.k.m(this);
    }

    public boolean equals(@Nullable Object other) {
        return nv.k.f(this, other);
    }

    @NotNull
    public final String g(int index) {
        return nv.k.q(this, index);
    }

    @NotNull
    public final List<String> h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return nv.k.r(this, name);
    }

    public int hashCode() {
        return nv.k.h(this);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return nv.k.k(this);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public String toString() {
        return nv.k.p(this);
    }
}
