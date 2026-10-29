.class public final synthetic Lnb/d8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/i8;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzoo;

.field public final synthetic d:Lnb/j5;


# direct methods
.method public synthetic constructor <init>(Lnb/i8;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/d8;->a:Lnb/i8;

    iput-object p2, p0, Lnb/d8;->b:Ljava/lang/String;

    iput-object p3, p0, Lnb/d8;->c:Lcom/google/android/gms/measurement/internal/zzoo;

    iput-object p4, p0, Lnb/d8;->d:Lnb/j5;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lnb/d8;->a:Lnb/i8;

    iget-object v1, p0, Lnb/d8;->b:Ljava/lang/String;

    iget-object v2, p0, Lnb/d8;->c:Lcom/google/android/gms/measurement/internal/zzoo;

    iget-object v3, p0, Lnb/d8;->d:Lnb/j5;

    invoke-virtual {v0, v1, v2, v3}, Lnb/i8;->w2(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V

    return-void
.end method
