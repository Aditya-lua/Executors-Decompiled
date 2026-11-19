.class public final Lea/m;
.super Lha/p;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lea/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:J

.field public final h:Lea/l;

.field public final i:Lea/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/c0;

    invoke-direct {v0}, Lea/c0;-><init>()V

    sput-object v0, Lea/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJLea/l;Lea/l;)V
    .locals 2
    .param p5    # Lea/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lea/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lha/p;-><init>()V

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lo9/s;->p(Z)V

    invoke-static {p5}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-wide p1, p0, Lea/m;->f:J

    iput-wide p3, p0, Lea/m;->g:J

    iput-object p5, p0, Lea/m;->h:Lea/l;

    iput-object p6, p0, Lea/m;->i:Lea/l;

    return-void
.end method


# virtual methods
.method public A3()Lea/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/m;->h:Lea/l;

    return-object v0
.end method

.method public B3()J
    .locals 2

    iget-wide v0, p0, Lea/m;->f:J

    return-wide v0
.end method

.method public C3()J
    .locals 2

    iget-wide v0, p0, Lea/m;->g:J

    return-wide v0
.end method

.method public D3()Lea/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/m;->i:Lea/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Lea/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lea/m;

    iget-wide v2, p0, Lea/m;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p1, Lea/m;->f:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lea/m;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p1, Lea/m;->g:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lea/m;->h:Lea/l;

    iget-object v3, p1, Lea/m;->h:Lea/l;

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lea/m;->i:Lea/l;

    iget-object p1, p1, Lea/m;->i:Lea/l;

    invoke-static {v2, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lea/m;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Lea/m;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lea/m;->h:Lea/l;

    iget-object v3, p0, Lea/m;->i:Lea/l;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

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

    const/4 v1, 0x1

    invoke-virtual {p0}, Lea/m;->B3()J

    move-result-wide v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lea/m;->C3()J

    move-result-wide v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-virtual {p0}, Lea/m;->A3()Lea/l;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lea/m;->D3()Lea/l;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
