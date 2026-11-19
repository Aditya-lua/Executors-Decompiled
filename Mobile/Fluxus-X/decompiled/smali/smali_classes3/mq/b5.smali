.class public final synthetic Lmq/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;

.field public final synthetic c:Lmq/y0$q;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;Lmq/y0$q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/b5;->a:Lln/k$a;

    iput-object p2, p0, Lmq/b5;->b:Lmq/q5;

    iput-object p3, p0, Lmq/b5;->c:Lmq/y0$q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/b5;->a:Lln/k$a;

    iget-object v1, p0, Lmq/b5;->b:Lmq/q5;

    iget-object v2, p0, Lmq/b5;->c:Lmq/y0$q;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lmq/q5;->P0(Lln/k$a;Lmq/q5;Lmq/y0$q;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
