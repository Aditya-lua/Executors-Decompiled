.class public final synthetic Lvq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvq/j;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Lvq/j;Lln/k$a;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq/e;->a:Lvq/j;

    iput-object p2, p0, Lvq/e;->b:Lln/k$a;

    iput-object p3, p0, Lvq/e;->c:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvq/e;->a:Lvq/j;

    iget-object v1, p0, Lvq/e;->b:Lln/k$a;

    iget-object v2, p0, Lvq/e;->c:Lmq/q5$b;

    invoke-static {v0, v1, v2}, Lvq/j;->b(Lvq/j;Lln/k$a;Lmq/q5$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
