.class public final Lc8/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lf8/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lc8/a$d;

.field public static final b:Ltf/d;

.field public static final c:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc8/a$d;

    invoke-direct {v0}, Lc8/a$d;-><init>()V

    sput-object v0, Lc8/a$d;->a:Lc8/a$d;

    const-string v0, "logSource"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lc8/a$d;->b:Ltf/d;

    const-string v0, "logEventDropped"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lc8/a$d;->c:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf8/d;Ltf/f;)V
    .locals 2

    sget-object v0, Lc8/a$d;->b:Ltf/d;

    invoke-virtual {p1}, Lf8/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lc8/a$d;->c:Ltf/d;

    invoke-virtual {p1}, Lf8/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf8/d;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lc8/a$d;->a(Lf8/d;Ltf/f;)V

    return-void
.end method
