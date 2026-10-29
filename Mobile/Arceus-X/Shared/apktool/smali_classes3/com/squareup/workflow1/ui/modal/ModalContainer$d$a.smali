.class public final Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/workflow1/ui/modal/ModalContainer$d;-><init>(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;Lcom/squareup/workflow1/ui/modal/ModalContainer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/squareup/workflow1/ui/modal/ModalContainer$d$a",
        "Landroidx/lifecycle/f;",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onDestroy",
        "(Landroidx/lifecycle/s;)V",
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
.field public final synthetic a:Lcom/squareup/workflow1/ui/modal/ModalContainer$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "TModalRenderingT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/workflow1/ui/modal/ModalContainer$a<",
            "TModalRenderingT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;->a:Lcom/squareup/workflow1/ui/modal/ModalContainer$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;->a:Lcom/squareup/workflow1/ui/modal/ModalContainer$a;

    invoke-virtual {p1}, Lcom/squareup/workflow1/ui/modal/ModalContainer$a;->c()V

    return-void
.end method
