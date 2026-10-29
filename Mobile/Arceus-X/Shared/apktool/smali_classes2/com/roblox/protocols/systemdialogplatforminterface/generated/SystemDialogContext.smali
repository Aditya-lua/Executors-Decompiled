.class public final Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final dismissed:Z

.field final id:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->id:J

    iput-boolean p3, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->dismissed:Z

    return-void
.end method


# virtual methods
.method public getDismissed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->dismissed:Z

    return v0
.end method

.method public getId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->id:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SystemDialogContext{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",dismissed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;->dismissed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
