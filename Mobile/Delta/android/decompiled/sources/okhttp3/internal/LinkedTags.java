package okhttp3.internal;

import iu.m;
import iu.p;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/LinkedTags;", "", "K", "Lokhttp3/internal/Tags;", "Lhu/c;", "key", "value", "next", "<init>", "(Lhu/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lhu/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lhu/c;", "Ljava/lang/Object;", "Lokhttp3/internal/Tags;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class LinkedTags<K> extends Tags {

    @NotNull
    private final hu.c<K> key;

    @NotNull
    private final Tags next;

    @NotNull
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(@NotNull hu.c<K> key, @NotNull K value, @NotNull Tags next) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(next, "next");
        this.key = key;
        this.value = value;
        this.next = next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedTags toString$lambda$0(LinkedTags it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Tags tags = it.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(LinkedTags it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.key);
        sb2.append('=');
        sb2.append(it.value);
        return sb2.toString();
    }

    @Override // okhttp3.internal.Tags
    @Nullable
    public <T> T get(@NotNull hu.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.c(key, this.key) ? (T) yt.a.a(key).cast(this.value) : (T) this.next.get(key);
    }

    @Override // okhttp3.internal.Tags
    @NotNull
    public <T> Tags plus(@NotNull hu.c<T> key, @Nullable T value) {
        Tags linkedTags;
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.c(key, this.key)) {
            linkedTags = this.next;
        } else {
            Tags tagsPlus = this.next.plus(key, null);
            linkedTags = tagsPlus == this.next ? this : new LinkedTags(this.key, this.value, tagsPlus);
        }
        return value != null ? new LinkedTags(key, value, linkedTags) : linkedTags;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m0(CollectionsKt.y0(p.z(m.h(this, new Function1() { // from class: okhttp3.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkedTags.toString$lambda$0((LinkedTags) obj);
            }
        }))), null, "{", "}", 0, null, new Function1() { // from class: okhttp3.internal.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkedTags.toString$lambda$1((LinkedTags) obj);
            }
        }, 25, null);
    }
}
