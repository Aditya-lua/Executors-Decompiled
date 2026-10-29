.class public abstract Ll9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
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
.field public final a:Ll9/k;

.field public final b:[Lcom/google/android/gms/common/Feature;

.field public final c:Z

.field public final d:I


# direct methods
.method public constructor <init>(Ll9/k;[Lcom/google/android/gms/common/Feature;ZI)V
    .locals 0
    .param p1    # Ll9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/k<",
            "T",
            "L;",
            ">;[",
            "Lcom/google/android/gms/common/Feature;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/o;->a:Ll9/k;

    iput-object p2, p0, Ll9/o;->b:[Lcom/google/android/gms/common/Feature;

    iput-boolean p3, p0, Ll9/o;->c:Z

    iput p4, p0, Ll9/o;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ll9/o;->a:Ll9/k;

    invoke-virtual {v0}, Ll9/k;->a()V

    return-void
.end method

.method public b()Ll9/k$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll9/k$a<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/o;->a:Ll9/k;

    invoke-virtual {v0}, Ll9/k;->b()Ll9/k$a;

    move-result-object v0

    return-object v0
.end method

.method public c()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Ll9/o;->b:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public abstract d(Lk9/a$b;Lsb/k;)V
    .param p1    # Lk9/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Lsb/k<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ll9/o;->d:I

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Ll9/o;->c:Z

    return v0
.end method
