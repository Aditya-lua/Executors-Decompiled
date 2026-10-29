package p255kt;

import au.InterfaceC1170a;
import au.InterfaceC1173d;
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
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.collections.AbstractC7679f;
import kotlin.collections.C7691l;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kt.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b!\b\u0000\u0018\u0000 `*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003-\\WB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010,J\u0017\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010I\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bN\u0010%J-\u0010O\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010\u0001\u001a\u00028\u00002\u0006\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0001\u0010\u0014J\u001f\u0010S\u001a\u00020$2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010MJ5\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010ZR\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010?¨\u0006a"}, m31665d2 = {"Lkt/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "u", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "x", "n", "B", "minCapacity", "A", "y", "(Ljava/util/List;)Z", "i", "C", "(II)V", "t", "p", "(ILjava/util/Collection;I)V", "rangeOffset", "rangeLength", "F", "retain", "G", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "I", "length", "c", "Z", "isReadOnly", "size", "d", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7825b<E> extends AbstractC7679f<E> implements List<E>, RandomAccess, Serializable, InterfaceC1173d {

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final b f29634d = new b(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C7825b f29635e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public E[] backing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int length;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isReadOnly;

    /* JADX INFO: renamed from: kt.b$a */
    @Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bL\u0010(J-\u0010K\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010M\u001a\u00020\nH\u0002¢\u0006\u0004\bK\u0010NJ\u0017\u0010O\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010\u0017J\u001f\u0010R\u001a\u00020'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010YR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010AR\u0014\u0010a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0014¨\u0006b"}, m31665d2 = {"Lkt/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkt/b;", "root", "<init>", "([Ljava/lang/Object;IILkt/b$a;Lkt/b;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "u", "l", "m", "", "p", "(Ljava/util/List;)Z", "i", "k", "n", "(ILjava/util/Collection;I)V", "x", "rangeOffset", "rangeLength", "y", "(II)V", "retain", "A", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "I", "c", "d", "Lkt/b$a;", "e", "Lkt/b;", "size", "t", "isReadOnly", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a<E> extends AbstractC7679f<E> implements List<E>, RandomAccess, Serializable, InterfaceC1173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public E[] backing;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int offset;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final a<E> parent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final C7825b<E> root;

        /* JADX INFO: renamed from: kt.b$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, m31665d2 = {"Lkt/b$a$a;", "E", "", "Lkt/b$a;", "list", "", "index", "<init>", "(Lkt/b$a;I)V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "", "set", "(Ljava/lang/Object;)V", "add", "remove", "()V", "b", "a", "Lkt/b$a;", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14198a<E> implements ListIterator<E>, InterfaceC1170a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final a<E> list;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public int index;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            public int lastIndex;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int expectedModCount;

            public C14198a(@NotNull a<E> list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i10;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                m32479b();
                a<E> aVar = this.list;
                int i10 = this.index;
                this.index = i10 + 1;
                aVar.add(i10, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            /* JADX INFO: renamed from: b */
            public final void m32479b() {
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
                m32479b();
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
                m32479b();
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
                m32479b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.mo31761b(i10);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                m32479b();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i10, element);
            }
        }

        public a(@NotNull E[] backing, int i10, int i11, @Nullable a<E> aVar, @NotNull C7825b<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = aVar;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        /* JADX INFO: renamed from: l */
        private final void m32469l() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: u */
        private final void m32470u() {
            ((AbstractList) this).modCount++;
        }

        /* JADX INFO: renamed from: A */
        public final int m32471A(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            a<E> aVar = this.parent;
            int iM32471A = aVar != null ? aVar.m32471A(rangeOffset, rangeLength, elements, retain) : this.root.m32446G(rangeOffset, rangeLength, elements, retain);
            if (iM32471A > 0) {
                m32470u();
            }
            this.length -= iM32471A;
            return iM32471A;
        }

        @Override // kotlin.collections.AbstractC7679f
        /* JADX INFO: renamed from: a */
        public int getSize() {
            m32469l();
            return this.length;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            m32474m();
            m32469l();
            m32473k(this.offset + this.length, element);
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            m32474m();
            m32469l();
            int size = elements.size();
            m32472i(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC7679f
        /* JADX INFO: renamed from: b */
        public E mo31761b(int index) {
            m32474m();
            m32469l();
            AbstractC7675d.INSTANCE.m31750b(index, this.length);
            return m32477x(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m32474m();
            m32469l();
            m32478y(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object other) {
            m32469l();
            if (other != this) {
                return (other instanceof List) && m32475p((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            m32469l();
            AbstractC7675d.INSTANCE.m31750b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m32469l();
            return C7826c.m32489i(this.backing, this.offset, this.length);
        }

        /* JADX INFO: renamed from: i */
        public final void m32472i(int i10, Collection<? extends E> elements, int n10) {
            m32470u();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.m32472i(i10, elements, n10);
            } else {
                this.root.m32456p(i10, elements, n10);
            }
            this.backing = (E[]) this.root.backing;
            this.length += n10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            m32469l();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (Intrinsics.m31980c(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m32469l();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        /* JADX INFO: renamed from: k */
        public final void m32473k(int i10, E element) {
            m32470u();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.m32473k(i10, element);
            } else {
                this.root.m32457t(i10, element);
            }
            this.backing = (E[]) this.root.backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            m32469l();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (Intrinsics.m31980c(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        /* JADX INFO: renamed from: m */
        public final void m32474m() {
            if (m32476t()) {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: p */
        public final boolean m32475p(List<?> other) {
            return C7826c.m32488h(this.backing, this.offset, this.length, other);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            m32474m();
            m32469l();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                mo31761b(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<?> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            m32474m();
            m32469l();
            return m32471A(this.offset, this.length, elements, false) > 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<?> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            m32474m();
            m32469l();
            return m32471A(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            m32474m();
            m32469l();
            AbstractC7675d.INSTANCE.m31750b(index, this.length);
            E[] eArr = this.backing;
            int i10 = this.offset;
            E e10 = eArr[i10 + index];
            eArr[i10 + index] = element;
            return e10;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int fromIndex, int toIndex) {
            AbstractC7675d.INSTANCE.m31752d(fromIndex, toIndex, this.length);
            return new a(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        /* JADX INFO: renamed from: t */
        public final boolean m32476t() {
            return this.root.isReadOnly;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            m32469l();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                C7691l.m31814i(eArr, array, 0, i11, i10 + i11);
                return (T[]) C7697o.m31879e(this.length, array);
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
            m32469l();
            return C7826c.m32490j(this.backing, this.offset, this.length, this);
        }

        /* JADX INFO: renamed from: x */
        public final E m32477x(int i10) {
            m32470u();
            a<E> aVar = this.parent;
            E eM32477x = aVar != null ? aVar.m32477x(i10) : (E) this.root.m32444E(i10);
            this.length--;
            return eM32477x;
        }

        /* JADX INFO: renamed from: y */
        public final void m32478y(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                m32470u();
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.m32478y(rangeOffset, rangeLength);
            } else {
                this.root.m32445F(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int index) {
            m32469l();
            AbstractC7675d.INSTANCE.m31751c(index, this.length);
            return new C14198a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            m32474m();
            m32469l();
            AbstractC7675d.INSTANCE.m31751c(index, this.length);
            m32473k(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            m32474m();
            m32469l();
            AbstractC7675d.INSTANCE.m31751c(index, this.length);
            int size = elements.size();
            m32472i(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            m32469l();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return C7691l.m31819n(eArr, i10, this.length + i10);
        }
    }

    /* JADX INFO: renamed from: kt.b$b */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lkt/b$b;", "", "<init>", "()V", "Lkt/b;", "", "Empty", "Lkt/b;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kt.b.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: kt.b$c */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, m31665d2 = {"Lkt/b$c;", "E", "", "Lkt/b;", "list", "", "index", "<init>", "(Lkt/b;I)V", "", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "Lkt/b;", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c<E> implements ListIterator<E>, InterfaceC1170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7825b<E> list;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int expectedModCount;

        public c(@NotNull C7825b<E> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i10;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        /* JADX INFO: renamed from: b */
        private final void m32480b() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            m32480b();
            C7825b<E> c7825b = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            c7825b.add(i10, element);
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
            m32480b();
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
            m32480b();
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
            m32480b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.mo31761b(i10);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            m32480b();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i10, element);
        }
    }

    static {
        C7825b c7825b = new C7825b(0);
        c7825b.isReadOnly = true;
        f29635e = c7825b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7825b() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: D */
    private final void m32443D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final E m32444E(int i10) {
        m32443D();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        C7691l.m31814i(eArr, eArr, i10, i10 + 1, this.length);
        C7826c.m32486f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m32445F(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            m32443D();
        }
        E[] eArr = this.backing;
        C7691l.m31814i(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i10 = this.length;
        C7826c.m32487g(eArr2, i10 - rangeLength, i10);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final int m32446G(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
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
        C7691l.m31814i(eArr2, eArr2, rangeOffset + i11, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i14 = this.length;
        C7826c.m32487g(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            m32443D();
        }
        this.length -= i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m32456p(int i10, Collection<? extends E> elements, int n10) {
        m32443D();
        m32462C(i10, n10);
        Iterator<? extends E> it = elements.iterator();
        for (int i11 = 0; i11 < n10; i11++) {
            this.backing[i10 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m32457t(int i10, E element) {
        m32443D();
        m32462C(i10, 1);
        this.backing[i10] = element;
    }

    /* JADX INFO: renamed from: x */
    private final void m32458x() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: y */
    private final boolean m32459y(List<?> other) {
        return C7826c.m32488h(this.backing, 0, this.length, other);
    }

    /* JADX INFO: renamed from: A */
    public final void m32460A(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) C7826c.m32485e(this.backing, AbstractC7675d.INSTANCE.m31753e(eArr.length, minCapacity));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m32461B(int n10) {
        m32460A(this.length + n10);
    }

    /* JADX INFO: renamed from: C */
    public final void m32462C(int i10, int n10) {
        m32461B(n10);
        E[] eArr = this.backing;
        C7691l.m31814i(eArr, eArr, i10 + n10, i10, this.length);
        this.length += n10;
    }

    @Override // kotlin.collections.AbstractC7679f
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        m32458x();
        m32457t(this.length, element);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m32458x();
        int size = elements.size();
        m32456p(this.length, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC7679f
    /* JADX INFO: renamed from: b */
    public E mo31761b(int index) {
        m32458x();
        AbstractC7675d.INSTANCE.m31750b(index, this.length);
        return m32444E(index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m32458x();
        m32445F(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof List) && m32459y((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractC7675d.INSTANCE.m31750b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return C7826c.m32489i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (Intrinsics.m31980c(this.backing[i10], element)) {
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
            if (Intrinsics.m31980c(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        m32458x();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            mo31761b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<?> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m32458x();
        return m32446G(0, this.length, elements, false) > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<?> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m32458x();
        return m32446G(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        m32458x();
        AbstractC7675d.INSTANCE.m31750b(index, this.length);
        E[] eArr = this.backing;
        E e10 = eArr[index];
        eArr[index] = element;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractC7675d.INSTANCE.m31752d(fromIndex, toIndex, this.length);
        return new a(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            C7691l.m31814i(this.backing, array, 0, 0, i10);
            return (T[]) C7697o.m31879e(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return C7826c.m32490j(this.backing, 0, this.length, this);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<E> m32463u() {
        m32458x();
        this.isReadOnly = true;
        return this.length > 0 ? this : f29635e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7825b(int i10) {
        this.backing = (E[]) C7826c.m32484d(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        AbstractC7675d.INSTANCE.m31751c(index, this.length);
        return new c(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        m32458x();
        AbstractC7675d.INSTANCE.m31751c(index, this.length);
        m32457t(index, element);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r1v0 int))
     A[MD:(int):void (m)] (LINE:4) call: kt.b.<init>(int):void type: THIS */
    public /* synthetic */ C7825b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m32458x();
        AbstractC7675d.INSTANCE.m31751c(index, this.length);
        int size = elements.size();
        m32456p(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return C7691l.m31819n(this.backing, 0, this.length);
    }
}
