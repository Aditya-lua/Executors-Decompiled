.class public final synthetic Lno/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/n0;->a:Lno/u2;

    iput-object p2, p0, Lno/n0;->b:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/n0;->a:Lno/u2;

    iget-object v1, p0, Lno/n0;->b:Lln/k$a;

    invoke-static {v0, v1}, Lno/u2;->Q(Lno/u2;Lln/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
