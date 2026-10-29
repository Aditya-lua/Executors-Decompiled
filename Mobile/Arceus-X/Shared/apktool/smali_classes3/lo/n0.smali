.class public final synthetic Llo/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/n0;->a:Lym/k$a;

    iput-object p2, p0, Llo/n0;->b:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llo/n0;->a:Lym/k$a;

    iget-object v1, p0, Llo/n0;->b:Luo/l;

    invoke-static {v0, v1}, Llo/t0;->r(Lym/k$a;Luo/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
