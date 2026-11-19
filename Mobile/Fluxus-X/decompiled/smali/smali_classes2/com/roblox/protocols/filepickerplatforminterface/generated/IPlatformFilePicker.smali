.class public abstract Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelLoad(J)V
    .locals 0

    return-void
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSupported(Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public loadFile(JJLjava/lang/Long;)V
    .locals 0

    return-void
.end method

.method public pickFiles(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;)V
    .locals 0

    return-void
.end method

.method public releaseLoadedFile(J)V
    .locals 0

    return-void
.end method

.method public releasePickedFile(J)V
    .locals 0

    return-void
.end method
