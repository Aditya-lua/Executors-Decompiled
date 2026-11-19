.class public final synthetic Lyo/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lln/k$a;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/w;->a:Lyo/t0;

    iput-object p2, p0, Lyo/w;->b:Lln/k$a;

    iput-object p3, p0, Lyo/w;->c:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyo/w;->a:Lyo/t0;

    iget-object v1, p0, Lyo/w;->b:Lln/k$a;

    iget-object v2, p0, Lyo/w;->c:Lvo/d2$a;

    invoke-static {v0, v1, v2}, Lyo/t0;->m(Lyo/t0;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
