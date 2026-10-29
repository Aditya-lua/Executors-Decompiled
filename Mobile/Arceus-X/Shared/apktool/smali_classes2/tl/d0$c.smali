.class public final Ltl/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltl/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltl/d0;->M(Lorg/json/JSONObject;Lmm/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "tl/d0$c",
        "Ltl/j;",
        "",
        "queryInfo",
        "",
        "onSuccess",
        "(Ljava/lang/String;)V",
        "Lul/a;",
        "error",
        "a",
        "(Lul/a;)V",
        "universalapp_googleProdRelease"
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
.field public final synthetic a:Ltl/d0;

.field public final synthetic b:Lkotlin/jvm/internal/y;

.field public final synthetic c:Lmm/m;


# direct methods
.method public constructor <init>(Ltl/d0;Lkotlin/jvm/internal/y;Lmm/m;)V
    .locals 0

    iput-object p1, p0, Ltl/d0$c;->a:Ltl/d0;

    iput-object p2, p0, Ltl/d0$c;->b:Lkotlin/jvm/internal/y;

    iput-object p3, p0, Ltl/d0$c;->c:Lmm/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltl/d0$c;->d(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltl/d0$c;->e(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)Lkotlin/Unit;
    .locals 2

    const-string v0, "RewardedAdsProtocol"

    const-string v1, "Error getting query info"

    invoke-static {v0, v1, p0}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->N3()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p1, Lkotlin/jvm/internal/y;->a:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lul/a;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "UNKNOWN"

    :cond_0
    const-string p1, "terminal"

    invoke-static {p2, p1, p0}, Ltl/d0;->B(Ltl/d0;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 p0, 0x0

    invoke-static {p2, p0}, Ltl/d0;->z(Ltl/d0;Ljava/lang/String;)Lmm/l;

    move-result-object p0

    invoke-interface {p3, p0}, Lmm/m;->a(Lmm/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->N3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lkotlin/jvm/internal/y;->a:Z

    if-eqz p0, :cond_0

    const-string p0, "terminal"

    const-string v0, "success"

    invoke-static {p1, p0, v0}, Ltl/d0;->B(Ltl/d0;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {p1, p3}, Ltl/d0;->z(Ltl/d0;Ljava/lang/String;)Lmm/l;

    move-result-object p0

    invoke-interface {p2, p0}, Lmm/m;->a(Lmm/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a(Lul/a;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltl/d0$c;->a:Ltl/d0;

    iget-object v1, p0, Ltl/d0$c;->b:Lkotlin/jvm/internal/y;

    iget-object v2, p0, Ltl/d0$c;->c:Lmm/m;

    new-instance v3, Ltl/f0;

    invoke-direct {v3, p1, v1, v0, v2}, Ltl/f0;-><init>(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)V

    invoke-static {v0, v3}, Ltl/d0;->y(Ltl/d0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ltl/d0$c;->a:Ltl/d0;

    iget-object v1, p0, Ltl/d0$c;->b:Lkotlin/jvm/internal/y;

    iget-object v2, p0, Ltl/d0$c;->c:Lmm/m;

    new-instance v3, Ltl/e0;

    invoke-direct {v3, v1, v0, v2, p1}, Ltl/e0;-><init>(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)V

    invoke-static {v0, v3}, Ltl/d0;->y(Ltl/d0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
