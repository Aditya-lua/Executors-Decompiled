.class public final Lgb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lgb/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb/f;

    invoke-direct {v0}, Lgb/f;-><init>()V

    sput-object v0, Lgb/e;->a:Lgb/f;

    return-void
.end method

.method public static a()Lgb/f;
    .locals 1

    sget-object v0, Lgb/e;->a:Lgb/f;

    return-object v0
.end method
