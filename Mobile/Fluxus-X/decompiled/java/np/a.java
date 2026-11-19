package np;

import android.os.Parcel;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import ds.CollectedData;
import ds.CollectedGovernmentIdDetails;
import ds.DocumentFile;
import ds.GovernmentIdCapture;
import ds.SelfieCapture;
import gs.UiStepData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import po.DocumentStepData;
import qq.SelfieStepData;
import vo.Frame;
import vo.GovernmentIdDetails;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {BuildConfig.FLAVOR, "Lar/f;", "Lds/a;", "d", "(Ljava/util/List;)Lds/a;", "Lds/g;", "h", "(Lar/f;)Lds/g;", "Lpo/d;", "e", "(Lpo/d;)Lds/g;", "Ldp/d;", "f", "(Ldp/d;)Lds/g;", "Lvo/r;", "Lds/b;", "a", "(Ljava/util/List;)Lds/b;", "Lvo/n;", "Lds/e;", "b", "(Lvo/n;)Lds/e;", "Lqq/b;", "g", "(Lqq/b;)Lds/g;", "Lmq/b0;", "Lds/f;", "c", "(Lmq/b0;)Lds/f;", "Lgs/d;", "i", "(Lgs/d;)Lds/g;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: np.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0525a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26275a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26276c;

        static {
            int[] iArr = new int[vo.n.d.values().length];
            try {
                iArr[vo.n.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vo.n.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vo.n.d.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26275a = iArr;
            int[] iArr2 = new int[vo.n.a.values().length];
            try {
                iArr2[vo.n.a.f34838a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[vo.n.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[vo.n.a.f34839c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[mq.b0.a.values().length];
            try {
                iArr3[mq.b0.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[mq.b0.a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f26276c = iArr3;
        }
    }

    public static final CollectedGovernmentIdDetails a(List<GovernmentIdDetails> list) {
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

    public static final GovernmentIdCapture b(vo.n nVar) {
        GovernmentIdCapture.d dVar;
        GovernmentIdCapture.a aVar;
        String idClassKey = nVar.getIdClassKey();
        int i10 = C0525a.f26275a[nVar.getSide().ordinal()];
        if (i10 == 1) {
            dVar = GovernmentIdCapture.d.Front;
        } else if (i10 == 2) {
            dVar = GovernmentIdCapture.d.Back;
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            dVar = GovernmentIdCapture.d.FrontAndBack;
        }
        int i11 = C0525a.b[nVar.getCaptureMethod().ordinal()];
        if (i11 == 1) {
            aVar = GovernmentIdCapture.a.Auto;
        } else if (i11 == 2) {
            aVar = GovernmentIdCapture.a.Manual;
        } else {
            if (i11 != 3) {
                throw new zt.l();
            }
            aVar = GovernmentIdCapture.a.Upload;
        }
        List<Frame> listJ3 = nVar.j3();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : listJ3) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, dVar, aVar, arrayList);
    }

    public static final SelfieCapture c(mq.b0 b0Var) {
        SelfieCapture.a aVar;
        if (!new File(b0Var.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i10 = C0525a.f26276c[b0Var.getCaptureMethod().ordinal()];
        if (i10 == 1) {
            aVar = SelfieCapture.a.Auto;
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            aVar = SelfieCapture.a.Manual;
        }
        return new SelfieCapture(aVar, new File(b0Var.getAbsoluteFilePath()));
    }

    @Nullable
    public static final CollectedData d(@NotNull List<? extends ar.f> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ds.g gVarH = h((ar.f) it.next());
            if (gVarH != null) {
                arrayList.add(gVarH);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    public static final ds.g e(DocumentStepData documentStepData) {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<no.e> listA = documentStepData.a();
        ArrayList arrayList = new ArrayList();
        for (no.e eVar : listA) {
            if (eVar instanceof no.e.Local) {
                documentFile = new DocumentFile(new File(((no.e.Local) eVar).getAbsoluteFilePath()));
            } else {
                if (!(eVar instanceof no.e.Remote)) {
                    throw new zt.l();
                }
                String absoluteFilePath = ((no.e.Remote) eVar).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new ds.g.DocumentStepData(stepName, arrayList);
    }

    public static final ds.g f(dp.d dVar) {
        String stepName = dVar.getStepName();
        List<vo.n> listA = dVar.a();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((vo.n) it.next()));
        }
        List<vo.n> listA2 = dVar.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA2) {
            if (obj instanceof vo.n.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p001kotlin.collections.q.u(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((vo.n.GovernmentIdImage) obj2).getIdDetails());
        }
        return new ds.g.GovernmentIdStepData(stepName, arrayList, a(arrayList3));
    }

    public static final ds.g g(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        mq.b0 centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC = centerCapture != null ? c(centerCapture) : null;
        mq.b0 centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC2 = centerCapture2 != null ? c(centerCapture2) : null;
        mq.b0 centerCapture3 = selfieStepData.getCenterCapture();
        return new ds.g.SelfieStepData(stepName, selfieCaptureC, selfieCaptureC2, centerCapture3 != null ? c(centerCapture3) : null);
    }

    @Nullable
    public static final ds.g h(@NotNull ar.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof UiStepData) {
            return i((UiStepData) fVar);
        }
        if (fVar instanceof SelfieStepData) {
            return g((SelfieStepData) fVar);
        }
        if (fVar instanceof dp.d) {
            return f((dp.d) fVar);
        }
        if (fVar instanceof DocumentStepData) {
            return e((DocumentStepData) fVar);
        }
        return null;
    }

    @NotNull
    public static final ds.g i(@NotNull UiStepData uiStepData) {
        Intrinsics.checkNotNullParameter(uiStepData, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object objA = com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue());
                parcelObtain.writeValue(objA);
                linkedHashMap.put(str, objA);
            } catch (RuntimeException unused) {
            }
        }
        parcelObtain.recycle();
        return new ds.g.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}
