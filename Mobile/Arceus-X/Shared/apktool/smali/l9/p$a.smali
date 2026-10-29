.class public Ll9/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lk9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ll9/q;

.field public b:Ll9/q;

.field public c:Ljava/lang/Runnable;

.field public d:Ll9/k;

.field public e:[Lcom/google/android/gms/common/Feature;

.field public f:Z

.field public g:I


# direct methods
.method public synthetic constructor <init>(Ll9/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ll9/x0;->a:Ll9/x0;

    iput-object p1, p0, Ll9/p$a;->c:Ljava/lang/Runnable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/p$a;->f:Z

    return-void
.end method

.method public static bridge synthetic h(Ll9/p$a;)Ll9/q;
    .locals 0

    iget-object p0, p0, Ll9/p$a;->a:Ll9/q;

    return-object p0
.end method

.method public static bridge synthetic i(Ll9/p$a;)Ll9/q;
    .locals 0

    iget-object p0, p0, Ll9/p$a;->b:Ll9/q;

    return-object p0
.end method


# virtual methods
.method public a()Ll9/p;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll9/p<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/p$a;->a:Ll9/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Must set register function"

    invoke-static {v0, v3}, Ln9/m;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Ll9/p$a;->b:Ll9/q;

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v3, "Must set unregister function"

    invoke-static {v0, v3}, Ln9/m;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Ll9/p$a;->d:Ll9/k;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    const-string v0, "Must set holder"

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Ll9/p$a;->d:Ll9/k;

    invoke-virtual {v0}, Ll9/k;->b()Ll9/k$a;

    move-result-object v0

    const-string v1, "Key must not be null"

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/k$a;

    new-instance v1, Ll9/p;

    new-instance v2, Ll9/y0;

    iget-object v4, p0, Ll9/p$a;->d:Ll9/k;

    iget-object v5, p0, Ll9/p$a;->e:[Lcom/google/android/gms/common/Feature;

    iget-boolean v6, p0, Ll9/p$a;->f:Z

    iget v7, p0, Ll9/p$a;->g:I

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll9/y0;-><init>(Ll9/p$a;Ll9/k;[Lcom/google/android/gms/common/Feature;ZI)V

    new-instance v4, Ll9/z0;

    invoke-direct {v4, p0, v0}, Ll9/z0;-><init>(Ll9/p$a;Ll9/k$a;)V

    iget-object v0, v3, Ll9/p$a;->c:Ljava/lang/Runnable;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v4, v0, v5}, Ll9/p;-><init>(Ll9/o;Ll9/w;Ljava/lang/Runnable;Ll9/b1;)V

    return-object v1
.end method

.method public b(Ll9/q;)Ll9/p$a;
    .locals 0
    .param p1    # Ll9/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/q<",
            "TA;",
            "Lsb/k<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Ll9/p$a;->a:Ll9/q;

    return-object p0
.end method

.method public c(Z)Ll9/p$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-boolean p1, p0, Ll9/p$a;->f:Z

    return-object p0
.end method

.method public varargs d([Lcom/google/android/gms/common/Feature;)Ll9/p$a;
    .locals 0
    .param p1    # [Lcom/google/android/gms/common/Feature;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/common/Feature;",
            ")",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Ll9/p$a;->e:[Lcom/google/android/gms/common/Feature;

    return-object p0
.end method

.method public e(I)Ll9/p$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput p1, p0, Ll9/p$a;->g:I

    return-object p0
.end method

.method public f(Ll9/q;)Ll9/p$a;
    .locals 0
    .param p1    # Ll9/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/q<",
            "TA;",
            "Lsb/k<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Ll9/p$a;->b:Ll9/q;

    return-object p0
.end method

.method public g(Ll9/k;)Ll9/p$a;
    .locals 0
    .param p1    # Ll9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/k<",
            "T",
            "L;",
            ">;)",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Ll9/p$a;->d:Ll9/k;

    return-object p0
.end method
