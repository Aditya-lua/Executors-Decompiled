.class public abstract Lf1/c2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/c2;
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


# virtual methods
.method public abstract a()Lf1/c2;
.end method

.method public abstract b(I)Lf1/c2$a;
.end method

.method public abstract c(Landroid/util/Range;)Lf1/c2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lf1/c2$a;"
        }
    .end annotation
.end method

.method public abstract d(I)Lf1/c2$a;
.end method

.method public abstract e(Lf1/a0;)Lf1/c2$a;
.end method
