.class public Ltl/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Activity$ScreenCaptureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltl/a;->d(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ltl/a;


# direct methods
.method public constructor <init>(Ltl/a;)V
    .locals 0

    iput-object p1, p0, Ltl/a$a;->a:Ltl/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScreenCaptured()V
    .locals 2

    iget-object v0, p0, Ltl/a$a;->a:Ltl/a;

    sget-object v1, Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;->SCREENSHOT:Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;

    invoke-static {v0, v1}, Ltl/a;->a(Ltl/a;Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;)V

    return-void
.end method
