.class public final La8/b$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "La8/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La8/b$f;

.field public static final b:Lrf/d;

.field public static final c:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/b$f;

    invoke-direct {v0}, La8/b$f;-><init>()V

    sput-object v0, La8/b$f;->a:La8/b$f;

    const-string v0, "networkType"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$f;->b:Lrf/d;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$f;->c:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/o;Lrf/f;)V
    .locals 2

    sget-object v0, La8/b$f;->b:Lrf/d;

    invoke-virtual {p1}, La8/o;->c()La8/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$f;->c:Lrf/d;

    invoke-virtual {p1}, La8/o;->b()La8/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La8/o;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, La8/b$f;->a(La8/o;Lrf/f;)V

    return-void
.end method
