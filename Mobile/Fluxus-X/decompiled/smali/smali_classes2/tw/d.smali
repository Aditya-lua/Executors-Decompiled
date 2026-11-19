.class public final Ltw/d;
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
.field public final c:Llg/f;

.field public final d:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llg/f;Llg/a0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Llg/a0<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lmv/g0;-><init>()V

    iput-object p1, p0, Ltw/d;->c:Llg/f;

    iput-object p2, p0, Ltw/d;->d:Llg/a0;

    iput-object p3, p0, Ltw/d;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()Lmv/b0;
    .locals 1

    sget-object v0, Ltw/b;->d:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 3

    iget-object v0, p0, Ltw/d;->c:Llg/f;

    iget-object v1, p0, Ltw/d;->d:Llg/a0;

    iget-object v2, p0, Ltw/d;->e:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Ltw/b;->c(Lew/f;Llg/f;Llg/a0;Ljava/lang/Object;)V

    return-void
.end method
