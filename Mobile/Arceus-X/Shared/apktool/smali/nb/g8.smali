.class public final synthetic Lnb/g8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/i8;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/zzr;


# direct methods
.method public synthetic constructor <init>(Lnb/i8;Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/g8;->a:Lnb/i8;

    iput-object p2, p0, Lnb/g8;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lnb/g8;->c:Ljava/lang/String;

    iput-object p4, p0, Lnb/g8;->d:Lcom/google/android/gms/measurement/internal/zzr;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lnb/g8;->a:Lnb/i8;

    iget-object v1, p0, Lnb/g8;->b:Landroid/os/Bundle;

    iget-object v2, p0, Lnb/g8;->c:Ljava/lang/String;

    iget-object v3, p0, Lnb/g8;->d:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-virtual {v0, v1, v2, v3}, Lnb/i8;->y2(Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
