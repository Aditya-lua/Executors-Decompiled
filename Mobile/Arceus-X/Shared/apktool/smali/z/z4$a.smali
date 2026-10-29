.class public Lz/z4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/z4;->a(Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lz/z4;


# direct methods
.method public constructor <init>(Lz/z4;)V
    .locals 0

    iput-object p1, p0, Lz/z4$a;->a:Lz/z4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "ProcessingCaptureSession"

    const-string v1, "open session failed "

    invoke-static {v0, v1, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lz/z4$a;->a:Lz/z4;

    invoke-virtual {p1}, Lz/z4;->close()V

    iget-object p1, p0, Lz/z4$a;->a:Lz/z4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz/z4;->f(Z)Lne/x;

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lz/z4$a;->a(Ljava/lang/Void;)V

    return-void
.end method
