.class public final Lvf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvf/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luf/b<",
        "Lvf/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Ltf/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ltf/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ltf/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lvf/d$b;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ltf/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ltf/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Ltf/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvf/a;

    invoke-direct {v0}, Lvf/a;-><init>()V

    sput-object v0, Lvf/d;->e:Ltf/e;

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sput-object v0, Lvf/d;->f:Ltf/g;

    new-instance v0, Lvf/c;

    invoke-direct {v0}, Lvf/c;-><init>()V

    sput-object v0, Lvf/d;->g:Ltf/g;

    new-instance v0, Lvf/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvf/d$b;-><init>(Lvf/d$a;)V

    sput-object v0, Lvf/d;->h:Lvf/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lvf/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lvf/d;->b:Ljava/util/Map;

    sget-object v0, Lvf/d;->e:Ltf/e;

    iput-object v0, p0, Lvf/d;->c:Ltf/e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvf/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lvf/d;->f:Ltf/g;

    invoke-virtual {p0, v0, v1}, Lvf/d;->l(Ljava/lang/Class;Ltf/g;)Lvf/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lvf/d;->g:Ltf/g;

    invoke-virtual {p0, v0, v1}, Lvf/d;->l(Ljava/lang/Class;Ltf/g;)Lvf/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Lvf/d;->h:Lvf/d$b;

    invoke-virtual {p0, v0, v1}, Lvf/d;->l(Ljava/lang/Class;Ltf/g;)Lvf/d;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Boolean;Ltf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Ltf/h;->add(Z)Ltf/h;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Ltf/f;)V
    .locals 2

    new-instance p1, Ltf/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ltf/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic c(Ljava/lang/String;Ltf/h;)V
    .locals 0

    invoke-interface {p1, p0}, Ltf/h;->add(Ljava/lang/String;)Ltf/h;

    return-void
.end method

.method public static synthetic d(Lvf/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lvf/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic e(Lvf/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lvf/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic f(Lvf/d;)Ltf/e;
    .locals 0

    iget-object p0, p0, Lvf/d;->c:Ltf/e;

    return-object p0
.end method

.method public static synthetic g(Lvf/d;)Z
    .locals 0

    iget-boolean p0, p0, Lvf/d;->d:Z

    return p0
.end method


# virtual methods
.method public h()Ltf/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lvf/d$a;

    invoke-direct {v0, p0}, Lvf/d$a;-><init>(Lvf/d;)V

    return-object v0
.end method

.method public i(Luf/a;)Lvf/d;
    .locals 0
    .param p1    # Luf/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-interface {p1, p0}, Luf/a;->configure(Luf/b;)V

    return-object p0
.end method

.method public j(Z)Lvf/d;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lvf/d;->d:Z

    return-object p0
.end method

.method public k(Ljava/lang/Class;Ltf/e;)Lvf/d;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltf/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ltf/e<",
            "-TT;>;)",
            "Lvf/d;"
        }
    .end annotation

    iget-object v0, p0, Lvf/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lvf/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public l(Ljava/lang/Class;Ltf/g;)Lvf/d;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltf/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ltf/g<",
            "-TT;>;)",
            "Lvf/d;"
        }
    .end annotation

    iget-object v0, p0, Lvf/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lvf/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic registerEncoder(Ljava/lang/Class;Ltf/e;)Luf/b;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltf/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lvf/d;->k(Ljava/lang/Class;Ltf/e;)Lvf/d;

    move-result-object p1

    return-object p1
.end method
