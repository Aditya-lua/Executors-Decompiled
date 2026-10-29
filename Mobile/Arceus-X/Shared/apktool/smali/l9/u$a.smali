.class public Ll9/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lk9/a$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ll9/q;

.field public b:Z

.field public c:[Lcom/google/android/gms/common/Feature;

.field public d:I


# direct methods
.method public synthetic constructor <init>(Ll9/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/u$a;->b:Z

    const/4 p1, 0x0

    iput p1, p0, Ll9/u$a;->d:I

    return-void
.end method

.method public static bridge synthetic f(Ll9/u$a;)Ll9/q;
    .locals 0

    iget-object p0, p0, Ll9/u$a;->a:Ll9/q;

    return-object p0
.end method


# virtual methods
.method public a()Ll9/u;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll9/u<",
            "TA;TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Ll9/u$a;->a:Ll9/q;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Ln9/m;->b(ZLjava/lang/Object;)V

    new-instance v0, Ll9/g1;

    iget-object v1, p0, Ll9/u$a;->c:[Lcom/google/android/gms/common/Feature;

    iget-boolean v2, p0, Ll9/u$a;->b:Z

    iget v3, p0, Ll9/u$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Ll9/g1;-><init>(Ll9/u$a;[Lcom/google/android/gms/common/Feature;ZI)V

    return-object v0
.end method

.method public b(Ll9/q;)Ll9/u$a;
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
            "TResultT;>;>;)",
            "Ll9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Ll9/u$a;->a:Ll9/q;

    return-object p0
.end method

.method public c(Z)Ll9/u$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ll9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-boolean p1, p0, Ll9/u$a;->b:Z

    return-object p0
.end method

.method public varargs d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;
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
            "Ll9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Ll9/u$a;->c:[Lcom/google/android/gms/common/Feature;

    return-object p0
.end method

.method public e(I)Ll9/u$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ll9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput p1, p0, Ll9/u$a;->d:I

    return-object p0
.end method
