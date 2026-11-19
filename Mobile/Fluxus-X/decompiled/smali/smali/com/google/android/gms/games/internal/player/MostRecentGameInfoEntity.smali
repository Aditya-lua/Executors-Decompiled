.class public final Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
.super Lha/p;
.source "SourceFile"

# interfaces
.implements Lka/b;


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "GamesGmsClientImpl.java"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Landroid/net/Uri;

.field public final j:Landroid/net/Uri;

.field public final k:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lka/c;

    invoke-direct {v0}, Lka/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLandroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lha/p;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->f:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->g:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->h:J

    iput-object p5, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->i:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->j:Landroid/net/Uri;

    iput-object p7, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->k:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Lka/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lha/p;-><init>()V

    .line 2
    invoke-interface {p1}, Lka/b;->zza()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->f:Ljava/lang/String;

    .line 3
    invoke-interface {p1}, Lka/b;->zzb()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->g:Ljava/lang/String;

    .line 4
    invoke-interface {p1}, Lka/b;->zzc()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->h:J

    .line 5
    invoke-interface {p1}, Lka/b;->zzd()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->i:Landroid/net/Uri;

    .line 6
    invoke-interface {p1}, Lka/b;->zze()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->j:Landroid/net/Uri;

    .line 7
    invoke-interface {p1}, Lka/b;->zzf()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->k:Landroid/net/Uri;

    return-void
.end method

.method public static A3(Lka/b;Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Lka/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lka/b;

    invoke-interface {p1}, Lka/b;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lka/b;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lka/b;->zzc()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zzc()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lka/b;->zzd()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zzd()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lka/b;->zze()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zze()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lka/b;->zzf()Landroid/net/Uri;

    move-result-object p1

    invoke-interface {p0}, Lka/b;->zzf()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p1, p0}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static B3(Lka/b;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GameId"

    invoke-interface {p0}, Lka/b;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GameName"

    invoke-interface {p0}, Lka/b;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lka/b;->zzc()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "ActivityTimestampMillis"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GameIconUri"

    invoke-interface {p0}, Lka/b;->zzd()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GameHiResUri"

    invoke-interface {p0}, Lka/b;->zze()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GameFeaturedUri"

    invoke-interface {p0}, Lka/b;->zzf()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lka/b;)I
    .locals 6

    invoke-interface {p0}, Lka/b;->zza()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lka/b;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lka/b;->zzc()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lka/b;->zzd()Landroid/net/Uri;

    move-result-object v3

    invoke-interface {p0}, Lka/b;->zze()Landroid/net/Uri;

    move-result-object v4

    invoke-interface {p0}, Lka/b;->zzf()Landroid/net/Uri;

    move-result-object v5

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->A3(Lka/b;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->a(Lka/b;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->B3(Lka/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lka/c;->a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->h:J

    return-wide v0
.end method

.method public final zzd()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->i:Landroid/net/Uri;

    return-object v0
.end method

.method public final zze()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzf()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->k:Landroid/net/Uri;

    return-object v0
.end method
