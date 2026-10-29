.class public final Lfb/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lda/e;


# instance fields
.field public final a:Lfb/m;

.field public final b:Lfb/h;


# direct methods
.method public constructor <init>(Lfb/m;Lfb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/o0;->a:Lfb/m;

    iput-object p2, p0, Lfb/o0;->b:Lfb/h;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lda/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfb/o0;->a:Lfb/m;

    invoke-interface {v0}, Lfb/m;->zzc()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
