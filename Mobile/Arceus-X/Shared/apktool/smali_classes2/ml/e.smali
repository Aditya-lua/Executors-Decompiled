.class public final synthetic Lml/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

.field public final synthetic c:Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lml/e;->a:J

    iput-object p3, p0, Lml/e;->b:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    iput-object p4, p0, Lml/e;->c:Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;

    iput-object p5, p0, Lml/e;->d:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-wide v0, p0, Lml/e;->a:J

    iget-object v2, p0, Lml/e;->b:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    iget-object v3, p0, Lml/e;->c:Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;

    iget-object v4, p0, Lml/e;->d:Landroid/app/Activity;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->b(JLcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V

    return-void
.end method
