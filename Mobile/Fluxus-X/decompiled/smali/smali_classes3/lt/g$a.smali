.class public Llt/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llt/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lmt/c;

.field public b:Lpt/a;

.field public c:Lrt/a;

.field public d:Llt/c;

.field public e:Lqt/a;

.field public f:Lpt/d;

.field public g:Llt/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Llt/g$a;)Lpt/a;
    .locals 0

    iget-object p0, p0, Llt/g$a;->b:Lpt/a;

    return-object p0
.end method

.method public static bridge synthetic b(Llt/g$a;)Lqt/a;
    .locals 0

    iget-object p0, p0, Llt/g$a;->e:Lqt/a;

    return-object p0
.end method

.method public static bridge synthetic c(Llt/g$a;)Lpt/d;
    .locals 0

    iget-object p0, p0, Llt/g$a;->f:Lpt/d;

    return-object p0
.end method

.method public static bridge synthetic d(Llt/g$a;)Llt/c;
    .locals 0

    iget-object p0, p0, Llt/g$a;->d:Llt/c;

    return-object p0
.end method

.method public static bridge synthetic e(Llt/g$a;)Llt/k;
    .locals 0

    iget-object p0, p0, Llt/g$a;->g:Llt/k;

    return-object p0
.end method

.method public static bridge synthetic f(Llt/g$a;)Lrt/a;
    .locals 0

    iget-object p0, p0, Llt/g$a;->c:Lrt/a;

    return-object p0
.end method

.method public static bridge synthetic g(Llt/g$a;)Lmt/c;
    .locals 0

    iget-object p0, p0, Llt/g$a;->a:Lmt/c;

    return-object p0
.end method


# virtual methods
.method public h(Lmt/c;Llt/k;)Llt/g;
    .locals 0
    .param p1    # Lmt/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Llt/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Llt/g$a;->a:Lmt/c;

    iput-object p2, p0, Llt/g$a;->g:Llt/k;

    iget-object p1, p0, Llt/g$a;->b:Lpt/a;

    if-nez p1, :cond_0

    invoke-static {}, Lpt/a;->a()Lpt/a;

    move-result-object p1

    iput-object p1, p0, Llt/g$a;->b:Lpt/a;

    :cond_0
    iget-object p1, p0, Llt/g$a;->c:Lrt/a;

    if-nez p1, :cond_1

    new-instance p1, Lrt/b;

    invoke-direct {p1}, Lrt/b;-><init>()V

    iput-object p1, p0, Llt/g$a;->c:Lrt/a;

    :cond_1
    iget-object p1, p0, Llt/g$a;->d:Llt/c;

    if-nez p1, :cond_2

    new-instance p1, Llt/d;

    invoke-direct {p1}, Llt/d;-><init>()V

    iput-object p1, p0, Llt/g$a;->d:Llt/c;

    :cond_2
    iget-object p1, p0, Llt/g$a;->e:Lqt/a;

    if-nez p1, :cond_3

    invoke-static {}, Lqt/a;->a()Lqt/a;

    move-result-object p1

    iput-object p1, p0, Llt/g$a;->e:Lqt/a;

    :cond_3
    iget-object p1, p0, Llt/g$a;->f:Lpt/d;

    if-nez p1, :cond_4

    new-instance p1, Lpt/e;

    invoke-direct {p1}, Lpt/e;-><init>()V

    iput-object p1, p0, Llt/g$a;->f:Lpt/d;

    :cond_4
    new-instance p1, Llt/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Llt/g;-><init>(Llt/g$a;Llt/h;)V

    return-object p1
.end method
