.class public final Lnf/g;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnf/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:[Lcom/google/firebase/appindexing/internal/Thing;

.field public final h:[Ljava/lang/String;

.field public final i:[Ljava/lang/String;

.field public final j:Lwa/f0;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnf/h;

    invoke-direct {v0}, Lnf/h;-><init>()V

    sput-object v0, Lnf/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lwa/f0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lp9/a;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lnf/g;->f:I

    iput-object p2, p0, Lnf/g;->g:[Lcom/google/firebase/appindexing/internal/Thing;

    iput-object p3, p0, Lnf/g;->h:[Ljava/lang/String;

    iput-object p4, p0, Lnf/g;->i:[Ljava/lang/String;

    iput-object p5, p0, Lnf/g;->j:Lwa/f0;

    iput-object p6, p0, Lnf/g;->k:Ljava/lang/String;

    iput-object p7, p0, Lnf/g;->l:Ljava/lang/String;

    return-void
.end method

.method public static A3()Lnf/g;
    .locals 8

    new-instance v0, Lnf/g;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lnf/g;-><init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lwa/f0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs B3([Lcom/google/firebase/appindexing/internal/Thing;)Lnf/g;
    .locals 8

    new-instance v0, Lnf/g;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lnf/g;-><init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lwa/f0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lnf/g;->f:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lnf/g;->g:[Lcom/google/firebase/appindexing/internal/Thing;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lnf/g;->h:[Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->w(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 v1, 0x5

    iget-object v2, p0, Lnf/g;->i:[Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->w(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 v1, 0x6

    iget-object v2, p0, Lnf/g;->j:Lwa/f0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x7

    iget-object v1, p0, Lnf/g;->k:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget-object v1, p0, Lnf/g;->l:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
