.class public final synthetic Lnb/c8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/i8;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lnb/g5;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/c8;->a:Lnb/i8;

    iput-object p2, p0, Lnb/c8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p3, p0, Lnb/c8;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lnb/c8;->d:Lnb/g5;

    iput-object p5, p0, Lnb/c8;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    iget-object v0, p0, Lnb/c8;->a:Lnb/i8;

    iget-object v1, p0, Lnb/c8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, p0, Lnb/c8;->c:Landroid/os/Bundle;

    iget-object v3, p0, Lnb/c8;->d:Lnb/g5;

    iget-object v4, p0, Lnb/c8;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lnb/i8;->v2(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;Ljava/lang/String;)V

    return-void
.end method
