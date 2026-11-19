.class public Llt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt/g$a;
    }
.end annotation


# instance fields
.field public final a:Lmt/c;

.field public final b:Lpt/a;

.field public final c:Lrt/a;

.field public final d:Llt/c;

.field public final e:Lqt/a;

.field public final f:Lpt/d;

.field public final g:Llt/k;


# direct methods
.method public constructor <init>(Llt/g$a;)V
    .locals 1
    .param p1    # Llt/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Llt/g$a;->g(Llt/g$a;)Lmt/c;

    move-result-object v0

    iput-object v0, p0, Llt/g;->a:Lmt/c;

    .line 4
    invoke-static {p1}, Llt/g$a;->a(Llt/g$a;)Lpt/a;

    move-result-object v0

    iput-object v0, p0, Llt/g;->b:Lpt/a;

    .line 5
    invoke-static {p1}, Llt/g$a;->f(Llt/g$a;)Lrt/a;

    move-result-object v0

    iput-object v0, p0, Llt/g;->c:Lrt/a;

    .line 6
    invoke-static {p1}, Llt/g$a;->d(Llt/g$a;)Llt/c;

    move-result-object v0

    iput-object v0, p0, Llt/g;->d:Llt/c;

    .line 7
    invoke-static {p1}, Llt/g$a;->b(Llt/g$a;)Lqt/a;

    move-result-object v0

    iput-object v0, p0, Llt/g;->e:Lqt/a;

    .line 8
    invoke-static {p1}, Llt/g$a;->c(Llt/g$a;)Lpt/d;

    move-result-object v0

    iput-object v0, p0, Llt/g;->f:Lpt/d;

    .line 9
    invoke-static {p1}, Llt/g$a;->e(Llt/g$a;)Llt/k;

    move-result-object p1

    iput-object p1, p0, Llt/g;->g:Llt/k;

    return-void
.end method

.method public synthetic constructor <init>(Llt/g$a;Llt/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llt/g;-><init>(Llt/g$a;)V

    return-void
.end method


# virtual methods
.method public a()Lqt/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/g;->e:Lqt/a;

    return-object v0
.end method

.method public b()Llt/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/g;->d:Llt/c;

    return-object v0
.end method

.method public c()Llt/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/g;->g:Llt/k;

    return-object v0
.end method

.method public d()Lrt/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/g;->c:Lrt/a;

    return-object v0
.end method

.method public e()Lmt/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/g;->a:Lmt/c;

    return-object v0
.end method
