.class public Lu4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu4/d;

.field public final b:I

.field public final c:[B

.field public final d:Z


# direct methods
.method public constructor <init>(Lu4/d;I[BZ)V
    .locals 0
    .param p1    # Lu4/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/k;->a:Lu4/d;

    iput p2, p0, Lu4/k;->b:I

    iput-object p3, p0, Lu4/k;->c:[B

    iput-boolean p4, p0, Lu4/k;->d:Z

    return-void
.end method
