.class public abstract Lbf/b1;
.super Lpe/l;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpe/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lbf/b1;->c()Lbf/c1;

    move-result-object v0

    invoke-virtual {v0}, Lpe/l;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lef/a;
    .locals 1

    invoke-virtual {p0}, Lbf/b1;->c()Lbf/c1;

    move-result-object v0

    invoke-virtual {v0}, Lbf/c1;->b()Lef/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Lbf/c1;
.end method
