.class public final synthetic Lfq/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lfq/n1;

.field public final synthetic c:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lfq/n1;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/k1;->a:Lln/k$a;

    iput-object p2, p0, Lfq/k1;->b:Lfq/n1;

    iput-object p3, p0, Lfq/k1;->c:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/k1;->a:Lln/k$a;

    iget-object v1, p0, Lfq/k1;->b:Lfq/n1;

    iget-object v2, p0, Lfq/k1;->c:Lfq/n1$c;

    invoke-static {v0, v1, v2}, Lfq/n1;->j(Lln/k$a;Lfq/n1;Lfq/n1$c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
