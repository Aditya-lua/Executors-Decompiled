.class public Lwk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/a;


# static fields
.field public static final b:Ljava/lang/Object;


# instance fields
.field public a:Lwk/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwk/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInstance()Lwk/j;
    .locals 3

    sget-object v0, Lwk/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwk/b;->a:Lwk/j;

    if-nez v1, :cond_0

    new-instance v1, Lwk/j;

    sget-object v2, Ljava/net/CookiePolicy;->ACCEPT_ALL:Ljava/net/CookiePolicy;

    invoke-direct {v1, v2}, Lwk/j;-><init>(Ljava/net/CookiePolicy;)V

    iput-object v1, p0, Lwk/b;->a:Lwk/j;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lwk/b;->a:Lwk/j;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
