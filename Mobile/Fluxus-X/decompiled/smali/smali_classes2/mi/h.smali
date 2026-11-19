.class public Lmi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmi/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Loi/a;[Lmi/c$a;Lmi/l;)Lmi/e;
    .locals 6

    new-instance v0, Lmi/e;

    invoke-static {p2}, Lok/n;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lbh/a1;->S()Ljava/lang/String;

    move-result-object v3

    move-object v1, p1

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lmi/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmi/l;[Lmi/c$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;[Lmi/c$a;Lmi/l;)Lmi/d;
    .locals 1

    new-instance v0, Lmi/d;

    invoke-direct {v0, p1, p3, p2}, Lmi/d;-><init>(Ljava/lang/String;Lmi/l;[Lmi/c$a;)V

    return-object v0
.end method
