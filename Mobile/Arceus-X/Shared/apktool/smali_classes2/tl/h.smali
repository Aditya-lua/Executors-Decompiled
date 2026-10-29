.class public final Ltl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltl/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltl/g;",
        "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
        "a",
        "(Ltl/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
        "universalapp_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ltl/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;
    .locals 1
    .param p0    # Ltl/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Ltl/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :pswitch_1
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->LOADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOFILL:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->SERVEADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->GENERATESIGNALFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINITIALIZED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
