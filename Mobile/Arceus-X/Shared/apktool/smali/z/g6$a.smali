.class public Lz/g6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz/g6;


# direct methods
.method public constructor <init>(Lz/g6;)V
    .locals 0

    iput-object p1, p0, Lz/g6$a;->a:Lz/g6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lz/g6$a;->a:Lz/g6;

    iget-object v0, v0, Lz/g6;->e:Lz/g6$b;

    invoke-interface {v0, p1}, Lz/g6$b;->a(Landroid/hardware/camera2/TotalCaptureResult;)V

    const/4 p1, 0x0

    return p1
.end method
