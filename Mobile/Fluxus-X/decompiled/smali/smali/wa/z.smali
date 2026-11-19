.class public final Lwa/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# static fields
.field public static final a:Ll9/a$g;

.field public static final b:Ll9/a$a;

.field public static final c:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lwa/z;->a:Ll9/a$g;

    new-instance v1, Lwa/y;

    invoke-direct {v1}, Lwa/y;-><init>()V

    sput-object v1, Lwa/z;->b:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "AppDataSearch.LIGHTWEIGHT_API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lwa/z;->c:Ll9/a;

    return-void
.end method
