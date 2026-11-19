.class public final synthetic Lmq/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/j1;->a:Lln/k$a;

    iput-object p2, p0, Lmq/j1;->b:Lmq/q5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/j1;->a:Lln/k$a;

    iget-object v1, p0, Lmq/j1;->b:Lmq/q5;

    check-cast p1, Lxn/a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lmq/q5;->l0(Lln/k$a;Lmq/q5;Lxn/a;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
