.class public final Lo9/r0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/r0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Landroid/accounts/Account;

.field public final h:I

.field public final i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/s0;

    invoke-direct {v0}, Lo9/s0;-><init>()V

    sput-object v0, Lo9/r0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lo9/r0;->f:I

    iput-object p2, p0, Lo9/r0;->g:Landroid/accounts/Account;

    iput p3, p0, Lo9/r0;->h:I

    iput-object p4, p0, Lo9/r0;->i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-void
.end method

.method public constructor <init>(Landroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 1

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1, p2, p3}, Lo9/r0;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, Lo9/r0;->f:I

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lo9/r0;->g:Landroid/accounts/Account;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x3

    iget v2, p0, Lo9/r0;->h:I

    invoke-static {p1, v0, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget-object v2, p0, Lo9/r0;->i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-static {p1, v0, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
