.class public Lo5/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lw1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Lo5/e0;->a:Lw1/a;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo5/e0;->b:Landroid/util/SparseArray;

    new-instance v0, Lw1/g;

    invoke-direct {v0}, Lw1/g;-><init>()V

    iput-object v0, p0, Lo5/e0;->c:Lw1/g;

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Lo5/e0;->d:Lw1/a;

    return-void
.end method
