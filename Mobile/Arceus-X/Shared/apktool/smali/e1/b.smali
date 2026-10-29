.class public final synthetic Le1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Le1/c;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lcom/google/mlkit/vision/interfaces/Detector;

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Landroidx/camera/core/d;

.field public final synthetic f:I

.field public final synthetic g:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Le1/c;Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/d;ILandroid/graphics/Matrix;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/b;->a:Le1/c;

    iput-object p2, p0, Le1/b;->b:Ljava/util/Map;

    iput-object p3, p0, Le1/b;->c:Lcom/google/mlkit/vision/interfaces/Detector;

    iput-object p4, p0, Le1/b;->d:Ljava/util/Map;

    iput-object p5, p0, Le1/b;->e:Landroidx/camera/core/d;

    iput p6, p0, Le1/b;->f:I

    iput-object p7, p0, Le1/b;->g:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 8

    iget-object v0, p0, Le1/b;->a:Le1/c;

    iget-object v1, p0, Le1/b;->b:Ljava/util/Map;

    iget-object v2, p0, Le1/b;->c:Lcom/google/mlkit/vision/interfaces/Detector;

    iget-object v3, p0, Le1/b;->d:Ljava/util/Map;

    iget-object v4, p0, Le1/b;->e:Landroidx/camera/core/d;

    iget v5, p0, Le1/b;->f:I

    iget-object v6, p0, Le1/b;->g:Landroid/graphics/Matrix;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Le1/c;->a(Le1/c;Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/d;ILandroid/graphics/Matrix;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
