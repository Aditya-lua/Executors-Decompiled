.class public final synthetic Lhp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhp/e0;


# direct methods
.method public synthetic constructor <init>(Lhp/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/u;->a:Lhp/e0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhp/u;->a:Lhp/e0;

    invoke-static {v0}, Lhp/e0;->k(Lhp/e0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
