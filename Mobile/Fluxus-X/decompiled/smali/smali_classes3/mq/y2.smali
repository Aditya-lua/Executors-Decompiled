.class public final synthetic Lmq/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;

.field public final synthetic c:Lmq/y0$j;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;Lmq/y0$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/y2;->a:Lln/k$a;

    iput-object p2, p0, Lmq/y2;->b:Lmq/q5;

    iput-object p3, p0, Lmq/y2;->c:Lmq/y0$j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/y2;->a:Lln/k$a;

    iget-object v1, p0, Lmq/y2;->b:Lmq/q5;

    iget-object v2, p0, Lmq/y2;->c:Lmq/y0$j;

    invoke-static {v0, v1, v2}, Lmq/q5;->I(Lln/k$a;Lmq/q5;Lmq/y0$j;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
