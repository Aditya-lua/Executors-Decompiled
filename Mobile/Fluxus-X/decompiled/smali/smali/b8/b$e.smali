.class public final Lb8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lb8/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/b$e;

.field public static final b:Ltf/d;

.field public static final c:Ltf/d;

.field public static final d:Ltf/d;

.field public static final e:Ltf/d;

.field public static final f:Ltf/d;

.field public static final g:Ltf/d;

.field public static final h:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/b$e;

    invoke-direct {v0}, Lb8/b$e;-><init>()V

    sput-object v0, Lb8/b$e;->a:Lb8/b$e;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->b:Ltf/d;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->c:Ltf/d;

    const-string v0, "clientInfo"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->d:Ltf/d;

    const-string v0, "logSource"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->e:Ltf/d;

    const-string v0, "logSourceName"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->f:Ltf/d;

    const-string v0, "logEvent"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->g:Ltf/d;

    const-string v0, "qosTier"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$e;->h:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/m;Ltf/f;)V
    .locals 3

    sget-object v0, Lb8/b$e;->b:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lb8/b$e;->c:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lb8/b$e;->d:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->b()Lb8/k;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$e;->e:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$e;->f:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$e;->g:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$e;->h:Ltf/d;

    invoke-virtual {p1}, Lb8/m;->f()Lb8/p;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb8/m;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lb8/b$e;->a(Lb8/m;Ltf/f;)V

    return-void
.end method
