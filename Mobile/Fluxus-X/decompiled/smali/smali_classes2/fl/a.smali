.class public Lfl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfl/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 3

    const-string v0, "rbx.platform"

    const-string v1, "UserAgentInterceptor.intercept()"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v0

    const-string v1, "User-Agent"

    iget-object v2, p0, Lfl/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
