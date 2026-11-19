.class public final synthetic Lfq/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lfq/n1;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lfq/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/b1;->a:Lln/k$a;

    iput-object p2, p0, Lfq/b1;->b:Lfq/n1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/b1;->a:Lln/k$a;

    iget-object v1, p0, Lfq/b1;->b:Lfq/n1;

    invoke-static {v0, v1}, Lfq/n1;->A(Lln/k$a;Lfq/n1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
