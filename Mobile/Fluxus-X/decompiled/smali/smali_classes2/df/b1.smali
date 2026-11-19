.class public abstract Ldf/b1;
.super Lre/l;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lre/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Ldf/b1;->c()Ldf/c1;

    move-result-object v0

    invoke-virtual {v0}, Lre/l;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lgf/a;
    .locals 1

    invoke-virtual {p0}, Ldf/b1;->c()Ldf/c1;

    move-result-object v0

    invoke-virtual {v0}, Ldf/c1;->b()Lgf/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Ldf/c1;
.end method
