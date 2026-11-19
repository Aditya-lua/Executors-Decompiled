.class public final synthetic Lfq/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lfq/u;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lfq/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/m;->a:Lln/k$a;

    iput-object p2, p0, Lfq/m;->b:Lfq/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/m;->a:Lln/k$a;

    iget-object v1, p0, Lfq/m;->b:Lfq/u;

    invoke-static {v0, v1}, Lfq/u;->n(Lln/k$a;Lfq/u;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
