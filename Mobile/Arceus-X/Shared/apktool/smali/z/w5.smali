.class public final synthetic Lz/w5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# instance fields
.field public final synthetic a:Lz/x5;


# direct methods
.method public synthetic constructor <init>(Lz/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w5;->a:Lz/x5;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lz/w5;->a:Lz/x5;

    invoke-static {v0, p1}, Lz/x5;->b(Lz/x5;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
