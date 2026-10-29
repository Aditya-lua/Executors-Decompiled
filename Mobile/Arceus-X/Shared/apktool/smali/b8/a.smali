.class public final Lb8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsf/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/a$f;,
        Lb8/a$b;,
        Lb8/a$c;,
        Lb8/a$d;,
        Lb8/a$g;,
        Lb8/a$a;,
        Lb8/a$e;
    }
.end annotation


# static fields
.field public static final a:Lsf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/a;

    invoke-direct {v0}, Lb8/a;-><init>()V

    sput-object v0, Lb8/a;->a:Lsf/a;

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

    const-class v0, Lb8/l;

    sget-object v1, Lb8/a$e;->a:Lb8/a$e;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/a;

    sget-object v1, Lb8/a$a;->a:Lb8/a$a;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/f;

    sget-object v1, Lb8/a$g;->a:Lb8/a$g;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/d;

    sget-object v1, Lb8/a$d;->a:Lb8/a$d;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/c;

    sget-object v1, Lb8/a$c;->a:Lb8/a$c;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/b;

    sget-object v1, Lb8/a$b;->a:Lb8/a$b;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Le8/e;

    sget-object v1, Lb8/a$f;->a:Lb8/a$f;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    return-void
.end method
