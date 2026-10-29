.class public abstract Ltk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lorg/json/JSONObject;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(ZLorg/json/JSONObject;)V
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltk/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public abstract c()Landroid/content/Context;
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltk/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltk/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Ltk/a;->c:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Ltk/a;->c:Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Ltk/a;->c:Lorg/json/JSONObject;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltk/a;->d:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltk/a;->b:Ljava/lang/String;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltk/a;->a:Ljava/lang/String;

    return-void
.end method

.method public j(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Ltk/a;->c:Lorg/json/JSONObject;

    return-void
.end method
