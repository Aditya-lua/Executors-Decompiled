.class public abstract Ll9/w;
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
.field public final a:Ll9/k$a;


# direct methods
.method public constructor <init>(Ll9/k$a;)V
    .locals 0
    .param p1    # Ll9/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/k$a<",
            "T",
            "L;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/w;->a:Ll9/k$a;

    return-void
.end method


# virtual methods
.method public a()Ll9/k$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll9/k$a<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/w;->a:Ll9/k$a;

    return-object v0
.end method

.method public abstract b(Lk9/a$b;Lsb/k;)V
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
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method
