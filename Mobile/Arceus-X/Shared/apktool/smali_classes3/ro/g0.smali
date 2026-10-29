.class public final synthetic Lro/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/h;


# direct methods
.method public synthetic constructor <init>(Lym/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/g0;->a:Lym/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro/g0;->a:Lym/h;

    invoke-static {v0}, Lro/m0;->k(Lym/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
