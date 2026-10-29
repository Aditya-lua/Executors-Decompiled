.class public Lnn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrn/c;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lnn/f;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lnn/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;",
            "Ljava/util/List<",
            "Lun/a;",
            ">;",
            "Ljava/util/List<",
            "Lsn/e;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;",
            "Lnn/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn/q;->a:Ljava/util/List;

    iput-object p2, p0, Lnn/q;->b:Ljava/util/List;

    iput-object p3, p0, Lnn/q;->c:Ljava/util/List;

    iput-object p4, p0, Lnn/q;->d:Ljava/util/Set;

    iput-object p5, p0, Lnn/q;->e:Lnn/f;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TD;>;",
            "Ljava/lang/String;",
            ")TD;"
        }
    .end annotation

    iget-object v0, p0, Lnn/q;->e:Lnn/f;

    invoke-virtual {v0, p1, p2}, Lnn/f;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/q;->c:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lun/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/q;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/q;->d:Ljava/util/Set;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/q;->a:Ljava/util/List;

    return-object v0
.end method
