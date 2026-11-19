.class public final synthetic Lyo/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/i0;->a:Lyo/t0;

    iput-object p2, p0, Lyo/i0;->b:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyo/i0;->a:Lyo/t0;

    iget-object v1, p0, Lyo/i0;->b:Lvo/d2$a;

    invoke-static {v0, v1}, Lyo/t0;->I(Lyo/t0;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
