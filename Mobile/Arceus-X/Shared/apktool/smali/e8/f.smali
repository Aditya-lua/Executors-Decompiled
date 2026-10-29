.class public final Le8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/f$a;
    }
.end annotation


# static fields
.field public static final c:Le8/f;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le8/f$a;

    invoke-direct {v0}, Le8/f$a;-><init>()V

    invoke-virtual {v0}, Le8/f$a;->a()Le8/f;

    move-result-object v0

    sput-object v0, Le8/f;->c:Le8/f;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le8/f;->a:J

    iput-wide p3, p0, Le8/f;->b:J

    return-void
.end method

.method public static c()Le8/f$a;
    .locals 1

    new-instance v0, Le8/f$a;

    invoke-direct {v0}, Le8/f$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Luf/d;
        tag = 0x2
    .end annotation

    iget-wide v0, p0, Le8/f;->b:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Luf/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Le8/f;->a:J

    return-wide v0
.end method
