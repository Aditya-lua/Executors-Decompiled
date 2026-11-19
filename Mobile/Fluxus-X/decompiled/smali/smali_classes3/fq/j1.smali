.class public final synthetic Lfq/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/n1;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Lfq/n1;Lln/k$a;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/j1;->a:Lfq/n1;

    iput-object p2, p0, Lfq/j1;->b:Lln/k$a;

    iput-object p3, p0, Lfq/j1;->c:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/j1;->a:Lfq/n1;

    iget-object v1, p0, Lfq/j1;->b:Lln/k$a;

    iget-object v2, p0, Lfq/j1;->c:Lfq/n1$c;

    invoke-static {v0, v1, v2}, Lfq/n1;->s(Lfq/n1;Lln/k$a;Lfq/n1$c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
