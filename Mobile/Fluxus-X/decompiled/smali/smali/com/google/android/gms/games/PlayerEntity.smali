.class public final Lcom/google/android/gms/games/PlayerEntity;
.super Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;
.source "SourceFile"

# interfaces
.implements Lea/k;


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
            "Lcom/google/android/gms/games/PlayerEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:J

.field public final C:Lea/d0;

.field public final D:Lea/p;

.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/net/Uri;

.field public final k:Landroid/net/Uri;

.field public final l:J

.field public final m:I

.field public final n:J

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

.field public final s:Lea/m;

.field public final t:Z

.field public final u:Z

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Landroid/net/Uri;

.field public final y:Ljava/lang/String;

.field public final z:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/z;

    invoke-direct {v0}, Lea/z;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/PlayerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lea/k;)V
    .locals 8
    .param p1    # Lea/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    .line 2
    invoke-interface {p1}, Lea/k;->r3()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->h:Ljava/lang/String;

    .line 3
    invoke-interface {p1}, Lea/k;->m()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/PlayerEntity;->i:Ljava/lang/String;

    .line 4
    invoke-interface {p1}, Lea/k;->h()Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->j:Landroid/net/Uri;

    .line 5
    invoke-interface {p1}, Lea/k;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->o:Ljava/lang/String;

    .line 6
    invoke-interface {p1}, Lea/k;->E()Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->k:Landroid/net/Uri;

    .line 7
    invoke-interface {p1}, Lea/k;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->p:Ljava/lang/String;

    .line 8
    invoke-interface {p1}, Lea/k;->e0()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/games/PlayerEntity;->l:J

    .line 9
    invoke-interface {p1}, Lea/k;->zze()I

    move-result v4

    iput v4, p0, Lcom/google/android/gms/games/PlayerEntity;->m:I

    .line 10
    invoke-interface {p1}, Lea/k;->s0()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/games/PlayerEntity;->n:J

    .line 11
    invoke-interface {p1}, Lea/k;->getTitle()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->q:Ljava/lang/String;

    .line 12
    invoke-interface {p1}, Lea/k;->zzf()Z

    move-result v4

    iput-boolean v4, p0, Lcom/google/android/gms/games/PlayerEntity;->t:Z

    .line 13
    invoke-interface {p1}, Lea/k;->zzh()Lka/b;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    move-object v6, v5

    goto :goto_0

    .line 14
    :cond_0
    new-instance v6, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    invoke-direct {v6, v4}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;-><init>(Lka/b;)V

    .line 15
    :goto_0
    iput-object v6, p0, Lcom/google/android/gms/games/PlayerEntity;->r:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 16
    invoke-interface {p1}, Lea/k;->z0()Lea/m;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->s:Lea/m;

    .line 17
    invoke-interface {p1}, Lea/k;->zzd()Z

    move-result v4

    iput-boolean v4, p0, Lcom/google/android/gms/games/PlayerEntity;->u:Z

    .line 18
    invoke-interface {p1}, Lea/k;->zzb()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->v:Ljava/lang/String;

    .line 19
    invoke-interface {p1}, Lea/k;->zzc()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    .line 20
    invoke-interface {p1}, Lea/k;->I1()Landroid/net/Uri;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->x:Landroid/net/Uri;

    .line 21
    invoke-interface {p1}, Lea/k;->getBannerImageLandscapeUrl()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->y:Ljava/lang/String;

    .line 22
    invoke-interface {p1}, Lea/k;->h0()Landroid/net/Uri;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->z:Landroid/net/Uri;

    .line 23
    invoke-interface {p1}, Lea/k;->getBannerImagePortraitUrl()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->A:Ljava/lang/String;

    .line 24
    invoke-interface {p1}, Lea/k;->d()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/google/android/gms/games/PlayerEntity;->B:J

    .line 25
    invoke-interface {p1}, Lea/k;->c1()Lea/o;

    move-result-object v4

    if-nez v4, :cond_1

    move-object v6, v5

    goto :goto_1

    .line 26
    :cond_1
    new-instance v6, Lea/d0;

    invoke-interface {v4}, Ln9/e;->freeze()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lea/o;

    invoke-direct {v6, v4}, Lea/d0;-><init>(Lea/o;)V

    .line 27
    :goto_1
    iput-object v6, p0, Lcom/google/android/gms/games/PlayerEntity;->C:Lea/d0;

    .line 28
    invoke-interface {p1}, Lea/k;->g2()Lea/d;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_2

    .line 29
    :cond_2
    invoke-interface {v4}, Ln9/e;->freeze()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lea/p;

    .line 30
    :goto_2
    iput-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->D:Lea/p;

    .line 31
    invoke-interface {p1}, Lea/k;->c()Z

    move-result v4

    iput-boolean v4, p0, Lcom/google/android/gms/games/PlayerEntity;->E:Z

    .line 32
    invoke-interface {p1}, Lea/k;->zza()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->F:Ljava/lang/String;

    .line 33
    invoke-static {v0}, Lo9/c;->a(Ljava/lang/Object;)V

    .line 34
    invoke-static {v1}, Lo9/c;->a(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    cmp-long p1, v2, v0

    if-lez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    .line 35
    :goto_3
    invoke-static {p1}, Lo9/c;->b(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Lea/m;ZZLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLea/d0;Lea/p;ZLjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->h:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/PlayerEntity;->j:Landroid/net/Uri;

    iput-object p10, p0, Lcom/google/android/gms/games/PlayerEntity;->o:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/PlayerEntity;->k:Landroid/net/Uri;

    iput-object p11, p0, Lcom/google/android/gms/games/PlayerEntity;->p:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/games/PlayerEntity;->l:J

    iput p7, p0, Lcom/google/android/gms/games/PlayerEntity;->m:I

    iput-wide p8, p0, Lcom/google/android/gms/games/PlayerEntity;->n:J

    iput-object p12, p0, Lcom/google/android/gms/games/PlayerEntity;->q:Ljava/lang/String;

    iput-boolean p15, p0, Lcom/google/android/gms/games/PlayerEntity;->t:Z

    iput-object p13, p0, Lcom/google/android/gms/games/PlayerEntity;->r:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    iput-object p14, p0, Lcom/google/android/gms/games/PlayerEntity;->s:Lea/m;

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/games/PlayerEntity;->u:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->v:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->x:Landroid/net/Uri;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->y:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->z:Landroid/net/Uri;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->A:Ljava/lang/String;

    move-wide/from16 p1, p23

    iput-wide p1, p0, Lcom/google/android/gms/games/PlayerEntity;->B:J

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->C:Lea/d0;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->D:Lea/p;

    move/from16 p1, p27

    iput-boolean p1, p0, Lcom/google/android/gms/games/PlayerEntity;->E:Z

    move-object/from16 p1, p28

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->F:Ljava/lang/String;

    return-void
.end method

.method public static D3(Lea/k;)I
    .locals 18

    invoke-interface/range {p0 .. p0}, Lea/k;->r3()Ljava/lang/String;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Lea/k;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lea/k;->zzd()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Lea/k;->h()Landroid/net/Uri;

    move-result-object v4

    invoke-interface/range {p0 .. p0}, Lea/k;->E()Landroid/net/Uri;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lea/k;->e0()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lea/k;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lea/k;->z0()Lea/m;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lea/k;->zzb()Ljava/lang/String;

    move-result-object v9

    invoke-interface/range {p0 .. p0}, Lea/k;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-interface/range {p0 .. p0}, Lea/k;->I1()Landroid/net/Uri;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Lea/k;->h0()Landroid/net/Uri;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lea/k;->d()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface/range {p0 .. p0}, Lea/k;->c1()Lea/o;

    move-result-object v14

    invoke-interface/range {p0 .. p0}, Lea/k;->g2()Lea/d;

    move-result-object v15

    invoke-interface/range {p0 .. p0}, Lea/k;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    invoke-interface/range {p0 .. p0}, Lea/k;->zza()Ljava/lang/String;

    move-result-object v17

    filled-new-array/range {v1 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public static E3(Lea/k;Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Lea/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lea/k;

    invoke-interface {p1}, Lea/k;->r3()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->r3()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->zzd()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->zzd()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->h()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->E()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->e0()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->e0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->z0()Lea/m;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->z0()Lea/m;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->zzc()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->I1()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->I1()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->h0()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->h0()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->g2()Lea/d;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->g2()Lea/d;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->c1()Lea/o;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->c1()Lea/o;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/k;->c()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/k;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Lea/k;->zza()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static F3(Lea/k;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "PlayerId"

    invoke-interface {p0}, Lea/k;->r3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "DisplayName"

    invoke-interface {p0}, Lea/k;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/k;->zzd()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "HasDebugAccess"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUri"

    invoke-interface {p0}, Lea/k;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUrl"

    invoke-interface {p0}, Lea/k;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "HiResImageUri"

    invoke-interface {p0}, Lea/k;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "HiResImageUrl"

    invoke-interface {p0}, Lea/k;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/k;->e0()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "RetrievedTimestamp"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "Title"

    invoke-interface {p0}, Lea/k;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "LevelInfo"

    invoke-interface {p0}, Lea/k;->z0()Lea/m;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "GamerTag"

    invoke-interface {p0}, Lea/k;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "Name"

    invoke-interface {p0}, Lea/k;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "BannerImageLandscapeUri"

    invoke-interface {p0}, Lea/k;->I1()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "BannerImageLandscapeUrl"

    invoke-interface {p0}, Lea/k;->getBannerImageLandscapeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "BannerImagePortraitUri"

    invoke-interface {p0}, Lea/k;->h0()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "BannerImagePortraitUrl"

    invoke-interface {p0}, Lea/k;->getBannerImagePortraitUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "CurrentPlayerInfo"

    invoke-interface {p0}, Lea/k;->g2()Lea/d;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/k;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "TotalUnlockedAchievement"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/k;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Lea/k;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "AlwaysAutoSignIn"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_0
    invoke-interface {p0}, Lea/k;->c1()Lea/o;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lea/k;->c1()Lea/o;

    move-result-object v1

    const-string v2, "RelationshipInfo"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_1
    invoke-interface {p0}, Lea/k;->zza()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Lea/k;->zza()Ljava/lang/String;

    move-result-object p0

    const-string v1, "GamePlayerId"

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    :cond_2
    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G3()Ljava/lang/Integer;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->A3()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic H3(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;->C3(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I3(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public E()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->k:Landroid/net/Uri;

    return-object v0
.end method

.method public I1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->x:Landroid/net/Uri;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/PlayerEntity;->E:Z

    return v0
.end method

.method public c1()Lea/o;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->C:Lea/d0;

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->B:J

    return-wide v0
.end method

.method public e0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->l:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->E3(Lea/k;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g2()Lea/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->D:Lea/p;

    return-object v0
.end method

.method public getBannerImageLandscapeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->y:Ljava/lang/String;

    return-object v0
.end method

.method public getBannerImagePortraitUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->A:Ljava/lang/String;

    return-object v0
.end method

.method public getHiResImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->q:Ljava/lang/String;

    return-object v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public h0()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->z:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->D3(Lea/k;)I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public r3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->h:Ljava/lang/String;

    return-object v0
.end method

.method public s0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->n:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->F3(Lea/k;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->B3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->j:Landroid/net/Uri;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object p2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->k:Landroid/net/Uri;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->l:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void

    :cond_2
    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->r3()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->e0()J

    move-result-wide v4

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/games/PlayerEntity;->m:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->s0()J

    move-result-wide v4

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xe

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->r:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x10

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->z0()Lea/m;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x12

    iget-boolean v2, p0, Lcom/google/android/gms/games/PlayerEntity;->t:Z

    invoke-static {p1, v1, v2}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v1, 0x13

    iget-boolean v2, p0, Lcom/google/android/gms/games/PlayerEntity;->u:Z

    invoke-static {p1, v1, v2}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->v:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x15

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x16

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->I1()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x17

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getBannerImageLandscapeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x18

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->h0()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x19

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getBannerImagePortraitUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x1d

    iget-wide v4, p0, Lcom/google/android/gms/games/PlayerEntity;->B:J

    invoke-static {p1, v1, v4, v5}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0x21

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->c1()Lea/o;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x23

    invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->g2()Lea/d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0x24

    iget-boolean v1, p0, Lcom/google/android/gms/games/PlayerEntity;->E:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x25

    iget-object v1, p0, Lcom/google/android/gms/games/PlayerEntity;->F:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public z0()Lea/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->s:Lea/m;

    return-object v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->v:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/PlayerEntity;->u:Z

    return v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/PlayerEntity;->m:I

    return v0
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/PlayerEntity;->t:Z

    return v0
.end method

.method public final zzh()Lka/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->r:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    return-object v0
.end method
