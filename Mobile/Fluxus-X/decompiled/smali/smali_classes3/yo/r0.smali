.class public final synthetic Lyo/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lvo/j0$n;

.field public final synthetic c:Lvo/f;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lvo/j0$n;Lvo/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/r0;->a:Lyo/t0;

    iput-object p2, p0, Lyo/r0;->b:Lvo/j0$n;

    iput-object p3, p0, Lyo/r0;->c:Lvo/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyo/r0;->a:Lyo/t0;

    iget-object v1, p0, Lyo/r0;->b:Lvo/j0$n;

    iget-object v2, p0, Lyo/r0;->c:Lvo/f;

    check-cast p1, Lzt/n;

    invoke-static {v0, v1, v2, p1}, Lyo/t0;->p(Lyo/t0;Lvo/j0$n;Lvo/f;Lzt/n;)Lln/r;

    move-result-object p1

    return-object p1
.end method
