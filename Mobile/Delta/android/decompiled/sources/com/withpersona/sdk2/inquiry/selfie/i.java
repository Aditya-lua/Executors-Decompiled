package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import fn.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0001*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfn/p0;", "Lkn/a;", "d", "(Lfn/p0;)Lkn/a;", "", "a", "(Lkn/a;)Ljava/lang/String;", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "b", "(Lfn/p0;Lqq/c;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lkn/a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12968a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12968a = iArr;
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
    public static final String a(@NotNull kn.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f12968a[aVar.ordinal()];
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
        throw new jt.l();
    }

    @NotNull
    public static final Object b(@NotNull p0 p0Var, @NotNull qq.c sdkFilesManager, @NotNull PoseInfo poseInfo) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Bitmap bitmap = p0Var.getBitmap();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File fileE = sdkFilesManager.e("jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    ut.c.a(fileOutputStream, null);
                    jt.n.Companion companion = jt.n.INSTANCE;
                    String absolutePath = fileE.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    Object objB = jt.n.b(new Selfie.SelfieImage(absolutePath, Selfie.a.AUTO, d(p0Var), jCurrentTimeMillis, poseInfo.getToken()));
                    bitmap.recycle();
                    return objB;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                Object objB2 = jt.n.b(jt.o.a(e10));
                bitmap.recycle();
                return objB2;
            }
        } catch (Throwable th4) {
            bitmap.recycle();
            throw th4;
        }
    }

    @NotNull
    public static final kn.a c(@NotNull NextStep.Selfie.SelfiePose selfiePose) {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i10 = a.b[selfiePose.ordinal()];
        if (i10 == 1) {
            return kn.a.Center;
        }
        if (i10 == 2) {
            return kn.a.Left;
        }
        if (i10 == 3) {
            return kn.a.Right;
        }
        if (i10 == 4) {
            return kn.a.Up;
        }
        if (i10 == 5) {
            return kn.a.Down;
        }
        throw new jt.l();
    }

    @NotNull
    public static final kn.a d(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        if (p0Var instanceof p0.a) {
            return kn.a.Center;
        }
        if (p0Var instanceof p0.c) {
            return kn.a.Left;
        }
        if (p0Var instanceof p0.d) {
            return kn.a.Right;
        }
        if (p0Var instanceof p0.e) {
            return kn.a.Up;
        }
        if (p0Var instanceof p0.b) {
            return kn.a.Down;
        }
        throw new jt.l();
    }
}
