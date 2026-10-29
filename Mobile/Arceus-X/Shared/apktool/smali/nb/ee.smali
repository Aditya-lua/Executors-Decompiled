.class public final Lnb/ee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    iput-object p2, p0, Lnb/ee;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ee;->b:Lnb/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lnb/ee;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lnb/ee;->b:Lnb/me;

    invoke-virtual {v2, v1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v1

    sget-object v3, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    const/16 v4, 0x64

    invoke-static {v1, v4}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v1

    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    move-result-object v0

    invoke-virtual {v0}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
