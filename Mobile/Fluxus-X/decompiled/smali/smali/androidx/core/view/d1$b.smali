.class public abstract Landroidx/core/view/d1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public a:Landroidx/core/view/WindowInsetsCompat;

.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/core/view/d1$b;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Landroidx/core/view/d1$b;->b:I

    return v0
.end method

.method public b(Landroidx/core/view/d1;)V
    .locals 0

    return-void
.end method

.method public c(Landroidx/core/view/d1;)V
    .locals 0

    return-void
.end method

.method public abstract d(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/d1;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation
.end method

.method public abstract e(Landroidx/core/view/d1;Landroidx/core/view/d1$a;)Landroidx/core/view/d1$a;
.end method
