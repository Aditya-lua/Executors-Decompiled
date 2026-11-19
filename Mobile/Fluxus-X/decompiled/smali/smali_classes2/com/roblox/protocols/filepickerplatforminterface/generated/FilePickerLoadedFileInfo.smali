.class public final Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final fileDescriptor:Ljava/lang/Integer;

.field final path:Ljava/lang/String;

.field final sizeBytes:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->path:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->fileDescriptor:Ljava/lang/Integer;

    iput-wide p3, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->sizeBytes:J

    return-void
.end method


# virtual methods
.method public getFileDescriptor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->fileDescriptor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getSizeBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->sizeBytes:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FilePickerLoadedFileInfo{path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",fileDescriptor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->fileDescriptor:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",sizeBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadedFileInfo;->sizeBytes:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
