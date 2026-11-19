.class public final synthetic Lyo/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lks/a;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lks/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/g0;->a:Lln/k$a;

    iput-object p2, p0, Lyo/g0;->b:Lks/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyo/g0;->a:Lln/k$a;

    iget-object v1, p0, Lyo/g0;->b:Lks/a;

    invoke-static {v0, v1}, Lyo/t0;->o(Lln/k$a;Lks/a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
