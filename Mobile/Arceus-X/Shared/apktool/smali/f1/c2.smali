.class public abstract Lf1/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/c2$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lf1/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7fffffff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Lf1/c2;->a:Landroid/util/Range;

    sget-object v0, Lf1/x;->c:Lf1/x;

    sget-object v1, Lf1/x;->b:Lf1/x;

    sget-object v2, Lf1/x;->a:Lf1/x;

    filled-new-array {v0, v1, v2}, [Lf1/x;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lf1/p;->a(Lf1/x;)Lf1/p;

    move-result-object v0

    invoke-static {v1, v0}, Lf1/a0;->e(Ljava/util/List;Lf1/p;)Lf1/a0;

    move-result-object v0

    sput-object v0, Lf1/c2;->b:Lf1/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lf1/c2$a;
    .locals 2

    new-instance v0, Lf1/n$b;

    invoke-direct {v0}, Lf1/n$b;-><init>()V

    sget-object v1, Lf1/c2;->b:Lf1/a0;

    invoke-virtual {v0, v1}, Lf1/n$b;->e(Lf1/a0;)Lf1/c2$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf1/c2$a;->d(I)Lf1/c2$a;

    move-result-object v0

    sget-object v1, Lf1/c2;->a:Landroid/util/Range;

    invoke-virtual {v0, v1}, Lf1/c2$a;->c(Landroid/util/Range;)Lf1/c2$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lf1/c2$a;->b(I)Lf1/c2$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()I
.end method

.method public abstract e()Lf1/a0;
.end method

.method public abstract f()Lf1/c2$a;
.end method
