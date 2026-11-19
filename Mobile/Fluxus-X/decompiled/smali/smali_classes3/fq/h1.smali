.class public final synthetic Lfq/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Lfq/n1;Lln/k$a;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/h1;->a:Lfq/n1;

    iput-object p2, p0, Lfq/h1;->b:Lln/k$a;

    iput-object p3, p0, Lfq/h1;->c:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/h1;->a:Lfq/n1;

    iget-object v1, p0, Lfq/h1;->b:Lln/k$a;

    iget-object v2, p0, Lfq/h1;->c:Lfq/n1$c;

    check-cast p1, Lfq/u$b;

    invoke-static {v0, v1, v2, p1}, Lfq/n1;->l(Lfq/n1;Lln/k$a;Lfq/n1$c;Lfq/u$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
