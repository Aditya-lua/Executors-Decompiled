.class public final synthetic Lmq/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1$a;

.field public final synthetic b:Lmq/y0$p;

.field public final synthetic c:Lmq/q5$b;

.field public final synthetic d:Lmq/q5;

.field public final synthetic e:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lfq/n1$a;Lmq/y0$p;Lmq/q5$b;Lmq/q5;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/r4;->a:Lfq/n1$a;

    iput-object p2, p0, Lmq/r4;->b:Lmq/y0$p;

    iput-object p3, p0, Lmq/r4;->c:Lmq/q5$b;

    iput-object p4, p0, Lmq/r4;->d:Lmq/q5;

    iput-object p5, p0, Lmq/r4;->e:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmq/r4;->a:Lfq/n1$a;

    iget-object v1, p0, Lmq/r4;->b:Lmq/y0$p;

    iget-object v2, p0, Lmq/r4;->c:Lmq/q5$b;

    iget-object v3, p0, Lmq/r4;->d:Lmq/q5;

    iget-object v4, p0, Lmq/r4;->e:Lln/k$a;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lmq/q5;->h1(Lfq/n1$a;Lmq/y0$p;Lmq/q5$b;Lmq/q5;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
