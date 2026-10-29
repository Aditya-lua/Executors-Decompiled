.class public Lqi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/c;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lqi/d;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "PREF_NAME_UGC_LOCALE"

    invoke-virtual {p0, v0, p1}, Lqi/d;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()Lqi/f;
    .locals 3

    invoke-virtual {p0}, Lqi/d;->g()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "DEFAULT_LOCALE_VALUE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqi/f;->b(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Lqi/f;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lqi/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqi/d;->h(Ljava/lang/String;)V

    return-void
.end method

.method public d()Lqi/f;
    .locals 3

    invoke-virtual {p0}, Lqi/d;->g()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "PREF_NAME_UGC_LOCALE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqi/f;->b(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    return-object v0
.end method

.method public e(Lqi/f;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lqi/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqi/d;->j(Ljava/lang/String;)V

    return-void
.end method

.method public f()Lqi/f;
    .locals 3

    invoke-virtual {p0}, Lqi/d;->g()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "PREF_NAME_SELECTED_LOCALE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqi/f;->b(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    return-object v0
.end method

.method public final g()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lqi/d;->a:Landroid/content/Context;

    const-string v1, "LocaleSettingsPreferences"

    invoke-static {v0, v1}, Lgk/z;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    const-string v0, "DEFAULT_LOCALE_VALUE"

    invoke-virtual {p0, v0, p1}, Lqi/d;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lqi/d;->g()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    const-string v0, "PREF_NAME_SELECTED_LOCALE"

    invoke-virtual {p0, v0, p1}, Lqi/d;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
