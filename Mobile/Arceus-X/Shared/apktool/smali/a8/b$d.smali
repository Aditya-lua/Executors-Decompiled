.class public final La8/b$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "La8/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La8/b$d;

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

    new-instance v0, La8/b$d;

    invoke-direct {v0}, La8/b$d;-><init>()V

    sput-object v0, La8/b$d;->a:La8/b$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->b:Lrf/d;

    const-string v0, "eventCode"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->c:Lrf/d;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->d:Lrf/d;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->e:Lrf/d;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->f:Lrf/d;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->g:Lrf/d;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$d;->h:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/l;Lrf/f;)V
    .locals 3

    sget-object v0, La8/b$d;->b:Lrf/d;

    invoke-virtual {p1}, La8/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, La8/b$d;->c:Lrf/d;

    invoke-virtual {p1}, La8/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$d;->d:Lrf/d;

    invoke-virtual {p1}, La8/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, La8/b$d;->e:Lrf/d;

    invoke-virtual {p1}, La8/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$d;->f:Lrf/d;

    invoke-virtual {p1}, La8/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$d;->g:Lrf/d;

    invoke-virtual {p1}, La8/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, La8/b$d;->h:Lrf/d;

    invoke-virtual {p1}, La8/l;->e()La8/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La8/l;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, La8/b$d;->a(La8/l;Lrf/f;)V

    return-void
.end method
