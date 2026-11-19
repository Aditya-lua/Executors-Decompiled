.class public final Lb8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/b$f;,
        Lb8/b$d;,
        Lb8/b$a;,
        Lb8/b$c;,
        Lb8/b$e;,
        Lb8/b$b;
    }
.end annotation


# static fields
.field public static final a:Luf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/b;

    invoke-direct {v0}, Lb8/b;-><init>()V

    sput-object v0, Lb8/b;->a:Luf/a;

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

    sget-object v0, Lb8/b$b;->a:Lb8/b$b;

    const-class v1, Lb8/j;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/d;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    sget-object v0, Lb8/b$e;->a:Lb8/b$e;

    const-class v1, Lb8/m;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/g;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    sget-object v0, Lb8/b$c;->a:Lb8/b$c;

    const-class v1, Lb8/k;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/e;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    sget-object v0, Lb8/b$a;->a:Lb8/b$a;

    const-class v1, Lb8/a;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/c;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    sget-object v0, Lb8/b$d;->a:Lb8/b$d;

    const-class v1, Lb8/l;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/f;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    sget-object v0, Lb8/b$f;->a:Lb8/b$f;

    const-class v1, Lb8/o;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    const-class v1, Lb8/i;

    invoke-interface {p1, v1, v0}, Luf/b;->registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;

    return-void
.end method
