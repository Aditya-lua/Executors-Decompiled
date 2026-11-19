.class public final Lvd/s;
.super Lcom/google/android/play/core/integrity/IntegrityTokenResponse;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lvd/r1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvd/r1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;-><init>()V

    iput-object p1, p0, Lvd/s;->a:Ljava/lang/String;

    iput-object p2, p0, Lvd/s;->b:Lvd/r1;

    return-void
.end method


# virtual methods
.method public final token()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvd/s;->a:Ljava/lang/String;

    return-object v0
.end method
