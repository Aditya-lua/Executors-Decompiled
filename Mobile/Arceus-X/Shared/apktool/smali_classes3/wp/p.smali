.class public final Lwp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwp/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lwp/i<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00172\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lwp/p;",
        "Lan/k;",
        "Lwp/i;",
        "Lxp/b;",
        "binding",
        "<init>",
        "(Lxp/b;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "l",
        "(Lwp/i;Lan/y;)V",
        "Landroid/content/Context;",
        "context",
        "h",
        "(Lwp/i;Landroid/content/Context;)V",
        "b",
        "Lxp/b;",
        "Landroid/app/Dialog;",
        "c",
        "Landroid/app/Dialog;",
        "optionsDialog",
        "d",
        "a",
        "sandbox_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lwp/p$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lxp/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Landroid/app/Dialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwp/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwp/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwp/p;->d:Lwp/p$a;

    return-void
.end method

.method public constructor <init>(Lxp/b;)V
    .locals 1
    .param p1    # Lxp/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/p;->b:Lxp/b;

    return-void
.end method

.method public static synthetic b(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lwp/p;->i(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lwp/i;Lxp/b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lwp/p;->m(Lwp/i;Lxp/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lwp/p;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwp/p;->o(Lwp/p;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwp/p;Lwp/i;Landroid/content/Context;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwp/p;->n(Lwp/p;Lwp/i;Landroid/content/Context;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lwp/i;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lwp/p;->j(Lwp/i;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic g(Lwp/p;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lwp/p;->k(Lwp/p;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final i(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public static final j(Lwp/i;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwp/i;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lwp/p;Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lwp/p;->c:Landroid/app/Dialog;

    return-void
.end method

.method public static final m(Lwp/i;Lxp/b;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lwp/i;->c()Lkotlin/jvm/functions/Function0;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p2, Lwp/c;->e:Lwp/c$a;

    invoke-virtual {p0}, Lwp/i;->a()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwp/c$b;

    invoke-virtual {p2, p0}, Lwp/c$a;->a(Lwp/c$b;)Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting the debug flag to: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iget-object p1, p1, Lxp/b;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static final n(Lwp/p;Lwp/i;Landroid/content/Context;Landroid/view/View;)Z
    .locals 0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lwp/p;->h(Lwp/i;Landroid/content/Context;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final o(Lwp/p;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 5

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    const-string v0, "getInsetsIgnoringVisibility(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lwp/p;->b:Lxp/b;

    iget-object p0, p0, Lxp/b;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const-string v0, "floatingActionButton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    int-to-double v1, p1

    const-wide/high16 v3, 0x4030000000000000L    # 16.0

    invoke-static {v3, v4}, Ljq/j;->c(D)D

    move-result-wide v3

    add-double/2addr v1, v3

    double-to-int p1, v1

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lwp/i;

    invoke-virtual {p0, p1, p2}, Lwp/p;->l(Lwp/i;Lan/y;)V

    return-void
.end method

.method public final h(Lwp/i;Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp/i<",
            "*>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lwp/p;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/app/Dialog;

    sget v1, Lic/j;->d:I

    invoke-direct {v0, p2, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2}, Lxp/a;->c(Landroid/view/LayoutInflater;)Lxp/a;

    move-result-object p2

    const-string v1, "inflate(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lxp/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    iget-object v1, p2, Lxp/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    const-string v2, "Sandbox options"

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p2, Lxp/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    sget v2, Ljq/s;->u:I

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    iget-object v1, p2, Lxp/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    new-instance v2, Lwp/m;

    invoke-direct {v2, v0}, Lwp/m;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p2, Lxp/a;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    invoke-virtual {p1}, Lwp/i;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p2, p2, Lxp/a;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    new-instance v1, Lwp/n;

    invoke-direct {v1, p1}, Lwp/n;-><init>(Lwp/i;)V

    invoke-virtual {p2, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    new-instance p1, Lwp/o;

    invoke-direct {p1, p0}, Lwp/o;-><init>(Lwp/p;)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-object v0, p0, Lwp/p;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public l(Lwp/i;Lan/y;)V
    .locals 4
    .param p1    # Lwp/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp/i<",
            "*>;",
            "Lan/y;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwp/p;->b:Lxp/b;

    invoke-virtual {v0}, Lxp/b;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lxp/b;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v3, Lwp/j;

    invoke-direct {v3, p1, v0}, Lwp/j;-><init>(Lwp/i;Lxp/b;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Lxp/b;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v3, Lwp/k;

    invoke-direct {v3, p0, p1, v1}, Lwp/k;-><init>(Lwp/p;Lwp/i;Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v1, v0, Lxp/b;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const-string v2, "floatingActionButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwp/l;

    invoke-direct {v2, p0}, Lwp/l;-><init>(Lwp/p;)V

    invoke-static {v1, v2}, Lwq/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lxp/b;->b:Lcom/squareup/workflow1/ui/WorkflowViewStub;

    invoke-virtual {p1}, Lwp/i;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/squareup/workflow1/ui/WorkflowViewStub;->c(Ljava/lang/Object;Lan/y;)Landroid/view/View;

    return-void
.end method
