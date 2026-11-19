.class public Lfo/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfo/f;
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
            "Lho/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfo/h;",
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
            "Leo/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:Lfo/d;

.field public i:Lfo/a;

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfo/f$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfo/f$a;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfo/f$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfo/f$a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfo/f$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lfo/f$a;->f:Ljava/util/Set;

    invoke-static {}, Lao/k;->t()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lfo/f$a;->g:Ljava/util/Set;

    sget-object v0, Lfo/a;->a:Lfo/a;

    iput-object v0, p0, Lfo/f$a;->i:Lfo/a;

    const v0, 0x7fffffff

    iput v0, p0, Lfo/f$a;->j:I

    return-void
.end method

.method public static bridge synthetic a(Lfo/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic b(Lfo/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic c(Lfo/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->g:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic d(Lfo/f$a;)Lfo/a;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->i:Lfo/a;

    return-object p0
.end method

.method public static bridge synthetic e(Lfo/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic f(Lfo/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->f:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic g(Lfo/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic h(Lfo/f$a;)I
    .locals 0

    iget p0, p0, Lfo/f$a;->j:I

    return p0
.end method

.method public static bridge synthetic i(Lfo/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfo/f$a;->e:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic j(Lfo/f$a;)Lfo/d;
    .locals 0

    invoke-virtual {p0}, Lfo/f$a;->l()Lfo/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public k()Lfo/f;
    .locals 2

    new-instance v0, Lfo/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfo/f;-><init>(Lfo/f$a;Lfo/g;)V

    return-object v0
.end method

.method public final l()Lfo/d;
    .locals 1

    iget-object v0, p0, Lfo/f$a;->h:Lfo/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lfo/e;

    invoke-direct {v0}, Lfo/e;-><init>()V

    return-object v0
.end method
