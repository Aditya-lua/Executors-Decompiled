.class public final Lmv/i0$b$a;
.super Lmv/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmv/i0$b;->a(Lew/g;Lmv/b0;J)Lmv/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "mv/i0$b$a",
        "Lmv/i0;",
        "Lmv/b0;",
        "f",
        "()Lmv/b0;",
        "",
        "e",
        "()J",
        "Lew/g;",
        "l3",
        "()Lew/g;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic d:Lmv/b0;

.field public final synthetic e:J

.field public final synthetic f:Lew/g;


# direct methods
.method public constructor <init>(Lmv/b0;JLew/g;)V
    .locals 0

    iput-object p1, p0, Lmv/i0$b$a;->d:Lmv/b0;

    iput-wide p2, p0, Lmv/i0$b$a;->e:J

    iput-object p4, p0, Lmv/i0$b$a;->f:Lew/g;

    invoke-direct {p0}, Lmv/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    iget-wide v0, p0, Lmv/i0$b$a;->e:J

    return-wide v0
.end method

.method public f()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lmv/i0$b$a;->d:Lmv/b0;

    return-object v0
.end method

.method public l3()Lew/g;
    .locals 1

    iget-object v0, p0, Lmv/i0$b$a;->f:Lew/g;

    return-object v0
.end method
