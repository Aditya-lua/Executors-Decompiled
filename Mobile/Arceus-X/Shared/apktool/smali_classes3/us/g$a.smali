.class public Lus/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lus/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lvs/c;

.field public b:Lys/a;

.field public c:Lat/a;

.field public d:Lus/c;

.field public e:Lzs/a;

.field public f:Lys/d;

.field public g:Lus/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lus/g$a;)Lys/a;
    .locals 0

    iget-object p0, p0, Lus/g$a;->b:Lys/a;

    return-object p0
.end method

.method public static bridge synthetic b(Lus/g$a;)Lzs/a;
    .locals 0

    iget-object p0, p0, Lus/g$a;->e:Lzs/a;

    return-object p0
.end method

.method public static bridge synthetic c(Lus/g$a;)Lys/d;
    .locals 0

    iget-object p0, p0, Lus/g$a;->f:Lys/d;

    return-object p0
.end method

.method public static bridge synthetic d(Lus/g$a;)Lus/c;
    .locals 0

    iget-object p0, p0, Lus/g$a;->d:Lus/c;

    return-object p0
.end method

.method public static bridge synthetic e(Lus/g$a;)Lus/k;
    .locals 0

    iget-object p0, p0, Lus/g$a;->g:Lus/k;

    return-object p0
.end method

.method public static bridge synthetic f(Lus/g$a;)Lat/a;
    .locals 0

    iget-object p0, p0, Lus/g$a;->c:Lat/a;

    return-object p0
.end method

.method public static bridge synthetic g(Lus/g$a;)Lvs/c;
    .locals 0

    iget-object p0, p0, Lus/g$a;->a:Lvs/c;

    return-object p0
.end method


# virtual methods
.method public h(Lvs/c;Lus/k;)Lus/g;
    .locals 0
    .param p1    # Lvs/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lus/g$a;->a:Lvs/c;

    iput-object p2, p0, Lus/g$a;->g:Lus/k;

    iget-object p1, p0, Lus/g$a;->b:Lys/a;

    if-nez p1, :cond_0

    invoke-static {}, Lys/a;->a()Lys/a;

    move-result-object p1

    iput-object p1, p0, Lus/g$a;->b:Lys/a;

    :cond_0
    iget-object p1, p0, Lus/g$a;->c:Lat/a;

    if-nez p1, :cond_1

    new-instance p1, Lat/b;

    invoke-direct {p1}, Lat/b;-><init>()V

    iput-object p1, p0, Lus/g$a;->c:Lat/a;

    :cond_1
    iget-object p1, p0, Lus/g$a;->d:Lus/c;

    if-nez p1, :cond_2

    new-instance p1, Lus/d;

    invoke-direct {p1}, Lus/d;-><init>()V

    iput-object p1, p0, Lus/g$a;->d:Lus/c;

    :cond_2
    iget-object p1, p0, Lus/g$a;->e:Lzs/a;

    if-nez p1, :cond_3

    invoke-static {}, Lzs/a;->a()Lzs/a;

    move-result-object p1

    iput-object p1, p0, Lus/g$a;->e:Lzs/a;

    :cond_3
    iget-object p1, p0, Lus/g$a;->f:Lys/d;

    if-nez p1, :cond_4

    new-instance p1, Lys/e;

    invoke-direct {p1}, Lys/e;-><init>()V

    iput-object p1, p0, Lus/g$a;->f:Lys/d;

    :cond_4
    new-instance p1, Lus/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lus/g;-><init>(Lus/g$a;Lus/h;)V

    return-object p1
.end method
