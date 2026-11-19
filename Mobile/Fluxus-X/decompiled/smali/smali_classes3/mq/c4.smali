.class public final synthetic Lmq/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lmq/q5$b;

.field public final synthetic d:Lmq/y0$p;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lln/k$a;Lmq/q5$b;Lmq/y0$p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/c4;->a:Lmq/q5;

    iput-object p2, p0, Lmq/c4;->b:Lln/k$a;

    iput-object p3, p0, Lmq/c4;->c:Lmq/q5$b;

    iput-object p4, p0, Lmq/c4;->d:Lmq/y0$p;

    iput-wide p5, p0, Lmq/c4;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lmq/c4;->a:Lmq/q5;

    iget-object v1, p0, Lmq/c4;->b:Lln/k$a;

    iget-object v2, p0, Lmq/c4;->c:Lmq/q5$b;

    iget-object v3, p0, Lmq/c4;->d:Lmq/y0$p;

    iget-wide v4, p0, Lmq/c4;->e:J

    move-object v6, p1

    check-cast v6, Lsn/v;

    invoke-static/range {v0 .. v6}, Lmq/q5;->s0(Lmq/q5;Lln/k$a;Lmq/q5$b;Lmq/y0$p;JLsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
