.class public final synthetic Lmq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/m;

.field public final synthetic b:Lmq/n;

.field public final synthetic c:Lmq/q5$d$c$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/m;Lmq/n;Lmq/q5$d$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/k;->a:Landroidx/lifecycle/m;

    iput-object p2, p0, Lmq/k;->b:Lmq/n;

    iput-object p3, p0, Lmq/k;->c:Lmq/q5$d$c$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/k;->a:Landroidx/lifecycle/m;

    iget-object v1, p0, Lmq/k;->b:Lmq/n;

    iget-object v2, p0, Lmq/k;->c:Lmq/q5$d$c$b;

    invoke-static {v0, v1, v2}, Lmq/n;->f(Landroidx/lifecycle/m;Lmq/n;Lmq/q5$d$c$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
