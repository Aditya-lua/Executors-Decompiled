.class public final Lnb/x8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/lang/Boolean;

.field public c:J

.field public d:Lcom/google/android/gms/internal/measurement/zzdd;

.field public e:Z

.field public final f:Ljava/lang/Long;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/x8;->e:Z

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/x8;->a:Landroid/content/Context;

    iput-object p3, p0, Lnb/x8;->f:Ljava/lang/Long;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lnb/x8;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    iget-boolean p1, p2, Lcom/google/android/gms/internal/measurement/zzdd;->h:Z

    iput-boolean p1, p0, Lnb/x8;->e:Z

    iget-wide v1, p2, Lcom/google/android/gms/internal/measurement/zzdd;->g:J

    iput-wide v1, p0, Lnb/x8;->c:J

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdd;->j:Ljava/lang/String;

    iput-object p1, p0, Lnb/x8;->g:Ljava/lang/String;

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdd;->i:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lnb/x8;->b:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method
