.class public final synthetic Ltl/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltl/d0;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/m;->a:Ltl/d0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltl/m;->a:Ltl/d0;

    invoke-static {v0}, Ltl/d0;->e(Ltl/d0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
