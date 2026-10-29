.class public final synthetic Ltl/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lmm/m;


# direct methods
.method public synthetic constructor <init>(Lmm/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/u;->a:Lmm/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltl/u;->a:Lmm/m;

    check-cast p1, Lvl/c;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, p1, p2}, Ltl/d0;->r(Lmm/m;Lvl/c;F)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
