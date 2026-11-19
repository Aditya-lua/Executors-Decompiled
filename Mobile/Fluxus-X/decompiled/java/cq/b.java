package cq;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.c1;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import jq.h;
import kr.a0;
import nn.ViewEnvironment;
import nn.b0;
import nn.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import p001kotlin.jvm.internal.k;
import pu.o;
import rn.j;
import xq.p0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcq/b;", "Lrn/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", BuildConfig.FLAVOR, "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "f", "a", "modal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cq.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u000e\b\u0000\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcq/b$a;", "Lnn/b0;", "Lcq/c;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcq/c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "modal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<c<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<c<?, ?>> f11510a;

        /* JADX INFO: renamed from: cq.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0202a extends k implements Function2<rn.f<?, ? extends Object>, ViewEnvironment, Unit> {
            public C0202a(Object obj) {
                super(2, obj, b.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(rn.f<?, ? extends Object> p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((b) this.receiver).c(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(rn.f<?, ? extends Object> fVar, ViewEnvironment viewEnvironment) {
                d(fVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(c initialRendering, ViewEnvironment initialEnv, Context contextForNewView, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            b bVar = new b(contextForNewView, null, 0, 0, 14, null);
            bVar.setId(g.b);
            bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            f0.a(bVar, initialRendering, initialEnv, new C0202a(bVar));
            return bVar;
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull c<?, ?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f11510a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super c<?, ?>> getType() {
            return this.f11510a.getType();
        }

        public Companion() {
            this.f11510a = new nn.f<>(d0.b(c.class), new o() { // from class: cq.a
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return b.Companion.c((c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    @Override // rn.j
    @NotNull
    public Dialog g(@NotNull View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext(), h.b);
        Iterator<T> it = a0.d(view).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next).getTag(g.f11516a) instanceof Integer));
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(g.f11516a) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                p0.a(window, num.intValue());
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            c1.b(window, false);
            if (!kr.g.f()) {
                window.setNavigationBarColor(-16777216);
            }
        }
        return dialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
