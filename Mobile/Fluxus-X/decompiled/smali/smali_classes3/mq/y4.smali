.class public final synthetic Lmq/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5$b;

.field public final synthetic b:Lmq/y0$j;


# direct methods
.method public synthetic constructor <init>(Lmq/q5$b;Lmq/y0$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/y4;->a:Lmq/q5$b;

    iput-object p2, p0, Lmq/y4;->b:Lmq/y0$j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/y4;->a:Lmq/q5$b;

    iget-object v1, p0, Lmq/y4;->b:Lmq/y0$j;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lmq/q5;->e1(Lmq/q5$b;Lmq/y0$j;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
