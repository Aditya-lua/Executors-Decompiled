.class public final Lmb/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/d;

.field public static final b:Lk9/d;

.field public static final c:Lk9/d;

.field public static final d:Lk9/d;

.field public static final e:Lk9/d;

.field public static final f:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lk9/d;

    const-string v1, "name_ulr_private"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lmb/d0;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v4, "name_sleep_segment_request"

    invoke-direct {v1, v4, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lmb/d0;->b:Lk9/d;

    new-instance v4, Lk9/d;

    const-string v5, "support_context_feature_id"

    invoke-direct {v4, v5, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lmb/d0;->c:Lk9/d;

    new-instance v5, Lk9/d;

    const-string v6, "get_current_location"

    invoke-direct {v5, v6, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lmb/d0;->d:Lk9/d;

    new-instance v6, Lk9/d;

    const-string v7, "get_last_activity_feature_id"

    invoke-direct {v6, v7, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lmb/d0;->e:Lk9/d;

    filled-new-array {v0, v1, v4, v5, v6}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lmb/d0;->f:[Lk9/d;

    return-void
.end method
