package p395qu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.AbstractC10713b0;

/* JADX INFO: renamed from: qu.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0010"}, m31665d2 = {"Lqu/c0;", "Lqu/b0;", "S", "", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/lang/Object;)Z", "isClosed", "b", "(Ljava/lang/Object;)Lqu/b0;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10715c0<S extends AbstractC10713b0<S>> {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <S extends AbstractC10713b0<S>> Object m40832a(@Nullable Object obj) {
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final S m40833b(Object obj) {
        if (obj == C10712b.f38266a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.m31981d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m40834c(Object obj) {
        return obj == C10712b.f38266a;
    }
}
