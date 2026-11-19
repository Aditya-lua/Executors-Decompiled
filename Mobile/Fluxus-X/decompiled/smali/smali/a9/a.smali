.class public final La9/a;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$a;,
        La9/a$e;,
        La9/a$b;,
        La9/a$d;,
        La9/a$c;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La9/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:La9/a$e;

.field public final g:La9/a$b;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:I

.field public final k:La9/a$d;

.field public final l:La9/a$c;

.field public final m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/l;

    invoke-direct {v0}, La9/l;-><init>()V

    sput-object v0, La9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(La9/a$e;La9/a$b;Ljava/lang/String;ZILa9/a$d;La9/a$c;Z)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$e;

    iput-object p1, p0, La9/a;->f:La9/a$e;

    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$b;

    iput-object p1, p0, La9/a;->g:La9/a$b;

    iput-object p3, p0, La9/a;->h:Ljava/lang/String;

    iput-boolean p4, p0, La9/a;->i:Z

    iput p5, p0, La9/a;->j:I

    const/4 p1, 0x0

    if-nez p6, :cond_0

    invoke-static {}, La9/a$d;->A3()La9/a$d$a;

    move-result-object p2

    invoke-virtual {p2, p1}, La9/a$d$a;->d(Z)La9/a$d$a;

    invoke-virtual {p2}, La9/a$d$a;->a()La9/a$d;

    move-result-object p6

    :cond_0
    iput-object p6, p0, La9/a;->k:La9/a$d;

    if-nez p7, :cond_1

    invoke-static {}, La9/a$c;->A3()La9/a$c$a;

    move-result-object p2

    invoke-virtual {p2, p1}, La9/a$c$a;->c(Z)La9/a$c$a;

    invoke-virtual {p2}, La9/a$c$a;->a()La9/a$c;

    move-result-object p7

    :cond_1
    iput-object p7, p0, La9/a;->l:La9/a$c;

    iput-boolean p8, p0, La9/a;->m:Z

    return-void
.end method

.method public static A3()La9/a$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/a$a;

    invoke-direct {v0}, La9/a$a;-><init>()V

    return-object v0
.end method

.method public static H3(La9/a;)La9/a$a;
    .locals 2
    .param p0    # La9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, La9/a;->A3()La9/a$a;

    move-result-object v0

    invoke-virtual {p0}, La9/a;->B3()La9/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$a;->c(La9/a$b;)La9/a$a;

    invoke-virtual {p0}, La9/a;->E3()La9/a$e;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$a;->f(La9/a$e;)La9/a$a;

    invoke-virtual {p0}, La9/a;->D3()La9/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$a;->e(La9/a$d;)La9/a$a;

    invoke-virtual {p0}, La9/a;->C3()La9/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$a;->d(La9/a$c;)La9/a$a;

    iget-boolean v1, p0, La9/a;->i:Z

    invoke-virtual {v0, v1}, La9/a$a;->b(Z)La9/a$a;

    iget v1, p0, La9/a;->j:I

    invoke-virtual {v0, v1}, La9/a$a;->i(I)La9/a$a;

    iget-boolean v1, p0, La9/a;->m:Z

    invoke-virtual {v0, v1}, La9/a$a;->g(Z)La9/a$a;

    iget-object p0, p0, La9/a;->h:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, La9/a$a;->h(Ljava/lang/String;)La9/a$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public B3()La9/a$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/a;->g:La9/a$b;

    return-object v0
.end method

.method public C3()La9/a$c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/a;->l:La9/a$c;

    return-object v0
.end method

.method public D3()La9/a$d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/a;->k:La9/a$d;

    return-object v0
.end method

.method public E3()La9/a$e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/a;->f:La9/a$e;

    return-object v0
.end method

.method public F3()Z
    .locals 1

    iget-boolean v0, p0, La9/a;->m:Z

    return v0
.end method

.method public G3()Z
    .locals 1

    iget-boolean v0, p0, La9/a;->i:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, La9/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, La9/a;

    iget-object v0, p0, La9/a;->f:La9/a$e;

    iget-object v2, p1, La9/a;->f:La9/a$e;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a;->g:La9/a$b;

    iget-object v2, p1, La9/a;->g:La9/a$b;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a;->k:La9/a$d;

    iget-object v2, p1, La9/a;->k:La9/a$d;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a;->l:La9/a$c;

    iget-object v2, p1, La9/a;->l:La9/a$c;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a;->h:Ljava/lang/String;

    iget-object v2, p1, La9/a;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La9/a;->i:Z

    iget-boolean v2, p1, La9/a;->i:Z

    if-ne v0, v2, :cond_1

    iget v0, p0, La9/a;->j:I

    iget v2, p1, La9/a;->j:I

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, La9/a;->m:Z

    iget-boolean p1, p1, La9/a;->m:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 8

    iget-object v0, p0, La9/a;->f:La9/a$e;

    iget-object v1, p0, La9/a;->g:La9/a$b;

    iget-object v2, p0, La9/a;->k:La9/a$d;

    iget-object v3, p0, La9/a;->l:La9/a$c;

    iget-object v4, p0, La9/a;->h:Ljava/lang/String;

    iget-boolean v5, p0, La9/a;->i:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget v6, p0, La9/a;->j:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-boolean v7, p0, La9/a;->m:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, La9/a;->E3()La9/a$e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, La9/a;->B3()La9/a$b;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, La9/a;->h:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, La9/a;->G3()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x5

    iget v2, p0, La9/a;->j:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x6

    invoke-virtual {p0}, La9/a;->D3()La9/a$d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    invoke-virtual {p0}, La9/a;->C3()La9/a$c;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0x8

    invoke-virtual {p0}, La9/a;->F3()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
