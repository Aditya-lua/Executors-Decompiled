.class public final synthetic Lmq/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lln/k$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/y3;->a:Lmq/q5;

    iput-object p2, p0, Lmq/y3;->b:Lln/k$a;

    iput-boolean p3, p0, Lmq/y3;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/y3;->a:Lmq/q5;

    iget-object v1, p0, Lmq/y3;->b:Lln/k$a;

    iget-boolean v2, p0, Lmq/y3;->c:Z

    check-cast p1, Lqq/c$d;

    invoke-static {v0, v1, v2, p1}, Lmq/q5;->b0(Lmq/q5;Lln/k$a;ZLqq/c$d;)Lln/r;

    move-result-object p1

    return-object p1
.end method
