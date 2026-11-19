.class public final synthetic Lmq/w5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lmq/y0$d;

.field public final synthetic c:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(JLmq/y0$d;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lmq/w5;->a:J

    iput-object p3, p0, Lmq/w5;->b:Lmq/y0$d;

    iput-object p4, p0, Lmq/w5;->c:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lmq/w5;->a:J

    iget-object v2, p0, Lmq/w5;->b:Lmq/y0$d;

    iget-object v3, p0, Lmq/w5;->c:Lmq/q5$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5$l;->m(JLmq/y0$d;Lmq/q5$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
