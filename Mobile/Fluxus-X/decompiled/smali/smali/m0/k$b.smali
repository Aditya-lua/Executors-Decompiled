.class public abstract Lm0/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/k;
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

.method public static c(Lx0/b0;I)Lm0/k$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;I)",
            "Lm0/k$b;"
        }
    .end annotation

    new-instance v0, Lm0/a;

    invoke-direct {v0, p0, p1}, Lm0/a;-><init>(Lx0/b0;I)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Lx0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end method
