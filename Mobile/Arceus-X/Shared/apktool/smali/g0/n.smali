.class public abstract Lg0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Lg0/k2;

.field public final f:Lg0/l1;

.field public final g:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lg0/n;->h:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lx0/r0;
    .locals 1

    new-instance v0, Lx0/y0;

    invoke-direct {v0, p0}, Lx0/y0;-><init>(Lg0/n;)V

    return-object v0
.end method

.method public b()Lx2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx2/a<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/n;->g:Lx2/a;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lg0/n;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public d()Lg0/l1;
    .locals 1

    iget-object v0, p0, Lg0/n;->f:Lg0/l1;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lg0/n;->b:I

    return v0
.end method

.method public f()Lg0/k2;
    .locals 1

    iget-object v0, p0, Lg0/n;->e:Lg0/k2;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lg0/n;->a:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lg0/n;->c:I

    return v0
.end method
