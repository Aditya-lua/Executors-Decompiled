.class public final Ltd/a0;
.super Ltd/q0;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ltd/r1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltd/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltd/r1;)Ltd/q0;
    .locals 0

    iput-object p1, p0, Ltd/a0;->b:Ltd/r1;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Ltd/q0;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ltd/a0;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null token"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Ltd/r0;
    .locals 3

    iget-object v0, p0, Ltd/a0;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ltd/a0;->b:Ltd/r1;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ltd/r0;

    invoke-direct {v2, v0, v1}, Ltd/r0;-><init>(Ljava/lang/String;Ltd/r1;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltd/a0;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Ltd/a0;->b:Ltd/r1;

    if-nez v1, :cond_3

    const-string v1, " integrityDialogWrapper"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
