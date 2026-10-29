.class public final La8/b$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "La8/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La8/b$b;

.field public static final b:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/b$b;

    invoke-direct {v0}, La8/b$b;-><init>()V

    sput-object v0, La8/b$b;->a:La8/b$b;

    const-string v0, "logRequest"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$b;->b:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/j;Lrf/f;)V
    .locals 1

    sget-object v0, La8/b$b;->b:Lrf/d;

    invoke-virtual {p1}, La8/j;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La8/j;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, La8/b$b;->a(La8/j;Lrf/f;)V

    return-void
.end method
