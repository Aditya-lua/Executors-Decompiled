.class public final synthetic Ltl/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmm/m;

.field public final synthetic b:Ltl/d0;


# direct methods
.method public synthetic constructor <init>(Lmm/m;Ltl/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/h0;->a:Lmm/m;

    iput-object p2, p0, Ltl/h0;->b:Ltl/d0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltl/h0;->a:Lmm/m;

    iget-object v1, p0, Ltl/h0;->b:Ltl/d0;

    invoke-static {v0, v1}, Ltl/d0$d;->a(Lmm/m;Ltl/d0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
