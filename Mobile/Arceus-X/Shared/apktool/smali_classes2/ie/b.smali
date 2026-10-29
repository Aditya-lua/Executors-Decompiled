.class public abstract Lie/b;
.super Lie/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lie/y0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lie/b$b;

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lie/y0;-><init>()V

    sget-object v0, Lie/b$b;->b:Lie/b$b;

    iput-object v0, p0, Lie/b;->a:Lie/b$b;

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lie/b$b;->c:Lie/b$b;

    iput-object v0, p0, Lie/b;->a:Lie/b$b;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Z
    .locals 2

    sget-object v0, Lie/b$b;->d:Lie/b$b;

    iput-object v0, p0, Lie/b;->a:Lie/b$b;

    invoke-virtual {p0}, Lie/b;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lie/b;->b:Ljava/lang/Object;

    iget-object v0, p0, Lie/b;->a:Lie/b$b;

    sget-object v1, Lie/b$b;->c:Lie/b$b;

    if-eq v0, v1, :cond_0

    sget-object v0, Lie/b$b;->a:Lie/b$b;

    iput-object v0, p0, Lie/b;->a:Lie/b$b;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasNext()Z
    .locals 4

    iget-object v0, p0, Lie/b;->a:Lie/b$b;

    sget-object v1, Lie/b$b;->d:Lie/b$b;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lhe/n;->r(Z)V

    sget-object v0, Lie/b$a;->a:[I

    iget-object v1, p0, Lie/b;->a:Lie/b$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v3, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lie/b;->e()Z

    move-result v0

    return v0

    :cond_1
    return v3

    :cond_2
    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lie/b$b;->b:Lie/b$b;

    iput-object v0, p0, Lie/b;->a:Lie/b$b;

    iget-object v0, p0, Lie/b;->b:Ljava/lang/Object;

    invoke-static {v0}, Lie/k0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lie/b;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
