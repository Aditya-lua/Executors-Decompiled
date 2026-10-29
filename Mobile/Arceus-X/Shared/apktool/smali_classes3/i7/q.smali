.class public Li7/q;
.super Li7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        ">",
        "Li7/a<",
        "TK;TA;>;"
    }
.end annotation


# instance fields
.field public final i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "TA;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Li7/q;-><init>(Lt7/c;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lt7/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "TA;>;TA;)V"
        }
    .end annotation

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, v0}, Li7/a;-><init>(Ljava/util/List;)V

    .line 3
    invoke-virtual {p0, p1}, Li7/a;->o(Lt7/c;)V

    .line 4
    iput-object p2, p0, Li7/q;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public h()Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    iget-object v0, p0, Li7/a;->e:Lt7/c;

    iget-object v3, p0, Li7/q;->i:Ljava/lang/Object;

    invoke-virtual {p0}, Li7/a;->f()F

    move-result v5

    invoke-virtual {p0}, Li7/a;->f()F

    move-result v6

    invoke-virtual {p0}, Li7/a;->f()F

    move-result v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    invoke-virtual/range {v0 .. v7}, Lt7/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i(Lt7/a;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/a<",
            "TK;>;F)TA;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/q;->h()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Li7/a;->e:Lt7/c;

    if-eqz v0, :cond_0

    invoke-super {p0}, Li7/a;->l()V

    :cond_0
    return-void
.end method

.method public n(F)V
    .locals 0

    iput p1, p0, Li7/a;->d:F

    return-void
.end method
