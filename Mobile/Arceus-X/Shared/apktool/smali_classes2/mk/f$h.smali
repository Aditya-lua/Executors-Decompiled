.class public Lmk/f$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmk/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public final synthetic g:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;)V
    .locals 0

    iput-object p1, p0, Lmk/f$h;->g:Lmk/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lmk/f$h;->c:I

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lmk/f$h;->a:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lmk/f$h;->b:F

    return v0
.end method

.method public d(I)V
    .locals 1

    iget v0, p0, Lmk/f$h;->c:I

    iput v0, p0, Lmk/f$h;->f:I

    iput p1, p0, Lmk/f$h;->c:I

    return-void
.end method

.method public e(F)V
    .locals 1

    iget v0, p0, Lmk/f$h;->a:F

    iput v0, p0, Lmk/f$h;->d:F

    iput p1, p0, Lmk/f$h;->a:F

    return-void
.end method

.method public f(F)V
    .locals 1

    iget v0, p0, Lmk/f$h;->b:F

    iput v0, p0, Lmk/f$h;->e:F

    iput p1, p0, Lmk/f$h;->b:F

    return-void
.end method
