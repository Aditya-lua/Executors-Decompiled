.class public final Leb/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/q0;


# static fields
.field public static volatile f:Leb/k;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public volatile d:I

.field public final e:Leb/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leb/k;

    sget-object v1, Leb/p;->a:Leb/p;

    invoke-direct {v0, v1}, Leb/k;-><init>(Leb/p;)V

    sput-object v0, Leb/q;->f:Leb/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Leb/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Leb/q;->d:I

    const-string p1, "com.google.android.gms.fido"

    iput-object p1, p0, Leb/q;->a:Ljava/lang/String;

    iput-object p2, p0, Leb/q;->b:Ljava/lang/String;

    iput-object p3, p0, Leb/q;->c:Ljava/lang/Object;

    iput-object p4, p0, Leb/q;->e:Leb/l;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leb/f;->a()Leb/f;

    monitor-enter p0

    :try_start_0
    invoke-static {}, Leb/f;->b()Z

    sget-object v0, Leb/o;->a:Leb/n;

    const/4 v0, 0x0

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
