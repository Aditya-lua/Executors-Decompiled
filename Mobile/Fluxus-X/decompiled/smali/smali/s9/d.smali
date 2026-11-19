.class public interface abstract Ls9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll9/i<",
        "Ll9/a$d$c;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract h(Ls9/f;)Lcom/google/android/gms/tasks/Task;
    .param p1    # Ls9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls9/g;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract o([Ll9/j;)Lcom/google/android/gms/tasks/Task;
    .param p1    # [Ll9/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ll9/j;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls9/b;",
            ">;"
        }
    .end annotation
.end method
