.class public final synthetic Lmq/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/c0$c;

.field public final synthetic b:Lmq/q5;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Lmq/y0$n;

.field public final synthetic e:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Lmq/c0$c;Lmq/q5;Lln/k$a;Lmq/y0$n;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/w4;->a:Lmq/c0$c;

    iput-object p2, p0, Lmq/w4;->b:Lmq/q5;

    iput-object p3, p0, Lmq/w4;->c:Lln/k$a;

    iput-object p4, p0, Lmq/w4;->d:Lmq/y0$n;

    iput-object p5, p0, Lmq/w4;->e:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmq/w4;->a:Lmq/c0$c;

    iget-object v1, p0, Lmq/w4;->b:Lmq/q5;

    iget-object v2, p0, Lmq/w4;->c:Lln/k$a;

    iget-object v3, p0, Lmq/w4;->d:Lmq/y0$n;

    iget-object v4, p0, Lmq/w4;->e:Lmq/q5$b;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lmq/q5;->a0(Lmq/c0$c;Lmq/q5;Lln/k$a;Lmq/y0$n;Lmq/q5$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
