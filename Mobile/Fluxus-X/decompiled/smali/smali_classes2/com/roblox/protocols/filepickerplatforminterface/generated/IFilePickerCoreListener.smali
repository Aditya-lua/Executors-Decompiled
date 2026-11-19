.class public abstract Lcom/roblox/protocols/filepickerplatforminterface/generated/IFilePickerCoreListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/filepickerplatforminterface/generated/IFilePickerCoreListener$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/filepickerplatforminterface/generated/IPlatformFilePicker;)Lcom/roblox/protocols/filepickerplatforminterface/generated/IFilePickerCoreListener;
.end method


# virtual methods
.method public onLoadCompleted(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;)V
    .locals 0

    return-void
.end method

.method public onPickCompleted(JLcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerStatus;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerStatus;",
            "Ljava/util/ArrayList<",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
