.class public final Lrb/l;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lrb/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Lk9/b;

.field public final h:Lo9/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrb/m;

    invoke-direct {v0}, Lrb/m;-><init>()V

    sput-object v0, Lrb/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILk9/b;Lo9/t0;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lrb/l;->f:I

    iput-object p2, p0, Lrb/l;->g:Lk9/b;

    iput-object p3, p0, Lrb/l;->h:Lo9/t0;

    return-void
.end method


# virtual methods
.method public final A3()Lk9/b;
    .locals 1

    iget-object v0, p0, Lrb/l;->g:Lk9/b;

    return-object v0
.end method

.method public final B3()Lo9/t0;
    .locals 1

    iget-object v0, p0, Lrb/l;->h:Lo9/t0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lrb/l;->f:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lrb/l;->g:Lk9/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lrb/l;->h:Lo9/t0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
