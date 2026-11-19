.class public final Lgb/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgb/u0;

.field public static volatile b:Lgb/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgb/v0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgb/v0;-><init>([B)V

    sput-object v0, Lgb/w0;->a:Lgb/u0;

    sput-object v0, Lgb/w0;->b:Lgb/u0;

    return-void
.end method

.method public static a()Lgb/u0;
    .locals 1

    sget-object v0, Lgb/w0;->b:Lgb/u0;

    return-object v0
.end method
