.class public final synthetic Ltq/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$q;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/q5$b;Lmq/y0$q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/e2;->a:Ltq/k2;

    iput-object p2, p0, Ltq/e2;->b:Lmq/q5$b;

    iput-object p3, p0, Ltq/e2;->c:Lmq/y0$q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/e2;->a:Ltq/k2;

    iget-object v1, p0, Ltq/e2;->b:Lmq/q5$b;

    iget-object v2, p0, Ltq/e2;->c:Lmq/y0$q;

    invoke-static {v0, v1, v2}, Ltq/k2;->S(Ltq/k2;Lmq/q5$b;Lmq/y0$q;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
