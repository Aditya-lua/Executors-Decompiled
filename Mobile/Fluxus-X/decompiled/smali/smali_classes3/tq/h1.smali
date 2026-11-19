.class public final synthetic Ltq/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$k;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/q5$b;Lmq/y0$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/h1;->a:Ltq/k2;

    iput-object p2, p0, Ltq/h1;->b:Lmq/q5$b;

    iput-object p3, p0, Ltq/h1;->c:Lmq/y0$k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/h1;->a:Ltq/k2;

    iget-object v1, p0, Ltq/h1;->b:Lmq/q5$b;

    iget-object v2, p0, Ltq/h1;->c:Lmq/y0$k;

    invoke-static {v0, v1, v2}, Ltq/k2;->P0(Ltq/k2;Lmq/q5$b;Lmq/y0$k;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
