.class public final synthetic Lz/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/g1$d;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lz/g1$d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/m1;->a:Lz/g1$d;

    iput p2, p0, Lz/m1;->b:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 2

    iget-object v0, p0, Lz/m1;->a:Lz/g1$d;

    iget v1, p0, Lz/m1;->b:I

    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {v0, v1, p1}, Lz/g1$d;->a(Lz/g1$d;ILandroid/hardware/camera2/TotalCaptureResult;)Lne/x;

    move-result-object p1

    return-object p1
.end method
