.class public final Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;
.super Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker;
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

    invoke-direct {p0}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

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

.method private native native_cancelLoad(JJ)V
.end method

.method private native native_isAvailable(J)Z
.end method

.method private native native_isSupported(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)Z
.end method

.method private native native_loadFile(JJJLjava/lang/Long;)V
.end method

.method private native native_pickFiles(JJLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)V
.end method

.method private native native_releaseLoadedFile(JJ)V
.end method

.method private native native_releasePickedFile(JJ)V
.end method


# virtual methods
.method public cancelLoad(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_cancelLoad(JJ)V

    return-void
.end method

.method public isAvailable()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_isAvailable(J)Z

    move-result v0

    return v0
.end method

.method public isSupported(Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_isSupported(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)Z

    move-result p1

    return p1
.end method

.method public loadFile(JJLjava/lang/Long;)V
    .locals 8

    iget-wide v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    move-object v0, p0

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_loadFile(JJJLjava/lang/Long;)V

    return-void
.end method

.method public pickFiles(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_pickFiles(JJLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)V

    return-void
.end method

.method public releaseLoadedFile(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_releaseLoadedFile(JJ)V

    return-void
.end method

.method public releasePickedFile(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;->native_releasePickedFile(JJ)V

    return-void
.end method
