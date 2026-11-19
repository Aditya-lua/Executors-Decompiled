.class public abstract Lfe/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I)Lfe/u;
.end method

.method public abstract b(Ljava/util/Map;)Lfe/u;
.end method

.method public abstract c()Lfe/v;
.end method

.method public abstract d()Ljava/util/Map;
.end method

.method public final e()Lfe/v;
    .locals 1

    invoke-virtual {p0}, Lfe/u;->d()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfe/u;->b(Ljava/util/Map;)Lfe/u;

    invoke-virtual {p0}, Lfe/u;->c()Lfe/v;

    move-result-object v0

    return-object v0
.end method
