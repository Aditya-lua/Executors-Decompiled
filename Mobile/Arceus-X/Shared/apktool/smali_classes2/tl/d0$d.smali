.class public final Ltl/d0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltl/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltl/d0;->T(Lorg/json/JSONObject;Lmm/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "tl/d0$d",
        "Ltl/f;",
        "",
        "onSuccess",
        "()V",
        "",
        "errorMessage",
        "onFailure",
        "(Ljava/lang/String;)V",
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

.field public final synthetic b:Lmm/m;


# direct methods
.method public constructor <init>(Ltl/d0;Lmm/m;)V
    .locals 0

    iput-object p1, p0, Ltl/d0$d;->a:Ltl/d0;

    iput-object p2, p0, Ltl/d0$d;->b:Lmm/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmm/m;Ltl/d0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Ltl/d0$d;->d(Lmm/m;Ltl/d0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmm/m;Ltl/d0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Ltl/d0$d;->c(Lmm/m;Ltl/d0;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmm/m;Ltl/d0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Ltl/d0;->A(Ltl/d0;ZLjava/lang/String;)Lmm/l;

    move-result-object p1

    invoke-interface {p0, p1}, Lmm/m;->a(Lmm/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lmm/m;Ltl/d0;)Lkotlin/Unit;
    .locals 2

    const/4 v0, 0x1

    const-string v1, ""

    invoke-static {p1, v0, v1}, Ltl/d0;->A(Ltl/d0;ZLjava/lang/String;)Lmm/l;

    move-result-object p1

    invoke-interface {p0, p1}, Lmm/m;->a(Lmm/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 3

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltl/d0$d;->a:Ltl/d0;

    iget-object v1, p0, Ltl/d0$d;->b:Lmm/m;

    new-instance v2, Ltl/g0;

    invoke-direct {v2, v1, v0, p1}, Ltl/g0;-><init>(Lmm/m;Ltl/d0;Ljava/lang/String;)V

    invoke-static {v0, v2}, Ltl/d0;->y(Ltl/d0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onSuccess()V
    .locals 3

    iget-object v0, p0, Ltl/d0$d;->a:Ltl/d0;

    iget-object v1, p0, Ltl/d0$d;->b:Lmm/m;

    new-instance v2, Ltl/h0;

    invoke-direct {v2, v1, v0}, Ltl/h0;-><init>(Lmm/m;Ltl/d0;)V

    invoke-static {v0, v2}, Ltl/d0;->y(Ltl/d0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
