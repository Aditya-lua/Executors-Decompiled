.class public final Lga/w;
.super Lga/a;
.source "SourceFile"


# instance fields
.field public final a:Lsb/k;


# direct methods
.method public constructor <init>(Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Lga/a;-><init>()V

    iput-object p1, p0, Lga/w;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public final z0(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->y3()I

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lga/w;->a:Lsb/k;

    invoke-static {v1, v0}, Lda/f;->b(Lsb/k;I)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    return-void

    :cond_1
    :goto_0
    new-instance v2, Lea/a;

    invoke-direct {v2, p1}, Lea/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    if-ne v0, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Lga/w;->a:Lsb/k;

    new-instance v1, Lda/b;

    invoke-direct {v1, v2, p1}, Lda/b;-><init>(Ljava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
