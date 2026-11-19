.class public final synthetic Lmq/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/y0$l;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/q5;


# direct methods
.method public synthetic constructor <init>(Lmq/y0$l;Lmq/q5$b;Lmq/q5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/s4;->a:Lmq/y0$l;

    iput-object p2, p0, Lmq/s4;->b:Lmq/q5$b;

    iput-object p3, p0, Lmq/s4;->c:Lmq/q5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/s4;->a:Lmq/y0$l;

    iget-object v1, p0, Lmq/s4;->b:Lmq/q5$b;

    iget-object v2, p0, Lmq/s4;->c:Lmq/q5;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lmq/q5;->o(Lmq/y0$l;Lmq/q5$b;Lmq/q5;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
