.class public abstract Lhi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhi/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lhi/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:F


# direct methods
.method public constructor <init>(IIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhi/a;->a:I

    iput p2, p0, Lhi/a;->c:I

    iput p3, p0, Lhi/a;->d:F

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget v0, p0, Lhi/a;->b:I

    iget v1, p0, Lhi/a;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lhi/a;->a:I

    return v0
.end method

.method public retry()V
    .locals 2

    iget v0, p0, Lhi/a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lhi/a;->b:I

    iget v0, p0, Lhi/a;->a:I

    int-to-float v0, v0

    iget v1, p0, Lhi/a;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lhi/a;->a:I

    return-void
.end method
