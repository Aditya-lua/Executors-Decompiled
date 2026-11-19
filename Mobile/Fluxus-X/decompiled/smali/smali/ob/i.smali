.class public final Lob/i;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lob/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Lob/bf;

.field public i:J

.field public j:Z

.field public k:Ljava/lang/String;

.field public final l:Lob/i0;

.field public m:J

.field public n:Lob/i0;

.field public final o:J

.field public final p:Lob/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/j;

    invoke-direct {v0}, Lob/j;-><init>()V

    sput-object v0, Lob/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lob/bf;JZLjava/lang/String;Lob/i0;JLob/i0;JLob/i0;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lob/i;->f:Ljava/lang/String;

    iput-object p2, p0, Lob/i;->g:Ljava/lang/String;

    iput-object p3, p0, Lob/i;->h:Lob/bf;

    iput-wide p4, p0, Lob/i;->i:J

    iput-boolean p6, p0, Lob/i;->j:Z

    iput-object p7, p0, Lob/i;->k:Ljava/lang/String;

    iput-object p8, p0, Lob/i;->l:Lob/i0;

    iput-wide p9, p0, Lob/i;->m:J

    iput-object p11, p0, Lob/i;->n:Lob/i0;

    iput-wide p12, p0, Lob/i;->o:J

    iput-object p14, p0, Lob/i;->p:Lob/i0;

    return-void
.end method

.method public constructor <init>(Lob/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    .line 2
    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p1, Lob/i;->f:Ljava/lang/String;

    iput-object v0, p0, Lob/i;->f:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lob/i;->g:Ljava/lang/String;

    iput-object v0, p0, Lob/i;->g:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lob/i;->h:Lob/bf;

    iput-object v0, p0, Lob/i;->h:Lob/bf;

    .line 6
    iget-wide v0, p1, Lob/i;->i:J

    iput-wide v0, p0, Lob/i;->i:J

    .line 7
    iget-boolean v0, p1, Lob/i;->j:Z

    iput-boolean v0, p0, Lob/i;->j:Z

    .line 8
    iget-object v0, p1, Lob/i;->k:Ljava/lang/String;

    iput-object v0, p0, Lob/i;->k:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lob/i;->l:Lob/i0;

    iput-object v0, p0, Lob/i;->l:Lob/i0;

    .line 10
    iget-wide v0, p1, Lob/i;->m:J

    iput-wide v0, p0, Lob/i;->m:J

    .line 11
    iget-object v0, p1, Lob/i;->n:Lob/i0;

    iput-object v0, p0, Lob/i;->n:Lob/i0;

    .line 12
    iget-wide v0, p1, Lob/i;->o:J

    iput-wide v0, p0, Lob/i;->o:J

    .line 13
    iget-object p1, p1, Lob/i;->p:Lob/i0;

    iput-object p1, p0, Lob/i;->p:Lob/i0;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lob/i;->f:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lob/i;->g:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lob/i;->h:Lob/bf;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-wide v4, p0, Lob/i;->i:J

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lob/i;->j:Z

    invoke-static {p1, v1, v2}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lob/i;->k:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x8

    iget-object v2, p0, Lob/i;->l:Lob/i0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-wide v4, p0, Lob/i;->m:J

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lob/i;->n:Lob/i0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-wide v4, p0, Lob/i;->o:J

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lob/i;->p:Lob/i0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
