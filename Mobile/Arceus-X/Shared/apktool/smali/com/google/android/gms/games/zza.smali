.class public final Lcom/google/android/gms/games/zza;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/games/CurrentPlayerInfo;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/zza;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/i;

    invoke-direct {v0}, Lda/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/zza;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/zza;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/CurrentPlayerInfo;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/games/CurrentPlayerInfo;->B1()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/games/zza;->f:I

    return-void
.end method

.method public static a(Lcom/google/android/gms/games/CurrentPlayerInfo;)I
    .locals 0

    invoke-interface {p0}, Lcom/google/android/gms/games/CurrentPlayerInfo;->B1()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static v3(Lcom/google/android/gms/games/CurrentPlayerInfo;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/games/CurrentPlayerInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/games/CurrentPlayerInfo;

    invoke-interface {p1}, Lcom/google/android/gms/games/CurrentPlayerInfo;->B1()I

    move-result p1

    invoke-interface {p0}, Lcom/google/android/gms/games/CurrentPlayerInfo;->B1()I

    move-result p0

    if-ne p1, p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static w3(Lcom/google/android/gms/games/CurrentPlayerInfo;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/CurrentPlayerInfo;->B1()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "FriendsListVisibilityStatus"

    invoke-virtual {v0, v1, p0}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B1()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/zza;->f:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/zza;->v3(Lcom/google/android/gms/games/CurrentPlayerInfo;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic freeze()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/zza;->a(Lcom/google/android/gms/games/CurrentPlayerInfo;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/zza;->w3(Lcom/google/android/gms/games/CurrentPlayerInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lda/i;->a(Lcom/google/android/gms/games/zza;Landroid/os/Parcel;I)V

    return-void
.end method
