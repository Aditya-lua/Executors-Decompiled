.class public abstract Lx0/v0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/v0;
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

.method public static c(Lx0/n0;Ljava/util/List;)Lx0/v0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ljava/util/List<",
            "Lz0/f;",
            ">;)",
            "Lx0/v0$b;"
        }
    .end annotation

    new-instance v0, Lx0/c;

    invoke-direct {v0, p0, p1}, Lx0/c;-><init>(Lx0/n0;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz0/f;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lx0/n0;
.end method
