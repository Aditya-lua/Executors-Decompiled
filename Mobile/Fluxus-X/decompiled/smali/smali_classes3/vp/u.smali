.class public final synthetic Lvp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvp/e0;


# direct methods
.method public synthetic constructor <init>(Lvp/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/u;->a:Lvp/e0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvp/u;->a:Lvp/e0;

    invoke-static {v0}, Lvp/e0;->k(Lvp/e0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
