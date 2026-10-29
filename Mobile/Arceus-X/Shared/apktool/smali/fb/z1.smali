.class public final synthetic Lfb/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lfb/a2;

.field public final synthetic b:Lcom/google/android/gms/internal/games_v2/zzq;


# direct methods
.method public synthetic constructor <init>(Lfb/a2;Lcom/google/android/gms/internal/games_v2/zzq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/z1;->a:Lfb/a2;

    iput-object p2, p0, Lfb/z1;->b:Lcom/google/android/gms/internal/games_v2/zzq;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Lsb/k;

    check-cast p1, Lfb/b2;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lfb/g2;

    new-instance v0, Lfb/y1;

    iget-object v1, p0, Lfb/z1;->a:Lfb/a2;

    invoke-direct {v0, v1, p2}, Lfb/y1;-><init>(Lfb/a2;Lsb/k;)V

    iget-object p2, p0, Lfb/z1;->b:Lcom/google/android/gms/internal/games_v2/zzq;

    invoke-virtual {p1, v0, p2}, Lfb/g2;->t2(Lfb/f2;Lcom/google/android/gms/internal/games_v2/zzq;)V

    return-void
.end method
