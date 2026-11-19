.class public Ldj/h$a;
.super Lmi/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/h;->m(Ldj/h$d;Lmi/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/h$d;

.field public final synthetic b:Ldj/h;


# direct methods
.method public constructor <init>(Ldj/h;Ldj/h$d;)V
    .locals 0

    iput-object p1, p0, Ldj/h$a;->b:Ldj/h;

    iput-object p2, p0, Ldj/h$a;->a:Ldj/h$d;

    invoke-direct {p0}, Lmi/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lmi/j;)V
    .locals 4

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->f()I

    move-result v1

    invoke-virtual {p1}, Lmi/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lmi/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "robux"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lnk/c;->t(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    iget-object p1, p0, Ldj/h$a;->a:Ldj/h$d;

    if-eqz p1, :cond_1

    invoke-interface {p1, v3, v1}, Ldj/h$d;->a(ZI)V

    :cond_1
    return-void
.end method
