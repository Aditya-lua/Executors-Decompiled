.class public final synthetic Ltg/g$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g;-><init>(Ltl/i;Ltl/c;Lku/p0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;",
        "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ltg/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/g$a;

    invoke-direct {v0}, Ltg/g$a;-><init>()V

    sput-object v0, Ltg/g$a;->a:Ltg/g$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    const-string v3, "setPlatformImpl"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;
    .locals 0

    invoke-static {p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;

    invoke-virtual {p0, p1}, Ltg/g$a;->d(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    return-object p1
.end method
