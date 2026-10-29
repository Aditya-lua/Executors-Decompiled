.class public final Ltf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsf/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltf/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsf/b<",
        "Ltf/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lrf/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrf/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lrf/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrf/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lrf/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrf/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ltf/d$b;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lrf/e<",
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
            "Lrf/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Lrf/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrf/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltf/a;

    invoke-direct {v0}, Ltf/a;-><init>()V

    sput-object v0, Ltf/d;->e:Lrf/e;

    new-instance v0, Ltf/b;

    invoke-direct {v0}, Ltf/b;-><init>()V

    sput-object v0, Ltf/d;->f:Lrf/g;

    new-instance v0, Ltf/c;

    invoke-direct {v0}, Ltf/c;-><init>()V

    sput-object v0, Ltf/d;->g:Lrf/g;

    new-instance v0, Ltf/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltf/d$b;-><init>(Ltf/d$a;)V

    sput-object v0, Ltf/d;->h:Ltf/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltf/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltf/d;->b:Ljava/util/Map;

    sget-object v0, Ltf/d;->e:Lrf/e;

    iput-object v0, p0, Ltf/d;->c:Lrf/e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltf/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Ltf/d;->f:Lrf/g;

    invoke-virtual {p0, v0, v1}, Ltf/d;->l(Ljava/lang/Class;Lrf/g;)Ltf/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Ltf/d;->g:Lrf/g;

    invoke-virtual {p0, v0, v1}, Ltf/d;->l(Ljava/lang/Class;Lrf/g;)Ltf/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Ltf/d;->h:Ltf/d$b;

    invoke-virtual {p0, v0, v1}, Ltf/d;->l(Ljava/lang/Class;Lrf/g;)Ltf/d;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Boolean;Lrf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Lrf/h;->add(Z)Lrf/h;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lrf/f;)V
    .locals 2

    new-instance p1, Lrf/c;

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

    invoke-direct {p1, p0}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic c(Ljava/lang/String;Lrf/h;)V
    .locals 0

    invoke-interface {p1, p0}, Lrf/h;->add(Ljava/lang/String;)Lrf/h;

    return-void
.end method

.method public static synthetic d(Ltf/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ltf/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic e(Ltf/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ltf/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic f(Ltf/d;)Lrf/e;
    .locals 0

    iget-object p0, p0, Ltf/d;->c:Lrf/e;

    return-object p0
.end method

.method public static synthetic g(Ltf/d;)Z
    .locals 0

    iget-boolean p0, p0, Ltf/d;->d:Z

    return p0
.end method


# virtual methods
.method public h()Lrf/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ltf/d$a;

    invoke-direct {v0, p0}, Ltf/d$a;-><init>(Ltf/d;)V

    return-object v0
.end method

.method public i(Lsf/a;)Ltf/d;
    .locals 0
    .param p1    # Lsf/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-interface {p1, p0}, Lsf/a;->configure(Lsf/b;)V

    return-object p0
.end method

.method public j(Z)Ltf/d;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Ltf/d;->d:Z

    return-object p0
.end method

.method public k(Ljava/lang/Class;Lrf/e;)Ltf/d;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lrf/e;
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
            "Lrf/e<",
            "-TT;>;)",
            "Ltf/d;"
        }
    .end annotation

    iget-object v0, p0, Ltf/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ltf/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public l(Ljava/lang/Class;Lrf/g;)Ltf/d;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lrf/g;
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
            "Lrf/g<",
            "-TT;>;)",
            "Ltf/d;"
        }
    .end annotation

    iget-object v0, p0, Ltf/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ltf/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lrf/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Ltf/d;->k(Ljava/lang/Class;Lrf/e;)Ltf/d;

    move-result-object p1

    return-object p1
.end method
