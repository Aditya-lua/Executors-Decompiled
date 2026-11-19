.class public final synthetic Lmq/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lmq/y0$n;

.field public final synthetic d:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lln/k$a;Lmq/y0$n;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/o2;->a:Lmq/q5;

    iput-object p2, p0, Lmq/o2;->b:Lln/k$a;

    iput-object p3, p0, Lmq/o2;->c:Lmq/y0$n;

    iput-object p4, p0, Lmq/o2;->d:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmq/o2;->a:Lmq/q5;

    iget-object v1, p0, Lmq/o2;->b:Lln/k$a;

    iget-object v2, p0, Lmq/o2;->c:Lmq/y0$n;

    iget-object v3, p0, Lmq/o2;->d:Lmq/q5$b;

    check-cast p1, Lmq/c0$c;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->R(Lmq/q5;Lln/k$a;Lmq/y0$n;Lmq/q5$b;Lmq/c0$c;)Lln/r;

    move-result-object p1

    return-object p1
.end method
