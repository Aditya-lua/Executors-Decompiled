.class public final Lb8/a$e;
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
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "Lb8/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/a$e;

.field public static final b:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/a$e;

    invoke-direct {v0}, Lb8/a$e;-><init>()V

    sput-object v0, Lb8/a$e;->a:Lb8/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, Lb8/a$e;->b:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/l;Lrf/f;)V
    .locals 1

    sget-object v0, Lb8/a$e;->b:Lrf/d;

    invoke-virtual {p1}, Lb8/l;->b()Le8/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb8/l;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, Lb8/a$e;->a(Lb8/l;Lrf/f;)V

    return-void
.end method
