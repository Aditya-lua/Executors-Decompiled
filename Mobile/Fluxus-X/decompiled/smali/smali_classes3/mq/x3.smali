.class public final synthetic Lmq/x3;
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

    iput-object p1, p0, Lmq/x3;->a:Lln/k$a;

    iput-object p2, p0, Lmq/x3;->b:Lmq/q5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/x3;->a:Lln/k$a;

    iget-object v1, p0, Lmq/x3;->b:Lmq/q5;

    check-cast p1, Lsn/v$b;

    invoke-static {v0, v1, p1}, Lmq/q5;->P(Lln/k$a;Lmq/q5;Lsn/v$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
