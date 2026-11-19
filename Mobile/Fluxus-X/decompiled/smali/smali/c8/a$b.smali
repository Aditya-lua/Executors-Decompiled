.class public final Lc8/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lf8/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lc8/a$b;

.field public static final b:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc8/a$b;

    invoke-direct {v0}, Lc8/a$b;-><init>()V

    sput-object v0, Lc8/a$b;->a:Lc8/a$b;

    const-string v0, "storageMetrics"

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

    sput-object v0, Lc8/a$b;->b:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf8/b;Ltf/f;)V
    .locals 1

    sget-object v0, Lc8/a$b;->b:Ltf/d;

    invoke-virtual {p1}, Lf8/b;->a()Lf8/e;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf8/b;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lc8/a$b;->a(Lf8/b;Ltf/f;)V

    return-void
.end method
