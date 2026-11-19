.class public final Lab/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/d;

.field public static final b:Lk9/d;

.field public static final c:Lk9/d;

.field public static final d:Lk9/d;

.field public static final e:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lk9/d;

    const-string v1, "sms_code_autofill"

    const-wide/16 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lab/c;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v4, "sms_code_browser"

    invoke-direct {v1, v4, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lab/c;->b:Lk9/d;

    new-instance v2, Lk9/d;

    const-string v3, "sms_retrieve"

    const-wide/16 v4, 0x1

    invoke-direct {v2, v3, v4, v5}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lab/c;->c:Lk9/d;

    new-instance v3, Lk9/d;

    const-string v4, "user_consent"

    const-wide/16 v5, 0x3

    invoke-direct {v3, v4, v5, v6}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lab/c;->d:Lk9/d;

    filled-new-array {v0, v1, v2, v3}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lab/c;->e:[Lk9/d;

    return-void
.end method
