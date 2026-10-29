.class public final Lva/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# static fields
.field public static final a:Lk9/a$g;

.field public static final b:Lk9/a$a;

.field public static final c:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lva/z;->a:Lk9/a$g;

    new-instance v1, Lva/y;

    invoke-direct {v1}, Lva/y;-><init>()V

    sput-object v1, Lva/z;->b:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "AppDataSearch.LIGHTWEIGHT_API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lva/z;->c:Lk9/a;

    return-void
.end method
