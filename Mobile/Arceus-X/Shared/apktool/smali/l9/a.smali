.class public Ll9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Ln9/a;->a(Lcom/google/android/gms/common/api/Status;)Lk9/b;

    move-result-object p1

    return-object p1
.end method
