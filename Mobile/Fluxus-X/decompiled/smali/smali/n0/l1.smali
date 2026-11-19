.class public final Ln0/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/l1$a;,
        Ln0/l1$b;
    }
.end annotation


# static fields
.field public static final i:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ln0/n1;

.field public final c:I

.field public final d:Z

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Z

.field public final g:Ln0/z3;

.field public final h:Ln0/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.captureConfig.rotation"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/l1;->i:Ln0/n1$a;

    const-string v0, "camerax.core.captureConfig.jpegQuality"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/l1;->j:Ln0/n1$a;

    const-string v0, "camerax.core.captureConfig.resolvedFrameRate"

    const-class v1, Landroid/util/Range;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/l1;->k:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ln0/n1;IZLjava/util/List;ZLn0/z3;Ln0/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;",
            "Ln0/n1;",
            "IZ",
            "Ljava/util/List<",
            "Ln0/u;",
            ">;Z",
            "Ln0/z3;",
            "Ln0/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/l1;->a:Ljava/util/List;

    iput-object p2, p0, Ln0/l1;->b:Ln0/n1;

    iput p3, p0, Ln0/l1;->c:I

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ln0/l1;->e:Ljava/util/List;

    iput-boolean p6, p0, Ln0/l1;->f:Z

    iput-object p7, p0, Ln0/l1;->g:Ln0/z3;

    iput-object p8, p0, Ln0/l1;->h:Ln0/e0;

    iput-boolean p4, p0, Ln0/l1;->d:Z

    return-void
.end method

.method public static synthetic a()Ln0/n1$a;
    .locals 1

    sget-object v0, Ln0/l1;->k:Ln0/n1$a;

    return-object v0
.end method

.method public static b()Ln0/l1;
    .locals 1

    new-instance v0, Ln0/l1$a;

    invoke-direct {v0}, Ln0/l1$a;-><init>()V

    invoke-virtual {v0}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1;->e:Ljava/util/List;

    return-object v0
.end method

.method public d()Ln0/e0;
    .locals 1

    iget-object v0, p0, Ln0/l1;->h:Ln0/e0;

    return-object v0
.end method

.method public e()Landroid/util/Range;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1;->b:Ln0/n1;

    sget-object v1, Ln0/l1;->k:Ln0/n1$a;

    sget-object v2, Ln0/t3;->a:Landroid/util/Range;

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Ln0/l1;->g:Ln0/z3;

    const-string v1, "CAPTURE_CONFIG_ID_KEY"

    invoke-virtual {v0, v1}, Ln0/z3;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public g()Ln0/n1;
    .locals 1

    iget-object v0, p0, Ln0/l1;->b:Ln0/n1;

    return-object v0
.end method

.method public h()I
    .locals 3

    iget-object v0, p0, Ln0/l1;->b:Ln0/n1;

    sget-object v1, Ln0/i4;->H:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public j()Ln0/z3;
    .locals 1

    iget-object v0, p0, Ln0/l1;->g:Ln0/z3;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Ln0/l1;->c:I

    return v0
.end method

.method public l()I
    .locals 3

    iget-object v0, p0, Ln0/l1;->b:Ln0/n1;

    sget-object v1, Ln0/i4;->I:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Ln0/l1;->d:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Ln0/l1;->f:Z

    return v0
.end method
