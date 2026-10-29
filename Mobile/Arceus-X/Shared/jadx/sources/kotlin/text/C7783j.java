package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC7671b;
import kotlin.collections.AbstractC7675d;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6988p;

/* JADX INFO: renamed from: kotlin.text.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m31665d2 = {"Lkotlin/text/j;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lkotlin/text/i;", "c", "Lkotlin/text/i;", "d", "()Lkotlin/text/i;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7783j implements MatchResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Matcher matcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CharSequence input;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7782i groups;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public List<String> groupValues_;

    /* JADX INFO: renamed from: kotlin.text.j$a */
    @Metadata(m31664d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"kotlin/text/j$a", "Lkotlin/collections/d;", "", "", "index", "e", "(I)Ljava/lang/String;", "b", "()I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC7675d<String> {
        public a() {
        }

        @Override // kotlin.collections.AbstractC7671b
        /* JADX INFO: renamed from: b */
        public int getSize() {
            return C7783j.this.m32253f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC7671b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m32254d((String) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public /* bridge */ boolean m32254d(String str) {
            return super.contains(str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // kotlin.collections.AbstractC7675d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String get(int index) {
            String strGroup = C7783j.this.m32253f().group(index);
            return strGroup == null ? "" : strGroup;
        }

        /* JADX INFO: renamed from: f */
        public /* bridge */ int m32256f(String str) {
            return super.indexOf(str);
        }

        /* JADX INFO: renamed from: g */
        public /* bridge */ int m32257g(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractC7675d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m32256f((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC7675d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m32257g((String) obj);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.j$b */
    @Metadata(m31664d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"kotlin/text/j$b", "", "Lkotlin/collections/b;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/MatchGroup;", "b", "()I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC7671b<MatchGroup> implements InterfaceC7782i {
        public b() {
        }

        /* JADX INFO: renamed from: f */
        public static final MatchGroup m32259f(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // kotlin.collections.AbstractC7671b
        /* JADX INFO: renamed from: b */
        public int getSize() {
            return C7783j.this.m32253f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC7671b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return m32260e((MatchGroup) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public /* bridge */ boolean m32260e(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.l.d(java.util.regex.MatchResult, int):kotlin.ranges.IntRange */
        @Override // kotlin.text.InterfaceC7782i
        public MatchGroup get(int index) {
            IntRange intRangeM32269i = C7785l.m32269i(C7783j.this.m32253f(), index);
            if (intRangeM32269i.mo27446b().intValue() < 0) {
                return null;
            }
            String strGroup = C7783j.this.m32253f().group(index);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeM32269i);
        }

        @Override // kotlin.collections.AbstractC7671b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            return C6988p.m29396x(CollectionsKt.m31696U(C7699p.m31893l(this)), new Function1() { // from class: kotlin.text.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7783j.b.m32259f(this.f29566a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public C7783j(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new b();
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ MatchResult.C7768b mo32102a() {
        return MatchResult.C7767a.m32106a(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<String> mo32103b() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        List<String> list = this.groupValues_;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: c */
    public IntRange mo32104c() {
        return C7785l.m32268h(m32253f());
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC7782i getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: f */
    public final java.util.regex.MatchResult m32253f() {
        return this.matcher;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        String strGroup = m32253f().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }
}
