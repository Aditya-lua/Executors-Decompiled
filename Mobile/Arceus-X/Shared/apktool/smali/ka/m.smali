.class public final synthetic Lka/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lka/n;

.field public final synthetic b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lka/n;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/m;->a:Lka/n;

    iput-object p2, p0, Lka/m;->b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    iput-object p3, p0, Lka/m;->c:Ljava/util/List;

    iput-object p4, p0, Lka/m;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Lsb/k;

    check-cast p1, Lka/q;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lka/r;

    new-instance v0, Lka/i;

    iget-object v1, p0, Lka/m;->a:Lka/n;

    invoke-direct {v0, v1, p2}, Lka/i;-><init>(Lka/n;Lsb/k;)V

    iget-object p2, p0, Lka/m;->b:Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    iget-object v1, p0, Lka/m;->c:Ljava/util/List;

    iget-object v2, p0, Lka/m;->d:Ljava/util/List;

    invoke-virtual {p1, v0, p2, v1, v2}, Lka/r;->t2(Lka/t;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
