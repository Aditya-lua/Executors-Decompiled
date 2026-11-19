.class public final Lb8/b$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lb8/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/b$d;

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

    new-instance v0, Lb8/b$d;

    invoke-direct {v0}, Lb8/b$d;-><init>()V

    sput-object v0, Lb8/b$d;->a:Lb8/b$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->b:Ltf/d;

    const-string v0, "eventCode"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->c:Ltf/d;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->d:Ltf/d;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->e:Ltf/d;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->f:Ltf/d;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->g:Ltf/d;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$d;->h:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/l;Ltf/f;)V
    .locals 3

    sget-object v0, Lb8/b$d;->b:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lb8/b$d;->c:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$d;->d:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lb8/b$d;->e:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$d;->f:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$d;->g:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lb8/b$d;->h:Ltf/d;

    invoke-virtual {p1}, Lb8/l;->e()Lb8/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb8/l;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lb8/b$d;->a(Lb8/l;Ltf/f;)V

    return-void
.end method
