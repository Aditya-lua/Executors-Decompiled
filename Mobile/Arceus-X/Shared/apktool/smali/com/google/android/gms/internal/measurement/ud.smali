.class public final Lcom/google/android/gms/internal/measurement/ud;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"


# direct methods
.method public constructor <init>(II)V
    .locals 3

    const-string v0, "Unpaired surrogate at index "

    const-string v1, " of "

    const/16 v2, 0x20

    invoke-static {p2, p1, v2, v0, v1}, Lcom/google/android/gms/internal/measurement/v9;->a(IIBLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-void
.end method
