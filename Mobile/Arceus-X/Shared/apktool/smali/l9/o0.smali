.class public final Ll9/o0;
.super Ll9/c0;
.source "SourceFile"


# instance fields
.field public final c:Lk9/e;


# direct methods
.method public constructor <init>(Lk9/e;)V
    .locals 1

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Ll9/c0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll9/o0;->c:Lk9/e;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/internal/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk9/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lk9/n;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Ll9/o0;->c:Lk9/e;

    invoke-virtual {v0, p1}, Lk9/e;->C(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final c()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Ll9/o0;->c:Lk9/e;

    invoke-virtual {v0}, Lk9/e;->I()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method
