.class public interface abstract Lbacktraceio/library/interfaces/DatabaseFileContext;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract clear()V
.end method

.method public abstract getAll()Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRecords()Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeOrphaned(Ljava/lang/Iterable;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract validFileConsistency()Z
.end method
