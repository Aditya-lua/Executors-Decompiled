.class public final Lf8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/c$b;,
        Lf8/c$a;
    }
.end annotation


# static fields
.field public static final c:Lf8/c;


# instance fields
.field public final a:J

.field public final b:Lf8/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/c$a;

    invoke-direct {v0}, Lf8/c$a;-><init>()V

    invoke-virtual {v0}, Lf8/c$a;->a()Lf8/c;

    move-result-object v0

    sput-object v0, Lf8/c;->c:Lf8/c;

    return-void
.end method

.method public constructor <init>(JLf8/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf8/c;->a:J

    iput-object p3, p0, Lf8/c;->b:Lf8/c$b;

    return-void
.end method

.method public static c()Lf8/c$a;
    .locals 1

    new-instance v0, Lf8/c$a;

    invoke-direct {v0}, Lf8/c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lwf/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lf8/c;->a:J

    return-wide v0
.end method

.method public b()Lf8/c$b;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lf8/c;->b:Lf8/c$b;

    return-object v0
.end method
