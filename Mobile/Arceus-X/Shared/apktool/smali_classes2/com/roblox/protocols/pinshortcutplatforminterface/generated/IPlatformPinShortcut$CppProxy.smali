.class public final Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;
.super Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CppProxy"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final nativeRef:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-static {p0, p1, p2}, Lcom/snapchat/djinni/NativeObjectManager;->register(Ljava/lang/Object;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "nativeRef is zero"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeDestroy(J)V
.end method

.method private native native_getDesiredThumbnailFormat(J)Ljava/lang/String;
.end method

.method private native native_isAvailable(J)Z
.end method

.method private native native_isPinExperienceV2Available(J)Z
.end method

.method private native native_isRevealPinnedExperienceAvailable(J)Z
.end method

.method private native native_pinExperience(JJLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_pinExperienceV2(JJJLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_revealPinnedExperience(JJ)V
.end method

.method private native native_shouldShowLuaNotificationOnPinExperienceCompleted(J)Z
.end method


# virtual methods
.method public getDesiredThumbnailFormat()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_getDesiredThumbnailFormat(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAvailable()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_isAvailable(J)Z

    move-result v0

    return v0
.end method

.method public isPinExperienceV2Available()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_isPinExperienceV2Available(J)Z

    move-result v0

    return v0
.end method

.method public isRevealPinnedExperienceAvailable()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_isRevealPinnedExperienceAvailable(J)Z

    move-result v0

    return v0
.end method

.method public pinExperience(JLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-wide v1, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_pinExperience(JJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public pinExperienceV2(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 9

    iget-wide v1, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    move-object v0, p0

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_pinExperienceV2(JJJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public revealPinnedExperience(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_revealPinnedExperience(JJ)V

    return-void
.end method

.method public shouldShowLuaNotificationOnPinExperienceCompleted()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut$CppProxy;->native_shouldShowLuaNotificationOnPinExperienceCompleted(J)Z

    move-result v0

    return v0
.end method
