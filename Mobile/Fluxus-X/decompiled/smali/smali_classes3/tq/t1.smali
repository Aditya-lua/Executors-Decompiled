.class public final synthetic Ltq/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/t1;->a:Ltq/k2;

    iput-object p2, p0, Ltq/t1;->b:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltq/t1;->a:Ltq/k2;

    iget-object v1, p0, Ltq/t1;->b:Lmq/q5$b;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, v1, p1}, Ltq/k2;->q(Ltq/k2;Lmq/q5$b;Lkotlin/Unit;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
