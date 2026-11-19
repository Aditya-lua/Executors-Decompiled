.class public abstract Lde/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ltb/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/r1;->a:Ltb/k;

    return-void
.end method

.method public constructor <init>(Ltb/k;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/r1;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public final a()Ltb/k;
    .locals 1

    iget-object v0, p0, Lde/r1;->a:Ltb/k;

    return-object v0
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lde/r1;->a:Ltb/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    :cond_0
    return-void
.end method

.method public abstract c()V
.end method

.method public final run()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lde/r1;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lde/r1;->b(Ljava/lang/Exception;)V

    return-void
.end method
