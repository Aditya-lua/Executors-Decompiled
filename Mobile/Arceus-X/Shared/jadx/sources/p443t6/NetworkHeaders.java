package p443t6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t6.n, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0019\u000bB#\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lt6/n;", "", "", "", "", "data", "<init>", "(Ljava/util/Map;)V", "key", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/util/Map;", "Lt6/n$a;", "d", "()Lt6/n$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NetworkHeaders {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final NetworkHeaders f40873c = new a().m43152b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, List<String>> data;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.Map) A[MD:(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>):void (m)] (LINE:1) call: t6.n.<init>(java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ NetworkHeaders(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> m43148b() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m43149c(@NotNull String key) {
        Map<String, List<String>> map = this.data;
        String lowerCase = key.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List<String> list = map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.m31718p0(list);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final a m43150d() {
        return new a(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkHeaders) && Intrinsics.m31980c(this.data, ((NetworkHeaders) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkHeaders(data=" + this.data + ')';
    }

    /* JADX INFO: renamed from: t6.n$a */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J \u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lt6/n$a;", "", "<init>", "()V", "Lt6/n;", "headers", "(Lt6/n;)V", "", "key", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lt6/n$a;", "", "values", "d", "(Ljava/lang/String;Ljava/util/List;)Lt6/n$a;", "a", "b", "()Lt6/n;", "", "", "Ljava/util/Map;", "data", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, List<String>> data;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this.data = new LinkedHashMap();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m43151a(@NotNull String key, @NotNull String value) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List<String> arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(lowerCase, arrayList);
            }
            arrayList.add(value);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final NetworkHeaders m43152b() {
            return new NetworkHeaders(C7690k0.m31807v(this.data), null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m43153c(@NotNull String key, @NotNull String value) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, C7699p.m31897p(value));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m43154d(@NotNull String key, @NotNull List<String> values) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.m31689O0(values));
            return this;
        }

        public a(@NotNull NetworkHeaders networkHeaders) {
            Map map = networkHeaders.data;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.m31689O0((Collection) entry.getValue()));
            }
            this.data = linkedHashMap;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkHeaders(Map<String, ? extends List<String>> map) {
        this.data = map;
    }
}
