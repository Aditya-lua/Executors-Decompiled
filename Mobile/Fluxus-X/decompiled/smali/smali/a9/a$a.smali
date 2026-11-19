.class public final La9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public a:La9/a$e;

.field public b:La9/a$b;

.field public c:La9/a$d;

.field public d:La9/a$c;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:I

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, La9/a$e;->A3()La9/a$e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La9/a$e$a;->b(Z)La9/a$e$a;

    invoke-virtual {v0}, La9/a$e$a;->a()La9/a$e;

    move-result-object v0

    iput-object v0, p0, La9/a$a;->a:La9/a$e;

    invoke-static {}, La9/a$b;->A3()La9/a$b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, La9/a$b$a;->g(Z)La9/a$b$a;

    invoke-virtual {v0}, La9/a$b$a;->b()La9/a$b;

    move-result-object v0

    iput-object v0, p0, La9/a$a;->b:La9/a$b;

    invoke-static {}, La9/a$d;->A3()La9/a$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, La9/a$d$a;->d(Z)La9/a$d$a;

    invoke-virtual {v0}, La9/a$d$a;->a()La9/a$d;

    move-result-object v0

    iput-object v0, p0, La9/a$a;->c:La9/a$d;

    invoke-static {}, La9/a$c;->A3()La9/a$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, La9/a$c$a;->c(Z)La9/a$c$a;

    invoke-virtual {v0}, La9/a$c$a;->a()La9/a$c;

    move-result-object v0

    iput-object v0, p0, La9/a$a;->d:La9/a$c;

    return-void
.end method


# virtual methods
.method public a()La9/a;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/a;

    iget-object v1, p0, La9/a$a;->a:La9/a$e;

    iget-object v2, p0, La9/a$a;->b:La9/a$b;

    iget-object v3, p0, La9/a$a;->e:Ljava/lang/String;

    iget-boolean v4, p0, La9/a$a;->f:Z

    iget v5, p0, La9/a$a;->g:I

    iget-object v6, p0, La9/a$a;->c:La9/a$d;

    iget-object v7, p0, La9/a$a;->d:La9/a$c;

    iget-boolean v8, p0, La9/a$a;->h:Z

    invoke-direct/range {v0 .. v8}, La9/a;-><init>(La9/a$e;La9/a$b;Ljava/lang/String;ZILa9/a$d;La9/a$c;Z)V

    return-object v0
.end method

.method public b(Z)La9/a$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, La9/a$a;->f:Z

    return-object p0
.end method

.method public c(La9/a$b;)La9/a$a;
    .locals 0
    .param p1    # La9/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$b;

    iput-object p1, p0, La9/a$a;->b:La9/a$b;

    return-object p0
.end method

.method public d(La9/a$c;)La9/a$a;
    .locals 0
    .param p1    # La9/a$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$c;

    iput-object p1, p0, La9/a$a;->d:La9/a$c;

    return-object p0
.end method

.method public e(La9/a$d;)La9/a$a;
    .locals 0
    .param p1    # La9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$d;

    iput-object p1, p0, La9/a$a;->c:La9/a$d;

    return-object p0
.end method

.method public f(La9/a$e;)La9/a$a;
    .locals 0
    .param p1    # La9/a$e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/a$e;

    iput-object p1, p0, La9/a$a;->a:La9/a$e;

    return-object p0
.end method

.method public g(Z)La9/a$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, La9/a$a;->h:Z

    return-object p0
.end method

.method public final h(Ljava/lang/String;)La9/a$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, La9/a$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final i(I)La9/a$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, La9/a$a;->g:I

    return-object p0
.end method
