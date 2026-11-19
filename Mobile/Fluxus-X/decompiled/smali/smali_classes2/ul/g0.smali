.class public final Lul/g0;
.super Lj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lul/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lul/g0;",
        "Lj/b;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/content/Intent;",
        "intent",
        "onNewIntent",
        "(Landroid/content/Intent;)V",
        "K1",
        "Lul/a;",
        "call",
        "J1",
        "(Lul/a;)V",
        "",
        "E",
        "Ljava/lang/String;",
        "callId",
        "Lav/d2;",
        "F",
        "Lav/d2;",
        "following",
        "Lrh/a;",
        "G",
        "Lrh/a;",
        "binding",
        "H",
        "a",
        "NativeShell_googleProdRelease"
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
.field public static final H:Lul/g0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public E:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public F:Lav/d2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public G:Lrh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lul/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lul/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lul/g0;->H:Lul/g0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/b;-><init>()V

    return-void
.end method

.method public static synthetic E1(Lul/g0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lul/g0;->H1(Lul/g0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F1(Lul/g0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lul/g0;->I1(Lul/g0;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic G1(Lul/g0;Lul/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lul/g0;->J1(Lul/a;)V

    return-void
.end method

.method public static final H1(Lul/g0;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lul/g0;->E:Ljava/lang/String;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->answerCall$NativeShell_googleProdRelease(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static final I1(Lul/g0;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lul/g0;->E:Ljava/lang/String;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->declineCall$NativeShell_googleProdRelease(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final J1(Lul/a;)V
    .locals 4

    iget-object v0, p0, Lul/g0;->G:Lrh/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lrh/a;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lul/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Lul/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lul/g0;->G:Lrh/a;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Lrh/a;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lul/a;->e()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final K1(Landroid/content/Intent;)V
    .locals 9

    const-string v0, "com.roblox.protocols.calling.CALL_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lul/g0;->E:Ljava/lang/String;

    iget-object v0, p0, Lul/g0;->F:Lav/d2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lav/d2$a;->a(Lav/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v3

    new-instance v6, Lul/g0$b;

    invoke-direct {v6, p1, p0, v1}, Lul/g0$b;-><init>(Ljava/lang/String;Lul/g0;Leu/b;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    move-result-object p1

    iput-object p1, p0, Lul/g0;->F:Lav/d2;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget v0, Lbh/r0;->a:I

    invoke-virtual {p0, v0}, Lj/b;->setTheme(I)V

    invoke-super {p0, p1}, Lf4/v;->onCreate(Landroid/os/Bundle;)V

    sget-object v1, Le/u0;->e:Le/u0$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Le/u0$a;->d(Le/u0$a;IILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le/u0;

    move-result-object p1

    invoke-static/range {v1 .. v6}, Le/u0$a;->d(Le/u0$a;IILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le/u0;

    move-result-object v0

    invoke-static {p0, p1, v0}, Le/x;->b(Le/p;Le/u0;Le/u0;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1b

    const/4 v1, 0x1

    if-lt p1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/app/Activity;->setShowWhenLocked(Z)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->setTurnScreenOn(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/high16 v0, 0x280000

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lrh/a;->c(Landroid/view/LayoutInflater;)Lrh/a;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lul/g0;->G:Lrh/a;

    const/4 v0, 0x0

    const-string v2, "binding"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Lrh/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/b;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lul/g0;->G:Lrh/a;

    if-nez p1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    iget-object p1, p1, Lrh/a;->d:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClipToOutline(Z)V

    iget-object p1, p0, Lul/g0;->G:Lrh/a;

    if-nez p1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v0

    :cond_3
    iget-object p1, p1, Lrh/a;->b:Landroidx/appcompat/widget/AppCompatImageButton;

    new-instance v1, Lul/e0;

    invoke-direct {v1, p0}, Lul/e0;-><init>(Lul/g0;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lul/g0;->G:Lrh/a;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v0, p1

    :goto_1
    iget-object p1, v0, Lrh/a;->c:Landroidx/appcompat/widget/AppCompatImageButton;

    new-instance v0, Lul/f0;

    invoke-direct {v0, p0}, Lul/f0;-><init>(Lul/g0;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "getIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lul/g0;->K1(Landroid/content/Intent;)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Le/p;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Lul/g0;->K1(Landroid/content/Intent;)V

    return-void
.end method
