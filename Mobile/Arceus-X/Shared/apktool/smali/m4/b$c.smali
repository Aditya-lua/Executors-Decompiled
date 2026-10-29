.class public Lm4/b$c;
.super Landroidx/lifecycle/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final d:Landroidx/lifecycle/a1$c;


# instance fields
.field public b:Lw1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/k<",
            "Lm4/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm4/b$c$a;

    invoke-direct {v0}, Lm4/b$c$a;-><init>()V

    sput-object v0, Lm4/b$c;->d:Landroidx/lifecycle/a1$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    new-instance v0, Lw1/k;

    invoke-direct {v0}, Lw1/k;-><init>()V

    iput-object v0, p0, Lm4/b$c;->b:Lw1/k;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm4/b$c;->c:Z

    return-void
.end method

.method public static g(Landroidx/lifecycle/b1;)Lm4/b$c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroidx/lifecycle/a1;

    sget-object v1, Lm4/b$c;->d:Landroidx/lifecycle/a1$c;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;)V

    const-class p0, Lm4/b$c;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/a1;->b(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p0

    check-cast p0, Lm4/b$c;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 4

    invoke-super {p0}, Landroidx/lifecycle/x0;->d()V

    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0}, Lw1/k;->j()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v2, v1}, Lw1/k;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm4/b$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lm4/b$a;->p(Z)Ln4/b;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0}, Lw1/k;->b()V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0}, Lw1/k;->j()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v2}, Lw1/k;->j()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v2, v1}, Lw1/k;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm4/b$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v3, v1}, Lw1/k;->h(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lm4/b$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Lm4/b$a;->q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm4/b$c;->c:Z

    return-void
.end method

.method public h(I)Lm4/b$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lm4/b$a<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0, p1}, Lw1/k;->e(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm4/b$a;

    return-object p1
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lm4/b$c;->c:Z

    return v0
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0}, Lw1/k;->j()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v2, v1}, Lw1/k;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm4/b$a;

    invoke-virtual {v2}, Lm4/b$a;->s()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(ILm4/b$a;)V
    .locals 1
    .param p2    # Lm4/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm4/b$c;->b:Lw1/k;

    invoke-virtual {v0, p1, p2}, Lw1/k;->i(ILjava/lang/Object;)V

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm4/b$c;->c:Z

    return-void
.end method
