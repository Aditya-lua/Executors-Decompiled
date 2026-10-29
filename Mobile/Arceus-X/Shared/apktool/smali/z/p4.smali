.class public final synthetic Lz/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# instance fields
.field public final synthetic a:Lz/q4;


# direct methods
.method public synthetic constructor <init>(Lz/q4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/p4;->a:Lz/q4;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lz/p4;->a:Lz/q4;

    invoke-static {v0, p1}, Lz/q4;->a(Lz/q4;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
