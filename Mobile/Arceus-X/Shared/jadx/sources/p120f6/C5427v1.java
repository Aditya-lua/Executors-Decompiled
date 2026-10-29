package p120f6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p146g6.C6037q;
import p146g6.C6040t;
import p146g6.NetworkRequestCompat;
import p229jt.C7345l;
import p477ut.C11958c;
import p536x5.C12694d;
import p536x5.C12717o0;
import p536x5.EnumC12688a;
import p536x5.EnumC12699f0;
import p536x5.EnumC12734x;

/* JADX INFO: renamed from: f6.v1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, m31665d2 = {"Lf6/v1;", "", "<init>", "()V", "Lx5/o0$c;", "state", "", "k", "(Lx5/o0$c;)I", "value", "g", "(I)Lx5/o0$c;", "Lx5/a;", "backoffPolicy", "a", "(Lx5/a;)I", "d", "(I)Lx5/a;", "Lx5/x;", "networkType", "h", "(Lx5/x;)I", "e", "(I)Lx5/x;", "Lx5/f0;", "policy", "i", "(Lx5/f0;)I", "f", "(I)Lx5/f0;", "", "Lx5/d$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "Lg6/s;", "l", "([B)Lg6/s;", "requestCompat", "c", "(Lg6/s;)[B", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5427v1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5427v1 f21000a = new C5427v1();

    /* JADX INFO: renamed from: f6.v1$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21001a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f21002b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f21003c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f21004d;

        static {
            int[] iArr = new int[C12717o0.c.values().length];
            try {
                iArr[C12717o0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C12717o0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C12717o0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C12717o0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C12717o0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C12717o0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21001a = iArr;
            int[] iArr2 = new int[EnumC12688a.values().length];
            try {
                iArr2[EnumC12688a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC12688a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f21002b = iArr2;
            int[] iArr3 = new int[EnumC12734x.values().length];
            try {
                iArr3[EnumC12734x.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC12734x.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC12734x.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC12734x.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC12734x.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f21003c = iArr3;
            int[] iArr4 = new int[EnumC12699f0.values().length];
            try {
                iArr4[EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[EnumC12699f0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f21004d = iArr4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m24903a(@NotNull EnumC12688a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = a.f21002b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<C12694d.c> m24904b(@NotNull byte[] bytes) {
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
                        linkedHashSet.add(new C12694d.c(uri, z10));
                    }
                    Unit unit = Unit.f29331a;
                    C11958c.m44629a(objectInputStream, null);
                    Unit unit2 = Unit.f29331a;
                    C11958c.m44629a(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    C11958c.m44629a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final byte[] m24905c(@NotNull NetworkRequestCompat requestCompat) {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestM26851b = requestCompat.m26851b();
        if (networkRequestM26851b == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrM26855c = C6040t.m26855c(networkRequestM26851b);
                int[] iArrM26854b = C6040t.m26854b(networkRequestM26851b);
                objectOutputStream.writeInt(iArrM26855c.length);
                for (int i10 : iArrM26855c) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(iArrM26854b.length);
                for (int i11 : iArrM26854b) {
                    objectOutputStream.writeInt(i11);
                }
                Unit unit = Unit.f29331a;
                C11958c.m44629a(objectOutputStream, null);
                C11958c.m44629a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C11958c.m44629a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final EnumC12688a m24906d(int value) {
        if (value == 0) {
            return EnumC12688a.EXPONENTIAL;
        }
        if (value == 1) {
            return EnumC12688a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final EnumC12734x m24907e(int value) {
        if (value == 0) {
            return EnumC12734x.NOT_REQUIRED;
        }
        if (value == 1) {
            return EnumC12734x.CONNECTED;
        }
        if (value == 2) {
            return EnumC12734x.UNMETERED;
        }
        if (value == 3) {
            return EnumC12734x.NOT_ROAMING;
        }
        if (value == 4) {
            return EnumC12734x.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return EnumC12734x.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final EnumC12699f0 m24908f(int value) {
        if (value == 0) {
            return EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return EnumC12699f0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C12717o0.c m24909g(int value) {
        if (value == 0) {
            return C12717o0.c.ENQUEUED;
        }
        if (value == 1) {
            return C12717o0.c.RUNNING;
        }
        if (value == 2) {
            return C12717o0.c.SUCCEEDED;
        }
        if (value == 3) {
            return C12717o0.c.FAILED;
        }
        if (value == 4) {
            return C12717o0.c.BLOCKED;
        }
        if (value == 5) {
            return C12717o0.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    /* JADX INFO: renamed from: h */
    public static final int m24910h(@NotNull EnumC12734x networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = a.f21003c[networkType.ordinal()];
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
        if (Build.VERSION.SDK_INT >= 30 && networkType == EnumC12734x.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    /* JADX INFO: renamed from: i */
    public static final int m24911i(@NotNull EnumC12699f0 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = a.f21004d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final byte[] m24912j(@NotNull Set<C12694d.c> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (C12694d.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.f29331a;
                C11958c.m44629a(objectOutputStream, null);
                C11958c.m44629a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C11958c.m44629a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final int m24913k(@NotNull C12717o0.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f21001a[state.ordinal()]) {
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
                throw new C7345l();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final NetworkRequestCompat m24914l(@NotNull byte[] bytes) {
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
                NetworkRequestCompat networkRequestCompatM26845b = C6037q.f23315a.m26845b(iArr2, iArr);
                C11958c.m44629a(objectInputStream, null);
                C11958c.m44629a(byteArrayInputStream, null);
                return networkRequestCompatM26845b;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C11958c.m44629a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }
}
