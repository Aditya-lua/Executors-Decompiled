.class public final Ll9/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ll9/f$a;->a:I

    iput v0, p0, Ll9/f$a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Ll9/f$a;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll9/f$a;->d:Z

    return-void
.end method


# virtual methods
.method public a()Ll9/f;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ll9/f;

    iget v1, p0, Ll9/f$a;->a:I

    iget v2, p0, Ll9/f$a;->b:I

    iget v3, p0, Ll9/f$a;->c:I

    iget-boolean v4, p0, Ll9/f$a;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Ll9/f;-><init>(IIIZ)V

    return-object v0
.end method

.method public b(I)Ll9/f$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Ll9/f$a;->a:I

    return-object p0
.end method

.method public c(I)Ll9/f$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Ll9/f$a;->b:I

    return-object p0
.end method

.method public d(Z)Ll9/f$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Ll9/f$a;->d:Z

    return-object p0
.end method

.method public e(I)Ll9/f$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Ll9/f$a;->c:I

    return-object p0
.end method
