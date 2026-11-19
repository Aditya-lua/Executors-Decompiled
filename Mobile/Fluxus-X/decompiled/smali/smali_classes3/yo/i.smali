.class public final synthetic Lyo/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lvo/j0$n;

.field public final synthetic c:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lvo/j0$n;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/i;->a:Lyo/t0;

    iput-object p2, p0, Lyo/i;->b:Lvo/j0$n;

    iput-object p3, p0, Lyo/i;->c:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyo/i;->a:Lyo/t0;

    iget-object v1, p0, Lyo/i;->b:Lvo/j0$n;

    iget-object v2, p0, Lyo/i;->c:Lln/k$a;

    invoke-static {v0, v1, v2}, Lyo/t0;->P(Lyo/t0;Lvo/j0$n;Lln/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
