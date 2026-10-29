package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p132fn.AbstractC5702p0;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p391qq.C10700c;
import p477ut.C11958c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0001*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lfn/p0;", "Lkn/a;", "d", "(Lfn/p0;)Lkn/a;", "", "a", "(Lkn/a;)Ljava/lang/String;", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "b", "(Lfn/p0;Lqq/c;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lkn/a;", "selfie_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3957i {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.i$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16626a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16627b;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16626a = iArr;
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
            f16627b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m20079a(@NotNull EnumC7638a enumC7638a) {
        Intrinsics.checkNotNullParameter(enumC7638a, "<this>");
        int i10 = a.f16626a[enumC7638a.ordinal()];
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
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m20080b(@NotNull AbstractC5702p0 abstractC5702p0, @NotNull C10700c sdkFilesManager, @NotNull PoseInfo poseInfo) {
        Intrinsics.checkNotNullParameter(abstractC5702p0, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Bitmap bitmap = abstractC5702p0.getBitmap();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File fileM40782e = sdkFilesManager.m40782e("jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    C11958c.m44629a(fileOutputStream, null);
                    C7347n.Companion companion = C7347n.INSTANCE;
                    String absolutePath = fileM40782e.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    Object objM30460b = C7347n.m30460b(new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.AUTO, m20082d(abstractC5702p0), jCurrentTimeMillis, poseInfo.getToken()));
                    bitmap.recycle();
                    return objM30460b;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                Object objM30460b2 = C7347n.m30460b(C7348o.m30469a(e10));
                bitmap.recycle();
                return objM30460b2;
            }
        } catch (Throwable th4) {
            bitmap.recycle();
            throw th4;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final EnumC7638a m20081c(@NotNull NextStep.Selfie.SelfiePose selfiePose) {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i10 = a.f16627b[selfiePose.ordinal()];
        if (i10 == 1) {
            return EnumC7638a.Center;
        }
        if (i10 == 2) {
            return EnumC7638a.Left;
        }
        if (i10 == 3) {
            return EnumC7638a.Right;
        }
        if (i10 == 4) {
            return EnumC7638a.Up;
        }
        if (i10 == 5) {
            return EnumC7638a.Down;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final EnumC7638a m20082d(@NotNull AbstractC5702p0 abstractC5702p0) {
        Intrinsics.checkNotNullParameter(abstractC5702p0, "<this>");
        if (abstractC5702p0 instanceof AbstractC5702p0.a) {
            return EnumC7638a.Center;
        }
        if (abstractC5702p0 instanceof AbstractC5702p0.c) {
            return EnumC7638a.Left;
        }
        if (abstractC5702p0 instanceof AbstractC5702p0.d) {
            return EnumC7638a.Right;
        }
        if (abstractC5702p0 instanceof AbstractC5702p0.e) {
            return EnumC7638a.Up;
        }
        if (abstractC5702p0 instanceof AbstractC5702p0.b) {
            return EnumC7638a.Down;
        }
        throw new C7345l();
    }
}
