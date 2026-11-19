.class public abstract Lm0/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(ILjava/util/List;)Lm0/u0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lm0/u0$a;"
        }
    .end annotation

    new-instance v0, Lm0/g;

    new-instance v1, Lx0/u;

    invoke-direct {v1}, Lx0/u;-><init>()V

    new-instance v2, Lx0/u;

    invoke-direct {v2}, Lx0/u;-><init>()V

    invoke-direct {v0, v1, v2, p0, p1}, Lm0/g;-><init>(Lx0/u;Lx0/u;ILjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/u0$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()I
.end method

.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/u0$b;",
            ">;"
        }
    .end annotation
.end method
