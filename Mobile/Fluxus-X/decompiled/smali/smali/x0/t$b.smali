.class public abstract Lx0/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/t;
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

.method public static d(IILy1/c$a;)Lx0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;)",
            "Lx0/a;"
        }
    .end annotation

    new-instance v0, Lx0/a;

    invoke-direct {v0, p0, p1, p2}, Lx0/a;-><init>(IILy1/c$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method
