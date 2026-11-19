.class public final Lcom/withpersona/sdk2/inquiry/internal/i;
.super Lf4/q;
.source "SourceFile"

# interfaces
.implements Lkp/b;
.implements Lyq/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\u00082\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J!\u0010%\u001a\u00020\u00082\u0006\u0010$\u001a\u00020!2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0005J\u000f\u0010)\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008)\u0010\u0005J\u000f\u0010*\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008*\u0010\u0005J\u000f\u0010+\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008,\u0010\u0005J\u0017\u0010.\u001a\u00020\u00082\u0006\u0010-\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008.\u0010\u0018J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0000\u00a2\u0006\u0004\u00080\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u00082\u00103J\u0017\u00106\u001a\u00020\u00082\u0006\u00105\u001a\u000204H\u0000\u00a2\u0006\u0004\u00086\u00107J\r\u00109\u001a\u000208\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010=\u001a\u00020\u00082\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010A\u001a\u0004\u0008G\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010SR\u0014\u0010U\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010\u000c\u00a8\u0006V"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/i;",
        "Lf4/q;",
        "Lkp/b;",
        "Lyq/d;",
        "<init>",
        "()V",
        "",
        "resetState",
        "",
        "h2",
        "(Z)V",
        "r2",
        "()Z",
        "Landroid/content/Context;",
        "context",
        "i2",
        "(Landroid/content/Context;)V",
        "",
        "redirectUri",
        "p2",
        "(Ljava/lang/String;)V",
        "Landroid/os/Bundle;",
        "resultBundle",
        "q2",
        "(Landroid/os/Bundle;)V",
        "g2",
        "C0",
        "savedInstanceState",
        "F0",
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
        "c1",
        "a1",
        "V0",
        "d1",
        "K0",
        "N0",
        "outState",
        "b1",
        "Lkp/a;",
        "k2",
        "()Lkp/a;",
        "v",
        "()Landroid/content/Context;",
        "Lcom/withpersona/sdk2/inquiry/internal/l$a;",
        "cancelOutput",
        "n2",
        "(Lcom/withpersona/sdk2/inquiry/internal/l$a;)V",
        "Lyp/a$a;",
        "m2",
        "()Lyp/a$a;",
        "Lcom/withpersona/sdk2/inquiry/internal/l;",
        "output",
        "o2",
        "(Lcom/withpersona/sdk2/inquiry/internal/l;)V",
        "Lcom/withpersona/sdk2/inquiry/internal/h;",
        "f0",
        "Lzt/h;",
        "j2",
        "()Lcom/withpersona/sdk2/inquiry/internal/h;",
        "args",
        "Lnp/z;",
        "g0",
        "l2",
        "()Lnp/z;",
        "viewModel",
        "Lpp/f;",
        "h0",
        "Lpp/f;",
        "binding",
        "i0",
        "Landroid/content/Context;",
        "themedContext",
        "",
        "getTheme",
        "()Ljava/lang/Integer;",
        "theme",
        "isInline",
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


# instance fields
.field public final f0:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g0:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h0:Lpp/f;

.field public i0:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lf4/q;-><init>()V

    new-instance v0, Lnp/w;

    invoke-direct {v0, p0}, Lnp/w;-><init>(Lcom/withpersona/sdk2/inquiry/internal/i;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->f0:Lzt/h;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/i$c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/i$c;-><init>(Lf4/q;)V

    sget-object v1, Lzt/k;->c:Lzt/k;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/i$d;

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/internal/i$d;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v1, v2}, Lzt/i;->b(Lzt/k;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    const-class v1, Lnp/z;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/i$e;

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/internal/i$e;-><init>(Lzt/h;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/i$f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Lcom/withpersona/sdk2/inquiry/internal/i$f;-><init>(Lkotlin/jvm/functions/Function0;Lzt/h;)V

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/i$g;

    invoke-direct {v4, p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i$g;-><init>(Lf4/q;Lzt/h;)V

    invoke-static {p0, v1, v2, v3, v4}, Lf4/y0;->b(Lf4/q;Lxu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->g0:Lzt/h;

    return-void
.end method

.method public static synthetic b2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->f2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c2(Lcom/withpersona/sdk2/inquiry/internal/i;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->h2(Z)V

    return-void
.end method

.method public static final synthetic d2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 0

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lnp/z;
    .locals 0

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p0

    return-object p0
.end method

.method public static final f2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/h;

    invoke-virtual {p0}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/h;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private final j2()Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->f0:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/h;

    return-object v0
.end method

.method private final l2()Lnp/z;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->g0:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnp/z;

    return-object v0
.end method

.method private final r2()Z
    .locals 5

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->Z(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "PERSONA_ACTIVITY_RESULT"

    const-string v2, "INQUIRY_ERROR"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ERROR_DEBUG_MESSAGE_KEY"

    const-string v2, "Invalid session token."

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ERROR_CODE_KEY"

    sget-object v2, Lds/d;->f:Lds/d;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->q2(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lf4/q;->L()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->a1()V

    return v4

    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf4/q;->C0(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->isInline()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo/d;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->getTheme()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lo/d;-><init>(Landroid/content/Context;I)V

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->i0:Landroid/content/Context;

    return-void
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->i0:Landroid/content/Context;

    if-nez v1, :cond_0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/i;->i2(Landroid/content/Context;)V

    invoke-super {p0, p1}, Lf4/q;->F0(Landroid/os/Bundle;)V

    invoke-static {v0}, Lqp/c;->a(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/h;->e()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/h;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p1

    invoke-virtual {p1}, Lnp/z;->y()Ler/c;

    move-result-object p1

    invoke-virtual {p1}, Ler/c;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lqp/c;->d(Landroid/content/Context;Ljava/util/List;)V

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

    invoke-super {p0, p1, p2, p3}, Lf4/q;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lpp/f;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpp/f;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->h0:Lpp/f;

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lpp/f;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public K0()V
    .locals 2

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lqp/c;->e(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->k2()Lkp/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkp/a;->a()V

    :cond_0
    invoke-super {p0}, Lf4/q;->K0()V

    return-void
.end method

.method public N0()V
    .locals 1

    invoke-super {p0}, Lf4/q;->N0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->i0:Landroid/content/Context;

    return-void
.end method

.method public V0()V
    .locals 1

    invoke-super {p0}, Lf4/q;->V0()V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->C()V

    return-void
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Lf4/q;->a1()V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->F()V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->D()V

    return-void
.end method

.method public b1(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf4/q;->b1(Landroid/os/Bundle;)V

    sget-object v0, Lzr/a;->a:Lzr/a$a;

    invoke-virtual {v0}, Lzr/a$a;->a()Lzr/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lzr/a;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public c1()V
    .locals 2

    invoke-super {p0}, Lf4/q;->c1()V

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Llo/c;->d(Landroid/content/Context;)V

    return-void
.end method

.method public d1()V
    .locals 2

    invoke-super {p0}, Lf4/q;->d1()V

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Llo/c;->f(Landroid/content/Context;)V

    return-void
.end method

.method public e1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6
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

    invoke-super {p0, p1, p2}, Lf4/q;->e1(Landroid/view/View;Landroid/os/Bundle;)V

    :try_start_0
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->r2()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lzr/a;->a:Lzr/a$a;

    invoke-virtual {p1}, Lzr/a$a;->a()Lzr/a;

    move-result-object p1

    invoke-interface {p1, p2}, Lzr/a;->b(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p1

    invoke-virtual {p1, p0}, Lnp/z;->B(Lg/c;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p1

    invoke-virtual {p1}, Lnp/z;->n()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/h;->m()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p1

    invoke-virtual {p1}, Lnp/z;->A()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf4/q;->k0()Landroidx/lifecycle/s;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v0

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/i$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/i$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/i;Leu/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->h2(Z)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->k2()Lkp/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lkp/a;->b(Lkp/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :goto_1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/h;->b()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/h;->e()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object p2

    const-string v0, "requireContext(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lqp/c;->c(Landroid/content/Context;)Lqp/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqp/b;->c(Ljava/lang/Throwable;)V

    :cond_2
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "PERSONA_ACTIVITY_RESULT"

    const-string v0, "INQUIRY_ERROR"

    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "ERROR_DEBUG_MESSAGE_KEY"

    const-string v0, "A fatal exception occurred."

    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "ERROR_CODE_KEY"

    sget-object v0, Lds/d;->l:Lds/d;

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->q2(Landroid/os/Bundle;)V

    return-void

    :cond_3
    throw p1
.end method

.method public final g2()V
    .locals 2

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->f()Lnp/s;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lnp/s;->j()Lcom/withpersona/sdk2/inquiry/internal/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/t;->b()V

    invoke-interface {v0}, Lnp/s;->g()Lpq/a;

    move-result-object v0

    invoke-virtual {v0}, Lpq/a;->f()V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->y()Ler/c;

    move-result-object v0

    invoke-virtual {v0}, Ler/c;->a()V

    return-void
.end method

.method public getTheme()Ljava/lang/Integer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->isInline()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Ljq/h;->c:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final h2(Z)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/i;->i0:Landroid/content/Context;

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v2

    invoke-virtual {v2}, Lnp/z;->n()Landroidx/lifecycle/d0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->o()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->s()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v2

    invoke-virtual {v2}, Lnp/z;->A()Landroidx/lifecycle/d0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->f()Lnp/h;

    move-result-object v7

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->g()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->x()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->j()Ljava/util/List;

    move-result-object v11

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/m$a;

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/withpersona/sdk2/inquiry/internal/m$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_1
    if-eqz v6, :cond_2

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/m$b;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->f()Lnp/h;

    move-result-object v7

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->x()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->j()Ljava/util/List;

    move-result-object v11

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/withpersona/sdk2/inquiry/internal/m$b;-><init>(Ljava/lang/String;Lnp/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v5

    goto/16 :goto_2

    :cond_2
    if-eqz v8, :cond_3

    new-instance v7, Lcom/withpersona/sdk2/inquiry/internal/m$c;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->f()Lnp/h;

    move-result-object v9

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v10

    const/16 v14, 0x38

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lcom/withpersona/sdk2/inquiry/internal/m$c;-><init>(Ljava/lang/String;Lnp/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v7

    goto/16 :goto_2

    :cond_3
    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->A()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->B()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->r()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->k()Lnp/v;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lnp/v;->a()Ljava/util/Map;

    move-result-object v2

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->f()Lnp/h;

    move-result-object v12

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->g()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v13

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->D()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->y()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    move-result-object v11

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->q()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->x()Ljava/lang/String;

    move-result-object v16

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->j()Ljava/util/List;

    move-result-object v17

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/m$d;

    const/16 v18, 0x400

    const/16 v19, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v19}, Lcom/withpersona/sdk2/inquiry/internal/m$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lnp/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    const-string v2, "getChildFragmentManager(...)"

    if-eqz p1, :cond_5

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/i;->i2(Landroid/content/Context;)V

    invoke-virtual {v0}, Lf4/q;->u()Lf4/k0;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lf4/k0;->r()Lf4/t0;

    move-result-object v1

    sget v2, Lnp/g0;->d:I

    sget-object v4, Lyp/d;->q0:Lyp/d$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/internal/h;->m()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6, v3}, Lyp/d$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m;)Lyp/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lf4/t0;->n(ILf4/q;)Lf4/t0;

    invoke-virtual {v1}, Lf4/t0;->g()I

    return-void

    :cond_5
    invoke-virtual {v0}, Lf4/q;->u()Lf4/k0;

    move-result-object v1

    sget v4, Lnp/g0;->d:I

    invoke-virtual {v1, v4}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lf4/q;->u()Lf4/k0;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lf4/k0;->r()Lf4/t0;

    move-result-object v1

    sget v2, Lnp/g0;->d:I

    sget-object v4, Lyp/d;->q0:Lyp/d$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/internal/h;->m()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6, v3}, Lyp/d$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m;)Lyp/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lf4/t0;->n(ILf4/q;)Lf4/t0;

    invoke-virtual {v1}, Lf4/t0;->g()I

    :cond_6
    :goto_3
    return-void
.end method

.method public final i2(Landroid/content/Context;)V
    .locals 17

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->f()Lnp/s;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPackageName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "com.withpersona"

    const/4 v4, 0x0

    invoke-static {v0, v3, v1, v2, v4}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/h;->v()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, "https://withpersona.com"

    :goto_0
    if-eqz v0, :cond_2

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/h;->G()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const-string v2, "https://webrtc-consumer.withpersona.com"

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/h;->i()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    const-string v3, "https://inquiry-fallback.withpersona.com"

    :goto_2
    if-eqz v0, :cond_4

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->E()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    const-string v0, "https://tg.withpersona.com"

    :goto_3
    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/internal/h;->u()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v5

    invoke-virtual {v5}, Lnp/z;->i()Lar/e;

    move-result-object v5

    goto :goto_4

    :cond_5
    new-instance v5, Lar/d;

    invoke-direct {v5}, Lar/d;-><init>()V

    :goto_4
    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v6

    invoke-virtual {v6}, Lnp/z;->m()Ldv/p0;

    move-result-object v6

    invoke-interface {v6}, Ldv/p0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/internal/h;->y()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    move-result-object v6

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/internal/h;->h()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v6

    goto :goto_6

    :cond_7
    :goto_5
    sget-object v6, Lcom/withpersona/sdk2/inquiry/FallbackMode;->ALWAYS:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    :goto_6
    sget-object v7, Lcom/withpersona/sdk2/inquiry/FallbackMode;->ALWAYS:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    if-ne v6, v7, :cond_8

    new-instance v7, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$a;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$a;

    invoke-direct {v7, v8}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V

    goto :goto_8

    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/internal/h;->y()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    move-result-object v7

    instance-of v8, v7, Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;

    if-eqz v8, :cond_9

    check-cast v7, Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;

    goto :goto_7

    :cond_9
    move-object v7, v4

    :goto_7
    if-eqz v7, :cond_a

    new-instance v8, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$b;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;->getResourceId()I

    move-result v7

    invoke-direct {v9, v7}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$b;-><init>(I)V

    invoke-direct {v8, v9}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V

    move-object v7, v8

    goto :goto_8

    :cond_a
    new-instance v7, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$a;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$a;

    invoke-direct {v7, v8}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V

    :goto_8
    new-instance v8, Lcom/withpersona/sdk2/inquiry/internal/i$a;

    move-object/from16 v9, p0

    invoke-direct {v8, v9}, Lcom/withpersona/sdk2/inquiry/internal/i$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/i;)V

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/internal/e;->a()Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Lnp/n;

    invoke-virtual {v9}, Lf4/q;->H1()Lf4/v;

    move-result-object v12

    const-string v13, "requireActivity(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v13

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/internal/h;->n()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v14

    invoke-static {v14}, Landroidx/lifecycle/y0;->a(Landroidx/lifecycle/x0;)Lav/p0;

    move-result-object v14

    invoke-direct {v11, v12, v13, v14}, Lnp/n;-><init>(Landroid/app/Activity;Ljava/lang/String;Lav/p0;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j(Lnp/n;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Laq/i;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->t()Laq/h0;

    move-result-object v12

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v13

    invoke-virtual {v13}, Lnp/z;->k()Laq/h0;

    move-result-object v13

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v14

    invoke-virtual {v14}, Lnp/z;->z()Laq/h0;

    move-result-object v14

    invoke-direct {v11, v12, v13, v14}, Laq/i;-><init>(Lg/d;Lg/d;Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e(Laq/i;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Laq/q;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->j()Laq/h0;

    move-result-object v12

    invoke-direct {v11, v12}, Laq/q;-><init>(Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f(Laq/q;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Laq/w;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->u()Laq/h0;

    move-result-object v12

    invoke-direct {v11, v12}, Laq/w;-><init>(Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o(Laq/w;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Leq/h;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->s()Laq/h0;

    move-result-object v12

    invoke-direct {v11, v12}, Leq/h;-><init>(Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n(Leq/h;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Lzp/e;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->p()Laq/h0;

    move-result-object v12

    invoke-direct {v11, v12}, Lzp/e;-><init>(Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l(Lzp/e;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Laq/d;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v12

    invoke-virtual {v12}, Lnp/z;->h()Laq/h0;

    move-result-object v12

    invoke-direct {v11, v12}, Laq/d;-><init>(Lg/d;)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c(Laq/d;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v10

    new-instance v11, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/internal/h;->F()Z

    move-result v12

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v13

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/internal/h;->g()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v14

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/internal/h;->n()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v15

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/internal/h;->z()Lcom/withpersona/sdk2/inquiry/StyleVariant;

    move-result-object v15

    if-eqz v15, :cond_b

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/StyleVariant;->getValue()Ljava/lang/String;

    move-result-object v4

    :cond_b
    move-object v15, v4

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/internal/h;->p()Z

    move-result v16

    invoke-direct/range {v11 .. v16}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v4

    new-instance v10, Lar/b;

    invoke-direct {v10, v5}, Lar/b;-><init>(Lar/a;)V

    invoke-virtual {v4, v10}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d(Lar/b;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v4

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/internal/h;->p()Z

    move-result v10

    invoke-direct {v5, v1, v2, v3, v10}, Lcom/withpersona/sdk2/inquiry/internal/network/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v4, v5}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Ldr/f;

    invoke-direct {v2, v8}, Ldr/f;-><init>(Ldr/e;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g(Ldr/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Lxq/c0;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/h;->c()Z

    move-result v3

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/internal/h;->d()Z

    move-result v4

    invoke-direct {v2, v3, v4}, Lxq/c0;-><init>(ZZ)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q(Lxq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Laq/c0;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v3

    invoke-virtual {v3}, Lnp/z;->v()Laq/h0;

    move-result-object v3

    invoke-direct {v2, v3}, Laq/c0;-><init>(Lg/d;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p(Laq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Lrp/c;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/h;->f()Lnp/h;

    move-result-object v3

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v4

    invoke-virtual {v4}, Lnp/z;->w()Landroidx/lifecycle/l0;

    move-result-object v4

    invoke-direct {v2, v6, v3, v4}, Lrp/c;-><init>(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lnp/h;Landroidx/lifecycle/l0;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h(Lrp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Ler/a;

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v3

    invoke-virtual {v3}, Lnp/z;->y()Ler/c;

    move-result-object v3

    invoke-direct {v2, v3}, Ler/a;-><init>(Ler/c;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i(Ler/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b()Lnp/s;

    move-result-object v0

    invoke-direct {v9}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnp/z;->H(Lnp/s;)V

    sget-object v1, Lzr/a;->a:Lzr/a$a;

    invoke-interface {v0}, Lnp/s;->h()Lzr/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lzr/a$a;->b(Lzr/a;)V

    sget-object v1, Leq/d;->a:Leq/d;

    invoke-interface {v0}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    invoke-virtual {v1, v0}, Leq/d;->a(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-void
.end method

.method public isInline()Z
    .locals 2

    invoke-virtual {p0}, Lf4/q;->H1()Lf4/v;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k2()Lkp/a;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lf4/q;->J()Lf4/q;

    move-result-object v0

    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object v1

    instance-of v2, v0, Lkp/a;

    if-eqz v2, :cond_0

    check-cast v0, Lkp/a;

    return-object v0

    :cond_0
    instance-of v0, v1, Lkp/a;

    if-eqz v0, :cond_1

    check-cast v1, Lkp/a;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m2()Lyp/a$a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->f()Lnp/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lnp/s;->f()Lyp/a$a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n2(Lcom/withpersona/sdk2/inquiry/internal/l$a;)V
    .locals 12
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/l$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cancelOutput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v2

    invoke-virtual {v2}, Lnp/z;->o()J

    move-result-wide v2

    sub-long v6, v0, v2

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->f()Lnp/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v4

    if-eqz v4, :cond_0

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;->Cancel:Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logInquiryEndEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;ZILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->o()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v1

    invoke-virtual {v1}, Lnp/z;->f()Lnp/s;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lnp/s;->d()Lnp/i;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lnp/i;->i(Ljava/lang/String;)Lav/d2;

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->p2(Ljava/lang/String;)V

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "PERSONA_ACTIVITY_RESULT"

    const-string v2, "INQUIRY_CANCELED"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxq/j;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "INQUIRY_ID_KEY"

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->A()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/h;->b:Lcom/withpersona/sdk2/inquiry/internal/h$a;

    invoke-virtual {v1, p1}, Lcom/withpersona/sdk2/inquiry/internal/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    const-string v1, "SESSION_TOKEN_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->q2(Landroid/os/Bundle;)V

    return-void
.end method

.method public final o2(Lcom/withpersona/sdk2/inquiry/internal/l;)V
    .locals 13
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->f()Lnp/s;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v3

    invoke-virtual {v3}, Lnp/z;->o()J

    move-result-wide v3

    sub-long v7, v1, v3

    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$b;

    if-nez v1, :cond_4

    instance-of v2, p1, Lcom/withpersona/sdk2/inquiry/internal/l$d;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$c;

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v5

    sget-object v6, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;->Error:Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/l$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/l$c;->f()Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logInquiryEndEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;ZILjava/lang/Object;)V

    goto :goto_3

    :cond_2
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$a;

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;

    :goto_1
    move-object v6, v1

    goto :goto_2

    :cond_5
    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;->Fallback:Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;

    goto :goto_1

    :goto_2
    invoke-interface {v0}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v5

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logInquiryEndEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;ZILjava/lang/Object;)V

    :goto_3
    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/internal/l;->A()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Lnp/s;->d()Lnp/i;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnp/i;->h(Ljava/lang/String;)Lav/d2;

    :cond_6
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$b;

    const-string v2, "PERSONA_ACTIVITY_RESULT"

    if-eqz v1, :cond_8

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/l$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->p2(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "INQUIRY_COMPLETE"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "INQUIRY_ID_KEY"

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "INQUIRY_STATUS_KEY"

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lnp/v;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$b;->a()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lnp/v;-><init>(Ljava/util/Map;)V

    const-string v2, "FIELDS_MAP_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v1

    invoke-virtual {v1}, Lnp/z;->i()Lar/e;

    move-result-object v1

    invoke-virtual {v1}, Lar/e;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lnp/a;->d(Ljava/util/List;)Lds/a;

    move-result-object v1

    const-string v2, "COLLECTED_DATA"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$b;->A()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/h;->b:Lcom/withpersona/sdk2/inquiry/internal/h$a;

    invoke-virtual {v1, p1}, Lcom/withpersona/sdk2/inquiry/internal/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_7
    const/4 p1, 0x0

    :goto_4
    const-string v1, "SESSION_TOKEN_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->q2(Landroid/os/Bundle;)V

    return-void

    :cond_8
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$d;

    if-eqz v1, :cond_9

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->n()Landroidx/lifecycle/d0;

    move-result-object v0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/l$d;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->A()Landroidx/lifecycle/d0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$d;->A()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->l2()Lnp/z;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lnp/z;->I(Z)V

    return-void

    :cond_9
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$a;

    if-eqz v1, :cond_b

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/l$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$a;->i()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->n2(Lcom/withpersona/sdk2/inquiry/internal/l$a;)V

    return-void

    :cond_a
    sget-object v0, Lop/e;->x0:Lop/e$a;

    invoke-virtual {p0}, Lf4/q;->u()Lf4/k0;

    move-result-object v1

    const-string v2, "getChildFragmentManager(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->getTheme()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2, p1}, Lop/e$a;->a(Lf4/k0;ILcom/withpersona/sdk2/inquiry/internal/l$a;)V

    return-void

    :cond_b
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/internal/l$c;

    if-eqz v1, :cond_d

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/l$c;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$c;->A()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Lnp/s;->d()Lnp/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$c;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lnp/i;->e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lav/d2;

    :cond_c
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "INQUIRY_ERROR"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ERROR_DEBUG_MESSAGE_KEY"

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ERROR_CODE_KEY"

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/l$c;->g()Lds/d;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/i;->q2(Landroid/os/Bundle;)V

    return-void

    :cond_d
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1
.end method

.method public final p2(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->v()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_0
    :goto_0
    return-void
.end method

.method public final q2(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->g2()V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/i;->j2()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lf4/b0;->a(Lf4/q;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public v()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i;->i0:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-super {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v0

    :cond_0
    return-object v0
.end method
