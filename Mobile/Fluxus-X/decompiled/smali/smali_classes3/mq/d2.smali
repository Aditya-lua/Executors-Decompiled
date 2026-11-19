.class public final synthetic Lmq/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/d2;->a:Lln/k$a;

    iput-object p2, p0, Lmq/d2;->b:Lmq/q5;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmq/d2;->a:Lln/k$a;

    iget-object v1, p0, Lmq/d2;->b:Lmq/q5;

    invoke-static {v0, v1}, Lmq/q5;->F0(Lln/k$a;Lmq/q5;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
