.class public final synthetic Lyo/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lvo/j0$n;

.field public final synthetic c:Lvo/f;

.field public final synthetic d:Lvo/n$b;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lvo/j0$n;Lvo/f;Lvo/n$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/u;->a:Lyo/t0;

    iput-object p2, p0, Lyo/u;->b:Lvo/j0$n;

    iput-object p3, p0, Lyo/u;->c:Lvo/f;

    iput-object p4, p0, Lyo/u;->d:Lvo/n$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lyo/u;->a:Lyo/t0;

    iget-object v1, p0, Lyo/u;->b:Lvo/j0$n;

    iget-object v2, p0, Lyo/u;->c:Lvo/f;

    iget-object v3, p0, Lyo/u;->d:Lvo/n$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lyo/t0;->h(Lyo/t0;Lvo/j0$n;Lvo/f;Lvo/n$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
