.class public Lda/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lda/b;

.field public b:Ljava/lang/Boolean;

.field public c:Lda/z;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lda/k;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lda/k;

    iget-object v1, p0, Lda/k$a;->a:Lda/b;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lda/b;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v3, p0, Lda/k$a;->b:Ljava/lang/Boolean;

    iget-object v4, p0, Lda/k$a;->c:Lda/z;

    if-nez v4, :cond_1

    move-object v4, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lda/z;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-direct {v0, v1, v3, v2, v4}, Lda/k;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lda/b;)Lda/k$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/k$a;->a:Lda/b;

    return-object p0
.end method

.method public c(Ljava/lang/Boolean;)Lda/k$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/k$a;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public d(Lda/z;)Lda/k$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/k$a;->c:Lda/z;

    return-object p0
.end method
