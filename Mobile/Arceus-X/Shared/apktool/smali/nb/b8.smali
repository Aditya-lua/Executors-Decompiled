.class public final synthetic Lnb/b8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/i8;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;


# direct methods
.method public synthetic constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/b8;->a:Lnb/i8;

    iput-object p2, p0, Lnb/b8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lnb/b8;->a:Lnb/i8;

    iget-object v1, p0, Lnb/b8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-virtual {v0, v1}, Lnb/i8;->u2(Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method
