.class public final synthetic Ltq/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/q5$b;Lmq/y0$p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/l;->a:Ltq/k2;

    iput-object p2, p0, Ltq/l;->b:Lmq/q5$b;

    iput-object p3, p0, Ltq/l;->c:Lmq/y0$p;

    iput-wide p4, p0, Ltq/l;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ltq/l;->a:Ltq/k2;

    iget-object v1, p0, Ltq/l;->b:Lmq/q5$b;

    iget-object v2, p0, Ltq/l;->c:Lmq/y0$p;

    iget-wide v3, p0, Ltq/l;->d:J

    move-object v5, p1

    check-cast v5, Lsn/v;

    invoke-static/range {v0 .. v5}, Ltq/k2;->o0(Ltq/k2;Lmq/q5$b;Lmq/y0$p;JLsn/v;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
