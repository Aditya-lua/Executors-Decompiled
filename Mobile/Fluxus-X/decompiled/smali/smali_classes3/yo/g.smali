.class public final synthetic Lyo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/g;->a:Lln/k$a;

    iput-object p2, p0, Lyo/g;->b:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyo/g;->a:Lln/k$a;

    iget-object v1, p0, Lyo/g;->b:Lip/l;

    invoke-static {v0, v1}, Lyo/t0;->v(Lln/k$a;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
