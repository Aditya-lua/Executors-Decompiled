package mq;

import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0001*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsn/d1;", "Lxn/a;", "d", "(Lsn/d1;)Lxn/a;", BuildConfig.FLAVOR, "a", "(Lxn/a;)Ljava/lang/String;", "Ler/c;", "sdkFilesManager", "Lrq/a;", "poseInfo", "Lzt/n;", "Lmq/b0;", "b", "(Lsn/d1;Ler/c;Lrq/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lxn/a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23685a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23685a = iArr;
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.DOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final String a(@NotNull xn.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f23685a[aVar.ordinal()];
        if (i10 == 1) {
            return "center";
        }
        if (i10 == 2) {
            return "left";
        }
        if (i10 == 3) {
            return "right";
        }
        if (i10 == 4) {
            return "up";
        }
        if (i10 == 5) {
            return "down";
        }
        throw new zt.l();
    }

    @NotNull
    public static final Object b(@NotNull sn.d1 d1Var, @NotNull er.c sdkFilesManager, @NotNull PoseInfo poseInfo) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Bitmap bitmap = d1Var.getBitmap();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File fileE = sdkFilesManager.e("jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    lu.c.a(fileOutputStream, null);
                    zt.n.Companion companion = zt.n.INSTANCE;
                    String absolutePath = fileE.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    Object objB = zt.n.b(new b0.SelfieImage(absolutePath, b0.a.AUTO, d(d1Var), jCurrentTimeMillis, poseInfo.getToken()));
                    bitmap.recycle();
                    return objB;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                Object objB2 = zt.n.b(zt.o.a(e10));
                bitmap.recycle();
                return objB2;
            }
        } catch (Throwable th4) {
            bitmap.recycle();
            throw th4;
        }
    }

    @NotNull
    public static final xn.a c(@NotNull NextStep.Selfie.SelfiePose selfiePose) {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i10 = a.b[selfiePose.ordinal()];
        if (i10 == 1) {
            return xn.a.Center;
        }
        if (i10 == 2) {
            return xn.a.Left;
        }
        if (i10 == 3) {
            return xn.a.Right;
        }
        if (i10 == 4) {
            return xn.a.Up;
        }
        if (i10 == 5) {
            return xn.a.Down;
        }
        throw new zt.l();
    }

    @NotNull
    public static final xn.a d(@NotNull sn.d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (d1Var instanceof sn.d1.a) {
            return xn.a.Center;
        }
        if (d1Var instanceof sn.d1.c) {
            return xn.a.Left;
        }
        if (d1Var instanceof sn.d1.d) {
            return xn.a.Right;
        }
        if (d1Var instanceof sn.d1.e) {
            return xn.a.Up;
        }
        if (d1Var instanceof sn.d1.b) {
            return xn.a.Down;
        }
        throw new zt.l();
    }
}
