.class public final Lcom/google/android/gms/games/internal/player/zze;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/internal/player/zze;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lja/c;

    invoke-direct {v0}, Lja/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/player/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    iput-boolean p2, p0, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    iput-boolean p5, p0, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    iput-boolean p6, p0, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    iput-boolean p7, p0, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    iput-boolean p8, p0, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    iput-boolean p9, p0, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    iput-boolean p10, p0, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/games/internal/player/zze;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/games/internal/player/zze;

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    iget-boolean v3, p1, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    iget-boolean p1, p1, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final hashCode()I
    .locals 11

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    filled-new-array/range {v1 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    const-string v2, "forbiddenToHavePlayerProfile"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    const-string v2, "requiresParentPermissionToShareData"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    const-string v2, "hasSettingsControlledByParent"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    const-string v2, "requiresParentPermissionToUsePlayTogether"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    const-string v2, "canUseOnlyAutoGeneratedGamerTag"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    const-string v2, "forbiddenToRecordVideo"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    const-string v2, "shouldSeeEquallyWeightedButtonsInConsents"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    const-string v2, "requiresParentConsentToUseAutoSignIn"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    const-string v2, "shouldSeeSimplifiedConsentMessages"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    const-string v2, "forbiddenToUseProfilelessRecall"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-boolean p2, p0, Lcom/google/android/gms/games/internal/player/zze;->f:Z

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x2

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->g:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->h:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x4

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->i:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x5

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->j:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x6

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->k:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x7

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->l:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->m:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->n:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    iget-boolean v1, p0, Lcom/google/android/gms/games/internal/player/zze;->o:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
