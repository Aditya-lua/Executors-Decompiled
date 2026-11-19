.class public final Lc8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc8/a$f;,
        Lc8/a$b;,
        Lc8/a$c;,
        Lc8/a$d;,
        Lc8/a$g;,
        Lc8/a$a;,
        Lc8/a$e;
    }
.end annotation


# static fields
.field public static final a:Luf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc8/a;

    invoke-direct {v0}, Lc8/a;-><init>()V

    sput-object v0, Lc8/a;->a:Luf/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Luf/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luf/b<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Lc8/l;

    sget-object v1, Lc8/a$e;->a:Lc8/a$e;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/a;

    sget-object v1, Lc8/a$a;->a:Lc8/a$a;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/f;

    sget-object v1, Lc8/a$g;->a:Lc8/a$g;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/d;

    sget-object v1, Lc8/a$d;->a:Lc8/a$d;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/c;

    sget-object v1, Lc8/a$c;->a:Lc8/a$c;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/b;

    sget-object v1, Lc8/a$b;->a:Lc8/a$b;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v0, Lf8/e;

    sget-object v1, Lc8/a$f;->a:Lc8/a$f;

    invoke-interface {p1, v0, v1}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    return-void
.end method
