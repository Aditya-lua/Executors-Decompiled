.class public final La9/a$b;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$b$a;
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
            "La9/a$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/r;

    invoke-direct {v0}, La9/r;-><init>()V

    sput-object v0, La9/a$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Z)V
    .locals 2

    invoke-direct {p0}, Lp9/a;-><init>()V

    const/4 v0, 0x1

    if-eqz p4, :cond_1

    if-nez p7, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    const-string v1, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups."

    invoke-static {v0, v1}, Lo9/s;->b(ZLjava/lang/Object;)V

    iput-boolean p1, p0, La9/a$b;->f:Z

    if-eqz p1, :cond_2

    const-string p1, "serverClientId must be provided if Google ID tokens are requested"

    invoke-static {p2, p1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iput-object p2, p0, La9/a$b;->g:Ljava/lang/String;

    iput-object p3, p0, La9/a$b;->h:Ljava/lang/String;

    iput-boolean p4, p0, La9/a$b;->i:Z

    sget-object p1, La9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 p1, 0x0

    if-eqz p6, :cond_4

    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_4
    :goto_1
    iput-object p1, p0, La9/a$b;->k:Ljava/util/List;

    iput-object p5, p0, La9/a$b;->j:Ljava/lang/String;

    iput-boolean p7, p0, La9/a$b;->l:Z

    return-void
.end method

.method public static A3()La9/a$b$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/a$b$a;

    invoke-direct {v0}, La9/a$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B3()Z
    .locals 1

    iget-boolean v0, p0, La9/a$b;->i:Z

    return v0
.end method

.method public C3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La9/a$b;->k:Ljava/util/List;

    return-object v0
.end method

.method public D3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/a$b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public E3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/a$b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public F3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/a$b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public G3()Z
    .locals 1

    iget-boolean v0, p0, La9/a$b;->f:Z

    return v0
.end method

.method public H3()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, La9/a$b;->l:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, La9/a$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, La9/a$b;

    iget-boolean v0, p0, La9/a$b;->f:Z

    iget-boolean v2, p1, La9/a$b;->f:Z

    if-ne v0, v2, :cond_1

    iget-object v0, p0, La9/a$b;->g:Ljava/lang/String;

    iget-object v2, p1, La9/a$b;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a$b;->h:Ljava/lang/String;

    iget-object v2, p1, La9/a$b;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La9/a$b;->i:Z

    iget-boolean v2, p1, La9/a$b;->i:Z

    if-ne v0, v2, :cond_1

    iget-object v0, p0, La9/a$b;->j:Ljava/lang/String;

    iget-object v2, p1, La9/a$b;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/a$b;->k:Ljava/util/List;

    iget-object v2, p1, La9/a$b;->k:Ljava/util/List;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La9/a$b;->l:Z

    iget-boolean p1, p1, La9/a$b;->l:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 8

    iget-boolean v0, p0, La9/a$b;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, La9/a$b;->g:Ljava/lang/String;

    iget-object v3, p0, La9/a$b;->h:Ljava/lang/String;

    iget-boolean v0, p0, La9/a$b;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-object v5, p0, La9/a$b;->j:Ljava/lang/String;

    iget-object v6, p0, La9/a$b;->k:Ljava/util/List;

    iget-boolean v0, p0, La9/a$b;->l:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, La9/a$b;->G3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, La9/a$b;->F3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, La9/a$b;->E3()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    invoke-virtual {p0}, La9/a$b;->B3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x5

    invoke-virtual {p0}, La9/a$b;->D3()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x6

    invoke-virtual {p0}, La9/a$b;->C3()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->x(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v0, 0x7

    invoke-virtual {p0}, La9/a$b;->H3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
