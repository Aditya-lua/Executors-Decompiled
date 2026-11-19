.class public abstract Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;)Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
.end method


# virtual methods
.method public answerIncomingCall(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public createCall(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public endCall(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public receiveIncomingCall(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
