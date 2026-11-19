.class public Lao/b;
.super Lho/c;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Lho/c;-><init>()V

    iput p1, p0, Lao/b;->a:I

    iput p2, p0, Lao/b;->b:I

    iput-boolean p3, p0, Lao/b;->c:Z

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, Lao/b;->b:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lao/b;->a:I

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lao/b;->c:Z

    return v0
.end method
