.class public final Luw/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/h<",
        "TT;",
        "Lmv/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lmv/b0;


# instance fields
.field public final a:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lmv/b0;->e(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    sput-object v0, Luw/b;->c:Lmv/b0;

    return-void
.end method

.method public constructor <init>(Lhn/h;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h<",
            "TT;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luw/b;->a:Lhn/h;

    iput-boolean p2, p0, Luw/b;->b:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Luw/b;->b(Ljava/lang/Object;)Lmv/g0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lmv/g0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lmv/g0;"
        }
    .end annotation

    iget-boolean v0, p0, Luw/b;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Luw/d;

    iget-object v1, p0, Luw/b;->a:Lhn/h;

    invoke-direct {v0, v1, p1}, Luw/d;-><init>(Lhn/h;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-static {v0}, Lhn/t;->r(Lew/f;)Lhn/t;

    move-result-object v1

    iget-object v2, p0, Luw/b;->a:Lhn/h;

    invoke-virtual {v2, v1, p1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    sget-object p1, Luw/b;->c:Lmv/b0;

    invoke-virtual {v0}, Lew/e;->J2()Lew/h;

    move-result-object v0

    invoke-static {p1, v0}, Lmv/g0;->c(Lmv/b0;Lew/h;)Lmv/g0;

    move-result-object p1

    return-object p1
.end method
