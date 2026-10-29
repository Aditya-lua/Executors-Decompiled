.class public final synthetic Lro/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/f;->a:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro/f;->a:Lvr/f;

    invoke-static {v0}, Lro/i;->f(Lvr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
