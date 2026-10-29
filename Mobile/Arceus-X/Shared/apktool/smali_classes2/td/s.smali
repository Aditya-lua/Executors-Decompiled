.class public final Ltd/s;
.super Lcom/google/android/play/core/integrity/IntegrityTokenResponse;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ltd/r1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ltd/r1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;-><init>()V

    iput-object p1, p0, Ltd/s;->a:Ljava/lang/String;

    iput-object p2, p0, Ltd/s;->b:Ltd/r1;

    return-void
.end method


# virtual methods
.method public final token()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltd/s;->a:Ljava/lang/String;

    return-object v0
.end method
