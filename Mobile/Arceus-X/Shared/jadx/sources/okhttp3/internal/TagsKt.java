package okhttp3.internal;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p348p1.C10146t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lhu/c;", Payload.TYPE, "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lhu/c;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TagsKt {
    @NotNull
    public static final <T> T computeIfAbsent(@NotNull AtomicReference<Tags> atomicReference, @NotNull InterfaceC6567c<T> type, @NotNull Function0<? extends T> compute) {
        Tags tags;
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(compute, "compute");
        T tInvoke = null;
        do {
            tags = atomicReference.get();
            T t8 = (T) tags.get(type);
            if (t8 != null) {
                return t8;
            }
            if (tInvoke == null) {
                tInvoke = compute.invoke();
            }
        } while (!C10146t.m39085a(atomicReference, tags, tags.plus(type, tInvoke)));
        return tInvoke;
    }
}
