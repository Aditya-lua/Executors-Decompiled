.class public final Lgb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lcom/google/android/gms/common/api/ApiMetadata;
    .locals 0

    invoke-static {}, Lgb/e;->a()Lgb/f;

    invoke-static {p0}, Lcom/google/android/gms/common/api/ComplianceOptions;->w3(Landroid/content/Context;)Lcom/google/android/gms/common/api/ComplianceOptions$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/ComplianceOptions$a;->a()Lcom/google/android/gms/common/api/ComplianceOptions;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/common/api/ApiMetadata;->a(Lcom/google/android/gms/common/api/ComplianceOptions;)Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object p0

    return-object p0
.end method
