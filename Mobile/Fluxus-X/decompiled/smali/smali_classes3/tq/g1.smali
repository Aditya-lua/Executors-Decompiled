.class public final synthetic Ltq/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lls/g;

.field public final synthetic c:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lls/g;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/g1;->a:Ltq/k2;

    iput-object p2, p0, Ltq/g1;->b:Lls/g;

    iput-object p3, p0, Ltq/g1;->c:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/g1;->a:Ltq/k2;

    iget-object v1, p0, Ltq/g1;->b:Lls/g;

    iget-object v2, p0, Ltq/g1;->c:Lmq/q5$b;

    invoke-static {v0, v1, v2}, Ltq/k2;->d0(Ltq/k2;Lls/g;Lmq/q5$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
