.class public Lsw/v$a;
.super Lmv/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final c:Lmv/g0;

.field public final d:Lmv/b0;


# direct methods
.method public constructor <init>(Lmv/g0;Lmv/b0;)V
    .locals 0

    invoke-direct {p0}, Lmv/g0;-><init>()V

    iput-object p1, p0, Lsw/v$a;->c:Lmv/g0;

    iput-object p2, p0, Lsw/v$a;->d:Lmv/b0;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lsw/v$a;->c:Lmv/g0;

    invoke-virtual {v0}, Lmv/g0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lsw/v$a;->d:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 1

    iget-object v0, p0, Lsw/v$a;->c:Lmv/g0;

    invoke-virtual {v0, p1}, Lmv/g0;->h(Lew/f;)V

    return-void
.end method
