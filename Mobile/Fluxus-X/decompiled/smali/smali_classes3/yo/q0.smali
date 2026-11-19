.class public final synthetic Lyo/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lln/k$a;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/q0;->a:Lyo/t0;

    iput-object p2, p0, Lyo/q0;->b:Lln/k$a;

    iput-object p3, p0, Lyo/q0;->c:Lvo/d2$a;

    iput-object p4, p0, Lyo/q0;->d:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lyo/q0;->a:Lyo/t0;

    iget-object v1, p0, Lyo/q0;->b:Lln/k$a;

    iget-object v2, p0, Lyo/q0;->c:Lvo/d2$a;

    iget-object v3, p0, Lyo/q0;->d:Lip/l;

    invoke-static {v0, v1, v2, v3}, Lyo/t0;->C(Lyo/t0;Lln/k$a;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
