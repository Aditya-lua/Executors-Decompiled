.class public abstract Ln0/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/t3$a;
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Ln0/t3;->a:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/util/Size;)Ln0/t3$a;
    .locals 2

    new-instance v0, Ln0/s$b;

    invoke-direct {v0}, Ln0/s$b;-><init>()V

    invoke-virtual {v0, p0}, Ln0/s$b;->f(Landroid/util/Size;)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln0/t3$a;->e(Landroid/util/Size;)Ln0/t3$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln0/t3$a;->g(I)Ln0/t3$a;

    move-result-object p0

    sget-object v1, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {p0, v1}, Ln0/t3$a;->c(Landroid/util/Range;)Ln0/t3$a;

    move-result-object p0

    sget-object v1, Lg0/k0;->d:Lg0/k0;

    invoke-virtual {p0, v1}, Ln0/t3$a;->b(Lg0/k0;)Ln0/t3$a;

    move-result-object p0

    invoke-virtual {p0, v0}, Ln0/t3$a;->h(Z)Ln0/t3$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lg0/k0;
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

.method public abstract d()Ln0/n1;
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public abstract f()Landroid/util/Size;
.end method

.method public abstract g()I
.end method

.method public abstract h()Z
.end method

.method public abstract i()Ln0/t3$a;
.end method
