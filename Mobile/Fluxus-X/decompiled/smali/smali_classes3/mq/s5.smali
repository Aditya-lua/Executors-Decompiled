.class public final synthetic Lmq/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lrq/a;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lrq/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/s5;->a:Lmq/q5;

    iput-object p2, p0, Lmq/s5;->b:Lrq/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/s5;->a:Lmq/q5;

    iget-object v1, p0, Lmq/s5;->b:Lrq/a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lmq/q5$h;->m(Lmq/q5;Lrq/a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
