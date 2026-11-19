package es;

import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import qr.SubmitButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les/i4$a;", BuildConfig.FLAVOR, "componentName", "b", "(Les/i4$a;Ljava/lang/String;)Les/i4$a;", BuildConfig.FLAVOR, "Lqr/x5;", "d", "(Ljava/util/List;)Ljava/util/List;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14350a = new a();

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @NotNull
    public static final i4.Displaying b(@NotNull i4.Displaying displaying, @Nullable final String str) {
        qr.d dVar;
        Intrinsics.checkNotNullParameter(displaying, "<this>");
        if (str == null || str.length() == 0) {
            dVar = (SubmitButtonComponent) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(SubmitButtonComponent.class), a.f14350a);
            if (dVar == null) {
                return displaying;
            }
        } else {
            dVar = (qr.i) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(qr.i.class), new Function1() { // from class: es.l1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(m1.c(str, (qr.i) obj));
                }
            });
            if (dVar == null) {
                return displaying;
            }
        }
        return i4.Displaying.v(displaying, null, null, null, null, null, null, null, new i4.Displaying.AutoSubmit(dVar, 0, null), null, false, false, null, null, null, false, 0, null, 0, 261919, null);
    }

    public static final boolean c(String str, qr.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @NotNull
    public static final List<qr.x5> d(@NotNull List<? extends qr.x5> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelableS1 : list) {
            if (parcelableS1 instanceof InputFileUploadComponent) {
                parcelableS1 = null;
            } else if (parcelableS1 instanceof qr.y5) {
                qr.y5 y5Var = (qr.y5) parcelableS1;
                List<qr.x5> listD = d(y5Var.getChildren());
                if (listD.isEmpty()) {
                    parcelableS1 = null;
                } else {
                    parcelableS1 = y5Var.s1(listD);
                }
            }
            if (parcelableS1 != null) {
                arrayList.add(parcelableS1);
            }
        }
        return arrayList;
    }
}
