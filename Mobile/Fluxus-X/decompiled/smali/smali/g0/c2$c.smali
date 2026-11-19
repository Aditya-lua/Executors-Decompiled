.class public final Lg0/c2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lg0/c2$c;

.field public static final e:Lg0/c2$c;

.field public static final f:Lg0/c2$c;

.field public static g:Lg0/c2$c;


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lg0/c2$c;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Lg0/c2$c;-><init>(ZJ)V

    sput-object v0, Lg0/c2$c;->d:Lg0/c2$c;

    new-instance v0, Lg0/c2$c;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Lg0/c2$c;-><init>(Z)V

    sput-object v0, Lg0/c2$c;->e:Lg0/c2$c;

    new-instance v0, Lg0/c2$c;

    const-wide/16 v5, 0x64

    invoke-direct {v0, v4, v5, v6}, Lg0/c2$c;-><init>(ZJ)V

    sput-object v0, Lg0/c2$c;->f:Lg0/c2$c;

    new-instance v0, Lg0/c2$c;

    invoke-direct {v0, v1, v2, v3, v4}, Lg0/c2$c;-><init>(ZJZ)V

    sput-object v0, Lg0/c2$c;->g:Lg0/c2$c;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lg0/c2$c;->a()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lg0/c2$c;-><init>(ZJ)V

    return-void
.end method

.method public constructor <init>(ZJ)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lg0/c2$c;-><init>(ZJZ)V

    return-void
.end method

.method public constructor <init>(ZJZ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lg0/c2$c;->b:Z

    .line 5
    iput-wide p2, p0, Lg0/c2$c;->a:J

    if-eqz p4, :cond_0

    xor-int/lit8 p1, p1, 0x1

    .line 6
    const-string p2, "shouldRetry must be false when completeWithoutFailure is set to true"

    invoke-static {p1, p2}, Lx2/g;->b(ZLjava/lang/Object;)V

    .line 7
    :cond_0
    iput-boolean p4, p0, Lg0/c2$c;->c:Z

    return-void
.end method

.method public static a()J
    .locals 2

    const-wide/16 v0, 0x1f4

    return-wide v0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lg0/c2$c;->a:J

    return-wide v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lg0/c2$c;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lg0/c2$c;->b:Z

    return v0
.end method
