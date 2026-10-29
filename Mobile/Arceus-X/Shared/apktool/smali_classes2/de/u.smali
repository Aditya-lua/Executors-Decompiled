.class public abstract Lde/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I)Lde/u;
.end method

.method public abstract b(Ljava/util/Map;)Lde/u;
.end method

.method public abstract c()Lde/v;
.end method

.method public abstract d()Ljava/util/Map;
.end method

.method public final e()Lde/v;
    .locals 1

    invoke-virtual {p0}, Lde/u;->d()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lde/u;->b(Ljava/util/Map;)Lde/u;

    invoke-virtual {p0}, Lde/u;->c()Lde/v;

    move-result-object v0

    return-object v0
.end method
