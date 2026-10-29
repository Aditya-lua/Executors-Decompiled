.class public final Lnb/yd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;

.field public final c:Lnb/za;

.field public final d:Lcom/google/android/gms/internal/measurement/p7;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lnb/za;Lcom/google/android/gms/internal/measurement/p7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/yd;->a:Ljava/lang/String;

    iput-object p2, p0, Lnb/yd;->b:Ljava/util/Map;

    iput-object p3, p0, Lnb/yd;->c:Lnb/za;

    iput-object p4, p0, Lnb/yd;->d:Lcom/google/android/gms/internal/measurement/p7;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/yd;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lnb/yd;->b:Ljava/util/Map;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public final c()Lnb/za;
    .locals 1

    iget-object v0, p0, Lnb/yd;->c:Lnb/za;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/measurement/p7;
    .locals 1

    iget-object v0, p0, Lnb/yd;->d:Lcom/google/android/gms/internal/measurement/p7;

    return-object v0
.end method
