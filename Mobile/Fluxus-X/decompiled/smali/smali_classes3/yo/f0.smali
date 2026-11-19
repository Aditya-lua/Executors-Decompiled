.class public final synthetic Lyo/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lvo/j0$n;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lvo/d2$a;Lvo/j0$n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/f0;->a:Lyo/t0;

    iput-object p2, p0, Lyo/f0;->b:Lvo/d2$a;

    iput-object p3, p0, Lyo/f0;->c:Lvo/j0$n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyo/f0;->a:Lyo/t0;

    iget-object v1, p0, Lyo/f0;->b:Lvo/d2$a;

    iget-object v2, p0, Lyo/f0;->c:Lvo/j0$n;

    invoke-static {v0, v1, v2}, Lyo/t0;->J(Lyo/t0;Lvo/d2$a;Lvo/j0$n;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
