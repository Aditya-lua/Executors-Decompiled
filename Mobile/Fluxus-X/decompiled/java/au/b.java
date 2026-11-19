package au;

import com.github.luben.zstd.BuildConfig;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.l;
import p001kotlin.collections.o;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003-[VB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010,J\u0017\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010I\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010E\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bE\u0010%J-\u0010N\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0001\u001a\u00028\u00002\u0006\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0001\u0010\u0014J\u001f\u0010R\u001a\u00020$2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010MJ5\u0010T\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010S\u001a\u00020\u000fH\u0002¢\u0006\u0004\bT\u0010UR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010YR\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010?¨\u0006`"}, d2 = {"Lau/b;", "E", BuildConfig.FLAVOR, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "initialCapacity", "<init>", "(I)V", BuildConfig.FLAVOR, "t", "()Ljava/util/List;", BuildConfig.FLAVOR, "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", BuildConfig.FLAVOR, "iterator", "()Ljava/util/Iterator;", BuildConfig.FLAVOR, "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "(ILjava/lang/Object;)V", BuildConfig.FLAVOR, "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", BuildConfig.FLAVOR, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "D", "w", "n", "B", "minCapacity", "A", "x", "(Ljava/util/List;)Z", "i", "C", "(II)V", "m", "(ILjava/util/Collection;I)V", "rangeOffset", "rangeLength", "F", "retain", "G", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "I", "length", "c", "Z", "isReadOnly", "size", "d", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b<E> extends p001kotlin.collections.f<E> implements List<E>, RandomAccess, Serializable, qu.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C0074b f3335d = new C0074b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f3336e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public E[] backing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int length;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isReadOnly;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0019\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bK\u0010(J-\u0010M\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010\u0017J\u001f\u0010R\u001a\u00020'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010YR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010AR\u0014\u0010`\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014¨\u0006a"}, d2 = {"Lau/b$a;", "E", BuildConfig.FLAVOR, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "backing", BuildConfig.FLAVOR, "offset", "length", "parent", "Lau/b;", "root", "<init>", "([Ljava/lang/Object;IILau/b$a;Lau/b;)V", BuildConfig.FLAVOR, "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", BuildConfig.FLAVOR, "iterator", "()Ljava/util/Iterator;", BuildConfig.FLAVOR, "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "(ILjava/lang/Object;)V", BuildConfig.FLAVOR, "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "t", "j", "l", BuildConfig.FLAVOR, "m", "(Ljava/util/List;)Z", "i", "n", "h", "(ILjava/util/Collection;I)V", "w", "rangeOffset", "rangeLength", "x", "(II)V", "retain", "A", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "I", "c", "d", "Lau/b$a;", "e", "Lau/b;", "size", "isReadOnly", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<E> extends p001kotlin.collections.f<E> implements List<E>, RandomAccess, Serializable, qu.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public E[] backing;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final a<E> parent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final b<E> root;

        /* JADX INFO: renamed from: au.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lau/b$a$a;", "E", BuildConfig.FLAVOR, "Lau/b$a;", "list", BuildConfig.FLAVOR, "index", "<init>", "(Lau/b$a;I)V", BuildConfig.FLAVOR, "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", BuildConfig.FLAVOR, "set", "(Ljava/lang/Object;)V", "add", "remove", "()V", "b", "a", "Lau/b$a;", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0073a<E> implements ListIterator<E>, qu.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final a<E> list;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public int index;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public int lastIndex;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public int expectedModCount;

            public C0073a(@NotNull a<E> list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i10;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                b();
                a<E> aVar = this.list;
                int i10 = this.index;
                this.index = i10 + 1;
                aVar.add(i10, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            public final void b() {
                if (((AbstractList) this.list.root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < this.list.length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                if (this.index >= this.list.length) {
                    throw new NoSuchElementException();
                }
                int i10 = this.index;
                this.index = i10 + 1;
                this.lastIndex = i10;
                return (E) this.list.backing[this.list.offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i10 = this.index;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.index = i11;
                this.lastIndex = i11;
                return (E) this.list.backing[this.list.offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.b(i10);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i10, element);
            }
        }

        public a(@NotNull E[] backing, int i10, int i11, @Nullable a<E> aVar, @NotNull b<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = aVar;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void j() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void t() {
            ((AbstractList) this).modCount++;
        }

        public final int A(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            a<E> aVar = this.parent;
            int iA = aVar != null ? aVar.A(rangeOffset, rangeLength, elements, retain) : this.root.G(rangeOffset, rangeLength, elements, retain);
            if (iA > 0) {
                t();
            }
            this.length -= iA;
            return iA;
        }

        @Override // p001kotlin.collections.f
        /* JADX INFO: renamed from: a */
        public int getSize() {
            j();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            l();
            j();
            i(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            l();
            j();
            int size = elements.size();
            h(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // p001kotlin.collections.f
        public E b(int index) {
            l();
            j();
            p001kotlin.collections.d.INSTANCE.b(index, this.length);
            return w(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            l();
            j();
            x(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object other) {
            j();
            if (other != this) {
                return (other instanceof List) && m((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            j();
            p001kotlin.collections.d.INSTANCE.b(index, this.length);
            return this.backing[this.offset + index];
        }

        public final void h(int i10, Collection<? extends E> elements, int n10) {
            t();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.h(i10, elements, n10);
            } else {
                this.root.m(i10, elements, n10);
            }
            this.backing = (E[]) this.root.backing;
            this.length += n10;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            j();
            return au.c.i(this.backing, this.offset, this.length);
        }

        public final void i(int i10, E element) {
            t();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.i(i10, element);
            } else {
                this.root.n(i10, element);
            }
            this.backing = (E[]) this.root.backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            j();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (Intrinsics.c(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            j();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void l() {
            if (n()) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            j();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (Intrinsics.c(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final boolean m(List<?> other) {
            return au.c.h(this.backing, this.offset, this.length, other);
        }

        public final boolean n() {
            return this.root.isReadOnly;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            l();
            j();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                b(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            l();
            j();
            return A(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            l();
            j();
            return A(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            l();
            j();
            p001kotlin.collections.d.INSTANCE.b(index, this.length);
            E[] eArr = this.backing;
            int i10 = this.offset;
            E e10 = eArr[i10 + index];
            eArr[i10 + index] = element;
            return e10;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int fromIndex, int toIndex) {
            p001kotlin.collections.d.INSTANCE.d(fromIndex, toIndex, this.length);
            return new a(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            j();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                l.i(eArr, array, 0, i11, i10 + i11);
                return (T[]) o.e(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            j();
            return au.c.j(this.backing, this.offset, this.length, this);
        }

        public final E w(int i10) {
            t();
            a<E> aVar = this.parent;
            E eW = aVar != null ? aVar.w(i10) : (E) this.root.E(i10);
            this.length--;
            return eW;
        }

        public final void x(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                t();
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.x(rangeOffset, rangeLength);
            } else {
                this.root.F(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int index) {
            j();
            p001kotlin.collections.d.INSTANCE.c(index, this.length);
            return new C0073a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            l();
            j();
            p001kotlin.collections.d.INSTANCE.c(index, this.length);
            i(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            l();
            j();
            p001kotlin.collections.d.INSTANCE.c(index, this.length);
            int size = elements.size();
            h(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            j();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return l.n(eArr, i10, this.length + i10);
        }
    }

    /* JADX INFO: renamed from: au.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/b$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lau/b;", BuildConfig.FLAVOR, "Empty", "Lau/b;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0074b {
        public /* synthetic */ C0074b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0074b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lau/b$c;", "E", BuildConfig.FLAVOR, "Lau/b;", "list", BuildConfig.FLAVOR, "index", "<init>", "(Lau/b;I)V", BuildConfig.FLAVOR, "b", "()V", BuildConfig.FLAVOR, "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "Lau/b;", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c<E> implements ListIterator<E>, qu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final b<E> list;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int expectedModCount;

        public c(@NotNull b<E> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i10;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            b();
            b<E> bVar = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            bVar.add(i10, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.index >= this.list.length) {
                throw new NoSuchElementException();
            }
            int i10 = this.index;
            this.index = i10 + 1;
            this.lastIndex = i10;
            return (E) this.list.backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i10 = this.index;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.index = i11;
            this.lastIndex = i11;
            return (E) this.list.backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.b(i10);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i10, element);
        }
    }

    static {
        b bVar = new b(0);
        bVar.isReadOnly = true;
        f3336e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E E(int i10) {
        D();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        l.i(eArr, eArr, i10, i10 + 1, this.length);
        au.c.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            D();
        }
        E[] eArr = this.backing;
        l.i(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i10 = this.length;
        au.c.g(eArr2, i10 - rangeLength, i10);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < rangeLength) {
            int i12 = rangeOffset + i10;
            if (elements.contains(this.backing[i12]) == retain) {
                E[] eArr = this.backing;
                i10++;
                eArr[i11 + rangeOffset] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = rangeLength - i11;
        E[] eArr2 = this.backing;
        l.i(eArr2, eArr2, rangeOffset + i11, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i14 = this.length;
        au.c.g(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            D();
        }
        this.length -= i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i10, Collection<? extends E> elements, int n10) {
        D();
        C(i10, n10);
        Iterator<? extends E> it = elements.iterator();
        for (int i11 = 0; i11 < n10; i11++) {
            this.backing[i10 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i10, E element) {
        D();
        C(i10, 1);
        this.backing[i10] = element;
    }

    private final void w() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean x(List<?> other) {
        return au.c.h(this.backing, 0, this.length, other);
    }

    public final void A(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) au.c.e(this.backing, p001kotlin.collections.d.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    public final void B(int n10) {
        A(this.length + n10);
    }

    public final void C(int i10, int n10) {
        B(n10);
        E[] eArr = this.backing;
        l.i(eArr, eArr, i10 + n10, i10, this.length);
        this.length += n10;
    }

    @Override // p001kotlin.collections.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        w();
        n(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        w();
        int size = elements.size();
        m(this.length, elements, size);
        return size > 0;
    }

    @Override // p001kotlin.collections.f
    public E b(int index) {
        w();
        p001kotlin.collections.d.INSTANCE.b(index, this.length);
        return E(index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        w();
        F(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof List) && x((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        p001kotlin.collections.d.INSTANCE.b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return au.c.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (Intrinsics.c(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (Intrinsics.c(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        w();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        w();
        return G(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        w();
        return G(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        w();
        p001kotlin.collections.d.INSTANCE.b(index, this.length);
        E[] eArr = this.backing;
        E e10 = eArr[index];
        eArr[index] = element;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        p001kotlin.collections.d.INSTANCE.d(fromIndex, toIndex, this.length);
        return new a(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @NotNull
    public final List<E> t() {
        w();
        this.isReadOnly = true;
        return this.length > 0 ? this : f3336e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            l.i(this.backing, array, 0, 0, i10);
            return (T[]) o.e(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return au.c.j(this.backing, 0, this.length, this);
    }

    public b(int i10) {
        this.backing = (E[]) au.c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        p001kotlin.collections.d.INSTANCE.c(index, this.length);
        return new c(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        w();
        p001kotlin.collections.d.INSTANCE.c(index, this.length);
        n(index, element);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        w();
        p001kotlin.collections.d.INSTANCE.c(index, this.length);
        int size = elements.size();
        m(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return l.n(this.backing, 0, this.length);
    }
}
