.class public final synthetic Lno/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lno/u2$f;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lno/u2$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/q0;->a:Lno/u2;

    iput-object p2, p0, Lno/q0;->b:Lno/u2$f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/q0;->a:Lno/u2;

    iget-object v1, p0, Lno/q0;->b:Lno/u2$f;

    check-cast p1, Lfq/n1$a;

    invoke-static {v0, v1, p1}, Lno/u2;->y0(Lno/u2;Lno/u2$f;Lfq/n1$a;)Lln/r;

    move-result-object p1

    return-object p1
.end method
