.class public final Le8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/c$b;,
        Le8/c$a;
    }
.end annotation


# static fields
.field public static final c:Le8/c;


# instance fields
.field public final a:J

.field public final b:Le8/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le8/c$a;

    invoke-direct {v0}, Le8/c$a;-><init>()V

    invoke-virtual {v0}, Le8/c$a;->a()Le8/c;

    move-result-object v0

    sput-object v0, Le8/c;->c:Le8/c;

    return-void
.end method

.method public constructor <init>(JLe8/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le8/c;->a:J

    iput-object p3, p0, Le8/c;->b:Le8/c$b;

    return-void
.end method

.method public static c()Le8/c$a;
    .locals 1

    new-instance v0, Le8/c$a;

    invoke-direct {v0}, Le8/c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Luf/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Le8/c;->a:J

    return-wide v0
.end method

.method public b()Le8/c$b;
    .locals 1
    .annotation build Luf/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Le8/c;->b:Le8/c$b;

    return-object v0
.end method
