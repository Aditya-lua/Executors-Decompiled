.class public final Lc8/a$e;
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
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lc8/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lc8/a$e;

.field public static final b:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc8/a$e;

    invoke-direct {v0}, Lc8/a$e;-><init>()V

    sput-object v0, Lc8/a$e;->a:Lc8/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lc8/a$e;->b:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc8/l;Ltf/f;)V
    .locals 1

    sget-object v0, Lc8/a$e;->b:Ltf/d;

    invoke-virtual {p1}, Lc8/l;->b()Lf8/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lc8/l;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lc8/a$e;->a(Lc8/l;Ltf/f;)V

    return-void
.end method
