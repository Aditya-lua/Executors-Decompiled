.class public final synthetic Lmq/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/c0$c;

.field public final synthetic b:Lmq/q5;

.field public final synthetic c:Lmq/y0$b;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lmq/c0$c;Lmq/q5;Lmq/y0$b;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/u4;->a:Lmq/c0$c;

    iput-object p2, p0, Lmq/u4;->b:Lmq/q5;

    iput-object p3, p0, Lmq/u4;->c:Lmq/y0$b;

    iput-object p4, p0, Lmq/u4;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmq/u4;->a:Lmq/c0$c;

    iget-object v1, p0, Lmq/u4;->b:Lmq/q5;

    iget-object v2, p0, Lmq/u4;->c:Lmq/y0$b;

    iget-object v3, p0, Lmq/u4;->d:Lln/k$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->z0(Lmq/c0$c;Lmq/q5;Lmq/y0$b;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
