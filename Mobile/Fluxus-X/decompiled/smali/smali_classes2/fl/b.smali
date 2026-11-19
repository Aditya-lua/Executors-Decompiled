.class public Lfl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# static fields
.field public static b:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.platform"

    iput-object v0, p0, Lfl/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lfl/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lfl/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Lmv/f0;Ljava/lang/String;)Lmv/f0;
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "XSRFTokenInterceptor.putXSRFTokenInRequest() token:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lfl/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.platform"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0, p2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 3

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-static {}, Lfl/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lfl/b;->b(Lmv/f0;Ljava/lang/String;)Lmv/f0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0;->f()I

    move-result v0

    const/16 v1, 0x193

    if-ne v0, v1, :cond_0

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0}, Lmv/h0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XSRFTokenInterceptor.intercept() new token:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.platform"

    invoke-static {v2, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lfl/b;->c(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method
