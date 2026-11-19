.class public Ls9/h;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/h$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls9/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/Long;

.field public final i:Ljava/lang/Long;

.field public final j:I

.field public final k:Ls9/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/m;

    invoke-direct {v0}, Ls9/m;-><init>()V

    sput-object v0, Ls9/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/Long;Ljava/lang/Long;I)V
    .locals 2

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Ls9/h;->f:I

    iput p2, p0, Ls9/h;->g:I

    iput-object p3, p0, Ls9/h;->h:Ljava/lang/Long;

    iput-object p4, p0, Ls9/h;->i:Ljava/lang/Long;

    iput p5, p0, Ls9/h;->j:I

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    new-instance p1, Ls9/h$a;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    invoke-direct {p1, p2, p3, p4, p5}, Ls9/h$a;-><init>(JJ)V

    :goto_0
    iput-object p1, p0, Ls9/h;->k:Ls9/h$a;

    return-void

    :cond_0
    const/4 p1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public A3()I
    .locals 1

    iget v0, p0, Ls9/h;->j:I

    return v0
.end method

.method public B3()I
    .locals 1

    iget v0, p0, Ls9/h;->g:I

    return v0
.end method

.method public C3()I
    .locals 1

    iget v0, p0, Ls9/h;->f:I

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

    invoke-virtual {p0}, Ls9/h;->C3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Ls9/h;->B3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v0, p0, Ls9/h;->h:Ljava/lang/Long;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->s(Landroid/os/Parcel;ILjava/lang/Long;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Ls9/h;->i:Ljava/lang/Long;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->s(Landroid/os/Parcel;ILjava/lang/Long;Z)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Ls9/h;->A3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
