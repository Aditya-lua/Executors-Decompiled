.class public Lri/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lri/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lri/g;


# direct methods
.method public constructor <init>(Lri/g;)V
    .locals 0

    iput-object p1, p0, Lri/g$a;->a:Lri/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 1

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lri/g$a;->b(Lal/a;Lmw/c;)V

    return-void
.end method

.method public b(Lal/a;Lmw/c;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleLocalization LanguageChangeTrigger.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

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

    invoke-static {v1, v2}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lyi/f;->b(Ljava/lang/String;)Lyi/f;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lyh/a;

    invoke-direct {v1, v0}, Lyh/a;-><init>(Lyi/f;)V

    invoke-virtual {p2, v1}, Lmw/c;->j(Ljava/lang/Object;)V

    :cond_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2, v3}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2, v3}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
