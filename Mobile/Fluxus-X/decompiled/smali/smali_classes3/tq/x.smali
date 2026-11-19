.class public final synthetic Ltq/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/x;->a:Ltq/k2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltq/x;->a:Ltq/k2;

    invoke-static {v0}, Ltq/k2;->F0(Ltq/k2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
