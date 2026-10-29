.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsf/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/b$f;,
        La8/b$d;,
        La8/b$a;,
        La8/b$c;,
        La8/b$e;,
        La8/b$b;
    }
.end annotation


# static fields
.field public static final a:Lsf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/b;

    invoke-direct {v0}, La8/b;-><init>()V

    sput-object v0, La8/b;->a:Lsf/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lsf/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsf/b<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, La8/b$b;->a:La8/b$b;

    const-class v1, La8/j;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/d;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, La8/b$e;->a:La8/b$e;

    const-class v1, La8/m;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/g;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, La8/b$c;->a:La8/b$c;

    const-class v1, La8/k;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/e;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, La8/b$a;->a:La8/b$a;

    const-class v1, La8/a;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/c;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, La8/b$d;->a:La8/b$d;

    const-class v1, La8/l;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/f;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, La8/b$f;->a:La8/b$f;

    const-class v1, La8/o;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v1, La8/i;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    return-void
.end method
