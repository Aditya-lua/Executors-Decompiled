.class public final synthetic Lka/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lka/n;

.field public final synthetic b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

.field public final synthetic c:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;


# direct methods
.method public synthetic constructor <init>(Lka/n;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/l;->a:Lka/n;

    iput-object p2, p0, Lka/l;->b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    iput-object p3, p0, Lka/l;->c:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Lsb/k;

    check-cast p1, Lka/q;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lka/r;

    new-instance v0, Lka/j;

    iget-object v1, p0, Lka/l;->a:Lka/n;

    invoke-direct {v0, v1, p2}, Lka/j;-><init>(Lka/n;Lsb/k;)V

    iget-object p2, p0, Lka/l;->b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    iget-object v1, p0, Lka/l;->c:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;

    invoke-virtual {p1, v0, p2, v1}, Lka/r;->u2(Lka/t;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;)V

    return-void
.end method
