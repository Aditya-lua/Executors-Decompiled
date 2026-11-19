package ua;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import ta.c0;
import ta.e0;
import ta.g0;
import ta.i;
import ta.i0;
import ta.k0;
import ta.m;
import ta.m0;
import ta.q0;
import ta.s;
import ta.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lua/c;", "Lua/a$a;", "<init>", "()V", "Lcom/google/android/gms/common/api/Status;", "status", "Lta/m0;", "result", BuildConfig.FLAVOR, "f0", "(Lcom/google/android/gms/common/api/Status;Lta/m0;)V", "Lta/e0;", "K0", "(Lcom/google/android/gms/common/api/Status;Lta/e0;)V", "Lta/m;", "b1", "(Lcom/google/android/gms/common/api/Status;Lta/m;)V", "Lta/i;", "I1", "(Lcom/google/android/gms/common/api/Status;Lta/i;)V", "Lta/g;", "c2", "(Lcom/google/android/gms/common/api/Status;Lta/g;)V", "Lta/g0;", "R0", "(Lcom/google/android/gms/common/api/Status;Lta/g0;)V", "Lta/k0;", "Q0", "(Lcom/google/android/gms/common/api/Status;Lta/k0;)V", "Lta/i0;", "b0", "(Lcom/google/android/gms/common/api/Status;Lta/i0;)V", "Lta/c;", "B", "(Lcom/google/android/gms/common/api/Status;Lta/c;)V", "Lta/q0;", "e0", "(Lcom/google/android/gms/common/api/Status;Lta/q0;)V", "Lta/e;", "M1", "(Lcom/google/android/gms/common/api/Status;Lta/e;)V", "Lta/c0;", "e2", "(Lcom/google/android/gms/common/api/Status;Lta/c0;)V", "Lta/u;", "f1", "(Lcom/google/android/gms/common/api/Status;Lta/u;)V", "Lta/s;", "C0", "(Lcom/google/android/gms/common/api/Status;Lta/s;)V", "Lta/a;", "Q", "(Lcom/google/android/gms/common/api/Status;Lta/a;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c extends a.AbstractBinderC0671a {
    @Override // ua.a
    public void B(@NonNull Status status, @Nullable ta.c result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void C0(@NonNull Status status, @Nullable s result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void I1(@NonNull Status status, @Nullable i result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void K0(@NonNull Status status, @Nullable e0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void M1(@NonNull Status status, @Nullable ta.e result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void Q(@NonNull Status status, @Nullable ta.a result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void Q0(@NonNull Status status, @Nullable k0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void R0(@NonNull Status status, @Nullable g0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void b0(@NonNull Status status, @Nullable i0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void b1(@NonNull Status status, @Nullable m result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void c2(@NonNull Status status, @Nullable ta.g result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void e0(@NonNull Status status, @Nullable q0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void e2(@NonNull Status status, @Nullable c0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void f0(@NonNull Status status, @Nullable m0 result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // ua.a
    public void f1(@NonNull Status status, @Nullable u result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }
}
