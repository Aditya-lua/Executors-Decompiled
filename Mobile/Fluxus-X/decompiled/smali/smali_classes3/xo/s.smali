.class public final synthetic Lxo/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxo/u;


# direct methods
.method public synthetic constructor <init>(Lxo/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/s;->a:Lxo/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxo/s;->a:Lxo/u;

    invoke-static {v0}, Lxo/u;->c(Lxo/u;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
