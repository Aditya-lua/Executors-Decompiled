package p610zo;

import android.os.Parcel;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.p057ui.network.C4177a;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p057ui.network.UiStepData;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: zo.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "d", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "h", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;", "e", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "a", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;", "i", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13948a {

    /* JADX INFO: renamed from: zo.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48718a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f48719b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f48720c;

        static {
            int[] iArr = new int[GovernmentId.EnumC3486b.values().length];
            try {
                iArr[GovernmentId.EnumC3486b.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.EnumC3486b.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.EnumC3486b.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48718a = iArr;
            int[] iArr2 = new int[GovernmentId.EnumC3485a.values().length];
            try {
                iArr2[GovernmentId.EnumC3485a.f13531a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentId.EnumC3485a.f13532b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentId.EnumC3485a.f13533c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f48719b = iArr2;
            int[] iArr3 = new int[Selfie.EnumC3902a.values().length];
            try {
                iArr3[Selfie.EnumC3902a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Selfie.EnumC3902a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f48720c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final CollectedGovernmentIdDetails m50434a(List<GovernmentIdDetails> list) {
        Iterator<GovernmentIdDetails> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new CollectedGovernmentIdDetails(null, null);
            }
            GovernmentIdDetails next = it.next();
            if ((next != null ? next.getDateOfBirth() : null) != null && next.getExpirationDate() != null) {
                return new CollectedGovernmentIdDetails(next.getDateOfBirth(), next.getExpirationDate());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final GovernmentIdCapture m50435b(GovernmentId governmentId) {
        GovernmentIdCapture.EnumC4125c enumC4125c;
        GovernmentIdCapture.EnumC4123a enumC4123a;
        String idClassKey = governmentId.getIdClassKey();
        int i10 = a.f48718a[governmentId.getSide().ordinal()];
        if (i10 == 1) {
            enumC4125c = GovernmentIdCapture.EnumC4125c.Front;
        } else if (i10 == 2) {
            enumC4125c = GovernmentIdCapture.EnumC4125c.Back;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            enumC4125c = GovernmentIdCapture.EnumC4125c.FrontAndBack;
        }
        int i11 = a.f48719b[governmentId.getCaptureMethod().ordinal()];
        if (i11 == 1) {
            enumC4123a = GovernmentIdCapture.EnumC4123a.Auto;
        } else if (i11 == 2) {
            enumC4123a = GovernmentIdCapture.EnumC4123a.Manual;
        } else {
            if (i11 != 3) {
                throw new C7345l();
            }
            enumC4123a = GovernmentIdCapture.EnumC4123a.Upload;
        }
        List<Frame> listMo16936d3 = governmentId.mo16936d3();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : listMo16936d3) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, enumC4125c, enumC4123a, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final SelfieCapture m50436c(Selfie selfie) {
        SelfieCapture.EnumC4126a enumC4126a;
        if (!new File(selfie.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i10 = a.f48720c[selfie.getCaptureMethod().ordinal()];
        if (i10 == 1) {
            enumC4126a = SelfieCapture.EnumC4126a.Auto;
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            enumC4126a = SelfieCapture.EnumC4126a.Manual;
        }
        return new SelfieCapture(enumC4126a, new File(selfie.getAbsoluteFilePath()));
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final CollectedData m50437d(@NotNull List<? extends StepData> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.withpersona.sdk2.inquiry.types.collected_data.StepData stepDataM50441h = m50441h((StepData) it.next());
            if (stepDataM50441h != null) {
                arrayList.add(stepDataM50441h);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData m50438e(DocumentStepData documentStepData) {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<com.withpersona.sdk2.inquiry.document.DocumentFile> listM16683a = documentStepData.m16683a();
        ArrayList arrayList = new ArrayList();
        for (com.withpersona.sdk2.inquiry.document.DocumentFile documentFile2 : listM16683a) {
            if (documentFile2 instanceof com.withpersona.sdk2.inquiry.document.DocumentFile.Local) {
                documentFile = new DocumentFile(new File(((com.withpersona.sdk2.inquiry.document.DocumentFile.Local) documentFile2).getAbsoluteFilePath()));
            } else {
                if (!(documentFile2 instanceof com.withpersona.sdk2.inquiry.document.DocumentFile.Remote)) {
                    throw new C7345l();
                }
                String absoluteFilePath = ((com.withpersona.sdk2.inquiry.document.DocumentFile.Remote) documentFile2).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new com.withpersona.sdk2.inquiry.types.collected_data.StepData.DocumentStepData(stepName, arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData m50439f(GovernmentIdStepData governmentIdStepData) {
        String stepName = governmentIdStepData.getStepName();
        List<GovernmentId> listM17720a = governmentIdStepData.m17720a();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM17720a, 10));
        Iterator<T> it = listM17720a.iterator();
        while (it.hasNext()) {
            arrayList.add(m50435b((GovernmentId) it.next()));
        }
        List<GovernmentId> listM17720a2 = governmentIdStepData.m17720a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM17720a2) {
            if (obj instanceof GovernmentId.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C7701q.m31905u(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((GovernmentId.GovernmentIdImage) obj2).getIdDetails());
        }
        return new com.withpersona.sdk2.inquiry.types.collected_data.StepData.GovernmentIdStepData(stepName, arrayList, m50434a(arrayList3));
    }

    /* JADX INFO: renamed from: g */
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData m50440g(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        Selfie centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureM50436c = centerCapture != null ? m50436c(centerCapture) : null;
        Selfie centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureM50436c2 = centerCapture2 != null ? m50436c(centerCapture2) : null;
        Selfie centerCapture3 = selfieStepData.getCenterCapture();
        return new com.withpersona.sdk2.inquiry.types.collected_data.StepData.SelfieStepData(stepName, selfieCaptureM50436c, selfieCaptureM50436c2, centerCapture3 != null ? m50436c(centerCapture3) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData m50441h(@NotNull StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "<this>");
        if (stepData instanceof UiStepData) {
            return m50442i((UiStepData) stepData);
        }
        if (stepData instanceof SelfieStepData) {
            return m50440g((SelfieStepData) stepData);
        }
        if (stepData instanceof GovernmentIdStepData) {
            return m50439f((GovernmentIdStepData) stepData);
        }
        if (stepData instanceof DocumentStepData) {
            return m50438e((DocumentStepData) stepData);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData m50442i(@NotNull UiStepData uiStepData) {
        Intrinsics.checkNotNullParameter(uiStepData, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.m21633a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object objM21637a = C4177a.m21637a((ComponentParam) entry.getValue());
                parcelObtain.writeValue(objM21637a);
                linkedHashMap.put(str, objM21637a);
            } catch (RuntimeException unused) {
            }
        }
        parcelObtain.recycle();
        return new com.withpersona.sdk2.inquiry.types.collected_data.StepData.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}
