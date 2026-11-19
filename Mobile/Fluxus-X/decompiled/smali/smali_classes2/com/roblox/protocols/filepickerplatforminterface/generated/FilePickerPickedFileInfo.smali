.class public final Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final extension:Ljava/lang/String;

.field final mimeType:Ljava/lang/String;

.field final name:Ljava/lang/String;

.field final pickedFileId:J


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->pickedFileId:J

    iput-object p3, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->mimeType:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->extension:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getExtension()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->extension:Ljava/lang/String;

    return-object v0
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPickedFileId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->pickedFileId:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FilePickerPickedFileInfo{pickedFileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->pickedFileId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mimeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->mimeType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",extension="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerPickedFileInfo;->extension:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
