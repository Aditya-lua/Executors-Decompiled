.class public final Lb8/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "Le8/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/a$d;

.field public static final b:Lrf/d;

.field public static final c:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb8/a$d;

    invoke-direct {v0}, Lb8/a$d;-><init>()V

    sput-object v0, Lb8/a$d;->a:Lb8/a$d;

    const-string v0, "logSource"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lb8/a$d;->b:Lrf/d;

    const-string v0, "logEventDropped"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lb8/a$d;->c:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/d;Lrf/f;)V
    .locals 2

    sget-object v0, Lb8/a$d;->b:Lrf/d;

    invoke-virtual {p1}, Le8/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lb8/a$d;->c:Lrf/d;

    invoke-virtual {p1}, Le8/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le8/d;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, Lb8/a$d;->a(Le8/d;Lrf/f;)V

    return-void
.end method
