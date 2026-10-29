.class public final Ltd/y0;
.super Ltd/c$d$a;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltd/c$d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ltd/c$d;
    .locals 4

    iget-object v0, p0, Ltd/y0;->b:Ljava/util/Set;

    if-eqz v0, :cond_0

    new-instance v1, Ltd/a1;

    iget-object v2, p0, Ltd/y0;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ltd/a1;-><init>(Ljava/lang/String;Ljava/util/Set;Ltd/z0;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: verdictOptOut"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ljava/lang/String;)Ltd/c$d$a;
    .locals 0

    iput-object p1, p0, Ltd/y0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Set;)Ltd/c$d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ltd/c$d$a;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Ltd/y0;->b:Ljava/util/Set;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null verdictOptOut"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
