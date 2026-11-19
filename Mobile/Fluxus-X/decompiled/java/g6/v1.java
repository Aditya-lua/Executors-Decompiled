package g6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import h6.NetworkRequestCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lg6/v1;", BuildConfig.FLAVOR, "<init>", "()V", "Ly5/o0$c;", "state", BuildConfig.FLAVOR, "k", "(Ly5/o0$c;)I", "value", "g", "(I)Ly5/o0$c;", "Ly5/a;", "backoffPolicy", "a", "(Ly5/a;)I", "d", "(I)Ly5/a;", "Ly5/x;", "networkType", "h", "(Ly5/x;)I", "e", "(I)Ly5/x;", "Ly5/f0;", "policy", "i", "(Ly5/f0;)I", "f", "(I)Ly5/f0;", BuildConfig.FLAVOR, "Ly5/d$c;", "triggers", BuildConfig.FLAVOR, "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "Lh6/s;", "l", "([B)Lh6/s;", "requestCompat", "c", "(Lh6/s;)[B", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v1 f17402a = new v1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17403a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f17405d;

        static {
            int[] iArr = new int[y5.o0.c.values().length];
            try {
                iArr[y5.o0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y5.o0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y5.o0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y5.o0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y5.o0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y5.o0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f17403a = iArr;
            int[] iArr2 = new int[y5.a.values().length];
            try {
                iArr2[y5.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[y5.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[y5.x.values().length];
            try {
                iArr3[y5.x.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[y5.x.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[y5.x.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[y5.x.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[y5.x.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f17404c = iArr3;
            int[] iArr4 = new int[y5.f0.values().length];
            try {
                iArr4[y5.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[y5.f0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f17405d = iArr4;
        }
    }

    public static final int a(@NotNull y5.a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = a.b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new zt.l();
    }

    @NotNull
    public static final Set<y5.d.c> b(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        Intrinsics.checkNotNull(uri);
                        linkedHashSet.add(new y5.d.c(uri, z10));
                    }
                    Unit unit = Unit.f21506a;
                    lu.c.a(objectInputStream, null);
                    Unit unit2 = Unit.f21506a;
                    lu.c.a(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    lu.c.a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @NotNull
    public static final byte[] c(@NotNull NetworkRequestCompat requestCompat) {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestB = requestCompat.b();
        if (networkRequestB == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = h6.t.c(networkRequestB);
                int[] iArrB = h6.t.b(networkRequestB);
                objectOutputStream.writeInt(iArrC.length);
                for (int i10 : iArrC) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i11 : iArrB) {
                    objectOutputStream.writeInt(i11);
                }
                Unit unit = Unit.f21506a;
                lu.c.a(objectOutputStream, null);
                lu.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                lu.c.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @NotNull
    public static final y5.a d(int value) {
        if (value == 0) {
            return y5.a.EXPONENTIAL;
        }
        if (value == 1) {
            return y5.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @NotNull
    public static final y5.x e(int value) {
        if (value == 0) {
            return y5.x.NOT_REQUIRED;
        }
        if (value == 1) {
            return y5.x.CONNECTED;
        }
        if (value == 2) {
            return y5.x.UNMETERED;
        }
        if (value == 3) {
            return y5.x.NOT_ROAMING;
        }
        if (value == 4) {
            return y5.x.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return y5.x.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @NotNull
    public static final y5.f0 f(int value) {
        if (value == 0) {
            return y5.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return y5.f0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @NotNull
    public static final y5.o0.c g(int value) {
        if (value == 0) {
            return y5.o0.c.ENQUEUED;
        }
        if (value == 1) {
            return y5.o0.c.RUNNING;
        }
        if (value == 2) {
            return y5.o0.c.SUCCEEDED;
        }
        if (value == 3) {
            return y5.o0.c.FAILED;
        }
        if (value == 4) {
            return y5.o0.c.BLOCKED;
        }
        if (value == 5) {
            return y5.o0.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static final int h(@NotNull y5.x networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = a.f17404c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == y5.x.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int i(@NotNull y5.f0 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = a.f17405d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new zt.l();
    }

    @NotNull
    public static final byte[] j(@NotNull Set<y5.d.c> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (y5.d.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.f21506a;
                lu.c.a(objectOutputStream, null);
                lu.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                lu.c.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final int k(@NotNull y5.o0.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f17403a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new zt.l();
        }
    }

    @NotNull
    public static final NetworkRequestCompat l(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatB = h6.q.f18102a.b(iArr2, iArr);
                lu.c.a(objectInputStream, null);
                lu.c.a(byteArrayInputStream, null);
                return networkRequestCompatB;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                lu.c.a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }
}
