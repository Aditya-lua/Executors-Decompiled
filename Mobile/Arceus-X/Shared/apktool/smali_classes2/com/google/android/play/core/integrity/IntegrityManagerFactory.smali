.class public Lcom/google/android/play/core/integrity/IntegrityManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ltd/c;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Ltd/x;->a(Landroid/content/Context;)Ltd/w;

    move-result-object p0

    invoke-interface {p0}, Ltd/w;->a()Ltd/c;

    move-result-object p0

    return-object p0
.end method

.method public static create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Ltd/s1;->a(Landroid/content/Context;)Ltd/l1;

    move-result-object p0

    invoke-virtual {p0}, Ltd/l1;->a()Lcom/google/android/play/core/integrity/IntegrityManager;

    move-result-object p0

    return-object p0
.end method
