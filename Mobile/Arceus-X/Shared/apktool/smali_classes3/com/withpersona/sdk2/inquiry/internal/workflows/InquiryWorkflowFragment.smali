.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;
.super Lkq/a;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;,
        Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkq/a<",
        "Lbp/c;",
        ">;",
        "Ldt/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 ]2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002^_B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081.\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010PR\u001b\u0010V\u001a\u00020R8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010N\u001a\u0004\u0008T\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\u00a8\u0006`"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;",
        "Lkq/a;",
        "Lbp/c;",
        "Ldt/d;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "F0",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "J0",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "e1",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Ldt/a;",
        "",
        "c",
        "()Ldt/a;",
        "Lcom/withpersona/sdk2/inquiry/internal/i;",
        "p2",
        "()Lcom/withpersona/sdk2/inquiry/internal/i;",
        "Lzo/s;",
        "h0",
        "Lzo/s;",
        "j2",
        "()Lzo/s;",
        "setInquiryComponent$inquiry_internal_release",
        "(Lzo/s;)V",
        "inquiryComponent",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;",
        "i0",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;",
        "m2",
        "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;",
        "setViewModelFactory",
        "(Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;)V",
        "viewModelFactory",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;",
        "j0",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;",
        "o2",
        "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;",
        "setWorkflowStateViewModelFactory",
        "(Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;)V",
        "workflowStateViewModelFactory",
        "Lvq/a;",
        "k0",
        "Lvq/a;",
        "getSystemUiController",
        "()Lvq/a;",
        "setSystemUiController",
        "(Lvq/a;)V",
        "systemUiController",
        "Lgo/e;",
        "l0",
        "Lgo/e;",
        "getFeatureFlagManager",
        "()Lgo/e;",
        "setFeatureFlagManager",
        "(Lgo/e;)V",
        "featureFlagManager",
        "Lhp/n0;",
        "m0",
        "Lhp/n0;",
        "k2",
        "()Lhp/n0;",
        "setInquiryStateRenderer",
        "(Lhp/n0;)V",
        "inquiryStateRenderer",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;",
        "n0",
        "Ljt/h;",
        "l2",
        "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c;",
        "viewModel",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/e;",
        "o0",
        "n2",
        "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e;",
        "workflowStateViewModel",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;",
        "p0",
        "Lkq/c;",
        "i2",
        "()Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;",
        "args",
        "q0",
        "WorkflowFragmentArgs",
        "a",
        "inquiry-internal_release"
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
.field public static final q0:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public h0:Lzo/s;

.field public i0:Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;

.field public j0:Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;

.field public k0:Lvq/a;

.field public l0:Lgo/e;

.field public m0:Lhp/n0;

.field public final n0:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o0:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p0:Lkq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->q0:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lkq/a;-><init>()V

    new-instance v0, Lkp/a;

    invoke-direct {v0, p0}, Lkp/a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$f;

    invoke-direct {v1, p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$f;-><init>(Landroidx/fragment/app/c;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$g;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$g;-><init>(Landroidx/fragment/app/c;)V

    sget-object v2, Ljt/k;->c:Ljt/k;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$h;

    invoke-direct {v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$h;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v2, v3}, Ljt/i;->a(Ljt/k;Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    const-class v3, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    invoke-static {v3}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v3

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$i;

    invoke-direct {v4, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$i;-><init>(Ljt/h;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$j;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$j;-><init>(Lkotlin/jvm/functions/Function0;Ljt/h;)V

    invoke-static {p0, v3, v4, v5, v1}, Le4/l0;->b(Landroidx/fragment/app/c;Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->n0:Ljt/h;

    new-instance v0, Lkp/b;

    invoke-direct {v0, p0}, Lkp/b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$k;

    invoke-direct {v1, p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$k;-><init>(Landroidx/fragment/app/c;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$l;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$l;-><init>(Landroidx/fragment/app/c;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$m;

    invoke-direct {v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$m;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v2, v3}, Ljt/i;->a(Ljt/k;Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$n;

    invoke-direct {v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$n;-><init>(Ljt/h;)V

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$e;

    invoke-direct {v4, v6, v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$e;-><init>(Lkotlin/jvm/functions/Function0;Ljt/h;)V

    invoke-static {p0, v2, v3, v4, v1}, Le4/l0;->b(Landroidx/fragment/app/c;Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->o0:Ljt/h;

    new-instance v0, Lkq/c;

    const-class v1, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$d;

    invoke-direct {v2, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$d;-><init>(Landroidx/fragment/app/c;)V

    invoke-direct {v0, v1, v2}, Lkq/c;-><init>(Lhu/c;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->p0:Lkq/c;

    return-void
.end method

.method public static synthetic f2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->q2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->r2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)Lcom/withpersona/sdk2/inquiry/internal/i;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->p2()Lcom/withpersona/sdk2/inquiry/internal/i;

    move-result-object p0

    return-object p0
.end method

.method public static final q2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->m2()Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;->a(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    move-result-object p0

    return-object p0
.end method

.method public static final r2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->o2()Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;->a(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public F0(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->p2()Lcom/withpersona/sdk2/inquiry/internal/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->m2()Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;->a()Lcom/withpersona/sdk2/inquiry/internal/workflows/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/a;->a(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->F0(Landroid/os/Bundle;)V

    return-void
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lbp/c;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lbp/c;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkq/a;->e2(Lr5/a;)V

    invoke-virtual {p0}, Lkq/a;->b2()Lr5/a;

    move-result-object p1

    check-cast p1, Lbp/c;

    invoke-virtual {p1}, Lbp/c;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Ldt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldt/a<",
            "-",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->j2()Lzo/s;

    move-result-object v0

    invoke-interface {v0}, Lzo/s;->a()Ldt/b;

    move-result-object v0

    return-object v0
.end method

.method public e1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/c;->e1(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lkq/a;->b2()Lr5/a;

    move-result-object p1

    check-cast p1, Lbp/c;

    iget-object p1, p1, Lbp/c;->c:Landroidx/fragment/app/FragmentContainerView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->j2()Lzo/s;

    move-result-object p1

    invoke-interface {p1}, Lzo/s;->i()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->v()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string v0, "getChildFragmentManager(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkq/a;->b2()Lr5/a;

    move-result-object v0

    check-cast v0, Lbp/c;

    iget-object v0, v0, Lbp/c;->c:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->k0()Landroidx/lifecycle/s;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;->d(Landroidx/fragment/app/FragmentManager;ILandroidx/lifecycle/s;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->l2()Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->i2()Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;->a()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->e(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lhp/e0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->k0()Landroidx/lifecycle/s;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v3

    new-instance v6, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b;

    const/4 p2, 0x0

    invoke-direct {v6, p1, p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b;-><init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Lnt/b;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->k0()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v3

    new-instance v6, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c;

    invoke-direct {v6, p1, p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c;-><init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;Lnt/b;)V

    invoke-static/range {v3 .. v8}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final i2()Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->p0:Lkq/c;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;

    return-object v0
.end method

.method public final j2()Lzo/s;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->h0:Lzo/s;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "inquiryComponent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k2()Lhp/n0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->m0:Lhp/n0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "inquiryStateRenderer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l2()Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->n0:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;

    return-object v0
.end method

.method public final m2()Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->i0:Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "viewModelFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n2()Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->o0:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    return-object v0
.end method

.method public final o2()Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->j0:Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "workflowStateViewModelFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p2()Lcom/withpersona/sdk2/inquiry/internal/i;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->K()Landroidx/fragment/app/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryFragment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/i;

    return-object v0
.end method
