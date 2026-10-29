package com.withpersona.sdk2.inquiry.p057ui;

import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.p057ui.C4149b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup;
import er.C5199h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "componentName", "b", "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "(Ljava/util/List;)Ljava/util/List;", "ui_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4149b {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function1<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final a f17658a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final UiState.Displaying m21349b(@NotNull UiState.Displaying displaying, @Nullable final String str) {
        AutoSubmitableComponent autoSubmitableComponent;
        Intrinsics.checkNotNullParameter(displaying, "<this>");
        if (str == null || str.length() == 0) {
            autoSubmitableComponent = (SubmitButtonComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(SubmitButtonComponent.class), a.f17658a);
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        } else {
            autoSubmitableComponent = (ButtonComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(ButtonComponent.class), new Function1() { // from class: or.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C4149b.m21350c(str, (ButtonComponent) obj));
                }
            });
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        }
        return UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(autoSubmitableComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 261919, null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21350c(String str, ButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final List<UiComponent> m21351d(@NotNull List<? extends UiComponent> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelableMo20548r1 : list) {
            if (parcelableMo20548r1 instanceof InputFileUploadComponent) {
                parcelableMo20548r1 = null;
            } else if (parcelableMo20548r1 instanceof UiComponentGroup) {
                UiComponentGroup uiComponentGroup = (UiComponentGroup) parcelableMo20548r1;
                List<UiComponent> listM21351d = m21351d(uiComponentGroup.getChildren());
                if (listM21351d.isEmpty()) {
                    parcelableMo20548r1 = null;
                } else {
                    parcelableMo20548r1 = uiComponentGroup.mo20548r1(listM21351d);
                }
            }
            if (parcelableMo20548r1 != null) {
                arrayList.add(parcelableMo20548r1);
            }
        }
        return arrayList;
    }
}
