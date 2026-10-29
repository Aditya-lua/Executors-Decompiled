.class public Lji/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lji/h;


# direct methods
.method public constructor <init>(Lji/h;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lji/h$a;->a:Lji/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lji/h;Lji/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lji/h$a;-><init>(Lji/h;)V

    return-void
.end method


# virtual methods
.method public a(Ltk/a;)V
    .locals 6

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "params"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "urlPath"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v2, v1

    :goto_0
    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v0, v1

    move-object v2, v0

    goto :goto_0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Navigation"

    invoke-static {v5, v4}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_3

    invoke-virtual {p0, v2}, Lji/h$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v4, Lph/g;

    invoke-direct {v4, v2}, Lph/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lph/g;->i(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-virtual {v4, v0}, Lph/g;->h(Lorg/json/JSONObject;)V

    :cond_2
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lfv/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0, v1}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "Settings"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "SETTINGS_TAG"

    return-object p1

    :cond_0
    const-string v0, "Friends"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "FRIENDS_TAG"

    return-object p1

    :cond_1
    const-string v0, "Games"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "GAMES_TAG"

    return-object p1

    :cond_2
    const-string v0, "Home"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "HOME_TAG"

    return-object p1

    :cond_3
    const-string v0, "Messages"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "MESSAGES_TAG"

    return-object p1

    :cond_4
    const-string v0, "Avatar"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "AVATAR_EDITOR_TAG"

    return-object p1

    :cond_5
    const-string v0, "Abuse Report"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p1, "ABUSE_REPORT_TAG"

    return-object p1

    :cond_6
    const-string v0, "Friend Finder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p1, "FRIEND_FINDER_TAG"

    return-object p1

    :cond_7
    const-string v0, "Universal Friends"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p1, "UNIVERSAL_FRIENDS_TAG"

    return-object p1

    :cond_8
    const-string v0, "GameDetails"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p1, "GAME_DETAILS_TAG"

    return-object p1

    :cond_9
    const-string v0, "CaptchaSuccess"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string p1, "CAPTCHA_SUCCESS_TAG"

    return-object p1

    :cond_a
    const-string v0, "CaptchaShown"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    const-string p1, "CAPTCHA_SHOWN_TAG"

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method
