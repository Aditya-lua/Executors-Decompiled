.class public final Lb8/a$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "Le8/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/a$c;

.field public static final b:Lrf/d;

.field public static final c:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb8/a$c;

    invoke-direct {v0}, Lb8/a$c;-><init>()V

    sput-object v0, Lb8/a$c;->a:Lb8/a$c;

    const-string v0, "eventsDroppedCount"

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

    sput-object v0, Lb8/a$c;->b:Lrf/d;

    const-string v0, "reason"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lb8/a$c;->c:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/c;Lrf/f;)V
    .locals 3

    sget-object v0, Lb8/a$c;->b:Lrf/d;

    invoke-virtual {p1}, Le8/c;->a()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, Lb8/a$c;->c:Lrf/d;

    invoke-virtual {p1}, Le8/c;->b()Le8/c$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le8/c;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, Lb8/a$c;->a(Le8/c;Lrf/f;)V

    return-void
.end method
