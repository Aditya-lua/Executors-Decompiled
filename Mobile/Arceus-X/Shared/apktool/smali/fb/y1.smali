.class public final Lfb/y1;
.super Lfb/e1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lfb/a2;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lfb/y1;->a:Lsb/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lfb/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public final t0(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/games_v2/zzs;)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lfb/y1;->a:Lsb/k;

    new-instance v0, Lk9/b;

    invoke-direct {v0, p1}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p2, v0}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object p1, p0, Lfb/y1;->a:Lsb/k;

    invoke-virtual {p1, p2}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
