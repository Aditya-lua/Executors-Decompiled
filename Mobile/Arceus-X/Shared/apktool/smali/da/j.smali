.class public final Lda/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/Feature;

.field public static final b:Lcom/google/android/gms/common/Feature;

.field public static final c:Lcom/google/android/gms/common/Feature;

.field public static final d:Lcom/google/android/gms/common/Feature;

.field public static final e:Lcom/google/android/gms/common/Feature;

.field public static final f:Lcom/google/android/gms/common/Feature;

.field public static final g:Lcom/google/android/gms/common/Feature;

.field public static final h:Lcom/google/android/gms/common/Feature;

.field public static final i:Lcom/google/android/gms/common/Feature;

.field public static final j:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v1, "games_get_account_selection_intent"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lda/j;->a:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    const-string v4, "games_get_privacy_settings_intent"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lda/j;->b:Lcom/google/android/gms/common/Feature;

    move-wide v3, v2

    new-instance v2, Lcom/google/android/gms/common/Feature;

    const-string v5, "games_load_player_force_reload"

    invoke-direct {v2, v5, v3, v4}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lda/j;->c:Lcom/google/android/gms/common/Feature;

    move-wide v4, v3

    new-instance v3, Lcom/google/android/gms/common/Feature;

    const-string v6, "games_load_profile_capabilities"

    const-wide/16 v7, 0x2

    invoke-direct {v3, v6, v7, v8}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lda/j;->d:Lcom/google/android/gms/common/Feature;

    move-wide v5, v4

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v7, "games_recall"

    invoke-direct {v4, v7, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lda/j;->e:Lcom/google/android/gms/common/Feature;

    move-wide v6, v5

    new-instance v5, Lcom/google/android/gms/common/Feature;

    const-string v8, "games_report_player"

    invoke-direct {v5, v8, v6, v7}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lda/j;->f:Lcom/google/android/gms/common/Feature;

    move-wide v7, v6

    new-instance v6, Lcom/google/android/gms/common/Feature;

    const-string v9, "games_app_shortcuts"

    invoke-direct {v6, v9, v7, v8}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lda/j;->g:Lcom/google/android/gms/common/Feature;

    move-wide v8, v7

    new-instance v7, Lcom/google/android/gms/common/Feature;

    const-string v10, "games_game_streaks"

    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lda/j;->h:Lcom/google/android/gms/common/Feature;

    move-wide v9, v8

    new-instance v8, Lcom/google/android/gms/common/Feature;

    const-string v11, "games_public_gamer_profile"

    invoke-direct {v8, v11, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lda/j;->i:Lcom/google/android/gms/common/Feature;

    filled-new-array/range {v0 .. v8}, [Lcom/google/android/gms/common/Feature;

    move-result-object v0

    sput-object v0, Lda/j;->j:[Lcom/google/android/gms/common/Feature;

    return-void
.end method
