.class public final Lgb/k1;
.super Lgb/h1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lgb/h1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Lgb/k1;
    .locals 0

    invoke-super {p0, p1}, Lgb/h1;->b(Ljava/lang/Object;)Lgb/h1;

    return-object p0
.end method

.method public final e()Lgb/o1;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgb/h1;->c:Z

    iget-object v0, p0, Lgb/h1;->a:[Ljava/lang/Object;

    iget v1, p0, Lgb/h1;->b:I

    invoke-static {v0, v1}, Lgb/o1;->g([Ljava/lang/Object;I)Lgb/o1;

    move-result-object v0

    return-object v0
.end method
