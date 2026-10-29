package p016an;

import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: an.c0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J1\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lan/c0;", "", "RenderingT", "Lhu/c;", "renderingType", "Lan/a0;", "a", "(Lhu/c;)Lan/a0;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC0368c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f902b;

    /* JADX INFO: renamed from: an.c0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31665d2 = {"Lan/c0$a;", "Lan/z;", "Lan/c0;", "<init>", "()V", "b", "()Lan/c0;", "default", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion extends ViewEnvironmentKey<InterfaceC0368c0> {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Companion f902b = new Companion();

        public Companion() {
            super(C7731d0.m32002b(InterfaceC0368c0.class));
        }

        /* JADX DEBUG: Method merged with bridge method: a()Ljava/lang/Object; */
        @Override // p016an.ViewEnvironmentKey
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC0368c0 mo1390a() {
            return C0370d0.m1398a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    <RenderingT> InterfaceC0364a0<RenderingT> mo1389a(@NotNull InterfaceC6567c<? extends RenderingT> renderingType);
}
