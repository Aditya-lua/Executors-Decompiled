.class public Lv4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv4/d;

.field public final b:I

.field public final c:[B

.field public final d:Z


# direct methods
.method public constructor <init>(Lv4/d;I[BZ)V
    .locals 0
    .param p1    # Lv4/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/k;->a:Lv4/d;

    iput p2, p0, Lv4/k;->b:I

    iput-object p3, p0, Lv4/k;->c:[B

    iput-boolean p4, p0, Lv4/k;->d:Z

    return-void
.end method
