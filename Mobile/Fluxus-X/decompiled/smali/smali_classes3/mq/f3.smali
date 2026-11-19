.class public final synthetic Lmq/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/f3;->a:Lmq/q5;

    iput-object p2, p0, Lmq/f3;->b:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/f3;->a:Lmq/q5;

    iget-object v1, p0, Lmq/f3;->b:Lln/k$a;

    invoke-static {v0, v1}, Lmq/q5;->b1(Lmq/q5;Lln/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
