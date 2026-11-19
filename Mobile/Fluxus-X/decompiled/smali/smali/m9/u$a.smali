.class public Lm9/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Ll9/a$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lm9/q;

.field public b:Z

.field public c:[Lk9/d;

.field public d:I


# direct methods
.method public synthetic constructor <init>(Lm9/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/u$a;->b:Z

    const/4 p1, 0x0

    iput p1, p0, Lm9/u$a;->d:I

    return-void
.end method

.method public static bridge synthetic f(Lm9/u$a;)Lm9/q;
    .locals 0

    iget-object p0, p0, Lm9/u$a;->a:Lm9/q;

    return-object p0
.end method


# virtual methods
.method public a()Lm9/u;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm9/u<",
            "TA;TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Lm9/u$a;->a:Lm9/q;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Lo9/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Lm9/g1;

    iget-object v1, p0, Lm9/u$a;->c:[Lk9/d;

    iget-boolean v2, p0, Lm9/u$a;->b:Z

    iget v3, p0, Lm9/u$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lm9/g1;-><init>(Lm9/u$a;[Lk9/d;ZI)V

    return-object v0
.end method

.method public b(Lm9/q;)Lm9/u$a;
    .locals 0
    .param p1    # Lm9/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/q<",
            "TA;",
            "Ltb/k<",
            "TResultT;>;>;)",
            "Lm9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lm9/u$a;->a:Lm9/q;

    return-object p0
.end method

.method public c(Z)Lm9/u$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lm9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-boolean p1, p0, Lm9/u$a;->b:Z

    return-object p0
.end method

.method public varargs d([Lk9/d;)Lm9/u$a;
    .locals 0
    .param p1    # [Lk9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lk9/d;",
            ")",
            "Lm9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lm9/u$a;->c:[Lk9/d;

    return-object p0
.end method

.method public e(I)Lm9/u$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lm9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput p1, p0, Lm9/u$a;->d:I

    return-object p0
.end method
