.class public Lfb/g1;
.super Lfb/h1;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lfb/h1;-><init>()V

    const-string v0, "initialCapacity"

    invoke-static {p1, v0}, Lfb/f1;->a(ILjava/lang/String;)I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lfb/g1;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lfb/g1;->b:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lfb/g1;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lfb/g1;->c(I)V

    iget-object v0, p0, Lfb/g1;->a:[Ljava/lang/Object;

    iget v1, p0, Lfb/g1;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lfb/g1;->b:I

    aput-object p1, v0, v1

    return-object p0
.end method

.method public final c(I)V
    .locals 2

    iget-object v0, p0, Lfb/g1;->a:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lfb/g1;->b:I

    add-int/2addr v1, p1

    invoke-static {v0, v1}, Lfb/h1;->a(II)I

    move-result p1

    if-gt p1, v0, :cond_1

    iget-boolean v0, p0, Lfb/g1;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lfb/g1;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfb/g1;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lfb/g1;->c:Z

    return-void
.end method
