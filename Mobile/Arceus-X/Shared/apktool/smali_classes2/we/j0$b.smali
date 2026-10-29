.class public Lwe/j0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lef/a;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;"
        }
    .end annotation
.end field

.field public d:Lwe/j0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/j0$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field public e:Lwe/r;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwe/j0$b;->b:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwe/j0$b;->c:Ljava/util/List;

    .line 5
    iput-object p1, p0, Lwe/j0$b;->a:Ljava/lang/Class;

    .line 6
    sget-object p1, Lwe/r;->b:Lwe/r;

    iput-object p1, p0, Lwe/j0$b;->e:Lwe/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Lwe/j0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwe/j0$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lpe/l;Laf/j0$c;Z)Lwe/j0$b;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lpe/l;",
            "Laf/j0$c;",
            "Z)",
            "Lwe/j0$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0$b;->b:Ljava/util/Map;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v0

    sget-object v1, Laf/g0;->c:Laf/g0;

    if-ne v0, v1, :cond_2

    new-instance v2, Lwe/j0$c;

    invoke-static {p3}, Lpe/f;->a(Laf/j0$c;)[B

    move-result-object v0

    invoke-static {v0}, Lef/a;->a([B)Lef/a;

    move-result-object v4

    invoke-virtual {p3}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v5

    invoke-virtual {p3}, Laf/j0$c;->g0()Laf/p0;

    move-result-object v6

    invoke-virtual {p3}, Laf/j0$c;->f0()I

    move-result v7

    invoke-virtual {p3}, Laf/j0$c;->e0()Laf/f0;

    move-result-object p3

    invoke-virtual {p3}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    move-object v3, p1

    move-object v9, p2

    invoke-direct/range {v2 .. v10}, Lwe/j0$c;-><init>(Ljava/lang/Object;Lef/a;Laf/g0;Laf/p0;ILjava/lang/String;Lpe/l;Lwe/j0$a;)V

    iget-object p1, p0, Lwe/j0$b;->b:Ljava/util/Map;

    iget-object p2, p0, Lwe/j0$b;->c:Ljava/util/List;

    invoke-static {v2, p1, p2}, Lwe/j0;->a(Lwe/j0$c;Ljava/util/Map;Ljava/util/List;)V

    if-eqz p4, :cond_1

    iget-object p1, p0, Lwe/j0$b;->d:Lwe/j0$c;

    if-nez p1, :cond_0

    iput-object v2, p0, Lwe/j0$b;->d:Lwe/j0$c;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "`fullPrimitive` must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addEntry cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/Object;Lpe/l;Laf/j0$c;)Lwe/j0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lpe/l;",
            "Laf/j0$c;",
            ")",
            "Lwe/j0$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lwe/j0$b;->a(Ljava/lang/Object;Lpe/l;Laf/j0$c;Z)Lwe/j0$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;Lpe/l;Laf/j0$c;)Lwe/j0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lpe/l;",
            "Laf/j0$c;",
            ")",
            "Lwe/j0$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lwe/j0$b;->a(Ljava/lang/Object;Lpe/l;Laf/j0$c;Z)Lwe/j0$b;

    move-result-object p1

    return-object p1
.end method

.method public d()Lwe/j0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwe/j0<",
            "TP;>;"
        }
    .end annotation

    iget-object v1, p0, Lwe/j0$b;->b:Ljava/util/Map;

    if-eqz v1, :cond_0

    new-instance v0, Lwe/j0;

    iget-object v2, p0, Lwe/j0$b;->c:Ljava/util/List;

    iget-object v3, p0, Lwe/j0$b;->d:Lwe/j0$c;

    iget-object v4, p0, Lwe/j0$b;->e:Lwe/r;

    iget-object v5, p0, Lwe/j0$b;->a:Ljava/lang/Class;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lwe/j0;-><init>(Ljava/util/Map;Ljava/util/List;Lwe/j0$c;Lwe/r;Ljava/lang/Class;Lwe/j0$a;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lwe/j0$b;->b:Ljava/util/Map;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lwe/r;)Lwe/j0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/r;",
            ")",
            "Lwe/j0$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0$b;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lwe/j0$b;->e:Lwe/r;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
