.class public Lji/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lji/g;


# direct methods
.method public constructor <init>(Lji/g;)V
    .locals 0

    iput-object p1, p0, Lji/g$a;->a:Lji/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltk/a;)V
    .locals 1

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lji/g$a;->b(Ltk/a;Lfv/c;)V

    return-void
.end method

.method public b(Ltk/a;Lfv/c;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleLocalization LanguageChangeTrigger.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "newRobloxLanguageValue"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "newRobloxLocaleValue "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lqi/f;->b(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lph/a;

    invoke-direct {v1, v0}, Lph/a;-><init>(Lqi/f;)V

    invoke-virtual {p2, v1}, Lfv/c;->j(Ljava/lang/Object;)V

    :cond_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2, v3}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2, v3}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
