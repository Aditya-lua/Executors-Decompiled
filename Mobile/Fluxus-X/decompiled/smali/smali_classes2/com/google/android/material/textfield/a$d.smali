.class public Lcom/google/android/material/textfield/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lmd/r;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/material/textfield/a;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/a;Lq/b1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/a$d;->a:Landroid/util/SparseArray;

    iput-object p1, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    sget p1, Ljc/k;->Y6:I

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lq/b1;->n(II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/a$d;->c:I

    sget p1, Ljc/k;->w7:I

    invoke-virtual {p2, p1, v0}, Lq/b1;->n(II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/a$d;->d:I

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/textfield/a$d;)I
    .locals 0

    iget p0, p0, Lcom/google/android/material/textfield/a$d;->c:I

    return p0
.end method


# virtual methods
.method public final b(I)Lmd/r;
    .locals 3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_4

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    new-instance p1, Lmd/p;

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    invoke-direct {p1, v0}, Lmd/p;-><init>(Lcom/google/android/material/textfield/a;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid end icon mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Lmd/f;

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    invoke-direct {p1, v0}, Lmd/f;-><init>(Lcom/google/android/material/textfield/a;)V

    return-object p1

    :cond_2
    new-instance p1, Lmd/w;

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    iget v1, p0, Lcom/google/android/material/textfield/a$d;->d:I

    invoke-direct {p1, v0, v1}, Lmd/w;-><init>(Lcom/google/android/material/textfield/a;I)V

    return-object p1

    :cond_3
    new-instance p1, Lmd/u;

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    invoke-direct {p1, v0}, Lmd/u;-><init>(Lcom/google/android/material/textfield/a;)V

    return-object p1

    :cond_4
    new-instance p1, Lmd/g;

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->b:Lcom/google/android/material/textfield/a;

    invoke-direct {p1, v0}, Lmd/g;-><init>(Lcom/google/android/material/textfield/a;)V

    return-object p1
.end method

.method public c(I)Lmd/r;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/a$d;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmd/r;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/a$d;->b(I)Lmd/r;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/textfield/a$d;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    return-object v0
.end method
