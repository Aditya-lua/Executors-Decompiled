.class public final Lwa/o;
.super Lwa/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lwa/p;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lwa/o;->a:Lsb/k;

    invoke-direct {p0}, Lwa/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final g0(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/appset/zzc;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Lx8/c;

    invoke-virtual {p2}, Lcom/google/android/gms/appset/zzc;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/appset/zzc;->zza()I

    move-result p2

    invoke-direct {v0, v1, p2}, Lx8/c;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p2, p0, Lwa/o;->a:Lsb/k;

    invoke-static {p1, v0, p2}, Ll9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)V

    return-void
.end method
