.class public final Ltg/g$o;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g;->setAdString(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Ljava/lang/String;

.field public final synthetic B:Ljava/lang/String;

.field public final synthetic C:Z

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ltg/g;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ltg/g;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltg/g;",
            "IJ",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ltg/g$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/g$o;->u:Ljava/lang/String;

    iput-object p2, p0, Ltg/g$o;->v:Ltg/g;

    iput p3, p0, Ltg/g$o;->w:I

    iput-wide p4, p0, Ltg/g$o;->x:J

    iput-object p6, p0, Ltg/g$o;->y:Ljava/lang/String;

    iput-boolean p7, p0, Ltg/g$o;->z:Z

    iput-object p8, p0, Ltg/g$o;->A:Ljava/lang/String;

    iput-object p9, p0, Ltg/g$o;->B:Ljava/lang/String;

    iput-boolean p10, p0, Ltg/g$o;->C:Z

    iput-object p11, p0, Ltg/g$o;->D:Ljava/lang/String;

    iput-object p12, p0, Ltg/g$o;->E:Ljava/lang/String;

    iput-object p13, p0, Ltg/g$o;->F:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p14}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Ltg/g$o;

    iget-object v2, v0, Ltg/g$o;->u:Ljava/lang/String;

    iget-object v3, v0, Ltg/g$o;->v:Ltg/g;

    iget v4, v0, Ltg/g$o;->w:I

    iget-wide v5, v0, Ltg/g$o;->x:J

    iget-object v7, v0, Ltg/g$o;->y:Ljava/lang/String;

    iget-boolean v8, v0, Ltg/g$o;->z:Z

    iget-object v9, v0, Ltg/g$o;->A:Ljava/lang/String;

    iget-object v10, v0, Ltg/g$o;->B:Ljava/lang/String;

    iget-boolean v11, v0, Ltg/g$o;->C:Z

    iget-object v12, v0, Ltg/g$o;->D:Ljava/lang/String;

    iget-object v13, v0, Ltg/g$o;->E:Ljava/lang/String;

    iget-object v14, v0, Ltg/g$o;->F:Ljava/lang/String;

    move-object/from16 v15, p1

    invoke-direct/range {v1 .. v15}, Ltg/g$o;-><init>(Ljava/lang/String;Ltg/g;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$o;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Ltg/g$o;->t:I

    if-nez v0, :cond_3

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ltg/g$o;->u:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Ltg/g$o;->v:Ltg/g;

    invoke-static {p1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget v1, p0, Ltg/g$o;->w:I

    const-string v2, "adTracingId is empty"

    invoke-virtual {p1, v1, v0, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onSetAdStringCompleted(IZLjava/lang/String;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iget-wide v1, p0, Ltg/g$o;->x:J

    iget-object v3, p0, Ltg/g$o;->y:Ljava/lang/String;

    iget-boolean v4, p0, Ltg/g$o;->z:Z

    iget-object v5, p0, Ltg/g$o;->A:Ljava/lang/String;

    iget-object v6, p0, Ltg/g$o;->B:Ljava/lang/String;

    iget-boolean v7, p0, Ltg/g$o;->C:Z

    iget-object v8, p0, Ltg/g$o;->D:Ljava/lang/String;

    iget-object v9, p0, Ltg/g$o;->E:Ljava/lang/String;

    iget-object v10, p0, Ltg/g$o;->F:Ljava/lang/String;

    const-string v11, "durationNeededForRewardMs"

    invoke-virtual {p1, v11, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "durationNeededEnum"

    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "isEUUser"

    invoke-virtual {p1, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "moderationExternalCreativeUrl"

    invoke-virtual {p1, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "gmaAdType"

    invoke-virtual {p1, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "isClickable"

    invoke-virtual {p1, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "uiExperimentData"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "adString"

    invoke-virtual {p1, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "adUnitId"

    invoke-virtual {p1, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Ltg/g$o;->v:Ltg/g;

    invoke-static {v0}, Ltg/g;->d(Ltg/g;)Ltl/c;

    move-result-object v0

    iget-object v1, p0, Ltg/g$o;->u:Ljava/lang/String;

    new-instance v2, Ltg/g$o$a;

    iget-object v3, p0, Ltg/g$o;->v:Ltg/g;

    iget v4, p0, Ltg/g$o;->w:I

    invoke-direct {v2, v3, v4}, Ltg/g$o$a;-><init>(Ltg/g;I)V

    invoke-interface {v0, v1, p1, v2}, Ltl/c;->j(Ljava/lang/String;Lorg/json/JSONObject;Ltl/f;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catch_0
    move-exception p1

    iget-object v1, p0, Ltg/g$o;->v:Ltg/g;

    invoke-static {v1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v2, p0, Ltg/g$o;->w:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setAdString failed to construct JSON - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, v0, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onSetAdStringCompleted(IZLjava/lang/String;)V

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltg/g$o;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$o;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
