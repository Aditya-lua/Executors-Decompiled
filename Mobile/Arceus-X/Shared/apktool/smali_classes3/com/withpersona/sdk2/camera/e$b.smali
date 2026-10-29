.class public final Lcom/withpersona/sdk2/camera/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/camera/e;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Landroidx/camera/view/PreviewView$e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/withpersona/sdk2/camera/e$b",
        "Landroidx/lifecycle/e0;",
        "Landroidx/camera/view/PreviewView$e;",
        "value",
        "",
        "b",
        "(Landroidx/camera/view/PreviewView$e;)V",
        "camera_release"
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
.field public final synthetic a:Lcom/withpersona/sdk2/camera/e;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/camera/e;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/e$b;->a:Lcom/withpersona/sdk2/camera/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/camera/e$b;->b(Landroidx/camera/view/PreviewView$e;)V

    return-void
.end method

.method public b(Landroidx/camera/view/PreviewView$e;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/camera/view/PreviewView$e;->b:Landroidx/camera/view/PreviewView$e;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/e$b;->a:Lcom/withpersona/sdk2/camera/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/camera/e;->m(Lcom/withpersona/sdk2/camera/e;)Lnu/c0;

    move-result-object p1

    new-instance v0, Lcom/withpersona/sdk2/camera/d$e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/camera/d$e;-><init>(Z)V

    invoke-interface {p1, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/e$b;->a:Lcom/withpersona/sdk2/camera/e;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/e;->n()Landroidx/camera/view/PreviewView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()Landroidx/lifecycle/a0;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/a0;->n(Landroidx/lifecycle/e0;)V

    :cond_0
    return-void
.end method
