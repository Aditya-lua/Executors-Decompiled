.class public final Lxo/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo/u;-><init>(Landroid/content/Context;Lxo/w;Lsn/i;Lsn/h0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
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
        "xo/u$a",
        "Landroidx/lifecycle/f;",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onResume",
        "(Landroidx/lifecycle/s;)V",
        "government-id_release"
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
.field public final synthetic a:Lxo/u;


# direct methods
.method public constructor <init>(Lxo/u;)V
    .locals 0

    iput-object p1, p0, Lxo/u$a;->a:Lxo/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxo/u;)V
    .locals 0

    invoke-static {p0}, Lxo/u$a;->b(Lxo/u;)V

    return-void
.end method

.method public static final b(Lxo/u;)V
    .locals 1

    invoke-static {p0}, Lxo/u;->j(Lxo/u;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    invoke-static {p0}, Lxo/u;->n(Lxo/u;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onCreate(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onDestroy(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onPause(Landroidx/lifecycle/s;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onResume(Landroidx/lifecycle/s;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxo/u$a;->a:Lxo/u;

    invoke-static {p1}, Lxo/u;->m(Lxo/u;)Lxo/w;

    move-result-object p1

    invoke-interface {p1}, Lxo/w;->getRoot()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lxo/u$a;->a:Lxo/u;

    new-instance v1, Lxo/t;

    invoke-direct {v1, v0}, Lxo/t;-><init>(Lxo/u;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onStart(Landroidx/lifecycle/s;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/s;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method
