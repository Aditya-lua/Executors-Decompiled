.class public final synthetic Lmq/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lmq/y0$q;

.field public final synthetic c:Lmq/q5$b;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lmq/y0$q;Lmq/q5$b;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/t4;->a:Lmq/q5;

    iput-object p2, p0, Lmq/t4;->b:Lmq/y0$q;

    iput-object p3, p0, Lmq/t4;->c:Lmq/q5$b;

    iput-object p4, p0, Lmq/t4;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmq/t4;->a:Lmq/q5;

    iget-object v1, p0, Lmq/t4;->b:Lmq/y0$q;

    iget-object v2, p0, Lmq/t4;->c:Lmq/q5$b;

    iget-object v3, p0, Lmq/t4;->d:Lln/k$a;

    check-cast p1, Ljs/b$b;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->Y0(Lmq/q5;Lmq/y0$q;Lmq/q5$b;Lln/k$a;Ljs/b$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
