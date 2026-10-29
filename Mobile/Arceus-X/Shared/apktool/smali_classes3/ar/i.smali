.class public final synthetic Lar/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lar/p;


# direct methods
.method public synthetic constructor <init>(Lar/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/i;->a:Lar/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lar/i;->a:Lar/p;

    invoke-static {v0}, Lar/p;->f(Lar/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
