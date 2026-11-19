.class public final Ldb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldb/b;

.field public static volatile b:Ldb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldb/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldb/d;-><init>(Ldb/c;)V

    sput-object v0, Ldb/e;->a:Ldb/b;

    sput-object v0, Ldb/e;->b:Ldb/b;

    return-void
.end method

.method public static a()Ldb/b;
    .locals 1

    sget-object v0, Ldb/e;->b:Ldb/b;

    return-object v0
.end method
