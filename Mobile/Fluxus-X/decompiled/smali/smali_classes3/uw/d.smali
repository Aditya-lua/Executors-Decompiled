.class public final Luw/d;
.super Lmv/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lmv/g0;"
    }
.end annotation


# instance fields
.field public final c:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/h;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lmv/g0;-><init>()V

    iput-object p1, p0, Luw/d;->c:Lhn/h;

    iput-object p2, p0, Luw/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()Lmv/b0;
    .locals 1

    sget-object v0, Luw/b;->c:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 2

    iget-object v0, p0, Luw/d;->c:Lhn/h;

    iget-object v1, p0, Luw/d;->d:Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lew/f;Ljava/lang/Object;)V

    return-void
.end method
