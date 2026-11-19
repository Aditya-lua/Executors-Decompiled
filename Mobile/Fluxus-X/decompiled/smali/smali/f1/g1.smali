.class public abstract Lf1/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/g1$a;
    }
.end annotation


# static fields
.field public static final a:Lf1/g1;

.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ln0/a3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/a3<",
            "Lf1/g1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lf1/g1$a;->b:Lf1/g1$a;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lf1/g1;->d(ILf1/g1$a;)Lf1/g1;

    move-result-object v0

    sput-object v0, Lf1/g1;->a:Lf1/g1;

    new-instance v0, Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lf1/g1;->b:Ljava/util/Set;

    sget-object v0, Lf1/g1$a;->a:Lf1/g1$a;

    invoke-static {v1, v0}, Lf1/g1;->d(ILf1/g1$a;)Lf1/g1;

    move-result-object v0

    invoke-static {v0}, Ln0/p1;->f(Ljava/lang/Object;)Ln0/a3;

    move-result-object v0

    sput-object v0, Lf1/g1;->c:Ln0/a3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(ILf1/g1$a;)Lf1/g1;
    .locals 2

    new-instance v0, Lf1/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lf1/m;-><init>(ILf1/g1$a;Lg0/v2$h;)V

    return-object v0
.end method

.method public static e(ILf1/g1$a;Lg0/v2$h;)Lf1/g1;
    .locals 1

    new-instance v0, Lf1/m;

    invoke-direct {v0, p0, p1, p2}, Lf1/m;-><init>(ILf1/g1$a;Lg0/v2$h;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Lg0/v2$h;
.end method

.method public abstract c()Lf1/g1$a;
.end method
