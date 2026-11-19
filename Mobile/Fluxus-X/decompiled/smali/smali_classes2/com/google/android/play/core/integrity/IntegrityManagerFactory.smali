.class public Lcom/google/android/play/core/integrity/IntegrityManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lvd/c;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lvd/x;->a(Landroid/content/Context;)Lvd/w;

    move-result-object p0

    invoke-interface {p0}, Lvd/w;->a()Lvd/c;

    move-result-object p0

    return-object p0
.end method

.method public static create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lvd/s1;->a(Landroid/content/Context;)Lvd/l1;

    move-result-object p0

    invoke-virtual {p0}, Lvd/l1;->a()Lcom/google/android/play/core/integrity/IntegrityManager;

    move-result-object p0

    return-object p0
.end method
