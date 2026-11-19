.class public final Lhn/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhn/y$m;,
        Lhn/y$l;
    }
.end annotation


# static fields
.field public static final a:Lhn/h$e;

.field public static final b:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/y$c;

    invoke-direct {v0}, Lhn/y$c;-><init>()V

    sput-object v0, Lhn/y;->a:Lhn/h$e;

    new-instance v0, Lhn/y$d;

    invoke-direct {v0}, Lhn/y$d;-><init>()V

    sput-object v0, Lhn/y;->b:Lhn/h;

    new-instance v0, Lhn/y$e;

    invoke-direct {v0}, Lhn/y$e;-><init>()V

    sput-object v0, Lhn/y;->c:Lhn/h;

    new-instance v0, Lhn/y$f;

    invoke-direct {v0}, Lhn/y$f;-><init>()V

    sput-object v0, Lhn/y;->d:Lhn/h;

    new-instance v0, Lhn/y$g;

    invoke-direct {v0}, Lhn/y$g;-><init>()V

    sput-object v0, Lhn/y;->e:Lhn/h;

    new-instance v0, Lhn/y$h;

    invoke-direct {v0}, Lhn/y$h;-><init>()V

    sput-object v0, Lhn/y;->f:Lhn/h;

    new-instance v0, Lhn/y$i;

    invoke-direct {v0}, Lhn/y$i;-><init>()V

    sput-object v0, Lhn/y;->g:Lhn/h;

    new-instance v0, Lhn/y$j;

    invoke-direct {v0}, Lhn/y$j;-><init>()V

    sput-object v0, Lhn/y;->h:Lhn/h;

    new-instance v0, Lhn/y$k;

    invoke-direct {v0}, Lhn/y$k;-><init>()V

    sput-object v0, Lhn/y;->i:Lhn/h;

    new-instance v0, Lhn/y$a;

    invoke-direct {v0}, Lhn/y$a;-><init>()V

    sput-object v0, Lhn/y;->j:Lhn/h;

    return-void
.end method

.method public static a(Lhn/m;Ljava/lang/String;II)I
    .locals 1

    invoke-virtual {p0}, Lhn/m;->m()I

    move-result v0

    if-lt v0, p2, :cond_0

    if-gt v0, p3, :cond_0

    return v0

    :cond_0
    new-instance p2, Lhn/j;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0}, Lhn/m;->x()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p3, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Expected %s but was %s at path %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lhn/j;-><init>(Ljava/lang/String;)V

    throw p2
.end method
