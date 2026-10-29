.class public final synthetic Lz/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/g1$d;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lz/g1$d;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j1;->a:Lz/g1$d;

    iput-object p2, p0, Lz/j1;->b:Ljava/util/List;

    iput p3, p0, Lz/j1;->c:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 3

    iget-object v0, p0, Lz/j1;->a:Lz/g1$d;

    iget-object v1, p0, Lz/j1;->b:Ljava/util/List;

    iget v2, p0, Lz/j1;->c:I

    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {v0, v1, v2, p1}, Lz/g1$d;->b(Lz/g1$d;Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lne/x;

    move-result-object p1

    return-object p1
.end method
