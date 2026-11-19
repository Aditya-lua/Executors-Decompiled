.class public final Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final cameraFacing:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

.field final extensions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final maximumFileCount:I

.field final mediaTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;",
            ">;"
        }
    .end annotation
.end field

.field final mimeTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final source:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;",
            "Ljava/util/ArrayList<",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->source:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    iput-object p2, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mediaTypes:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mimeTypes:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->extensions:Ljava/util/ArrayList;

    iput-object p5, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->cameraFacing:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    iput p6, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->maximumFileCount:I

    return-void
.end method


# virtual methods
.method public getCameraFacing()Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->cameraFacing:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    return-object v0
.end method

.method public getExtensions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->extensions:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getMaximumFileCount()I
    .locals 1

    iget v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->maximumFileCount:I

    return v0
.end method

.method public getMediaTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mediaTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getMimeTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mimeTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSource()Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->source:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FilePickerRequest{source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->source:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",mediaTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mediaTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",mimeTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->mimeTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",extensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->extensions:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",cameraFacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->cameraFacing:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",maximumFileCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerRequest;->maximumFileCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
