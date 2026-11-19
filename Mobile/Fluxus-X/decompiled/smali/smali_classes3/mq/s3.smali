.class public final synthetic Lmq/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/q5;

.field public final synthetic c:Lmq/q5$b;

.field public final synthetic d:Lmq/y0$g;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/q5;Lmq/q5$b;Lmq/y0$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/s3;->a:Lln/k$a;

    iput-object p2, p0, Lmq/s3;->b:Lmq/q5;

    iput-object p3, p0, Lmq/s3;->c:Lmq/q5$b;

    iput-object p4, p0, Lmq/s3;->d:Lmq/y0$g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmq/s3;->a:Lln/k$a;

    iget-object v1, p0, Lmq/s3;->b:Lmq/q5;

    iget-object v2, p0, Lmq/s3;->c:Lmq/q5$b;

    iget-object v3, p0, Lmq/s3;->d:Lmq/y0$g;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->M0(Lln/k$a;Lmq/q5;Lmq/q5$b;Lmq/y0$g;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
