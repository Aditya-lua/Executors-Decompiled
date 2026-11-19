.class public final Lf1/p1$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final a:Ln0/u3;

.field public static final b:Lf1/a2;

.field public static final c:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "*>;"
        }
    .end annotation
.end field

.field public static final d:Lm1/r1$a;

.field public static final e:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lg0/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Ln0/u3;->d:Ln0/u3;

    sput-object v0, Lf1/p1$e;->a:Ln0/u3;

    new-instance v1, Lf1/r1;

    invoke-direct {v1}, Lf1/r1;-><init>()V

    sput-object v1, Lf1/p1$e;->b:Lf1/a2;

    sget-object v2, Lm1/t1;->d:Lm1/r1$a;

    sput-object v2, Lf1/p1$e;->d:Lm1/r1$a;

    new-instance v3, Landroid/util/Range;

    const/16 v4, 0x1e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v3, Lf1/p1$e;->e:Landroid/util/Range;

    new-instance v3, Landroid/util/Range;

    const/16 v4, 0x78

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v3, Lf1/p1$e;->f:Landroid/util/Range;

    sget-object v3, Lg0/k0;->d:Lg0/k0;

    sput-object v3, Lf1/p1$e;->g:Lg0/k0;

    new-instance v4, Lf1/p1$d;

    invoke-direct {v4, v1}, Lf1/p1$d;-><init>(Lf1/a2;)V

    const/4 v1, 0x5

    invoke-virtual {v4, v1}, Lf1/p1$d;->o(I)Lf1/p1$d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lf1/p1$d;->n(Ln0/u3;)Lf1/p1$d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lf1/p1$d;->u(Lm1/r1$a;)Lf1/p1$d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lf1/p1$d;->k(Lg0/k0;)Lf1/p1$d;

    move-result-object v0

    invoke-virtual {v0}, Lf1/p1$d;->i()Lg1/a;

    move-result-object v0

    sput-object v0, Lf1/p1$e;->c:Lg1/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg1/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg1/a<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lf1/p1$e;->c:Lg1/a;

    return-object v0
.end method
