.class public final Lk9/f0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk9/f0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Landroid/content/Context;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/g0;

    invoke-direct {v0}, Lk9/g0;-><init>()V

    sput-object v0, Lk9/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lk9/f0;->f:Ljava/lang/String;

    iput-boolean p2, p0, Lk9/f0;->g:Z

    iput-boolean p3, p0, Lk9/f0;->h:Z

    invoke-static {p4}, Lz9/a$a;->s2(Landroid/os/IBinder;)Lz9/a;

    move-result-object p1

    invoke-static {p1}, Lz9/b;->t2(Lz9/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lk9/f0;->i:Landroid/content/Context;

    iput-boolean p5, p0, Lk9/f0;->j:Z

    iput-boolean p6, p0, Lk9/f0;->k:Z

    iput-boolean p7, p0, Lk9/f0;->l:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lk9/f0;->f:Ljava/lang/String;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget-boolean v1, p0, Lk9/f0;->g:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    iget-boolean v1, p0, Lk9/f0;->h:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, Lk9/f0;->i:Landroid/content/Context;

    invoke-static {p2}, Lz9/b;->u2(Ljava/lang/Object;)Lz9/a;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v2}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x5

    iget-boolean v1, p0, Lk9/f0;->j:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x6

    iget-boolean v1, p0, Lk9/f0;->k:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-boolean v1, p0, Lk9/f0;->l:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
