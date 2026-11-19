.class public final synthetic Lvq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lmq/y0$f;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lmq/y0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq/b;->a:Lln/k$a;

    iput-object p2, p0, Lvq/b;->b:Lmq/y0$f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvq/b;->a:Lln/k$a;

    iget-object v1, p0, Lvq/b;->b:Lmq/y0$f;

    invoke-static {v0, v1}, Lvq/j;->c(Lln/k$a;Lmq/y0$f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
