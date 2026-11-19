.class public final Lxa/o;
.super Lxa/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lxa/p;Ltb/k;)V
    .locals 0

    iput-object p2, p0, Lxa/o;->a:Ltb/k;

    invoke-direct {p0}, Lxa/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final U1(Lcom/google/android/gms/common/api/Status;Ly8/f;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Ly8/c;

    invoke-virtual {p2}, Ly8/f;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ly8/f;->zza()I

    move-result p2

    invoke-direct {v0, v1, p2}, Ly8/c;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p2, p0, Lxa/o;->a:Ltb/k;

    invoke-static {p1, v0, p2}, Lm9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)V

    return-void
.end method
