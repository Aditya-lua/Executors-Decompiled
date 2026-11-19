.class public final Lea/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/d;

.field public static final b:Lk9/d;

.field public static final c:Lk9/d;

.field public static final d:Lk9/d;

.field public static final e:Lk9/d;

.field public static final f:Lk9/d;

.field public static final g:Lk9/d;

.field public static final h:Lk9/d;

.field public static final i:Lk9/d;

.field public static final j:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lk9/d;

    const-string v1, "games_get_account_selection_intent"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lea/s;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v4, "games_get_privacy_settings_intent"

    invoke-direct {v1, v4, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lea/s;->b:Lk9/d;

    move-wide v3, v2

    new-instance v2, Lk9/d;

    const-string v5, "games_load_player_force_reload"

    invoke-direct {v2, v5, v3, v4}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lea/s;->c:Lk9/d;

    move-wide v4, v3

    new-instance v3, Lk9/d;

    const-string v6, "games_load_profile_capabilities"

    const-wide/16 v7, 0x2

    invoke-direct {v3, v6, v7, v8}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lea/s;->d:Lk9/d;

    move-wide v5, v4

    new-instance v4, Lk9/d;

    const-string v7, "games_recall"

    invoke-direct {v4, v7, v5, v6}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lea/s;->e:Lk9/d;

    move-wide v6, v5

    new-instance v5, Lk9/d;

    const-string v8, "games_report_player"

    invoke-direct {v5, v8, v6, v7}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lea/s;->f:Lk9/d;

    move-wide v7, v6

    new-instance v6, Lk9/d;

    const-string v9, "games_app_shortcuts"

    invoke-direct {v6, v9, v7, v8}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lea/s;->g:Lk9/d;

    move-wide v8, v7

    new-instance v7, Lk9/d;

    const-string v10, "games_game_streaks"

    invoke-direct {v7, v10, v8, v9}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lea/s;->h:Lk9/d;

    move-wide v9, v8

    new-instance v8, Lk9/d;

    const-string v11, "games_public_gamer_profile"

    invoke-direct {v8, v11, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lea/s;->i:Lk9/d;

    filled-new-array/range {v0 .. v8}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lea/s;->j:[Lk9/d;

    return-void
.end method
