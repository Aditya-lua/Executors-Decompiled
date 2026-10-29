.class public abstract Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBridge$CppProxy;
    }
.end annotation


# static fields
.field public static final APIVERSION:I = 0x3
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native boolFieldValue(Z)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;
.end method

.method public static native doubleFieldValue(D)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;
.end method

.method public static native intFieldValue(J)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;
.end method

.method public static native logCounter(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;D)Z
.end method

.method public static native logEvent(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z
.end method

.method public static native logStat(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;D)Z
.end method

.method public static native stringFieldValue(Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;
.end method

.method public static native telemetryConfig(Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;"
        }
    .end annotation
.end method

.method public static native telemetryConfigV3(Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;"
        }
    .end annotation
.end method

.method public static native telemetryData(Ljava/util/HashMap;Ljava/util/HashSet;Ljava/lang/String;Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;",
            ">;",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;"
        }
    .end annotation
.end method
