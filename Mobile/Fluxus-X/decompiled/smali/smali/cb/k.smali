.class public final Lcb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/d;

.field public static final b:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/d;

    const-string v1, "moduleinstall"

    const-wide/16 v2, 0x7

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcb/k;->a:Lk9/d;

    filled-new-array {v0}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lcb/k;->b:[Lk9/d;

    return-void
.end method
