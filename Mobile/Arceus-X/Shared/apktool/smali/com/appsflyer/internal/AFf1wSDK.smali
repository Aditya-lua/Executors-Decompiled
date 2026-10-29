.class public final Lcom/appsflyer/internal/AFf1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final registerClient:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 v0, 0x3

    sget-object v1, Lju/b;->e:Lju/b;

    invoke-static {v0, v1}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/a;->w(J)J

    move-result-wide v0

    sput-wide v0, Lcom/appsflyer/internal/AFf1wSDK;->registerClient:J

    return-void
.end method

.method public static final synthetic registerClient()J
    .locals 2

    sget-wide v0, Lcom/appsflyer/internal/AFf1wSDK;->registerClient:J

    return-wide v0
.end method
