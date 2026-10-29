.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic zza:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 12
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->COMPONENT:Lmf/c;

    const-class v1, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-static {v1}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/mlkit/common/internal/zza;

    invoke-direct {v3}, Lcom/google/mlkit/common/internal/zza;-><init>()V

    invoke-virtual {v1, v3}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lmf/c$b;->d()Lmf/c;

    move-result-object v1

    const-class v3, Lcom/google/mlkit/common/sdkinternal/MlKitThreadPool;

    invoke-static {v3}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v4

    new-instance v5, Lcom/google/mlkit/common/internal/zzb;

    invoke-direct {v5}, Lcom/google/mlkit/common/internal/zzb;-><init>()V

    invoke-virtual {v4, v5}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lmf/c$b;->d()Lmf/c;

    move-result-object v4

    const-class v5, Lcom/google/mlkit/common/model/RemoteModelManager;

    invoke-static {v5}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v5

    const-class v6, Lcom/google/mlkit/common/model/RemoteModelManager$RemoteModelManagerRegistration;

    invoke-static {v6}, Lmf/r;->m(Ljava/lang/Class;)Lmf/r;

    move-result-object v7

    invoke-virtual {v5, v7}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v5

    new-instance v7, Lcom/google/mlkit/common/internal/zzc;

    invoke-direct {v7}, Lcom/google/mlkit/common/internal/zzc;-><init>()V

    invoke-virtual {v5, v7}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v5

    invoke-virtual {v5}, Lmf/c$b;->d()Lmf/c;

    move-result-object v5

    const-class v7, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-static {v7}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v7

    invoke-static {v3}, Lmf/r;->l(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v7, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v3

    new-instance v7, Lcom/google/mlkit/common/internal/zzd;

    invoke-direct {v7}, Lcom/google/mlkit/common/internal/zzd;-><init>()V

    invoke-virtual {v3, v7}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lmf/c$b;->d()Lmf/c;

    move-result-object v3

    const-class v7, Lcom/google/mlkit/common/sdkinternal/Cleaner;

    invoke-static {v7}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v8

    new-instance v9, Lcom/google/mlkit/common/internal/zze;

    invoke-direct {v9}, Lcom/google/mlkit/common/internal/zze;-><init>()V

    invoke-virtual {v8, v9}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v8

    invoke-virtual {v8}, Lmf/c$b;->d()Lmf/c;

    move-result-object v8

    const-class v9, Lcom/google/mlkit/common/sdkinternal/CloseGuard$Factory;

    invoke-static {v9}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v9

    invoke-static {v7}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v7

    invoke-virtual {v9, v7}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v7

    new-instance v9, Lcom/google/mlkit/common/internal/zzf;

    invoke-direct {v9}, Lcom/google/mlkit/common/internal/zzf;-><init>()V

    invoke-virtual {v7, v9}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v7

    invoke-virtual {v7}, Lmf/c$b;->d()Lmf/c;

    move-result-object v7

    const-class v9, Lcom/google/mlkit/common/internal/model/zzg;

    invoke-static {v9}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v10

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v10, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v2

    new-instance v10, Lcom/google/mlkit/common/internal/zzg;

    invoke-direct {v10}, Lcom/google/mlkit/common/internal/zzg;-><init>()V

    invoke-virtual {v2, v10}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lmf/c$b;->d()Lmf/c;

    move-result-object v2

    invoke-static {v6}, Lmf/c;->m(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v6

    invoke-static {v9}, Lmf/r;->l(Ljava/lang/Class;)Lmf/r;

    move-result-object v9

    invoke-virtual {v6, v9}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v6

    new-instance v9, Lcom/google/mlkit/common/internal/zzh;

    invoke-direct {v9}, Lcom/google/mlkit/common/internal/zzh;-><init>()V

    invoke-virtual {v6, v9}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v6

    invoke-virtual {v6}, Lmf/c$b;->d()Lmf/c;

    move-result-object v6

    move-object v11, v7

    move-object v7, v2

    move-object v2, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v8

    move-object v8, v6

    move-object v6, v11

    invoke-static/range {v0 .. v8}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v0

    return-object v0
.end method
