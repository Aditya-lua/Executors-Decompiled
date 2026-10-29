.class public Ljj/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljj/a0;


# direct methods
.method public constructor <init>(Ljj/a0;)V
    .locals 0

    iput-object p1, p0, Ljj/a0$a;->a:Ljj/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmj/g0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljj/k;)V
    .locals 7

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmj/g0;->a()Lorg/json/JSONObject;

    move-result-object p1

    :try_start_0
    invoke-virtual {p5, p1, p2}, Ljj/k;->d(Lorg/json/JSONObject;Landroid/content/Context;)V

    const-string v0, "onMetadataRetrieved"

    const-string p2, "type"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p2, "notificationId"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "0"

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p3

    move-object v4, p4

    invoke-static/range {v0 .. v6}, Lsg/t0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method
