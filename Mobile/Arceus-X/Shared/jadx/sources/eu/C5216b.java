package eu;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"Leu/b;", "Leu/a;", "<init>", "()V", "eu/b$a", "c", "Leu/b$a;", "implStorage", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5216b extends AbstractC5215a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a implStorage = new a();

    /* JADX INFO: renamed from: eu.b$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"eu/b$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends ThreadLocal<Random> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // eu.AbstractC5215a
    @NotNull
    /* JADX INFO: renamed from: i */
    public Random mo24174i() {
        Random random = this.implStorage.get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
