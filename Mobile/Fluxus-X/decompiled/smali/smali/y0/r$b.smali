.class public abstract Ly0/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Lx0/n0;Lx0/n0;Ljava/util/List;)Ly0/r$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Lx0/n0;",
            "Ljava/util/List<",
            "Ly0/d;",
            ">;)",
            "Ly0/r$b;"
        }
    .end annotation

    new-instance v0, Ly0/b;

    invoke-direct {v0, p0, p1, p2}, Ly0/b;-><init>(Lx0/n0;Lx0/n0;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly0/d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lx0/n0;
.end method

.method public abstract c()Lx0/n0;
.end method
