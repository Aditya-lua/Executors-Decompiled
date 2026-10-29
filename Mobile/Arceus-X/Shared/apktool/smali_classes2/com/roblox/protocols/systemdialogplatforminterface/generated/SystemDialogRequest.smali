.class public final Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final blockTimeInSeconds:J

.field final cancelText:Ljava/lang/String;

.field final message:Ljava/lang/String;

.field final okText:Ljava/lang/String;

.field final showProgressBar:Z

.field final showSpinner:Z

.field final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->title:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->message:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->okText:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->cancelText:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showProgressBar:Z

    iput-boolean p6, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showSpinner:Z

    iput-wide p7, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->blockTimeInSeconds:J

    return-void
.end method


# virtual methods
.method public getBlockTimeInSeconds()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->blockTimeInSeconds:J

    return-wide v0
.end method

.method public getCancelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->cancelText:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getOkText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->okText:Ljava/lang/String;

    return-object v0
.end method

.method public getShowProgressBar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showProgressBar:Z

    return v0
.end method

.method public getShowSpinner()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showSpinner:Z

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->title:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SystemDialogRequest{title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",okText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->okText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",cancelText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->cancelText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",showProgressBar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showProgressBar:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",showSpinner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->showSpinner:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",blockTimeInSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;->blockTimeInSeconds:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
