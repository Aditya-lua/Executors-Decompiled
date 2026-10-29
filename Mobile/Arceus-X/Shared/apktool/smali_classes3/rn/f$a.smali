.class public Lrn/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrn/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrn/h;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:Lrn/d;

.field public i:Lrn/a;

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrn/f$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrn/f$a;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrn/f$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrn/f$a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrn/f$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lrn/f$a;->f:Ljava/util/Set;

    invoke-static {}, Lnn/k;->t()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lrn/f$a;->g:Ljava/util/Set;

    sget-object v0, Lrn/a;->a:Lrn/a;

    iput-object v0, p0, Lrn/f$a;->i:Lrn/a;

    const v0, 0x7fffffff

    iput v0, p0, Lrn/f$a;->j:I

    return-void
.end method

.method public static bridge synthetic a(Lrn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic b(Lrn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic c(Lrn/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->g:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic d(Lrn/f$a;)Lrn/a;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->i:Lrn/a;

    return-object p0
.end method

.method public static bridge synthetic e(Lrn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic f(Lrn/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->f:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic g(Lrn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic h(Lrn/f$a;)I
    .locals 0

    iget p0, p0, Lrn/f$a;->j:I

    return p0
.end method

.method public static bridge synthetic i(Lrn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lrn/f$a;->e:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic j(Lrn/f$a;)Lrn/d;
    .locals 0

    invoke-virtual {p0}, Lrn/f$a;->l()Lrn/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public k()Lrn/f;
    .locals 2

    new-instance v0, Lrn/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrn/f;-><init>(Lrn/f$a;Lrn/g;)V

    return-object v0
.end method

.method public final l()Lrn/d;
    .locals 1

    iget-object v0, p0, Lrn/f$a;->h:Lrn/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lrn/e;

    invoke-direct {v0}, Lrn/e;-><init>()V

    return-object v0
.end method
