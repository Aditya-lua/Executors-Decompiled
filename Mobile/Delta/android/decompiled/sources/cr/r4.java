package cr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/ViewGroup;", "root", "Landroidx/constraintlayout/widget/c;", "constraintSet", "", "Lar/a;", "componentViews", "", "childrenIds", "", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "alignment", "justify", "gap", "", "a", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/c;Ljava/util/List;Ljava/util/List;[ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "b", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/c;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14195a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14195a = iArr;
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, @NotNull androidx.constraintlayout.widget.c constraintSet, @NotNull List<ComponentView> componentViews, @NotNull List<Integer> childrenIds, @Nullable int[] iArr, @Nullable StyleElements.PositionType positionType, @Nullable StyleElements.PositionType positionType2, int i10) {
        Integer num;
        int i11;
        Integer numN;
        Object next;
        Object next2;
        List<mr.a> listI;
        ViewGroup root = viewGroup;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        double dG0 = iArr != null ? kotlin.collections.m.g0(iArr) : 0.0d;
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                kotlin.collections.p.t();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mr.b bVar = new mr.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i12 != kotlin.collections.p.m(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ComponentView) next2).d().getId() != iIntValue);
                ComponentView componentView = (ComponentView) next2;
                UiComponent uiComponentC = componentView != null ? componentView.c() : null;
                x xVar = uiComponentC instanceof x ? (x) uiComponentC : null;
                if (xVar != null && (listI = xVar.i()) != null) {
                    listI.add(bVar);
                }
                root.addView(bVar);
                constraintSet.m(bVar.getId(), i10);
                constraintSet.o(bVar.getId(), true);
                constraintSet.l(bVar.getId(), 1);
                constraintSet.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i12 = i13;
        }
        int i14 = 0;
        for (Object obj2 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.p.t();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i14 > 0 ? (Integer) arrayList.get(i14 - 1) : null;
            if (i14 == kotlin.collections.p.m(childrenIds)) {
                constraintSet.h(iIntValue2, 7, 0, 7);
                Iterator<T> it2 = componentViews.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ComponentView) next).d().getId() != iIntValue2);
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((mr.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
                i11 = 6;
            } else {
                num = (Integer) arrayList.get(i14);
                i11 = 6;
                constraintSet.h(iIntValue2, 7, num.intValue(), 6);
                constraintSet.h(num.intValue(), 6, iIntValue2, 7);
                constraintSet.h(num.intValue(), 7, childrenIds.get(i15).intValue(), 6);
                constraintSet.h(childrenIds.get(i15).intValue(), 6, num.intValue(), 7);
            }
            if (i14 == 0) {
                constraintSet.h(iIntValue2, i11, 0, i11);
            }
            constraintSet.l(iIntValue2, -2);
            constraintSet.n(iIntValue2, true);
            if (dG0 > 0.0d) {
                double dIntValue = ((double) ((iArr == null || (numN = kotlin.collections.m.N(iArr, i14)) == null) ? 0 : numN.intValue())) / dG0;
                if (dIntValue > 0.0d) {
                    constraintSet.D(iIntValue2, (float) dIntValue);
                } else {
                    constraintSet.m(iIntValue2, -2);
                }
            } else {
                constraintSet.m(iIntValue2, -2);
                constraintSet.o(iIntValue2, true);
            }
            constraintSet.h(iIntValue2, 3, 0, 3);
            constraintSet.h(iIntValue2, 4, 0, 4);
            if (num != null) {
                constraintSet.h(num.intValue(), 3, 0, 3);
                constraintSet.h(num.intValue(), 4, 0, 4);
            }
            int i16 = positionType == null ? -1 : a.f14195a[positionType.ordinal()];
            if (i16 == 1) {
                constraintSet.F(iIntValue2, 0.0f);
            } else if (i16 != 2) {
                constraintSet.F(iIntValue2, 0.5f);
            } else {
                constraintSet.F(iIntValue2, 1.0f);
            }
            if (i14 == 0) {
                int i17 = positionType2 == null ? -1 : a.f14195a[positionType2.ordinal()];
                if (i17 == 1) {
                    constraintSet.C(iIntValue2, 2);
                    constraintSet.B(iIntValue2, 0.0f);
                } else if (i17 == 2) {
                    constraintSet.C(iIntValue2, 2);
                    constraintSet.B(iIntValue2, 1.0f);
                } else if (i17 == 3) {
                    constraintSet.C(iIntValue2, 2);
                    constraintSet.B(iIntValue2, 0.5f);
                }
            }
            root = viewGroup;
            i14 = i15;
        }
    }

    public static final void b(@NotNull ViewGroup root, @NotNull androidx.constraintlayout.widget.c constraintSet, @NotNull List<ComponentView> componentViews, @NotNull List<Integer> childrenIds, @Nullable StyleElements.PositionType positionType, @Nullable StyleElements.PositionType positionType2, int i10) {
        Integer num;
        boolean z10;
        Object next;
        Object next2;
        List<mr.a> listI;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                kotlin.collections.p.t();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mr.b bVar = new mr.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i12 != kotlin.collections.p.m(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ComponentView) next2).d().getId() != iIntValue);
                ComponentView componentView = (ComponentView) next2;
                UiComponent uiComponentC = componentView != null ? componentView.c() : null;
                x xVar = uiComponentC instanceof x ? (x) uiComponentC : null;
                if (xVar != null && (listI = xVar.i()) != null) {
                    listI.add(bVar);
                }
                root.addView(bVar);
                constraintSet.m(bVar.getId(), 1);
                constraintSet.o(bVar.getId(), true);
                constraintSet.l(bVar.getId(), i10);
                constraintSet.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i12 = i13;
        }
        int i14 = 0;
        for (Object obj2 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.p.t();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i14 > 0 ? (Integer) arrayList.get(i14 - 1) : null;
            if (i14 == kotlin.collections.p.m(childrenIds)) {
                constraintSet.h(iIntValue2, 4, i11, 4);
                Iterator<T> it2 = componentViews.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ComponentView) next).d().getId() != iIntValue2);
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((mr.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
            } else {
                num = (Integer) arrayList.get(i14);
                constraintSet.h(num.intValue(), 3, iIntValue2, 4);
                constraintSet.h(iIntValue2, 4, num.intValue(), 3);
            }
            if (i14 == 0) {
                constraintSet.h(iIntValue2, 3, i11, 3);
            }
            if (num2 != null) {
                constraintSet.h(num2.intValue(), 4, iIntValue2, 3);
                constraintSet.h(iIntValue2, 3, num2.intValue(), 4);
            }
            constraintSet.h(iIntValue2, 6, i11, 6);
            constraintSet.h(iIntValue2, 7, i11, 7);
            if (num != null) {
                constraintSet.h(num.intValue(), 6, i11, 6);
                constraintSet.h(num.intValue(), 7, i11, 7);
            }
            constraintSet.l(iIntValue2, -2);
            constraintSet.m(iIntValue2, i11);
            int i16 = positionType == null ? -1 : a.f14195a[positionType.ordinal()];
            if (i16 == 1) {
                constraintSet.B(iIntValue2, 0.0f);
            } else if (i16 != 2) {
                constraintSet.B(iIntValue2, 0.5f);
            } else {
                constraintSet.B(iIntValue2, 1.0f);
            }
            if (i14 == 0) {
                int i17 = positionType2 == null ? -1 : a.f14195a[positionType2.ordinal()];
                z10 = true;
                if (i17 == 1) {
                    constraintSet.G(iIntValue2, 2);
                    constraintSet.F(iIntValue2, 0.0f);
                } else if (i17 == 2) {
                    constraintSet.G(iIntValue2, 2);
                    constraintSet.F(iIntValue2, 1.0f);
                } else if (i17 == 3) {
                    constraintSet.G(iIntValue2, 2);
                    constraintSet.F(iIntValue2, 0.5f);
                }
            } else {
                z10 = true;
            }
            i14 = i15;
            i11 = 0;
        }
    }
}
