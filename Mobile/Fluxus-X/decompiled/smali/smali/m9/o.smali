.class public abstract Lm9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Ll9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lm9/k;

.field public final b:[Lk9/d;

.field public final c:Z

.field public final d:I


# direct methods
.method public constructor <init>(Lm9/k;[Lk9/d;ZI)V
    .locals 0
    .param p1    # Lm9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/k<",
            "T",
            "L;",
            ">;[",
            "Lk9/d;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/o;->a:Lm9/k;

    iput-object p2, p0, Lm9/o;->b:[Lk9/d;

    iput-boolean p3, p0, Lm9/o;->c:Z

    iput p4, p0, Lm9/o;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lm9/o;->a:Lm9/k;

    invoke-virtual {v0}, Lm9/k;->a()V

    return-void
.end method

.method public b()Lm9/k$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm9/k$a<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm9/o;->a:Lm9/k;

    invoke-virtual {v0}, Lm9/k;->b()Lm9/k$a;

    move-result-object v0

    return-object v0
.end method

.method public c()[Lk9/d;
    .locals 1

    iget-object v0, p0, Lm9/o;->b:[Lk9/d;

    return-object v0
.end method

.method public abstract d(Ll9/a$b;Ltb/k;)V
    .param p1    # Ll9/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Ltb/k<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lm9/o;->d:I

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lm9/o;->c:Z

    return v0
.end method
