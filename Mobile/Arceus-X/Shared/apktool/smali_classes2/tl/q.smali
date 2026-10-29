.class public final synthetic Ltl/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltl/d0;

.field public final synthetic b:Lorg/json/JSONObject;

.field public final synthetic c:Lmm/m;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;Lorg/json/JSONObject;Lmm/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/q;->a:Ltl/d0;

    iput-object p2, p0, Ltl/q;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Ltl/q;->c:Lmm/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltl/q;->a:Ltl/d0;

    iget-object v1, p0, Ltl/q;->b:Lorg/json/JSONObject;

    iget-object v2, p0, Ltl/q;->c:Lmm/m;

    invoke-static {v0, v1, v2}, Ltl/d0;->q(Ltl/d0;Lorg/json/JSONObject;Lmm/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
