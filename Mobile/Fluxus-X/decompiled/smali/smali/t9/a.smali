.class public Lt9/a;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt9/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Ljava/util/Comparator;


# instance fields
.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt9/f;

    invoke-direct {v0}, Lt9/f;-><init>()V

    sput-object v0, Lt9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Lt9/e;->a:Lt9/e;

    sput-object v0, Lt9/a;->j:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lp9/a;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lt9/a;->f:Ljava/util/List;

    iput-boolean p2, p0, Lt9/a;->g:Z

    iput-object p3, p0, Lt9/a;->h:Ljava/lang/String;

    iput-object p4, p0, Lt9/a;->i:Ljava/lang/String;

    return-void
.end method

.method public static B3(Ljava/util/List;Z)Lt9/a;
    .locals 2

    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Lt9/a;->j:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/j;

    invoke-interface {v1}, Ll9/j;->getOptionalFeatures()[Lk9/d;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lt9/a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v0, 0x0

    invoke-direct {p0, v1, p1, v0, v0}, Lt9/a;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static a(Ls9/f;)Lt9/a;
    .locals 1
    .param p0    # Ls9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ls9/f;->a()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lt9/a;->B3(Ljava/util/List;Z)Lt9/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A3()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk9/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt9/a;->f:Ljava/util/List;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt9/a;

    if-nez v1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lt9/a;

    iget-boolean v1, p0, Lt9/a;->g:Z

    iget-boolean v2, p1, Lt9/a;->g:Z

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lt9/a;->f:Ljava/util/List;

    iget-object v2, p1, Lt9/a;->f:Ljava/util/List;

    invoke-static {v1, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt9/a;->h:Ljava/lang/String;

    iget-object v2, p1, Lt9/a;->h:Ljava/lang/String;

    invoke-static {v1, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt9/a;->i:Ljava/lang/String;

    iget-object p1, p1, Lt9/a;->i:Ljava/lang/String;

    invoke-static {v1, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lt9/a;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt9/a;->f:Ljava/util/List;

    iget-object v2, p0, Lt9/a;->h:Ljava/lang/String;

    iget-object v3, p0, Lt9/a;->i:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lt9/a;->A3()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lt9/a;->g:Z

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    iget-object v1, p0, Lt9/a;->h:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lt9/a;->i:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
