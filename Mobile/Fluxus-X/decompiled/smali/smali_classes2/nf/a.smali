.class public final Lnf/a;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnf/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lnf/a;

.field public static final h:Lnf/a;

.field public static final i:Lnf/a;


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnf/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnf/a;-><init>(I)V

    sput-object v0, Lnf/a;->g:Lnf/a;

    new-instance v0, Lnf/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lnf/a;-><init>(I)V

    sput-object v0, Lnf/a;->h:Lnf/a;

    new-instance v0, Lnf/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lnf/a;-><init>(I)V

    sput-object v0, Lnf/a;->i:Lnf/a;

    new-instance v0, Lnf/b;

    invoke-direct {v0}, Lnf/b;-><init>()V

    sput-object v0, Lnf/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lnf/a;->f:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lnf/a;->f:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
