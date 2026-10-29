.class public final Lcom/squareup/workflow1/ui/modal/ModalContainer$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/workflow1/ui/modal/ModalContainer;->c(Len/f;Lan/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0002\u0000\u0008\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "com/squareup/workflow1/ui/modal/ModalContainer$d",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroid/view/View;",
        "v",
        "",
        "onViewAttachedToWindow",
        "(Landroid/view/View;)V",
        "onViewDetachedFromWindow",
        "com/squareup/workflow1/ui/modal/ModalContainer$d$a",
        "a",
        "Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;",
        "()Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;",
        "dismissOnDestroy",
        "Landroidx/lifecycle/l;",
        "b",
        "Landroidx/lifecycle/l;",
        "getLifecycle",
        "()Landroidx/lifecycle/l;",
        "setLifecycle",
        "(Landroidx/lifecycle/l;)V",
        "lifecycle",
        "wf1-container-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Landroidx/lifecycle/l;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final synthetic c:Lcom/squareup/workflow1/ui/modal/ModalContainer$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "TModalRenderingT;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Lcom/squareup/workflow1/ui/modal/ModalContainer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/workflow1/ui/modal/ModalContainer<",
            "TModalRenderingT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;Lcom/squareup/workflow1/ui/modal/ModalContainer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "TModalRenderingT;>;",
            "Lcom/squareup/workflow1/ui/modal/ModalContainer<",
            "TModalRenderingT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->c:Lcom/squareup/workflow1/ui/modal/ModalContainer$a;

    iput-object p2, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->d:Lcom/squareup/workflow1/ui/modal/ModalContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;

    invoke-direct {p2, p1}, Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;-><init>(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V

    iput-object p2, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->a:Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;

    return-void
.end method


# virtual methods
.method public final a()Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->a:Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;

    return-object v0
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->d:Lcom/squareup/workflow1/ui/modal/ModalContainer;

    invoke-static {p1}, Lcom/squareup/workflow1/ui/modal/ModalContainer;->a(Lcom/squareup/workflow1/ui/modal/ModalContainer;)Lbn/d;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p0}, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->a()Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    iput-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->b:Landroidx/lifecycle/l;

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->b:Landroidx/lifecycle/l;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->a:Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d;->b:Landroidx/lifecycle/l;

    return-void
.end method
