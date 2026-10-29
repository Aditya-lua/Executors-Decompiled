.class public abstract Ll9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/u$a;
    }
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
.field public final a:[Lcom/google/android/gms/common/Feature;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Lcom/google/android/gms/common/Feature;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/u;->a:[Lcom/google/android/gms/common/Feature;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Ll9/u;->b:Z

    iput p3, p0, Ll9/u;->c:I

    return-void
.end method

.method public static c()Ll9/u$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk9/a$b;",
            "ResultT:",
            "Ljava/lang/Object;",
            ">()",
            "Ll9/u$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    new-instance v0, Ll9/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll9/u$a;-><init>(Ll9/h1;)V

    return-object v0
.end method


# virtual methods
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
            "TResultT;>;)V"
        }
    .end annotation
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ll9/u;->b:Z

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ll9/u;->c:I

    return v0
.end method

.method public final g()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Ll9/u;->a:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method
