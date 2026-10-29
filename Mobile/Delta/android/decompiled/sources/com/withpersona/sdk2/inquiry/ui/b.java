package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "componentName", "b", "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "(Ljava/util/List;)Ljava/util/List;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13825a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @NotNull
    public static final UiState.Displaying b(@NotNull UiState.Displaying displaying, @Nullable final String str) {
        AutoSubmitableComponent autoSubmitableComponent;
        Intrinsics.checkNotNullParameter(displaying, "<this>");
        if (str == null || str.length() == 0) {
            autoSubmitableComponent = (SubmitButtonComponent) er.h.a(displaying.getComponents(), d0.b(SubmitButtonComponent.class), a.f13825a);
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        } else {
            autoSubmitableComponent = (ButtonComponent) er.h.a(displaying.getComponents(), d0.b(ButtonComponent.class), new Function1() { // from class: or.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(com.withpersona.sdk2.inquiry.ui.b.c(str, (ButtonComponent) obj));
                }
            });
            if (autoSubmitableComponent == null) {
                return displaying;
            }
        }
        return UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(autoSubmitableComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 261919, null);
    }

    public static final boolean c(String str, ButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @NotNull
    public static final List<UiComponent> d(@NotNull List<? extends UiComponent> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelableQ1 : list) {
            if (parcelableQ1 instanceof InputFileUploadComponent) {
                parcelableQ1 = null;
            } else if (parcelableQ1 instanceof UiComponentGroup) {
                UiComponentGroup uiComponentGroup = (UiComponentGroup) parcelableQ1;
                List<UiComponent> listD = d(uiComponentGroup.getChildren());
                if (listD.isEmpty()) {
                    parcelableQ1 = null;
                } else {
                    parcelableQ1 = uiComponentGroup.q1(listD);
                }
            }
            if (parcelableQ1 != null) {
                arrayList.add(parcelableQ1);
            }
        }
        return arrayList;
    }
}
