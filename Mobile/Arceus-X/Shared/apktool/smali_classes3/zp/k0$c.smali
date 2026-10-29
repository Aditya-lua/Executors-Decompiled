.class public final Lzp/k0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp/k0;->E(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Lfn/g;
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
        "zp/k0$c",
        "Landroidx/lifecycle/f;",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onResume",
        "(Landroidx/lifecycle/s;)V",
        "selfie_release"
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
.field public final synthetic a:Lzp/k0;

.field public final synthetic b:Lfn/g;


# direct methods
.method public constructor <init>(Lzp/k0;Lfn/g;)V
    .locals 0

    iput-object p1, p0, Lzp/k0$c;->a:Lzp/k0;

    iput-object p2, p0, Lzp/k0$c;->b:Lfn/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lzp/k0;Lfn/g;)V
    .locals 0

    invoke-static {p0, p1}, Lzp/k0$c;->b(Lzp/k0;Lfn/g;)V

    return-void
.end method

.method public static final b(Lzp/k0;Lfn/g;)V
    .locals 1

    invoke-static {p0}, Lzp/k0;->t(Lzp/k0;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    invoke-static {p0, p1}, Lzp/k0;->x(Lzp/k0;Lfn/g;)V

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
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lzp/k0$c;->a:Lzp/k0;

    invoke-static {p1}, Lzp/k0;->w(Lzp/k0;)Lzp/r0;

    move-result-object p1

    invoke-interface {p1}, Lzp/r0;->getRoot()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lzp/k0$c;->a:Lzp/k0;

    iget-object v1, p0, Lzp/k0$c;->b:Lfn/g;

    new-instance v2, Lzp/m0;

    invoke-direct {v2, v0, v1}, Lzp/m0;-><init>(Lzp/k0;Lfn/g;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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
