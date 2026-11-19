.class public final Lcom/google/android/gms/games/GameEntity;
.super Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;
.source "SourceFile"

# interfaces
.implements Lea/e;


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
            "Lcom/google/android/gms/games/GameEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Z

.field public final C:Z

.field public final D:Z

.field public final E:Ljava/lang/String;

.field public final F:Z

.field public final G:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Landroid/net/Uri;

.field public final o:Landroid/net/Uri;

.field public final p:Landroid/net/Uri;

.field public final q:Z

.field public final r:Z

.field public final s:Ljava/lang/String;

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:Z

.field public final x:Z

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/t;

    invoke-direct {v0}, Lea/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/GameEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lea/e;)V
    .locals 1
    .param p1    # Lea/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    .line 2
    invoke-interface {p1}, Lea/e;->T1()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Ljava/lang/String;

    .line 3
    invoke-interface {p1}, Lea/e;->d0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Ljava/lang/String;

    .line 4
    invoke-interface {p1}, Lea/e;->R0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->k:Ljava/lang/String;

    .line 5
    invoke-interface {p1}, Lea/e;->getDescription()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->l:Ljava/lang/String;

    .line 6
    invoke-interface {p1}, Lea/e;->k0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    .line 7
    invoke-interface {p1}, Lea/e;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Ljava/lang/String;

    .line 8
    invoke-interface {p1}, Lea/e;->h()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->n:Landroid/net/Uri;

    .line 9
    invoke-interface {p1}, Lea/e;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    .line 10
    invoke-interface {p1}, Lea/e;->E()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->o:Landroid/net/Uri;

    .line 11
    invoke-interface {p1}, Lea/e;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->z:Ljava/lang/String;

    .line 12
    invoke-interface {p1}, Lea/e;->E1()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->p:Landroid/net/Uri;

    .line 13
    invoke-interface {p1}, Lea/e;->getFeaturedImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->A:Ljava/lang/String;

    .line 14
    invoke-interface {p1}, Lea/e;->zza()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    .line 15
    invoke-interface {p1}, Lea/e;->zze()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    .line 16
    invoke-interface {p1}, Lea/e;->zzf()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->t:I

    .line 17
    invoke-interface {p1}, Lea/e;->Q0()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->u:I

    .line 18
    invoke-interface {p1}, Lea/e;->h2()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->v:I

    .line 19
    invoke-interface {p1}, Lea/e;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    .line 20
    invoke-interface {p1}, Lea/e;->zzh()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    .line 21
    invoke-interface {p1}, Lea/e;->zzb()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->B:Z

    .line 22
    invoke-interface {p1}, Lea/e;->zzc()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->C:Z

    .line 23
    invoke-interface {p1}, Lea/e;->G0()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->D:Z

    .line 24
    invoke-interface {p1}, Lea/e;->E0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->E:Ljava/lang/String;

    .line 25
    invoke-interface {p1}, Lea/e;->u1()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->F:Z

    .line 26
    invoke-interface {p1}, Lea/e;->zzd()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->G:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;ZZLjava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZ)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/GameEntity;->h:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/GameEntity;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/GameEntity;->j:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/GameEntity;->k:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/GameEntity;->l:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/GameEntity;->n:Landroid/net/Uri;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/games/GameEntity;->o:Landroid/net/Uri;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/google/android/gms/games/GameEntity;->z:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/games/GameEntity;->p:Landroid/net/Uri;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/games/GameEntity;->A:Ljava/lang/String;

    iput-boolean p10, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    iput-boolean p11, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    iput-object p12, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    iput p13, p0, Lcom/google/android/gms/games/GameEntity;->t:I

    iput p14, p0, Lcom/google/android/gms/games/GameEntity;->u:I

    iput p15, p0, Lcom/google/android/gms/games/GameEntity;->v:I

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    move/from16 p1, p21

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->B:Z

    move/from16 p1, p22

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->C:Z

    move/from16 p1, p23

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->D:Z

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/google/android/gms/games/GameEntity;->E:Ljava/lang/String;

    move/from16 p1, p25

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->F:Z

    move/from16 p1, p26

    iput-boolean p1, p0, Lcom/google/android/gms/games/GameEntity;->G:Z

    return-void
.end method

.method public static D3(Lea/e;)I
    .locals 23

    invoke-interface/range {p0 .. p0}, Lea/e;->T1()Ljava/lang/String;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Lea/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Lea/e;->d0()Ljava/lang/String;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Lea/e;->R0()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p0 .. p0}, Lea/e;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lea/e;->k0()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lea/e;->h()Landroid/net/Uri;

    move-result-object v7

    invoke-interface/range {p0 .. p0}, Lea/e;->E()Landroid/net/Uri;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Lea/e;->E1()Landroid/net/Uri;

    move-result-object v9

    invoke-interface/range {p0 .. p0}, Lea/e;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-interface/range {p0 .. p0}, Lea/e;->zze()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Lea/e;->zzf()Ljava/lang/String;

    move-result-object v12

    invoke-interface/range {p0 .. p0}, Lea/e;->Q0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface/range {p0 .. p0}, Lea/e;->h2()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface/range {p0 .. p0}, Lea/e;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-interface/range {p0 .. p0}, Lea/e;->zzh()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    invoke-interface/range {p0 .. p0}, Lea/e;->zzb()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    invoke-interface/range {p0 .. p0}, Lea/e;->zzc()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    invoke-interface/range {p0 .. p0}, Lea/e;->G0()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    invoke-interface/range {p0 .. p0}, Lea/e;->E0()Ljava/lang/String;

    move-result-object v20

    invoke-interface/range {p0 .. p0}, Lea/e;->u1()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v21

    invoke-interface/range {p0 .. p0}, Lea/e;->zzd()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v22

    filled-new-array/range {v1 .. v22}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public static E3(Lea/e;Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lea/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lea/e;

    invoke-interface {p1}, Lea/e;->T1()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->T1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->d0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->R0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->R0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->k0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->k0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->h()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->E()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->E1()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->E1()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zza()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zza()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zze()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zze()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zzf()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zzf()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->Q0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->Q0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->h2()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->h2()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->c()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zzh()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zzh()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zzb()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zzb()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zzc()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->zzc()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->G0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->G0()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->E0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->E0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->u1()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lea/e;->u1()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lea/e;->zzd()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0}, Lea/e;->zzd()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p1, p0}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static F3(Lea/e;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "ApplicationId"

    invoke-interface {p0}, Lea/e;->T1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "DisplayName"

    invoke-interface {p0}, Lea/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "PrimaryCategory"

    invoke-interface {p0}, Lea/e;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "SecondaryCategory"

    invoke-interface {p0}, Lea/e;->R0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "Description"

    invoke-interface {p0}, Lea/e;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "DeveloperName"

    invoke-interface {p0}, Lea/e;->k0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUri"

    invoke-interface {p0}, Lea/e;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUrl"

    invoke-interface {p0}, Lea/e;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "HiResImageUri"

    invoke-interface {p0}, Lea/e;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "HiResImageUrl"

    invoke-interface {p0}, Lea/e;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "FeaturedImageUri"

    invoke-interface {p0}, Lea/e;->E1()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "FeaturedImageUrl"

    invoke-interface {p0}, Lea/e;->getFeaturedImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->zza()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "PlayEnabledGame"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->zze()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "InstanceInstalled"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "InstancePackageName"

    invoke-interface {p0}, Lea/e;->zzf()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->Q0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AchievementTotalCount"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->h2()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "LeaderboardCount"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->G0()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "AreSnapshotsEnabled"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "ThemeColor"

    invoke-interface {p0}, Lea/e;->E0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lea/e;->u1()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v1, "HasGamepadSupport"

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/q$a;->toString()Ljava/lang/String;

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
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->o:Landroid/net/Uri;

    return-object v0
.end method

.method public E0()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->E:Ljava/lang/String;

    return-object v0
.end method

.method public E1()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->p:Landroid/net/Uri;

    return-object v0
.end method

.method public G0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->D:Z

    return v0
.end method

.method public Q0()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->u:I

    return v0
.end method

.method public R0()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->k:Ljava/lang/String;

    return-object v0
.end method

.method public T1()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    return v0
.end method

.method public d0()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/GameEntity;->E3(Lea/e;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getFeaturedImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->A:Ljava/lang/String;

    return-object v0
.end method

.method public getHiResImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->z:Ljava/lang/String;

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    return-object v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->n:Landroid/net/Uri;

    return-object v0
.end method

.method public h2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->v:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->D3(Lea/e;)I

    move-result v0

    return v0
.end method

.method public k0()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->F3(Lea/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->F:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->B3()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->j:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->k:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->l:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->n:Landroid/net/Uri;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object p2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->o:Landroid/net/Uri;

    if-nez p2, :cond_1

    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->p:Landroid/net/Uri;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/google/android/gms/games/GameEntity;->t:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/google/android/gms/games/GameEntity;->u:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/google/android/gms/games/GameEntity;->v:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_3
    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->T1()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->R0()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->k0()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->E()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->E1()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xa

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xc

    iget-object v1, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xd

    iget v1, p0, Lcom/google/android/gms/games/GameEntity;->t:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0xe

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->Q0()I

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0xf

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->h2()I

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0x10

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x11

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x12

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->getIconImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x13

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x14

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->getFeaturedImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x15

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->B:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x16

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->C:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x17

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->G0()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x18

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->E0()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x19

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->u1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x1c

    iget-boolean v1, p0, Lcom/google/android/gms/games/GameEntity;->G:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    return v0
.end method

.method public final zzb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->B:Z

    return v0
.end method

.method public final zzc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->C:Z

    return v0
.end method

.method public final zzd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->G:Z

    return v0
.end method

.method public final zze()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    return v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final zzh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    return v0
.end method
