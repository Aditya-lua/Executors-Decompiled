.class public Lcom/google/android/gms/internal/measurement/gb;
.super Lcom/google/android/gms/internal/measurement/u9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/kb<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/measurement/gb<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/measurement/u9<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/kb;

.field public b:Lcom/google/android/gms/internal/measurement/kb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/kb;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/u9;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/gb;->a:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/kb;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/kb;->m()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static q(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ad;->a()Lcom/google/android/gms/internal/measurement/ad;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/ad;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/dd;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/dd;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic T()Lcom/google/android/gms/internal/measurement/sc;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->u()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/kb;->C(Lcom/google/android/gms/internal/measurement/kb;Z)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic l([BII)Lcom/google/android/gms/internal/measurement/u9;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/measurement/va;->b:Lcom/google/android/gms/internal/measurement/va;

    sget-object p2, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    const/4 p2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/measurement/va;->c:Lcom/google/android/gms/internal/measurement/va;

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/measurement/gb;->y([BIILcom/google/android/gms/internal/measurement/va;)Lcom/google/android/gms/internal/measurement/gb;

    return-object p0
.end method

.method public final bridge synthetic o([BIILcom/google/android/gms/internal/measurement/va;)Lcom/google/android/gms/internal/measurement/u9;
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/gb;->y([BIILcom/google/android/gms/internal/measurement/va;)Lcom/google/android/gms/internal/measurement/gb;

    return-object p0
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->s()V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->a:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->m()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/gb;->q(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    return-void
.end method

.method public final t()Lcom/google/android/gms/internal/measurement/gb;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->a:Lcom/google/android/gms/internal/measurement/kb;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/kb;->E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->u()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    return-object v0
.end method

.method public u()Lcom/google/android/gms/internal/measurement/kb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    return-object v0
.end method

.method public final v()Lcom/google/android/gms/internal/measurement/kb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->u()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/od;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/od;-><init>(Lcom/google/android/gms/internal/measurement/sc;)V

    throw v1
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/kb;)Lcom/google/android/gms/internal/measurement/gb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->a:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/kb;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->s()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/gb;->q(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final y([BIILcom/google/android/gms/internal/measurement/va;)Lcom/google/android/gms/internal/measurement/gb;
    .locals 7

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/kb;->k()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->s()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ad;->a()Lcom/google/android/gms/internal/measurement/ad;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/ad;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/dd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    new-instance v6, Lcom/google/android/gms/internal/measurement/z9;

    invoke-direct {v6, p4}, Lcom/google/android/gms/internal/measurement/z9;-><init>(Lcom/google/android/gms/internal/measurement/va;)V

    const/4 v4, 0x0

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/dd;->d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/z9;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/wb; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/wb;

    const-string p2, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/wb;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    throw p1
.end method
