.class public final Lnb/w7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lnb/w7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p3, p0, Lnb/w7;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/w7;->c:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnb/w7;->c:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    iget-object v1, p0, Lnb/w7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v2, p0, Lnb/w7;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lnb/me;->i(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    return-void
.end method
