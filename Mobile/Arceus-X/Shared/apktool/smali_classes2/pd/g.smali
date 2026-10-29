.class public final Lpd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpd/b;


# instance fields
.field public final a:Lpd/l;


# direct methods
.method public constructor <init>(Lpd/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpd/g;->a:Lpd/l;

    return-void
.end method


# virtual methods
.method public final a(Lpd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lpd/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpd/g;->a:Lpd/l;

    invoke-virtual {v0, p1}, Lpd/l;->b(Lpd/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
