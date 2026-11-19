.class public final Lo9/t0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/t0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Landroid/os/IBinder;

.field public final h:Lk9/b;

.field public final i:Z

.field public final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/u0;

    invoke-direct {v0}, Lo9/u0;-><init>()V

    sput-object v0, Lo9/t0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lk9/b;ZZ)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lo9/t0;->f:I

    iput-object p2, p0, Lo9/t0;->g:Landroid/os/IBinder;

    iput-object p3, p0, Lo9/t0;->h:Lk9/b;

    iput-boolean p4, p0, Lo9/t0;->i:Z

    iput-boolean p5, p0, Lo9/t0;->j:Z

    return-void
.end method


# virtual methods
.method public final A3()Lk9/b;
    .locals 1

    iget-object v0, p0, Lo9/t0;->h:Lk9/b;

    return-object v0
.end method

.method public final B3()Lo9/l;
    .locals 1

    iget-object v0, p0, Lo9/t0;->g:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lo9/l$a;->s2(Landroid/os/IBinder;)Lo9/l;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lo9/t0;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lo9/t0;

    iget-object v2, p0, Lo9/t0;->h:Lk9/b;

    iget-object v3, p1, Lo9/t0;->h:Lk9/b;

    invoke-virtual {v2, v3}, Lk9/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lo9/t0;->B3()Lo9/l;

    move-result-object v2

    invoke-virtual {p1}, Lo9/t0;->B3()Lo9/l;

    move-result-object p1

    invoke-static {v2, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lo9/t0;->f:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lo9/t0;->g:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lo9/t0;->h:Lk9/b;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-boolean v1, p0, Lo9/t0;->i:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x5

    iget-boolean v1, p0, Lo9/t0;->j:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
