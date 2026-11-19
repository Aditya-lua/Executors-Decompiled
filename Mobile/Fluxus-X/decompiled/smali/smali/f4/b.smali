.class public final Lf4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lf4/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[I

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:[I

.field public final d:[I

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/CharSequence;

.field public final j:I

.field public final k:Ljava/lang/CharSequence;

.field public final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/b$a;

    invoke-direct {v0}, Lf4/b$a;-><init>()V

    sput-object v0, Lf4/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lf4/b;->a:[I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lf4/b;->b:Ljava/util/ArrayList;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lf4/b;->c:[I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lf4/b;->d:[I

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lf4/b;->e:I

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf4/b;->f:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lf4/b;->g:I

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lf4/b;->h:I

    .line 38
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    iput-object v1, p0, Lf4/b;->i:Ljava/lang/CharSequence;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lf4/b;->j:I

    .line 40
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lf4/b;->k:Ljava/lang/CharSequence;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lf4/b;->l:Ljava/util/ArrayList;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lf4/b;->m:Ljava/util/ArrayList;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lf4/b;->n:Z

    return-void
.end method

.method public constructor <init>(Lf4/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lf4/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x6

    .line 3
    new-array v1, v1, [I

    iput-object v1, p0, Lf4/b;->a:[I

    .line 4
    iget-boolean v1, p1, Lf4/t0;->i:Z

    if-eqz v1, :cond_2

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lf4/b;->b:Ljava/util/ArrayList;

    .line 6
    new-array v1, v0, [I

    iput-object v1, p0, Lf4/b;->c:[I

    .line 7
    new-array v1, v0, [I

    iput-object v1, p0, Lf4/b;->d:[I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    iget-object v3, p1, Lf4/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/t0$a;

    .line 9
    iget-object v4, p0, Lf4/b;->a:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v3, Lf4/t0$a;->a:I

    aput v6, v4, v2

    .line 10
    iget-object v4, p0, Lf4/b;->b:Ljava/util/ArrayList;

    iget-object v6, v3, Lf4/t0$a;->b:Lf4/q;

    if-eqz v6, :cond_0

    iget-object v6, v6, Lf4/q;->f:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v4, p0, Lf4/b;->a:[I

    add-int/lit8 v6, v2, 0x2

    iget-boolean v7, v3, Lf4/t0$a;->c:Z

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x3

    .line 12
    iget v7, v3, Lf4/t0$a;->d:I

    aput v7, v4, v6

    add-int/lit8 v6, v2, 0x4

    .line 13
    iget v7, v3, Lf4/t0$a;->e:I

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x5

    .line 14
    iget v7, v3, Lf4/t0$a;->f:I

    aput v7, v4, v6

    add-int/lit8 v2, v2, 0x6

    .line 15
    iget v6, v3, Lf4/t0$a;->g:I

    aput v6, v4, v5

    .line 16
    iget-object v4, p0, Lf4/b;->c:[I

    iget-object v5, v3, Lf4/t0$a;->h:Landroidx/lifecycle/l$b;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v5, v4, v1

    .line 17
    iget-object v4, p0, Lf4/b;->d:[I

    iget-object v3, v3, Lf4/t0$a;->i:Landroidx/lifecycle/l$b;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_1
    iget v0, p1, Lf4/t0;->h:I

    iput v0, p0, Lf4/b;->e:I

    .line 19
    iget-object v0, p1, Lf4/t0;->k:Ljava/lang/String;

    iput-object v0, p0, Lf4/b;->f:Ljava/lang/String;

    .line 20
    iget v0, p1, Lf4/a;->v:I

    iput v0, p0, Lf4/b;->g:I

    .line 21
    iget v0, p1, Lf4/t0;->l:I

    iput v0, p0, Lf4/b;->h:I

    .line 22
    iget-object v0, p1, Lf4/t0;->m:Ljava/lang/CharSequence;

    iput-object v0, p0, Lf4/b;->i:Ljava/lang/CharSequence;

    .line 23
    iget v0, p1, Lf4/t0;->n:I

    iput v0, p0, Lf4/b;->j:I

    .line 24
    iget-object v0, p1, Lf4/t0;->o:Ljava/lang/CharSequence;

    iput-object v0, p0, Lf4/b;->k:Ljava/lang/CharSequence;

    .line 25
    iget-object v0, p1, Lf4/t0;->p:Ljava/util/ArrayList;

    iput-object v0, p0, Lf4/b;->l:Ljava/util/ArrayList;

    .line 26
    iget-object v0, p1, Lf4/t0;->q:Ljava/util/ArrayList;

    iput-object v0, p0, Lf4/b;->m:Ljava/util/ArrayList;

    .line 27
    iget-boolean p1, p1, Lf4/t0;->r:Z

    iput-boolean p1, p0, Lf4/b;->n:Z

    return-void

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not on back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lf4/a;)V
    .locals 9
    .param p1    # Lf4/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lf4/b;->a:[I

    array-length v3, v3

    const/4 v4, 0x1

    if-ge v1, v3, :cond_2

    new-instance v3, Lf4/t0$a;

    invoke-direct {v3}, Lf4/t0$a;-><init>()V

    iget-object v5, p0, Lf4/b;->a:[I

    add-int/lit8 v6, v1, 0x1

    aget v5, v5, v1

    iput v5, v3, Lf4/t0$a;->a:I

    const/4 v5, 0x2

    invoke-static {v5}, Lf4/k0;->N0(I)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Instantiate "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " op #"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " base fragment #"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lf4/b;->a:[I

    aget v7, v7, v6

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "FragmentManager"

    invoke-static {v7, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {}, Landroidx/lifecycle/l$b;->values()[Landroidx/lifecycle/l$b;

    move-result-object v5

    iget-object v7, p0, Lf4/b;->c:[I

    aget v7, v7, v2

    aget-object v5, v5, v7

    iput-object v5, v3, Lf4/t0$a;->h:Landroidx/lifecycle/l$b;

    invoke-static {}, Landroidx/lifecycle/l$b;->values()[Landroidx/lifecycle/l$b;

    move-result-object v5

    iget-object v7, p0, Lf4/b;->d:[I

    aget v7, v7, v2

    aget-object v5, v5, v7

    iput-object v5, v3, Lf4/t0$a;->i:Landroidx/lifecycle/l$b;

    iget-object v5, p0, Lf4/b;->a:[I

    add-int/lit8 v7, v1, 0x2

    aget v6, v5, v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    iput-boolean v4, v3, Lf4/t0$a;->c:Z

    add-int/lit8 v4, v1, 0x3

    aget v6, v5, v7

    iput v6, v3, Lf4/t0$a;->d:I

    add-int/lit8 v7, v1, 0x4

    aget v4, v5, v4

    iput v4, v3, Lf4/t0$a;->e:I

    add-int/lit8 v8, v1, 0x5

    aget v7, v5, v7

    iput v7, v3, Lf4/t0$a;->f:I

    add-int/lit8 v1, v1, 0x6

    aget v5, v5, v8

    iput v5, v3, Lf4/t0$a;->g:I

    iput v6, p1, Lf4/t0;->d:I

    iput v4, p1, Lf4/t0;->e:I

    iput v7, p1, Lf4/t0;->f:I

    iput v5, p1, Lf4/t0;->g:I

    invoke-virtual {p1, v3}, Lf4/t0;->e(Lf4/t0$a;)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_2
    iget v0, p0, Lf4/b;->e:I

    iput v0, p1, Lf4/t0;->h:I

    iget-object v0, p0, Lf4/b;->f:Ljava/lang/String;

    iput-object v0, p1, Lf4/t0;->k:Ljava/lang/String;

    iput-boolean v4, p1, Lf4/t0;->i:Z

    iget v0, p0, Lf4/b;->h:I

    iput v0, p1, Lf4/t0;->l:I

    iget-object v0, p0, Lf4/b;->i:Ljava/lang/CharSequence;

    iput-object v0, p1, Lf4/t0;->m:Ljava/lang/CharSequence;

    iget v0, p0, Lf4/b;->j:I

    iput v0, p1, Lf4/t0;->n:I

    iget-object v0, p0, Lf4/b;->k:Ljava/lang/CharSequence;

    iput-object v0, p1, Lf4/t0;->o:Ljava/lang/CharSequence;

    iget-object v0, p0, Lf4/b;->l:Ljava/util/ArrayList;

    iput-object v0, p1, Lf4/t0;->p:Ljava/util/ArrayList;

    iget-object v0, p0, Lf4/b;->m:Ljava/util/ArrayList;

    iput-object v0, p1, Lf4/t0;->q:Ljava/util/ArrayList;

    iget-boolean v0, p0, Lf4/b;->n:Z

    iput-boolean v0, p1, Lf4/t0;->r:Z

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f(Lf4/k0;)Lf4/a;
    .locals 4
    .param p1    # Lf4/k0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lf4/a;

    invoke-direct {v0, p1}, Lf4/a;-><init>(Lf4/k0;)V

    invoke-virtual {p0, v0}, Lf4/b;->a(Lf4/a;)V

    iget v1, p0, Lf4/b;->g:I

    iput v1, v0, Lf4/a;->v:I

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lf4/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lf4/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v3, v0, Lf4/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/t0$a;

    invoke-virtual {p1, v2}, Lf4/k0;->k0(Ljava/lang/String;)Lf4/q;

    move-result-object v2

    iput-object v2, v3, Lf4/t0$a;->b:Lf4/q;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lf4/a;->u(I)V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Lf4/b;->a:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Lf4/b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lf4/b;->c:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Lf4/b;->d:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget p2, p0, Lf4/b;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lf4/b;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lf4/b;->g:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lf4/b;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lf4/b;->i:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget p2, p0, Lf4/b;->j:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lf4/b;->k:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget-object p2, p0, Lf4/b;->l:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lf4/b;->m:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean p2, p0, Lf4/b;->n:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
