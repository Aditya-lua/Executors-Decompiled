.class public final Lcom/google/android/gms/games/achievement/AchievementEntity;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/games/achievement/Achievement;


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
            "Lcom/google/android/gms/games/achievement/AchievementEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/net/Uri;

.field public final k:Ljava/lang/String;

.field public final l:Landroid/net/Uri;

.field public final m:Ljava/lang/String;

.field public final n:I

.field public final o:Ljava/lang/String;

.field public final p:Lcom/google/android/gms/games/PlayerEntity;

.field public final q:I

.field public final r:I

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:J

.field public final v:F

.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/b;

    invoke-direct {v0}, Lea/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/achievement/AchievementEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/achievement/Achievement;)V
    .locals 6
    .param p1    # Lcom/google/android/gms/games/achievement/Achievement;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->H0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:I

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:Ljava/lang/String;

    .line 5
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->H()Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Landroid/net/Uri;

    .line 7
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getUnlockedImageUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Ljava/lang/String;

    .line 8
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->C2()Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Landroid/net/Uri;

    .line 9
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getRevealedImageUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Ljava/lang/String;

    .line 10
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 11
    new-instance v4, Lcom/google/android/gms/games/PlayerEntity;

    invoke-direct {v4, v2}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lcom/google/android/gms/games/Player;)V

    .line 12
    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Lcom/google/android/gms/games/PlayerEntity;

    goto :goto_0

    .line 13
    :cond_0
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Lcom/google/android/gms/games/PlayerEntity;

    .line 14
    :goto_0
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:I

    .line 15
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->i1()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:J

    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->n2()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    .line 17
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()F

    move-result v2

    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:F

    .line 18
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zza()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:Ljava/lang/String;

    .line 19
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    .line 20
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->q1()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:I

    .line 21
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->J1()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:Ljava/lang/String;

    .line 22
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->J2()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    .line 23
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->W1()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:I

    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:Ljava/lang/String;

    iput p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:Ljava/lang/String;

    .line 25
    :goto_1
    invoke-static {v0}, Ln9/b;->a(Ljava/lang/Object;)V

    .line 26
    invoke-static {v1}, Ln9/b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/games/PlayerEntity;IILjava/lang/String;JJFLjava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:I

    iput-object p3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Landroid/net/Uri;

    iput-object p8, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Ljava/lang/String;

    iput p9, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:I

    iput-object p10, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Lcom/google/android/gms/games/PlayerEntity;

    iput p12, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:I

    iput p13, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    iput-object p14, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:Ljava/lang/String;

    move-wide p1, p15

    iput-wide p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:J

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    move/from16 p1, p19

    iput p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:F

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/google/android/gms/games/achievement/Achievement;)I
    .locals 13

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->J2()I

    move-result v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->q1()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->H0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->n2()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->i1()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    move-result-object v10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array/range {v2 .. v12}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static v3(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lcom/google/android/gms/games/achievement/Achievement;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/games/achievement/Achievement;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v2

    if-ne v2, v0, :cond_5

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->J2()I

    move-result v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->J2()I

    move-result v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->q1()I

    move-result v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->q1()I

    move-result v3

    if-ne v2, v3, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->n2()J

    move-result-wide v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->n2()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v3

    if-ne v2, v3, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->i1()J

    move-result-wide v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->i1()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->H0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->H0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()F

    move-result p1

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()F

    move-result p0

    cmpl-float p0, p1, p0

    if-nez p0, :cond_6

    return v0

    :cond_6
    return v1
.end method

.method public static w3(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Id"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->H0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Game Id"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Type"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Name"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Description"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Player"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "State"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "Rarity Percent"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->J2()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "CurrentSteps"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->q1()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "TotalSteps"

    invoke-virtual {v0, v1, p0}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    :cond_0
    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C2()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Landroid/net/Uri;

    return-object v0
.end method

.method public H()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public H0()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public J1()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ln9/b;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:Ljava/lang/String;

    return-object v0
.end method

.method public J2()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ln9/b;->b(Z)V

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    return v0
.end method

.method public W1()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ln9/b;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/achievement/AchievementEntity;->v3(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getRevealedImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:I

    return v0
.end method

.method public getUnlockedImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->a(Lcom/google/android/gms/games/achievement/Achievement;)I

    move-result v0

    return v0
.end method

.method public i1()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:J

    return-wide v0
.end method

.method public n2()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    return-wide v0
.end method

.method public q1()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ln9/b;->b(Z)V

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->w3(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->H0()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getType()I

    move-result v2

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->H()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getUnlockedImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->C2()Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getRevealedImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x9

    iget v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Lcom/google/android/gms/games/PlayerEntity;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xc

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->getState()I

    move-result v1

    invoke-static {p1, p2, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0xd

    iget v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    invoke-static {p1, p2, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0xe

    iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xf

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->i1()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x10

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->n2()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x11

    iget v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 p2, 0x12

    iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/games/Player;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Lcom/google/android/gms/games/PlayerEntity;

    return-object v0
.end method

.method public final zzc()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:F

    return v0
.end method
