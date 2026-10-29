package com.withpersona.sdk2.inquiry.governmentid;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p391qq.C10700c;
import p477ut.C11958c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Landroid/graphics/Bitmap;", "Lqq/c;", "sdkFilesManager", "Ljava/io/File;", "a", "(Landroid/graphics/Bitmap;Lqq/c;)Ljava/io/File;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3549j {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.j$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14106a;

        static {
            int[] iArr = new int[GovernmentId.EnumC3485a.values().length];
            try {
                iArr[GovernmentId.EnumC3485a.f13531a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.EnumC3485a.f13532b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.EnumC3485a.f13533c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14106a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final File m17561a(@NotNull Bitmap bitmap, @NotNull C10700c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        File fileM40782e = sdkFilesManager.m40782e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            C11958c.m44629a(fileOutputStream, null);
            return fileM40782e;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final GovIdCaptureMethod m17562b(@NotNull GovernmentId.EnumC3485a enumC3485a) {
        Intrinsics.checkNotNullParameter(enumC3485a, "<this>");
        int i10 = a.f14106a[enumC3485a.ordinal()];
        if (i10 == 1) {
            return GovIdCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return GovIdCaptureMethod.MANUAL;
        }
        if (i10 == 3) {
            return GovIdCaptureMethod.VIDEO_UPLOAD;
        }
        throw new C7345l();
    }
}
