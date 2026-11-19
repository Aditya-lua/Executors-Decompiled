.class public final synthetic Lxo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxo/m;


# direct methods
.method public synthetic constructor <init>(Lxo/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/c;->a:Lxo/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxo/c;->a:Lxo/m;

    invoke-static {v0}, Lxo/m;->j(Lxo/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
