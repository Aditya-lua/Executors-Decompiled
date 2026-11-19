.class public final Lt9/d;
.super Lt9/j;
.source "SourceFile"


# instance fields
.field public final a:Lm9/k;


# direct methods
.method public constructor <init>(Lm9/k;)V
    .locals 0

    invoke-direct {p0}, Lt9/j;-><init>()V

    iput-object p1, p0, Lt9/d;->a:Lm9/k;

    return-void
.end method


# virtual methods
.method public final K1(Ls9/h;)V
    .locals 1

    new-instance v0, Lt9/c;

    invoke-direct {v0, p0, p1}, Lt9/c;-><init>(Lt9/d;Ls9/h;)V

    iget-object p1, p0, Lt9/d;->a:Lm9/k;

    invoke-virtual {p1, v0}, Lm9/k;->c(Lm9/k$b;)V

    return-void
.end method
