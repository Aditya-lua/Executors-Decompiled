.class public final La8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "La8/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La8/b$e;

.field public static final b:Lrf/d;

.field public static final c:Lrf/d;

.field public static final d:Lrf/d;

.field public static final e:Lrf/d;

.field public static final f:Lrf/d;

.field public static final g:Lrf/d;

.field public static final h:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/b$e;

    invoke-direct {v0}, La8/b$e;-><init>()V

    sput-object v0, La8/b$e;->a:La8/b$e;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->b:Lrf/d;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->c:Lrf/d;

    const-string v0, "clientInfo"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->d:Lrf/d;

    const-string v0, "logSource"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->e:Lrf/d;

    const-string v0, "logSourceName"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->f:Lrf/d;

    const-string v0, "logEvent"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->g:Lrf/d;

    const-string v0, "qosTier"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$e;->h:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/m;Lrf/f;)V
    .locals 3

    sget-object v0, La8/b$e;->b:Lrf/d;

    invoke-virtual {p1}, La8/m;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, La8/b$e;->c:Lrf/d;

    invoke-virtual {p1}, La8/m;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, La8/b$e;->d:Lrf/d;

    invoke-virtual {p1}, La8/m;->b()La8/k;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$e;->e:Lrf/d;

    invoke-virtual {p1}, La8/m;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$e;->f:Lrf/d;

    invoke-virtual {p1}, La8/m;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$e;->g:Lrf/d;

    invoke-virtual {p1}, La8/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$e;->h:Lrf/d;

    invoke-virtual {p1}, La8/m;->f()La8/p;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La8/m;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, La8/b$e;->a(La8/m;Lrf/f;)V

    return-void
.end method
