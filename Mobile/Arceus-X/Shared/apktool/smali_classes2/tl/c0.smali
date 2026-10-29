.class public final synthetic Ltl/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltl/d0;

.field public final synthetic b:Ltl/c;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;Ltl/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/c0;->a:Ltl/d0;

    iput-object p2, p0, Ltl/c0;->b:Ltl/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltl/c0;->a:Ltl/d0;

    iget-object v1, p0, Ltl/c0;->b:Ltl/c;

    invoke-static {v0, v1}, Ltl/d0;->n(Ltl/d0;Ltl/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
