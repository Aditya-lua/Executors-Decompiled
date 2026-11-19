.class public final synthetic Lno/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/z0;->a:Lno/u2;

    iput-object p2, p0, Lno/z0;->b:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/z0;->a:Lno/u2;

    iget-object v1, p0, Lno/z0;->b:Lln/k$a;

    check-cast p1, Lqr/x5;

    invoke-static {v0, v1, p1}, Lno/u2;->W(Lno/u2;Lln/k$a;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
