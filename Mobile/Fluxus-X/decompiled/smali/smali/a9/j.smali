.class public final La9/j;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La9/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/net/Uri;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Lda/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/x;

    invoke-direct {v0}, La9/x;-><init>()V

    sput-object v0, La9/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lda/q;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, La9/j;->f:Ljava/lang/String;

    iput-object p2, p0, La9/j;->g:Ljava/lang/String;

    iput-object p3, p0, La9/j;->h:Ljava/lang/String;

    iput-object p4, p0, La9/j;->i:Ljava/lang/String;

    iput-object p5, p0, La9/j;->j:Landroid/net/Uri;

    iput-object p6, p0, La9/j;->k:Ljava/lang/String;

    iput-object p7, p0, La9/j;->l:Ljava/lang/String;

    iput-object p8, p0, La9/j;->m:Ljava/lang/String;

    iput-object p9, p0, La9/j;->n:Lda/q;

    return-void
.end method


# virtual methods
.method public A3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/j;->i:Ljava/lang/String;

    return-object v0
.end method

.method public B3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/j;->h:Ljava/lang/String;

    return-object v0
.end method

.method public C3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/j;->l:Ljava/lang/String;

    return-object v0
.end method

.method public D3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/j;->f:Ljava/lang/String;

    return-object v0
.end method

.method public E3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/j;->k:Ljava/lang/String;

    return-object v0
.end method

.method public F3()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La9/j;->m:Ljava/lang/String;

    return-object v0
.end method

.method public G3()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, La9/j;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public H3()Lda/q;
    .locals 1

    iget-object v0, p0, La9/j;->n:Lda/q;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, La9/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, La9/j;

    iget-object v0, p0, La9/j;->f:Ljava/lang/String;

    iget-object v2, p1, La9/j;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->g:Ljava/lang/String;

    iget-object v2, p1, La9/j;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->h:Ljava/lang/String;

    iget-object v2, p1, La9/j;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->i:Ljava/lang/String;

    iget-object v2, p1, La9/j;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->j:Landroid/net/Uri;

    iget-object v2, p1, La9/j;->j:Landroid/net/Uri;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->k:Ljava/lang/String;

    iget-object v2, p1, La9/j;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->l:Ljava/lang/String;

    iget-object v2, p1, La9/j;->l:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->m:Ljava/lang/String;

    iget-object v2, p1, La9/j;->m:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/j;->n:Lda/q;

    iget-object p1, p1, La9/j;->n:Lda/q;

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 9

    iget-object v0, p0, La9/j;->f:Ljava/lang/String;

    iget-object v1, p0, La9/j;->g:Ljava/lang/String;

    iget-object v2, p0, La9/j;->h:Ljava/lang/String;

    iget-object v3, p0, La9/j;->i:Ljava/lang/String;

    iget-object v4, p0, La9/j;->j:Landroid/net/Uri;

    iget-object v5, p0, La9/j;->k:Ljava/lang/String;

    iget-object v6, p0, La9/j;->l:Ljava/lang/String;

    iget-object v7, p0, La9/j;->m:Ljava/lang/String;

    iget-object v8, p0, La9/j;->n:Lda/q;

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/j;->g:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, La9/j;->D3()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, La9/j;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0}, La9/j;->B3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, La9/j;->A3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x5

    invoke-virtual {p0}, La9/j;->G3()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    invoke-virtual {p0}, La9/j;->E3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x7

    invoke-virtual {p0}, La9/j;->C3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x8

    invoke-virtual {p0}, La9/j;->F3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x9

    invoke-virtual {p0}, La9/j;->H3()Lda/q;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
