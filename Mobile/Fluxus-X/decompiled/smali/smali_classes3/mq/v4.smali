.class public final synthetic Lmq/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$p;

.field public final synthetic d:Lsn/v;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lmq/q5$b;Lmq/y0$p;Lsn/v;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/v4;->a:Lmq/q5;

    iput-object p2, p0, Lmq/v4;->b:Lmq/q5$b;

    iput-object p3, p0, Lmq/v4;->c:Lmq/y0$p;

    iput-object p4, p0, Lmq/v4;->d:Lsn/v;

    iput-wide p5, p0, Lmq/v4;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lmq/v4;->a:Lmq/q5;

    iget-object v1, p0, Lmq/v4;->b:Lmq/q5$b;

    iget-object v2, p0, Lmq/v4;->c:Lmq/y0$p;

    iget-object v3, p0, Lmq/v4;->d:Lsn/v;

    iget-wide v4, p0, Lmq/v4;->e:J

    move-object v6, p1

    check-cast v6, Lln/r$c;

    invoke-static/range {v0 .. v6}, Lmq/q5;->V(Lmq/q5;Lmq/q5$b;Lmq/y0$p;Lsn/v;JLln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
