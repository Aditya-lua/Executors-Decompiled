.class public final synthetic Ly/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ly/m;


# direct methods
.method public synthetic constructor <init>(Ly/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/j;->a:Ly/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly/j;->a:Ly/m;

    invoke-static {v0}, Ly/m;->e(Ly/m;)Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;

    move-result-object v0

    return-object v0
.end method
