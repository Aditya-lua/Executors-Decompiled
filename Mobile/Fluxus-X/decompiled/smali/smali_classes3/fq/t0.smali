.class public final synthetic Lfq/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lfq/n1;

.field public final synthetic c:Lfq/n1$c;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(ZLfq/n1;Lfq/n1$c;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lfq/t0;->a:Z

    iput-object p2, p0, Lfq/t0;->b:Lfq/n1;

    iput-object p3, p0, Lfq/t0;->c:Lfq/n1$c;

    iput-object p4, p0, Lfq/t0;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lfq/t0;->a:Z

    iget-object v1, p0, Lfq/t0;->b:Lfq/n1;

    iget-object v2, p0, Lfq/t0;->c:Lfq/n1$c;

    iget-object v3, p0, Lfq/t0;->d:Lln/k$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lfq/n1;->D(ZLfq/n1;Lfq/n1$c;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
