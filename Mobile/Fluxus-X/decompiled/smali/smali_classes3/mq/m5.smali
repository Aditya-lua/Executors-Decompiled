.class public final synthetic Lmq/m5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lqq/c$d;

.field public final synthetic c:Lmq/q5;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(ZLqq/c$d;Lmq/q5;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lmq/m5;->a:Z

    iput-object p2, p0, Lmq/m5;->b:Lqq/c$d;

    iput-object p3, p0, Lmq/m5;->c:Lmq/q5;

    iput-object p4, p0, Lmq/m5;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lmq/m5;->a:Z

    iget-object v1, p0, Lmq/m5;->b:Lqq/c$d;

    iget-object v2, p0, Lmq/m5;->c:Lmq/q5;

    iget-object v3, p0, Lmq/m5;->d:Lln/k$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->g1(ZLqq/c$d;Lmq/q5;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
