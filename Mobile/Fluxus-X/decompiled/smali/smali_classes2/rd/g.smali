.class public final Lrd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# instance fields
.field public final a:Lrd/l;


# direct methods
.method public constructor <init>(Lrd/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/g;->a:Lrd/l;

    return-void
.end method


# virtual methods
.method public final a(Lrd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lrd/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrd/g;->a:Lrd/l;

    invoke-virtual {v0, p1}, Lrd/l;->b(Lrd/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
