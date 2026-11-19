.class public final synthetic Lmq/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/f2;->a:Lln/k$a;

    iput-object p2, p0, Lmq/f2;->b:Lmq/q5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/f2;->a:Lln/k$a;

    iget-object v1, p0, Lmq/f2;->b:Lmq/q5;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lmq/q5;->y(Lln/k$a;Lmq/q5;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
