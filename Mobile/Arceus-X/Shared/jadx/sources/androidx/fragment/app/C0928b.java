package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.C0625o0;
import androidx.core.view.C0635t0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0586b0;
import androidx.fragment.app.C0928b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.BackEventCompat;
import p093e4.AbstractC4818j0;
import p093e4.C4814h0;
import p229jt.C7352s;
import p235k2.AbstractC7429u;
import p456u2.C11776e;
import p504w1.C12277a;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\b%&'\f()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ9\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u000b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$¨\u0006,"}, m31665d2 = {"Landroidx/fragment/app/b;", "Landroidx/fragment/app/i;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/i$d;", "operations", "", "isPop", "", "d", "(Ljava/util/List;Z)V", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/b$b;", "animationInfos", "F", "Landroidx/fragment/app/b$h;", "transitionInfos", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)V", "Lw1/a;", "", "Landroid/view/View;", "", "names", "J", "(Lw1/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C0928b extends AbstractC0935i {

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/fragment/app/b$a;", "Landroidx/fragment/app/i$b;", "Landroidx/fragment/app/b$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/b$b;)V", "Landroid/view/ViewGroup;", "container", "", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/b$b;", "h", "()Landroidx/fragment/app/b$b;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a extends AbstractC0935i.b {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final b animationInfo;

        /* JADX INFO: renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m31665d2 = {"androidx/fragment/app/b$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
        public static final class AnimationAnimationListenerC14075a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC0935i.d f3360a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewGroup f3361b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ View f3362c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a f3363d;

            public AnimationAnimationListenerC14075a(AbstractC0935i.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f3360a = dVar;
                this.f3361b = viewGroup;
                this.f3362c = view;
                this.f3363d = aVar;
            }

            /* JADX INFO: renamed from: b */
            public static final void m4533b(ViewGroup container, View view, a this$0) {
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.getAnimationInfo().getOperation().m4825e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final ViewGroup viewGroup = this.f3361b;
                final View view = this.f3362c;
                final a aVar = this.f3363d;
                viewGroup.post(new Runnable() { // from class: e4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0928b.a.AnimationAnimationListenerC14075a.m4533b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f3360a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f3360a + " has reached onAnimationStart.");
                }
            }
        }

        public a(@NotNull b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: c */
        public void mo4529c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AbstractC0935i.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().f3418K;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().m4825e(this);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: d */
        public void mo4530d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.m4543b()) {
                this.animationInfo.getOperation().m4825e(this);
                return;
            }
            Context context = container.getContext();
            AbstractC0935i.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().f3418K;
            b bVar = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C0930d.a aVarM4534c = bVar.m4534c(context);
            if (aVarM4534c == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarM4534c.f3502a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != AbstractC0935i.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().m4825e(this);
                return;
            }
            container.startViewTransition(view);
            C0930d.b bVar2 = new C0930d.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC14075a(operation, container, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Landroidx/fragment/app/b$b;", "Landroidx/fragment/app/b$f;", "Landroidx/fragment/app/i$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/i$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/d$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/d$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/d$a;", "animation", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isPop;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isAnimLoaded;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public C0930d.a animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull AbstractC0935i.d operation, boolean z10) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.isPop = z10;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final C0930d.a m4534c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            C0930d.a aVarM4732b = C0930d.m4732b(context, getOperation().getFragment(), getOperation().getFinalState() == AbstractC0935i.d.b.VISIBLE, this.isPop);
            this.animation = aVarM4732b;
            this.isAnimLoaded = true;
            return aVarM4732b;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$c */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Landroidx/fragment/app/b$c;", "Landroidx/fragment/app/i$b;", "Landroidx/fragment/app/b$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/b$b;)V", "Landroid/view/ViewGroup;", "container", "", "f", "(Landroid/view/ViewGroup;)V", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/b$b;", "h", "()Landroidx/fragment/app/b$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class c extends AbstractC0935i.b {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final b animatorInfo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public AnimatorSet animator;

        /* JADX INFO: renamed from: androidx.fragment.app.b$c$a */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"androidx/fragment/app/b$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewGroup f3369a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f3370b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f3371c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AbstractC0935i.d f3372d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ c f3373e;

            public a(ViewGroup viewGroup, View view, boolean z10, AbstractC0935i.d dVar, c cVar) {
                this.f3369a = viewGroup;
                this.f3370b = view;
                this.f3371c = z10;
                this.f3372d = dVar;
                this.f3373e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f3369a.endViewTransition(this.f3370b);
                if (this.f3371c || this.f3372d.getFinalState() == AbstractC0935i.d.b.GONE) {
                    AbstractC0935i.d.b finalState = this.f3372d.getFinalState();
                    View viewToAnimate = this.f3370b;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    finalState.m4841b(viewToAnimate, this.f3369a);
                }
                this.f3373e.getAnimatorInfo().getOperation().m4825e(this.f3373e);
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f3372d + " has ended.");
                }
            }
        }

        public c(@NotNull b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: c */
        public void mo4529c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().m4825e(this);
                return;
            }
            AbstractC0935i.d operation = this.animatorInfo.getOperation();
            if (operation.getIsSeeking()) {
                e.f3375a.m4540a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.m4349N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: d */
        public void mo4530d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AbstractC0935i.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().m4825e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: e */
        public void mo4536e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            AbstractC0935i.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().m4825e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().f3451n) {
                return;
            }
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jM4539a = d.f3374a.m4539a(animatorSet);
            long progress = (long) (backEvent.getProgress() * jM4539a);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jM4539a) {
                progress = jM4539a - 1;
            }
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            e.f3375a.m4541b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: f */
        public void mo4537f(@NotNull ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.m4543b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C0930d.a aVarM4534c = bVar.m4534c(context);
            this.animator = aVarM4534c != null ? aVarM4534c.f3503b : null;
            AbstractC0935i.d operation = this.animatorInfo.getOperation();
            ComponentCallbacksC0929c fragment = operation.getFragment();
            boolean z10 = operation.getFinalState() == AbstractC0935i.d.b.GONE;
            View view = fragment.f3418K;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroidx/fragment/app/b$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f3374a = new d();

        /* JADX INFO: renamed from: a */
        public final long m4539a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$e */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Landroidx/fragment/app/b$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final e f3375a = new e();

        /* JADX INFO: renamed from: a */
        public final void m4540a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        /* JADX INFO: renamed from: b */
        public final void m4541b(@NotNull AnimatorSet animatorSet, long time) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$f */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Landroidx/fragment/app/b$f;", "", "Landroidx/fragment/app/i$d;", "operation", "<init>", "(Landroidx/fragment/app/i$d;)V", "a", "Landroidx/fragment/app/i$d;", "()Landroidx/fragment/app/i$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static class f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC0935i.d operation;

        public f(@NotNull AbstractC0935i.d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC0935i.d getOperation() {
            return this.operation;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m4543b() {
            View view = this.operation.getFragment().f3418K;
            AbstractC0935i.d.b bVarM4842a = view != null ? AbstractC0935i.d.b.INSTANCE.m4842a(view) : null;
            AbstractC0935i.d.b finalState = this.operation.getFinalState();
            if (bVarM4842a == finalState) {
                return true;
            }
            AbstractC0935i.d.b bVar = AbstractC0935i.d.b.VISIBLE;
            return (bVarM4842a == bVar || finalState == bVar) ? false : true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$g */
    @Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bb\u0010T\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006j"}, m31665d2 = {"Landroidx/fragment/app/b$g;", "Landroidx/fragment/app/i$b;", "", "Landroidx/fragment/app/b$h;", "transitionInfos", "Landroidx/fragment/app/i$d;", "firstOut", "lastIn", "Le4/j0;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lw1/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;Le4/j0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Lw1/a;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/i$d;", "t", "()Landroidx/fragment/app/i$d;", "u", "g", "Le4/j0;", "v", "()Le4/j0;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Lw1/a;", "getSharedElementNameMapping", "()Lw1/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Lu2/e;", "q", "Lu2/e;", "getTransitionSignal", "()Lu2/e;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", "D", "(Z)V", "noControllerReturned", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class g extends AbstractC0935i.b {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<h> transitionInfos;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final AbstractC0935i.d firstOut;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final AbstractC0935i.d lastIn;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final AbstractC4818j0 transitionImpl;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Object sharedElementTransition;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<View> sharedElementFirstOutViews;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<View> sharedElementLastInViews;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final C12277a<String, String> sharedElementNameMapping;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<String> enteringNames;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<String> exitingNames;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final C12277a<String, View> firstOutViews;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final C12277a<String, View> lastInViews;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public final boolean isPop;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final C11776e transitionSignal;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public Object controller;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public boolean noControllerReturned;

        /* JADX INFO: renamed from: androidx.fragment.app.b$g$a */
        @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "b", "()V"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class a extends AbstractC7746m implements Function0<Unit> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ ViewGroup f3394j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ Object f3395k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f3394j = viewGroup;
                this.f3395k = obj;
            }

            /* JADX INFO: renamed from: b */
            public final void m4567b() {
                g.this.getTransitionImpl().mo23299e(this.f3394j, this.f3395k);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m4567b();
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.b$g$b */
        @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "b", "()V"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class b extends AbstractC7746m implements Function0<Unit> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ ViewGroup f3397j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ Object f3398k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ C7729c0<Function0<Unit>> f3399l;

            /* JADX INFO: renamed from: androidx.fragment.app.b$g$b$a */
            @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "d", "()V"}, m31666k = 3, m31667mv = {1, 8, 0})
            public static final class a extends AbstractC7746m implements Function0<Unit> {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ g f3400i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ Object f3401j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ ViewGroup f3402k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f3400i = gVar;
                    this.f3401j = obj;
                    this.f3402k = viewGroup;
                }

                /* JADX INFO: renamed from: f */
                public static final void m4571f(g this$0, ViewGroup container) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(container, "$container");
                    Iterator<T> it = this$0.m4565w().iterator();
                    while (it.hasNext()) {
                        AbstractC0935i.d operation = ((h) it.next()).getOperation();
                        View viewM4677j0 = operation.getFragment().m4677j0();
                        if (viewM4677j0 != null) {
                            operation.getFinalState().m4841b(viewM4677j0, container);
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public static final void m4572g(g this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator<T> it = this$0.m4565w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().m4825e(this$0);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m4573d() {
                    List<h> listM4565w = this.f3400i.m4565w();
                    if (!(listM4565w instanceof Collection) || !listM4565w.isEmpty()) {
                        Iterator<T> it = listM4565w.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                if (FragmentManager.m4349N0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                C11776e c11776e = new C11776e();
                                AbstractC4818j0 transitionImpl = this.f3400i.getTransitionImpl();
                                ComponentCallbacksC0929c fragment = this.f3400i.m4565w().get(0).getOperation().getFragment();
                                Object obj = this.f3401j;
                                final g gVar = this.f3400i;
                                transitionImpl.mo23310w(fragment, obj, c11776e, new Runnable() { // from class: e4.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0928b.g.b.a.m4572g(gVar);
                                    }
                                });
                                c11776e.m44058a();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    AbstractC4818j0 transitionImpl2 = this.f3400i.getTransitionImpl();
                    Object controller = this.f3400i.getController();
                    Intrinsics.checkNotNull(controller);
                    final g gVar2 = this.f3400i;
                    final ViewGroup viewGroup = this.f3402k;
                    transitionImpl2.mo23316d(controller, new Runnable() { // from class: e4.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0928b.g.b.a.m4571f(gVar2, viewGroup);
                        }
                    });
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    m4573d();
                    return Unit.f29331a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, C7729c0<Function0<Unit>> c7729c0) {
                super(0);
                this.f3397j = viewGroup;
                this.f3398k = obj;
                this.f3399l = c7729c0;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.b$g$b$a] */
            /* JADX INFO: renamed from: b */
            public final void m4568b() {
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.m4557C(gVar.getTransitionImpl().mo23317j(this.f3397j, this.f3398k));
                if (g.this.getController() == null) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    g.this.m4558D(true);
                    return;
                }
                this.f3399l.f29425a = new a(g.this, this.f3398k, this.f3397j);
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.getFirstOut() + " to " + g.this.getLastIn());
                }
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m4568b();
                return Unit.f29331a;
            }
        }

        public g(@NotNull List<h> transitionInfos, @Nullable AbstractC0935i.d dVar, @Nullable AbstractC0935i.d dVar2, @NotNull AbstractC4818j0 transitionImpl, @Nullable Object obj, @NotNull ArrayList<View> sharedElementFirstOutViews, @NotNull ArrayList<View> sharedElementLastInViews, @NotNull C12277a<String, String> sharedElementNameMapping, @NotNull ArrayList<String> enteringNames, @NotNull ArrayList<String> exitingNames, @NotNull C12277a<String, View> firstOutViews, @NotNull C12277a<String, View> lastInViews, boolean z10) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z10;
            this.transitionSignal = new C11776e();
        }

        /* JADX INFO: renamed from: A */
        public static final void m4544A(AbstractC0935i.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.m4825e(this$0);
        }

        /* JADX INFO: renamed from: p */
        public static final void m4551p(AbstractC0935i.d dVar, AbstractC0935i.d dVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4814h0.m23288a(dVar.getFragment(), dVar2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: renamed from: q */
        public static final void m4552q(AbstractC4818j0 impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.m23318k(view, lastInEpicenterRect);
        }

        /* JADX INFO: renamed from: r */
        public static final void m4553r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            C4814h0.m23291e(transitioningViews, 4);
        }

        /* JADX INFO: renamed from: y */
        public static final void m4554y(AbstractC0935i.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.m4825e(this$0);
        }

        /* JADX INFO: renamed from: z */
        public static final void m4555z(C7729c0 seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.f29425a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: renamed from: B */
        public final void m4556B(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
            C4814h0.m23291e(enteringViews, 4);
            ArrayList<String> arrayListM23319q = this.transitionImpl.m23319q(this.sharedElementLastInViews);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                ArrayList<View> arrayList = this.sharedElementFirstOutViews;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    View sharedElementFirstOutViews = arrayList.get(i10);
                    i10++;
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + C0625o0.m2992H(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                ArrayList<View> arrayList2 = this.sharedElementLastInViews;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    View sharedElementLastInViews = arrayList2.get(i11);
                    i11++;
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + C0625o0.m2992H(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.m23322y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListM23319q, this.sharedElementNameMapping);
            C4814h0.m23291e(enteringViews, 0);
            this.transitionImpl.mo23294A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        /* JADX INFO: renamed from: C */
        public final void m4557C(@Nullable Object obj) {
            this.controller = obj;
        }

        /* JADX INFO: renamed from: D */
        public final void m4558D(boolean z10) {
            this.noControllerReturned = z10;
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.mo23302m()) {
                return false;
            }
            List<h> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.mo23303n(hVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.mo23303n(obj);
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: c */
        public void mo4529c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.transitionSignal.m44058a();
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: d */
        public void mo4530d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            int i10 = 0;
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (h hVar : this.transitionInfos) {
                    AbstractC0935i.d operation = hVar.getOperation();
                    if (FragmentManager.m4349N0(2)) {
                        if (this.noControllerReturned) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    hVar.getOperation().m4825e(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                AbstractC4818j0 abstractC4818j0 = this.transitionImpl;
                Intrinsics.checkNotNull(obj);
                abstractC4818j0.mo23315c(obj);
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairM4560o = m4560o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListM31671a = pairM4560o.m31671a();
            Object objM31672b = pairM4560o.m31672b();
            List<h> list = this.transitionInfos;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                final AbstractC0935i.d dVar = (AbstractC0935i.d) obj2;
                this.transitionImpl.mo23310w(dVar.getFragment(), objM31672b, this.transitionSignal, new Runnable() { // from class: e4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0928b.g.m4554y(dVar, this);
                    }
                });
            }
            m4556B(arrayListM31671a, container, new a(container, objM31672b));
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: e */
        public void mo4536e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.mo23320t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.AbstractC0935i.b
        /* JADX INFO: renamed from: f */
        public void mo4537f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    AbstractC0935i.d operation = ((h) it.next()).getOperation();
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (m4566x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && m4566x()) {
                final C7729c0 c7729c0 = new C7729c0();
                Pair<ArrayList<View>, Object> pairM4560o = m4560o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListM31671a = pairM4560o.m31671a();
                Object objM31672b = pairM4560o.m31672b();
                List<h> list = this.transitionInfos;
                ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).getOperation());
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    final AbstractC0935i.d dVar = (AbstractC0935i.d) arrayList.get(i10);
                    this.transitionImpl.mo23321x(dVar.getFragment(), objM31672b, this.transitionSignal, new Runnable() { // from class: e4.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0928b.g.m4555z(c7729c0);
                        }
                    }, new Runnable() { // from class: e4.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0928b.g.m4544A(dVar, this);
                        }
                    });
                }
                m4556B(arrayListM31671a, container, new b(container, objM31672b, c7729c0));
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m4559n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0635t0.m3178c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    m4559n(transitioningViews, child);
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public final Pair<ArrayList<View>, Object> m4560o(ViewGroup container, final AbstractC0935i.d lastIn, final AbstractC0935i.d firstOut) {
            lastIn = lastIn;
            firstOut = firstOut;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().m4578g() && firstOut != null && lastIn != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    C4814h0.m23288a(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(container, new Runnable() { // from class: e4.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0928b.g.m4551p(lastIn, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.mo23309v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final AbstractC4818j0 abstractC4818j0 = this.transitionImpl;
                            ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(container, new Runnable() { // from class: e4.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0928b.g.m4552q(abstractC4818j0, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.transitionImpl.mo23311z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    AbstractC4818j0 abstractC4818j1 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    abstractC4818j1.mo23307s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.transitionInfos.iterator();
            Object objMo23305p = null;
            Object objMo23305p2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                AbstractC0935i.d operation = next.getOperation();
                z10 = z10;
                Object objMo23301h = this.transitionImpl.mo23301h(next.getTransition());
                if (objMo23301h != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<h> it3 = it2;
                    View view4 = operation.getFragment().f3418K;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    m4559n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == lastIn)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(CollectionsKt.m31691Q0(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(CollectionsKt.m31691Q0(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.mo23297a(objMo23301h, view);
                    } else {
                        this.transitionImpl.mo23298b(objMo23301h, arrayList2);
                        this.transitionImpl.mo23307s(objMo23301h, objMo23301h, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == AbstractC0935i.d.b.GONE) {
                            operation.m4836q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().f3418K);
                            this.transitionImpl.mo23306r(objMo23301h, operation.getFragment().f3418K, arrayList3);
                            ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(container, new Runnable() { // from class: e4.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0928b.g.m4553r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == AbstractC0935i.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.transitionImpl.mo23308u(objMo23301h, rect);
                        }
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objMo23301h);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                int i11 = size;
                                View transitioningViews = arrayList2.get(i10);
                                i10++;
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews);
                                size = i11;
                            }
                        }
                    } else {
                        this.transitionImpl.mo23309v(objMo23301h, view2);
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objMo23301h);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            int i12 = 0;
                            for (int size2 = arrayList2.size(); i12 < size2; size2 = size2) {
                                View transitioningViews2 = arrayList2.get(i12);
                                i12++;
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objMo23305p = this.transitionImpl.mo23305p(objMo23305p, objMo23301h, null);
                    } else {
                        objMo23305p2 = this.transitionImpl.mo23305p(objMo23305p2, objMo23301h, null);
                    }
                    it2 = it3;
                }
            }
            Object objMo23304o = this.transitionImpl.mo23304o(objMo23305p, objMo23305p2, this.sharedElementTransition);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objMo23304o + " for container " + container);
            }
            return new Pair<>(arrayList, objMo23304o);
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final AbstractC0935i.d getFirstOut() {
            return this.firstOut;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final AbstractC0935i.d getLastIn() {
            return this.lastIn;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final AbstractC4818j0 getTransitionImpl() {
            return this.transitionImpl;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final List<h> m4565w() {
            return this.transitionInfos;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m4566x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().f3451n) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$h */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Landroidx/fragment/app/b$h;", "Landroidx/fragment/app/b$f;", "Landroidx/fragment/app/i$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/i$d;ZZ)V", "g", "()Z", "", "transition", "Le4/j0;", "d", "(Ljava/lang/Object;)Le4/j0;", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Le4/j0;", "handlingImpl", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class h extends f {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object transition;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean isOverlapAllowed;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object sharedElementTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull AbstractC0935i.d operation, boolean z10, boolean z11) {
            Object objM4650Y;
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            AbstractC0935i.d.b finalState = operation.getFinalState();
            AbstractC0935i.d.b bVar = AbstractC0935i.d.b.VISIBLE;
            if (finalState == bVar) {
                ComponentCallbacksC0929c fragment = operation.getFragment();
                objM4650Y = z10 ? fragment.m4634S() : fragment.m4721z();
            } else {
                ComponentCallbacksC0929c fragment2 = operation.getFragment();
                objM4650Y = z10 ? fragment2.m4650Y() : fragment2.m4592D();
            }
            this.transition = objM4650Y;
            this.isOverlapAllowed = operation.getFinalState() == bVar ? z10 ? operation.getFragment().m4698r() : operation.getFragment().m4696q() : true;
            this.sharedElementTransition = z11 ? z10 ? operation.getFragment().m4660b0() : operation.getFragment().m4657a0() : null;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final AbstractC4818j0 m4574c() {
            AbstractC4818j0 abstractC4818j0M4575d = m4575d(this.transition);
            AbstractC4818j0 abstractC4818j0M4575d2 = m4575d(this.sharedElementTransition);
            if (abstractC4818j0M4575d == null || abstractC4818j0M4575d2 == null || abstractC4818j0M4575d == abstractC4818j0M4575d2) {
                return abstractC4818j0M4575d == null ? abstractC4818j0M4575d2 : abstractC4818j0M4575d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC4818j0 m4575d(Object transition) {
            if (transition == null) {
                return null;
            }
            AbstractC4818j0 abstractC4818j0 = C4814h0.PLATFORM_IMPL;
            if (abstractC4818j0 != null && abstractC4818j0.mo23300g(transition)) {
                return abstractC4818j0;
            }
            AbstractC4818j0 abstractC4818j1 = C4814h0.SUPPORT_IMPL;
            if (abstractC4818j1 != null && abstractC4818j1.mo23300g(transition)) {
                return abstractC4818j1;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m4578g() {
            return this.sharedElementTransition != null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$i */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", "b", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class i extends AbstractC7746m implements Function1<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Collection<String> f3406i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection<String> collection) {
            super(1);
            this.f3406i = collection;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.m31699W(this.f3406i, C0625o0.m2992H(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928b(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    /* JADX INFO: renamed from: G */
    public static final void m4522G(C0928b this$0, AbstractC0935i.d operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.m4797c(operation);
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    /* JADX INFO: renamed from: F */
    public final void m4523F(List<b> animationInfos) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            C7708u.m31931z(arrayList2, ((b) it.next()).getOperation().m4826f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        int i10 = 0;
        boolean z10 = false;
        for (b bVar : animationInfos) {
            Context context = getContainer().getContext();
            AbstractC0935i.d operation = bVar.getOperation();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C0930d.a aVarM4534c = bVar.m4534c(context);
            if (aVarM4534c != null) {
                if (aVarM4534c.f3503b == null) {
                    arrayList.add(bVar);
                } else {
                    ComponentCallbacksC0929c fragment = operation.getFragment();
                    if (operation.m4826f().isEmpty()) {
                        if (operation.getFinalState() == AbstractC0935i.d.b.GONE) {
                            operation.m4836q(false);
                        }
                        operation.m4823b(new c(bVar));
                        z10 = true;
                    } else if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar2 = (b) obj;
            AbstractC0935i.d operation2 = bVar2.getOperation();
            ComponentCallbacksC0929c fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z10) {
                    operation2.m4823b(new a(bVar2));
                } else if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4524H(List<h> transitionInfos, boolean isPop, AbstractC0935i.d firstOut, AbstractC0935i.d lastIn) {
        ArrayList arrayList;
        int i10;
        AbstractC4818j0 abstractC4818j0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        String strM23289b;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : transitionInfos) {
            if (!((h) obj).m4543b()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            if (((h) obj2).m4574c() != null) {
                arrayList5.add(obj2);
            }
        }
        int size2 = arrayList5.size();
        AbstractC4818j0 abstractC4818j1 = null;
        int i13 = 0;
        while (i13 < size2) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            h hVar = (h) obj3;
            AbstractC4818j0 abstractC4818j0M4574c = hVar.m4574c();
            if (abstractC4818j1 != null && abstractC4818j0M4574c != abstractC4818j1) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC4818j1 = abstractC4818j0M4574c;
        }
        if (abstractC4818j1 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        C12277a c12277a = new C12277a();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        C12277a<String, View> c12277a2 = new C12277a<>();
        C12277a<String, View> c12277a3 = new C12277a<>();
        int size3 = arrayList5.size();
        ArrayList<String> arrayListM4664d0 = arrayList8;
        ArrayList<String> arrayListM4662c0 = arrayList9;
        Object obj4 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj5 = arrayList5.get(i14);
            int i15 = i14 + 1;
            h hVar2 = (h) obj5;
            if (!hVar2.m4578g() || firstOut == null || lastIn == null) {
                arrayList5 = arrayList5;
                i10 = i15;
                abstractC4818j0 = abstractC4818j1;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
                i11 = size3;
                i14 = i10;
                abstractC4818j1 = abstractC4818j0;
                arrayList6 = arrayList2;
                arrayList7 = arrayList3;
                size3 = i11;
                arrayList5 = arrayList5;
            } else {
                Object objMo23295B = abstractC4818j1.mo23295B(abstractC4818j1.mo23301h(hVar2.getSharedElementTransition()));
                arrayListM4662c0 = lastIn.getFragment().m4662c0();
                Intrinsics.checkNotNullExpressionValue(arrayListM4662c0, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> arrayListM4662c1 = firstOut.getFragment().m4662c0();
                Intrinsics.checkNotNullExpressionValue(arrayListM4662c1, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> arrayListM4664d1 = firstOut.getFragment().m4664d0();
                i10 = i15;
                Intrinsics.checkNotNullExpressionValue(arrayListM4664d1, "firstOut.fragment.sharedElementTargetNames");
                int size4 = arrayListM4664d1.size();
                abstractC4818j0 = abstractC4818j1;
                arrayList2 = arrayList6;
                int i16 = 0;
                while (i16 < size4) {
                    int i17 = size4;
                    int iIndexOf = arrayListM4662c0.indexOf(arrayListM4664d1.get(i16));
                    if (iIndexOf != -1) {
                        arrayListM4662c0.set(iIndexOf, arrayListM4662c1.get(i16));
                    }
                    i16++;
                    size4 = i17;
                }
                arrayListM4664d0 = lastIn.getFragment().m4664d0();
                Intrinsics.checkNotNullExpressionValue(arrayListM4664d0, "lastIn.fragment.sharedElementTargetNames");
                Pair pairM30477a = !isPop ? C7352s.m30477a(firstOut.getFragment().m4595E(), lastIn.getFragment().m4586B()) : C7352s.m30477a(firstOut.getFragment().m4586B(), lastIn.getFragment().m4595E());
                AbstractC7429u abstractC7429u = (AbstractC7429u) pairM30477a.m31671a();
                AbstractC7429u abstractC7429u2 = (AbstractC7429u) pairM30477a.m31672b();
                int size5 = arrayListM4662c0.size();
                arrayList3 = arrayList7;
                int i18 = 0;
                while (true) {
                    i11 = size3;
                    if (i18 >= size5) {
                        break;
                    }
                    int i19 = size5;
                    String str = arrayListM4662c0.get(i18);
                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                    String str2 = arrayListM4664d0.get(i18);
                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                    c12277a.put(str, str2);
                    i18++;
                    size3 = i11;
                    size5 = i19;
                }
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    int size6 = arrayListM4664d0.size();
                    int i20 = 0;
                    while (i20 < size6) {
                        String str3 = arrayListM4664d0.get(i20);
                        int i21 = i20 + 1;
                        String str4 = str3;
                        Log.v("FragmentManager", "Name: " + str4);
                        size6 = size6;
                        i20 = i21;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    int i22 = 0;
                    for (int size7 = arrayListM4662c0.size(); i22 < size7; size7 = size7) {
                        String str5 = arrayListM4662c0.get(i22);
                        Log.v("FragmentManager", "Name: " + str5);
                        i22++;
                    }
                }
                View view = firstOut.getFragment().f3418K;
                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                m4525I(c12277a2, view);
                c12277a2.m45579o(arrayListM4662c0);
                if (abstractC7429u != null) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + firstOut);
                    }
                    abstractC7429u.m30949a(arrayListM4662c0, c12277a2);
                    int size8 = arrayListM4662c0.size() - 1;
                    if (size8 >= 0) {
                        while (true) {
                            int i23 = size8 - 1;
                            String str6 = arrayListM4662c0.get(size8);
                            Intrinsics.checkNotNullExpressionValue(str6, "exitingNames[i]");
                            String str7 = str6;
                            View view2 = c12277a2.get(str7);
                            if (view2 == null) {
                                c12277a.remove(str7);
                            } else if (!Intrinsics.m31980c(str7, C0625o0.m2992H(view2))) {
                                c12277a.put(C0625o0.m2992H(view2), (String) c12277a.remove(str7));
                            }
                            if (i23 < 0) {
                                break;
                            } else {
                                size8 = i23;
                            }
                        }
                    }
                } else {
                    c12277a.m45579o(c12277a2.keySet());
                }
                View view3 = lastIn.getFragment().f3418K;
                Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                m4525I(c12277a3, view3);
                c12277a3.m45579o(arrayListM4664d0);
                c12277a3.m45579o(c12277a.values());
                if (abstractC7429u2 != null) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + lastIn);
                    }
                    abstractC7429u2.m30949a(arrayListM4664d0, c12277a3);
                    int size9 = arrayListM4664d0.size() - 1;
                    if (size9 >= 0) {
                        while (true) {
                            int i24 = size9 - 1;
                            String str8 = arrayListM4664d0.get(size9);
                            Intrinsics.checkNotNullExpressionValue(str8, "enteringNames[i]");
                            String str9 = str8;
                            View view4 = c12277a3.get(str9);
                            if (view4 == null) {
                                String strM23289b2 = C4814h0.m23289b(c12277a, str9);
                                if (strM23289b2 != null) {
                                    c12277a.remove(strM23289b2);
                                }
                            } else if (!Intrinsics.m31980c(str9, C0625o0.m2992H(view4)) && (strM23289b = C4814h0.m23289b(c12277a, str9)) != null) {
                                c12277a.put(strM23289b, C0625o0.m2992H(view4));
                            }
                            if (i24 < 0) {
                                break;
                            } else {
                                size9 = i24;
                            }
                        }
                    }
                } else {
                    C4814h0.m23290d(c12277a, c12277a3);
                }
                Collection<String> collectionKeySet = c12277a.keySet();
                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                m4526J(c12277a2, collectionKeySet);
                Collection<String> collectionValues = c12277a.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                m4526J(c12277a3, collectionValues);
                if (c12277a.isEmpty()) {
                    Log.i("FragmentManager", "Ignoring shared elements transition " + objMo23295B + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    i14 = i10;
                    abstractC4818j1 = abstractC4818j0;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    size3 = i11;
                    arrayList5 = arrayList5;
                    obj4 = null;
                } else {
                    obj4 = objMo23295B;
                    i14 = i10;
                    abstractC4818j1 = abstractC4818j0;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    size3 = i11;
                    arrayList5 = arrayList5;
                }
            }
        }
        ArrayList arrayList10 = arrayList5;
        AbstractC4818j0 abstractC4818j2 = abstractC4818j1;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList7;
        if (obj4 == null) {
            if (arrayList10.isEmpty()) {
                return;
            }
            int size10 = arrayList10.size();
            int i25 = 0;
            while (i25 < size10) {
                arrayList = arrayList10;
                Object obj6 = arrayList.get(i25);
                i25++;
                if (((h) obj6).getTransition() == null) {
                    arrayList10 = arrayList;
                }
            }
            return;
        }
        arrayList = arrayList10;
        ArrayList arrayList13 = arrayList;
        g gVar = new g(arrayList13, firstOut, lastIn, abstractC4818j2, obj4, arrayList11, arrayList12, c12277a, arrayListM4664d0, arrayListM4662c0, c12277a2, c12277a3, isPop);
        int size11 = arrayList13.size();
        int i26 = 0;
        while (i26 < size11) {
            Object obj7 = arrayList13.get(i26);
            i26++;
            ((h) obj7).getOperation().m4823b(gVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4525I(Map<String, View> namedViews, View view) {
        String strM2992H = C0625o0.m2992H(view);
        if (strM2992H != null) {
            namedViews.put(strM2992H, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    m4525I(namedViews, child);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4526J(C12277a<String, View> c12277a, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = c12277a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        C7708u.m31929J(entries, new i(collection));
    }

    /* JADX INFO: renamed from: K */
    public final void m4527K(List<? extends AbstractC0935i.d> operations) {
        ComponentCallbacksC0929c fragment = ((AbstractC0935i.d) CollectionsKt.m31717o0(operations)).getFragment();
        for (AbstractC0935i.d dVar : operations) {
            dVar.getFragment().f3421N.f3482c = fragment.f3421N.f3482c;
            dVar.getFragment().f3421N.f3483d = fragment.f3421N.f3483d;
            dVar.getFragment().f3421N.f3484e = fragment.f3421N.f3484e;
            dVar.getFragment().f3421N.f3485f = fragment.f3421N.f3485f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    @Override // androidx.fragment.app.AbstractC0935i
    /* JADX INFO: renamed from: d */
    public void mo4528d(@NotNull List<? extends AbstractC0935i.d> operations, boolean isPop) {
        AbstractC0935i.d dVar;
        Object next;
        Intrinsics.checkNotNullParameter(operations, "operations");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator<T> it = operations.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC0935i.d dVar2 = (AbstractC0935i.d) next;
            AbstractC0935i.d.b.Companion companion = AbstractC0935i.d.b.INSTANCE;
            View view = dVar2.getFragment().f3418K;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            AbstractC0935i.d.b bVarM4842a = companion.m4842a(view);
            AbstractC0935i.d.b bVar = AbstractC0935i.d.b.VISIBLE;
            if (bVarM4842a == bVar && dVar2.getFinalState() != bVar) {
                break;
            }
        }
        AbstractC0935i.d dVar3 = (AbstractC0935i.d) next;
        ListIterator<? extends AbstractC0935i.d> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            AbstractC0935i.d dVarPrevious = listIterator.previous();
            AbstractC0935i.d dVar4 = dVarPrevious;
            AbstractC0935i.d.b.Companion companion2 = AbstractC0935i.d.b.INSTANCE;
            View view2 = dVar4.getFragment().f3418K;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            AbstractC0935i.d.b bVarM4842a2 = companion2.m4842a(view2);
            AbstractC0935i.d.b bVar2 = AbstractC0935i.d.b.VISIBLE;
            if (bVarM4842a2 != bVar2 && dVar4.getFinalState() == bVar2) {
                dVar = dVarPrevious;
                break;
            }
        }
        AbstractC0935i.d dVar5 = dVar;
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar3 + " to " + dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m4527K(operations);
        for (final AbstractC0935i.d dVar6 : operations) {
            arrayList.add(new b(dVar6, isPop));
            boolean z10 = false;
            if (isPop) {
                if (dVar6 == dVar3) {
                    z10 = true;
                }
            } else if (dVar6 == dVar5) {
                z10 = true;
            }
            arrayList2.add(new h(dVar6, isPop, z10));
            dVar6.m4822a(new Runnable() { // from class: e4.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0928b.m4522G(this.f19403a, dVar6);
                }
            });
        }
        m4524H(arrayList2, isPop, dVar3, dVar5);
        m4523F(arrayList);
    }
}
