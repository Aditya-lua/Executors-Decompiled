.class public final synthetic Lno/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1$a;

.field public final synthetic b:Lno/u2;

.field public final synthetic c:Lno/u2$f;


# direct methods
.method public synthetic constructor <init>(Lfq/n1$a;Lno/u2;Lno/u2$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/r1;->a:Lfq/n1$a;

    iput-object p2, p0, Lno/r1;->b:Lno/u2;

    iput-object p3, p0, Lno/r1;->c:Lno/u2$f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lno/r1;->a:Lfq/n1$a;

    iget-object v1, p0, Lno/r1;->b:Lno/u2;

    iget-object v2, p0, Lno/r1;->c:Lno/u2$f;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lno/u2;->V(Lfq/n1$a;Lno/u2;Lno/u2$f;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
