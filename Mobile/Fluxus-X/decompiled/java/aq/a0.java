package aq;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096A¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Laq/a0;", "Ldv/g0;", BuildConfig.FLAVOR, "<init>", "()V", InquiryField.BooleanField.TYPE, "b", "(Z)Z", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements dv.g0<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final dv.b0<Boolean> f3294c = dv.i0.b(0, 1, cv.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv.b0<Boolean> f3295a = f3294c;

    public final boolean b(boolean z10) {
        return f3294c.a(Boolean.valueOf(z10));
    }

    @Override // dv.g0, dv.h
    @Nullable
    public Object collect(@NotNull dv.i<? super Boolean> iVar, @NotNull eu.b<?> bVar) {
        return this.f3295a.collect(iVar, bVar);
    }
}
