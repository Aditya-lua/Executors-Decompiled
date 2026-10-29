.class public Lei/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[Lei/c$a;Lei/l;)Lei/d;
    .locals 1

    new-instance v0, Lei/d;

    invoke-direct {v0, p1, p3, p2}, Lei/d;-><init>(Ljava/lang/String;Lei/l;[Lei/c$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;Lgi/a;[Lei/c$a;Lei/l;)Lei/e;
    .locals 6

    new-instance v0, Lei/e;

    invoke-static {p2}, Lgk/n;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lsg/a1;->S()Ljava/lang/String;

    move-result-object v3

    move-object v1, p1

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lei/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei/l;[Lei/c$a;)V

    return-object v0
.end method
