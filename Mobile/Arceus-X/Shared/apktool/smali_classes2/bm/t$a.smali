.class public Lbm/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm/t;->g(Landroid/app/Activity;Le3/k0;Ljava/lang/String;Lbm/t$d;Le3/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le3/p<",
        "Le3/l0;",
        "Lf3/n;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lbm/t$d;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lbm/t;


# direct methods
.method public constructor <init>(Lbm/t;Lbm/t$d;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbm/t$a;->c:Lbm/t;

    iput-object p2, p0, Lbm/t$a;->a:Lbm/t$d;

    iput-object p3, p0, Lbm/t$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lf3/n;

    invoke-virtual {p0, p1}, Lbm/t$a;->b(Lf3/n;)V

    return-void
.end method

.method public b(Lf3/n;)V
    .locals 2
    .param p1    # Lf3/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lbm/t;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error getting credentials: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    instance-of v0, p1, Lf3/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lf3/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lf3/s;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x6

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lf3/r;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public c(Le3/l0;)V
    .locals 3

    invoke-virtual {p1}, Le3/l0;->a()Le3/m;

    move-result-object p1

    instance-of v0, p1, Le3/t0;

    if-eqz v0, :cond_0

    check-cast p1, Le3/t0;

    invoke-virtual {p1}, Le3/t0;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    iget-object v1, p0, Lbm/t$a;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lbm/t$d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Le3/r0;

    if-eqz v0, :cond_1

    check-cast p1, Le3/r0;

    invoke-virtual {p1}, Le3/r0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Le3/r0;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "username"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "password"

    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lbm/t$a;->a:Lbm/t$d;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbm/t$a;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lbm/t$d;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v1, 0x4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iget-object p1, p0, Lbm/t$a;->a:Lbm/t$d;

    const/4 v0, 0x0

    const-string v1, "Unexpected GetCredentialResponse"

    invoke-interface {p1, v0, v1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le3/l0;

    invoke-virtual {p0, p1}, Lbm/t$a;->c(Le3/l0;)V

    return-void
.end method
