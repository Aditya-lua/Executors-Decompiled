.class public Lxg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg/b$a;


# static fields
.field public static final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static k:Lxg/a;


# instance fields
.field public a:Landroid/content/SharedPreferences;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:I

.field public h:Ljava/lang/Boolean;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    const-string v0, "en"

    const-string v1, "EN"

    invoke-static {v0, v1}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    const-string v1, "ar"

    const-string v2, "AR"

    invoke-static {v1, v2}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    const-string v2, "id"

    const-string v3, "ID"

    invoke-static {v2, v3}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    const-string v3, "fr"

    const-string v4, "FR"

    invoke-static {v3, v4}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    const-string v4, "de"

    const-string v5, "DE"

    invoke-static {v4, v5}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v4

    const-string v5, "hi"

    const-string v6, "HI"

    invoke-static {v5, v6}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v5

    const-string v6, "it"

    const-string v7, "IT"

    invoke-static {v6, v7}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v6

    const-string v7, "ja"

    const-string v8, "JA"

    invoke-static {v7, v8}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v7

    const-string v8, "ko"

    const-string v9, "KO"

    invoke-static {v8, v9}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v8

    const-string v9, "pl"

    const-string v10, "PL"

    invoke-static {v9, v10}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v9

    const-string v10, "pt"

    const-string v11, "PT"

    invoke-static {v10, v11}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v10

    const-string v11, "th"

    const-string v12, "TH"

    invoke-static {v11, v12}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v11

    const-string v12, "tr"

    const-string v13, "TR"

    invoke-static {v12, v13}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v12

    const-string v13, "vi"

    const-string v14, "VI"

    invoke-static {v13, v14}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v13

    const-string v14, "zh"

    const-string v15, "ZH-S"

    invoke-static {v14, v15}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v14

    const-string v15, "es"

    move-object/from16 v16, v0

    const-string v0, "ES-ES"

    invoke-static {v15, v0}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    const/16 v15, 0x10

    new-array v15, v15, [Ljava/util/Map$Entry;

    const/16 v17, 0x0

    aput-object v16, v15, v17

    const/16 v16, 0x1

    aput-object v1, v15, v16

    const/4 v1, 0x2

    aput-object v2, v15, v1

    const/4 v1, 0x3

    aput-object v3, v15, v1

    const/4 v1, 0x4

    aput-object v4, v15, v1

    const/4 v1, 0x5

    aput-object v5, v15, v1

    const/4 v1, 0x6

    aput-object v6, v15, v1

    const/4 v1, 0x7

    aput-object v7, v15, v1

    const/16 v1, 0x8

    aput-object v8, v15, v1

    const/16 v1, 0x9

    aput-object v9, v15, v1

    const/16 v1, 0xa

    aput-object v10, v15, v1

    const/16 v1, 0xb

    aput-object v11, v15, v1

    const/16 v1, 0xc

    aput-object v12, v15, v1

    const/16 v1, 0xd

    aput-object v13, v15, v1

    const/16 v1, 0xe

    aput-object v14, v15, v1

    const/16 v1, 0xf

    aput-object v0, v15, v1

    invoke-static {v15}, Lsg/b;->a([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lxg/a;->j:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lxg/a;->b:I

    iput v0, p0, Lxg/a;->c:I

    iput v0, p0, Lxg/a;->d:I

    iput v0, p0, Lxg/a;->e:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lxg/a;->f:J

    iput v0, p0, Lxg/a;->g:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lxg/a;->h:Ljava/lang/Boolean;

    return-void
.end method

.method public static e()Lxg/a;
    .locals 2

    sget-object v0, Lxg/a;->k:Lxg/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lxg/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lxg/a;->k:Lxg/a;

    if-nez v1, :cond_1

    new-instance v1, Lxg/a;

    invoke-direct {v1}, Lxg/a;-><init>()V

    sput-object v1, Lxg/a;->k:Lxg/a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lxg/a;->k:Lxg/a;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static h(Landroid/content/Context;)V
    .locals 1

    const-string v0, "rate_me_maybe"

    invoke-static {p0, v0}, Lgk/z;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string p0, "RateMeMaybe"

    const-string v0, "Cleared RateMeMaybe shared preferences."

    invoke-static {p0, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d5()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lxg/a;->j:Ljava/util/Map;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "Q_lang"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lxg/c;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k0()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "not_now"

    invoke-virtual {p0, p1}, Lxg/a;->j(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lxg/a;->f()Lvi/g;

    move-result-object p1

    const-string v0, "Mobile-Ratings-NotNow-Tapped-Android"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    move-object v0, p1

    check-cast v0, Lj/b;

    sget v1, Lsg/q0;->c:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->k(Lj/b;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k0()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "yes"

    invoke-virtual {p0, p1}, Lxg/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lxg/a;->f()Lvi/g;

    move-result-object p1

    const-string v0, "Mobile-Ratings-Yes-Tapped-Android"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "close"

    invoke-virtual {p0, v0}, Lxg/a;->j(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lxg/a;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lxg/a;->d(Z)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lxg/a;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k0()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "remind"

    invoke-virtual {p0, p1}, Lxg/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lxg/a;->f()Lvi/g;

    move-result-object p1

    const-string v0, "Mobile-Ratings-RemindMe-Tapped-Android"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public final f()Lvi/g;
    .locals 1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroid/content/Context;)V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "target"

    const-string v3, "mobile"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "placeId"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "gameId"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "btn"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "rate_me_maybe"

    invoke-static {p1, v0}, Lgk/z;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "CURRENT_APP_VERSION"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "2.744.1081"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Lxg/a;->h(Landroid/content/Context;)V

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_0
    iget-object p1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH"

    const-wide/16 v2, 0x0

    invoke-interface {p1, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    :cond_1
    iget-object p1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_TOTAL_LAUNCH_COUNT"

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget-object p1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_LAUNCHES_SINCE_LAST_PROMPT"

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public i(Landroid/app/Activity;JLjava/lang/String;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget v1, v0, Lxg/a;->g:I

    iget-object v2, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v4, "PREF_GAMES_PLAYED"

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "RateMeMaybe"

    if-le v1, v2, :cond_1

    const-string v1, "Hasn\'t played a number games higher than the minimum requested."

    invoke-static {v4, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-wide v1, v0, Lxg/a;->f:J

    iget-object v5, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v6, "PREF_LONGEST_GAME_DURATION"

    const-wide/16 v7, 0x0

    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    cmp-long v1, v1, v5

    if-lez v1, :cond_2

    const-string v1, "Hasn\'t played a game for more than the minimum time requested."

    invoke-static {v4, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object v1, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v5, "PREF_TOTAL_LAUNCH_COUNT"

    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v9, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v10, "PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH"

    invoke-interface {v9, v10, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    iget-object v11, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v12, "PREF_TIME_OF_LAST_PROMPT"

    invoke-interface {v11, v12, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v13

    iget-object v11, v0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-string v15, "PREF_LAUNCHES_SINCE_LAST_PROMPT"

    invoke-interface {v11, v15, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    move-wide/from16 v16, v7

    iget v7, v0, Lxg/a;->b:I

    if-lt v2, v7, :cond_6

    sub-long v7, v5, v9

    iget v2, v0, Lxg/a;->c:I

    int-to-long v9, v2

    const-wide/32 v18, 0x5265c00

    mul-long v9, v9, v18

    cmp-long v2, v7, v9

    if-ltz v2, :cond_6

    const-string v2, "Enough time until initial prompt."

    invoke-static {v4, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    cmp-long v2, v13, v16

    if-eqz v2, :cond_4

    iget v2, v0, Lxg/a;->d:I

    if-lt v11, v2, :cond_3

    sub-long v7, v5, v13

    iget v2, v0, Lxg/a;->e:I

    int-to-long v9, v2

    mul-long v9, v9, v18

    cmp-long v2, v7, v9

    if-ltz v2, :cond_3

    goto :goto_0

    :cond_3
    const-string v2, "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)"

    invoke-static {v4, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :cond_4
    :goto_0
    const-string v2, "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)"

    invoke-static {v4, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->k0()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lxg/a;->i:Ljava/util/List;

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v7, "placeId"

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v7, v8}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    invoke-interface {v2, v7, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lxg/a;->i:Ljava/util/List;

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v7, "gameId"

    move-object/from16 v8, p4

    invoke-direct {v4, v7, v8}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x2

    invoke-interface {v2, v7, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {v1, v12, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1, v15, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual/range {p0 .. p1}, Lxg/a;->l(Landroid/app/Activity;)V

    return-void

    :cond_6
    const-string v2, "Not enough time until initial prompt."

    invoke-static {v4, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "btn"

    invoke-direct {v1, v2, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x3

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const-string p1, "tap"

    iget-object v0, p0, Lxg/a;->i:Ljava/util/List;

    const-string v1, "appRatingPrompt"

    invoke-static {v1, p1, v0}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public k(IIIIJI)V
    .locals 0

    iput p1, p0, Lxg/a;->b:I

    iput p2, p0, Lxg/a;->c:I

    iput p3, p0, Lxg/a;->d:I

    iput p4, p0, Lxg/a;->e:I

    iput-wide p5, p0, Lxg/a;->f:J

    iput p7, p0, Lxg/a;->g:I

    return-void
.end method

.method public final l(Landroid/app/Activity;)V
    .locals 3

    check-cast p1, Lj/b;

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "rmmFragment"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lxg/b;

    invoke-direct {v1}, Lxg/b;-><init>()V

    invoke-virtual {v1, p0}, Lxg/b;->x2(Lxg/b$a;)V

    :try_start_0
    invoke-virtual {v1, p1, v0}, Le4/k;->t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k0()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lxg/a;->i:Ljava/util/List;

    new-instance v0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v1, "btn"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const-string p1, "appRatingPrompt"

    const-string v0, "impression"

    iget-object v1, p0, Lxg/a;->i:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lxg/a;->f()Lvi/g;

    move-result-object p1

    const-string v0, "Mobile-Ratings-Shown-Android"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RateMeMaybe"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public m(J)V
    .locals 5

    iget-object v0, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const-wide/16 v2, 0x0

    const-string v4, "PREF_LONGEST_GAME_DURATION"

    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    invoke-interface {v0, v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    :cond_0
    iget-object p1, p0, Lxg/a;->a:Landroid/content/SharedPreferences;

    const/4 p2, 0x0

    const-string v1, "PREF_GAMES_PLAYED"

    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
