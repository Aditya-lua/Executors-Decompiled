.class public Lni/c;
.super Lsk/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsk/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->d()I

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()J
    .locals 2

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->l()Z

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->n()Z

    move-result v0

    return v0
.end method
