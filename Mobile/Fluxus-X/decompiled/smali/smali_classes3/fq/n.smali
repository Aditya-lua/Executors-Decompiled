.class public final synthetic Lfq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lfq/u;

.field public final synthetic c:Lfq/u$c;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lfq/u;Lfq/u$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/n;->a:Lln/k$a;

    iput-object p2, p0, Lfq/n;->b:Lfq/u;

    iput-object p3, p0, Lfq/n;->c:Lfq/u$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/n;->a:Lln/k$a;

    iget-object v1, p0, Lfq/n;->b:Lfq/u;

    iget-object v2, p0, Lfq/n;->c:Lfq/u$c;

    invoke-static {v0, v1, v2}, Lfq/u;->l(Lln/k$a;Lfq/u;Lfq/u$c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
