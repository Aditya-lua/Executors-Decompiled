.class public final Lha/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lha/q;->a:Z

    iput-boolean p1, p0, Lha/q;->b:Z

    iput-boolean p1, p0, Lha/q;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Z)Lha/q;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lha/q;->a:Z

    return-object p0
.end method

.method public final b(Z)Lha/q;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lha/q;->b:Z

    return-object p0
.end method

.method public final c(Z)Lha/q;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lha/q;->c:Z

    return-object p0
.end method

.method public final d()Lha/r;
    .locals 2

    new-instance v0, Lha/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lha/r;-><init>(Lha/q;[B)V

    return-object v0
.end method

.method public final synthetic e()Z
    .locals 1

    iget-boolean v0, p0, Lha/q;->a:Z

    return v0
.end method

.method public final synthetic f()Z
    .locals 1

    iget-boolean v0, p0, Lha/q;->b:Z

    return v0
.end method

.method public final synthetic g()Z
    .locals 1

    iget-boolean v0, p0, Lha/q;->c:Z

    return v0
.end method
