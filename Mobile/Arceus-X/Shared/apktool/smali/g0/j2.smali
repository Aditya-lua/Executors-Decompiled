.class public interface abstract Lg0/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/j2$a;,
        Lg0/j2$b;
    }
.end annotation


# virtual methods
.method public abstract N1([F[F)V
.end method

.method public S([F[FZ)V
    .locals 0

    return-void
.end method

.method public abstract close()V
.end method

.method public getFormat()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method

.method public abstract i()Landroid/util/Size;
.end method

.method public abstract q2(Ljava/util/concurrent/Executor;Lx2/a;)Landroid/view/Surface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lx2/a<",
            "Lg0/j2$b;",
            ">;)",
            "Landroid/view/Surface;"
        }
    .end annotation
.end method
