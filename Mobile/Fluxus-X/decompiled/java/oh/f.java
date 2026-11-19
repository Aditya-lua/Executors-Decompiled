package oh;

import android.app.Activity;
import android.content.DialogInterface;
import bh.q0;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Loh/f;", "Loh/i;", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", BuildConfig.FLAVOR, "message", "Lkotlin/Function1;", "Loh/i$a;", BuildConfig.FLAVOR, "shouldShowDialog", BuildConfig.FLAVOR, "startUpgrade", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", Payload.TYPE, "a", "(Loh/i$a;)V", "Landroid/app/Activity;", "b", "Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Landroidx/appcompat/app/a;", "e", "Landroidx/appcompat/app/a;", "dialog", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<String> message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<i.a, Boolean> shouldShowDialog;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> startUpgrade;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.appcompat.app.a dialog;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28235a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.Optional.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.Required.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.a.NewApp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28235a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            f.this.startUpgrade.invoke();
            androidx.appcompat.app.a aVar = f.this.dialog;
            if (aVar != null) {
                aVar.dismiss();
            }
            f.this.dialog = null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            f.this.startUpgrade.invoke();
            f.this.a(i.a.Required);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Activity activity, @NotNull Function0<String> message, @NotNull Function1<? super i.a, Boolean> shouldShowDialog, @NotNull Function0<Unit> startUpgrade) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(shouldShowDialog, "shouldShowDialog");
        Intrinsics.checkNotNullParameter(startUpgrade, "startUpgrade");
        this.activity = activity;
        this.message = message;
        this.shouldShowDialog = shouldShowDialog;
        this.startUpgrade = startUpgrade;
    }

    public static final boolean d(i.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final void h(f fVar, i.a aVar) {
        androidx.appcompat.app.a aVarR;
        androidx.appcompat.app.a aVar2 = fVar.dialog;
        if (aVar2 != null) {
            h.d(aVar2);
        }
        if (fVar.shouldShowDialog.invoke(aVar).booleanValue()) {
            int i10 = a.f28235a[aVar.ordinal()];
            if (i10 == 1) {
                Activity activity = fVar.activity;
                aVarR = new androidx.appcompat.app.a.C0021a(activity).p(q0.f4255m).h(fVar.message.invoke()).m(q0.f4246j, fVar.new b()).d(false).r();
                Intrinsics.checkNotNullExpressionValue(aVarR, "show(...)");
            } else if (i10 == 2) {
                Activity activity2 = fVar.activity;
                aVarR = new androidx.appcompat.app.a.C0021a(activity2).p(q0.f4255m).h(fVar.message.invoke()).m(q0.f4246j, fVar.new c()).d(false).r();
                Intrinsics.checkNotNullExpressionValue(aVarR, "show(...)");
            } else {
                if (i10 != 3) {
                    throw new l();
                }
                aVarR = h.e(fVar.activity);
            }
        } else {
            fVar.startUpgrade.invoke();
            Unit unit = Unit.f21506a;
            aVarR = null;
        }
        fVar.dialog = aVarR;
    }

    @Override // oh.i
    public void a(@NotNull final i.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.activity.runOnUiThread(new Runnable() { // from class: oh.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(this.f28230a, type);
            }
        });
    }

    public /* synthetic */ f(Activity activity, Function0 function0, Function1 function1, Function0 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, function0, (i10 & 4) != 0 ? new Function1() { // from class: oh.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.d((i.a) obj));
            }
        } : function1, function2);
    }
}
