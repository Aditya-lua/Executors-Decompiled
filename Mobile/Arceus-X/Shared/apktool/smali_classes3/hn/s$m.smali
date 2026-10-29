.class public final Lhn/s$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/s;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "hn/s$m",
        "Landroid/view/SurfaceHolder$Callback;",
        "Landroid/view/SurfaceHolder;",
        "holder",
        "",
        "surfaceDestroyed",
        "(Landroid/view/SurfaceHolder;)V",
        "",
        "format",
        "width",
        "height",
        "surfaceChanged",
        "(Landroid/view/SurfaceHolder;III)V",
        "surfaceCreated",
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
.field public final synthetic a:Lhn/s;


# direct methods
.method public constructor <init>(Lhn/s;)V
    .locals 0

    iput-object p1, p0, Lhn/s$m;->a:Lhn/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lhn/s;)V
    .locals 0

    invoke-static {p0}, Lhn/s$m;->b(Lhn/s;)V

    return-void
.end method

.method public static final b(Lhn/s;)V
    .locals 6

    invoke-static {p0}, Lhn/s;->s(Lhn/s;)Lku/p0;

    move-result-object v0

    new-instance v3, Lhn/s$m$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lhn/s$m$a;-><init>(Lhn/s;Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lhn/s;->R(Lhn/s;Z)V

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    invoke-virtual {p1}, Lhn/s;->d0()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    move-result-object p1

    iget-object v0, p0, Lhn/s$m;->a:Lhn/s;

    invoke-virtual {v0}, Lhn/s;->b0()Lhn/h0;

    move-result-object v0

    invoke-virtual {v0}, Lhn/h0;->f()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    iget-object v1, p0, Lhn/s$m;->a:Lhn/s;

    invoke-virtual {v1}, Lhn/s;->b0()Lhn/h0;

    move-result-object v1

    invoke-virtual {v1}, Lhn/h0;->f()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    iget-object v2, p0, Lhn/s$m;->a:Lhn/s;

    invoke-static {v2}, Lhn/s;->z(Lhn/s;)I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b(III)V

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    invoke-virtual {p1}, Lhn/s;->d0()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    move-result-object p1

    iget-object v0, p0, Lhn/s$m;->a:Lhn/s;

    new-instance v1, Lhn/v;

    invoke-direct {v1, v0}, Lhn/v;-><init>(Lhn/s;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 6

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lhn/s;->R(Lhn/s;Z)V

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    invoke-static {p1}, Lhn/s;->s(Lhn/s;)Lku/p0;

    move-result-object v0

    new-instance v3, Lhn/s$m$b;

    iget-object p1, p0, Lhn/s$m;->a:Lhn/s;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lhn/s$m$b;-><init>(Lhn/s;Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method
