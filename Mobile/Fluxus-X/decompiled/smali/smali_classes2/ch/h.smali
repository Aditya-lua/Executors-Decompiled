.class public final synthetic Lch/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lch/i;


# direct methods
.method public synthetic constructor <init>(Lch/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/h;->a:Lch/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lch/h;->a:Lch/i;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    check-cast p3, Ljava/lang/String;

    invoke-static {v0, p1, p2, p3}, Lch/i;->a(Lch/i;Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
