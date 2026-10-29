.class public interface abstract Lg0/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/c2$c;,
        Lg0/c2$b;,
        Lg0/c2$a;
    }
.end annotation


# static fields
.field public static final a:Lg0/c2;

.field public static final b:Lg0/c2;

.field public static final c:Lg0/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg0/b2;

    invoke-direct {v0}, Lg0/b2;-><init>()V

    sput-object v0, Lg0/c2;->a:Lg0/c2;

    new-instance v0, Ln0/a1$b;

    invoke-static {}, Lg0/c2;->c()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ln0/a1$b;-><init>(J)V

    sput-object v0, Lg0/c2;->b:Lg0/c2;

    new-instance v0, Ln0/a1;

    invoke-static {}, Lg0/c2;->c()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ln0/a1;-><init>(J)V

    sput-object v0, Lg0/c2;->c:Lg0/c2;

    return-void
.end method

.method public static c()J
    .locals 2

    const-wide/16 v0, 0x1770

    return-wide v0
.end method

.method public static synthetic d(Lg0/c2$b;)Lg0/c2$c;
    .locals 0

    sget-object p0, Lg0/c2$c;->d:Lg0/c2$c;

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract e(Lg0/c2$b;)Lg0/c2$c;
.end method
