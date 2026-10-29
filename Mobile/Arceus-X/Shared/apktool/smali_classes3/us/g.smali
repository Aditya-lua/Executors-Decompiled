.class public Lus/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lus/g$a;
    }
.end annotation


# instance fields
.field public final a:Lvs/c;

.field public final b:Lys/a;

.field public final c:Lat/a;

.field public final d:Lus/c;

.field public final e:Lzs/a;

.field public final f:Lys/d;

.field public final g:Lus/k;


# direct methods
.method public constructor <init>(Lus/g$a;)V
    .locals 1
    .param p1    # Lus/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lus/g$a;->g(Lus/g$a;)Lvs/c;

    move-result-object v0

    iput-object v0, p0, Lus/g;->a:Lvs/c;

    .line 4
    invoke-static {p1}, Lus/g$a;->a(Lus/g$a;)Lys/a;

    move-result-object v0

    iput-object v0, p0, Lus/g;->b:Lys/a;

    .line 5
    invoke-static {p1}, Lus/g$a;->f(Lus/g$a;)Lat/a;

    move-result-object v0

    iput-object v0, p0, Lus/g;->c:Lat/a;

    .line 6
    invoke-static {p1}, Lus/g$a;->d(Lus/g$a;)Lus/c;

    move-result-object v0

    iput-object v0, p0, Lus/g;->d:Lus/c;

    .line 7
    invoke-static {p1}, Lus/g$a;->b(Lus/g$a;)Lzs/a;

    move-result-object v0

    iput-object v0, p0, Lus/g;->e:Lzs/a;

    .line 8
    invoke-static {p1}, Lus/g$a;->c(Lus/g$a;)Lys/d;

    move-result-object v0

    iput-object v0, p0, Lus/g;->f:Lys/d;

    .line 9
    invoke-static {p1}, Lus/g$a;->e(Lus/g$a;)Lus/k;

    move-result-object p1

    iput-object p1, p0, Lus/g;->g:Lus/k;

    return-void
.end method

.method public synthetic constructor <init>(Lus/g$a;Lus/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lus/g;-><init>(Lus/g$a;)V

    return-void
.end method


# virtual methods
.method public a()Lzs/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/g;->e:Lzs/a;

    return-object v0
.end method

.method public b()Lus/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/g;->d:Lus/c;

    return-object v0
.end method

.method public c()Lus/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/g;->g:Lus/k;

    return-object v0
.end method

.method public d()Lat/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/g;->c:Lat/a;

    return-object v0
.end method

.method public e()Lvs/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/g;->a:Lvs/c;

    return-object v0
.end method
