.class public final synthetic Lno/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lno/u2$f;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lln/k$a;Lno/u2$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/m0;->a:Lno/u2;

    iput-object p2, p0, Lno/m0;->b:Lln/k$a;

    iput-object p3, p0, Lno/m0;->c:Lno/u2$f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lno/m0;->a:Lno/u2;

    iget-object v1, p0, Lno/m0;->b:Lln/k$a;

    iget-object v2, p0, Lno/m0;->c:Lno/u2$f;

    invoke-static {v0, v1, v2}, Lno/u2;->l0(Lno/u2;Lln/k$a;Lno/u2$f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
