.class public final Lwf/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luf/b<",
        "Lwf/h$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Ltf/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwf/g;

    invoke-direct {v0}, Lwf/g;-><init>()V

    sput-object v0, Lwf/h$a;->d:Ltf/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwf/h$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwf/h$a;->b:Ljava/util/Map;

    sget-object v0, Lwf/h$a;->d:Ltf/e;

    iput-object v0, p0, Lwf/h$a;->c:Ltf/e;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ltf/f;)V
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


# virtual methods
.method public b()Lwf/h;
    .locals 4

    new-instance v0, Lwf/h;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lwf/h$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lwf/h$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Lwf/h$a;->c:Ltf/e;

    invoke-direct {v0, v1, v2, v3}, Lwf/h;-><init>(Ljava/util/Map;Ljava/util/Map;Ltf/e;)V

    return-object v0
.end method

.method public c(Luf/a;)Lwf/h$a;
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

.method public d(Ljava/lang/Class;Ltf/e;)Lwf/h$a;
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
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Ltf/e<",
            "-TU;>;)",
            "Lwf/h$a;"
        }
    .end annotation

    iget-object v0, p0, Lwf/h$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lwf/h$a;->b:Ljava/util/Map;

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

    invoke-virtual {p0, p1, p2}, Lwf/h$a;->d(Ljava/lang/Class;Ltf/e;)Lwf/h$a;

    move-result-object p1

    return-object p1
.end method
