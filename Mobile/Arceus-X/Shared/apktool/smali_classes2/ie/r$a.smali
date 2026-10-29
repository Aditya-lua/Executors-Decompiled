.class public abstract Lie/r$a;
.super Lie/r$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lie/r$b<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lie/r$b;-><init>()V

    const-string v0, "initialCapacity"

    invoke-static {p1, v0}, Lie/g;->b(ILjava/lang/String;)I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lie/r$a;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lie/r$a;->b:I

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)Lie/r$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lie/r$a<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lie/r$a;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lie/r$a;->g(I)V

    iget-object v0, p0, Lie/r$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lie/r$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lie/r$a;->b:I

    aput-object p1, v0, v1

    return-object p0
.end method

.method public varargs e([Ljava/lang/Object;)Lie/r$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lie/r$b<",
            "TE;>;"
        }
    .end annotation

    array-length v0, p1

    invoke-virtual {p0, p1, v0}, Lie/r$a;->f([Ljava/lang/Object;I)V

    return-object p0
.end method

.method public final f([Ljava/lang/Object;I)V
    .locals 3

    invoke-static {p1, p2}, Lie/l0;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    iget v0, p0, Lie/r$a;->b:I

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Lie/r$a;->g(I)V

    iget-object v0, p0, Lie/r$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lie/r$a;->b:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lie/r$a;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lie/r$a;->b:I

    return-void
.end method

.method public final g(I)V
    .locals 3

    iget-object v0, p0, Lie/r$a;->a:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    invoke-static {v1, p1}, Lie/r$b;->c(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lie/r$a;->a:[Ljava/lang/Object;

    iput-boolean v2, p0, Lie/r$a;->c:Z

    return-void

    :cond_0
    iget-boolean p1, p0, Lie/r$a;->c:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lie/r$a;->a:[Ljava/lang/Object;

    iput-boolean v2, p0, Lie/r$a;->c:Z

    :cond_1
    return-void
.end method
