.class public final Lfb/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/q0;


# static fields
.field public static volatile f:Lfb/k;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public volatile d:I

.field public final e:Lfb/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfb/k;

    sget-object v1, Lfb/p;->a:Lfb/p;

    invoke-direct {v0, v1}, Lfb/k;-><init>(Lfb/p;)V

    sput-object v0, Lfb/q;->f:Lfb/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lfb/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lfb/q;->d:I

    const-string p1, "com.google.android.gms.fido"

    iput-object p1, p0, Lfb/q;->a:Ljava/lang/String;

    iput-object p2, p0, Lfb/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lfb/q;->c:Ljava/lang/Object;

    iput-object p4, p0, Lfb/q;->e:Lfb/l;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lfb/f;->a()Lfb/f;

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lfb/f;->b()Z

    sget-object v0, Lfb/o;->a:Lfb/n;

    const/4 v0, 0x0

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
