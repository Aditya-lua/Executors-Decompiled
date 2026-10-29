.class public abstract Lm4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroidx/lifecycle/s;)Lm4/a;
    .locals 2
    .param p0    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/lifecycle/s;",
            ":",
            "Landroidx/lifecycle/c1;",
            ">(TT;)",
            "Lm4/a;"
        }
    .end annotation

    new-instance v0, Lm4/b;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/c1;

    invoke-interface {v1}, Landroidx/lifecycle/c1;->w()Landroidx/lifecycle/b1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lm4/b;-><init>(Landroidx/lifecycle/s;Landroidx/lifecycle/b1;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c(ILandroid/os/Bundle;Lm4/a$a;)Ln4/b;
    .param p3    # Lm4/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Lm4/a$a<",
            "TD;>;)",
            "Ln4/b<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract d()V
.end method
