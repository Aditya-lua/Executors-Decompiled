.class public Lsw/q$b$a;
.super Lew/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw/q$b;-><init>(Lmv/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lsw/q$b;


# direct methods
.method public constructor <init>(Lsw/q$b;Lew/l0;)V
    .locals 0

    iput-object p1, p0, Lsw/q$b$a;->b:Lsw/q$b;

    invoke-direct {p0, p2}, Lew/n;-><init>(Lew/l0;)V

    return-void
.end method


# virtual methods
.method public f3(Lew/e;J)J
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lew/n;->f3(Lew/e;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lsw/q$b$a;->b:Lsw/q$b;

    iput-object p1, p2, Lsw/q$b;->f:Ljava/io/IOException;

    throw p1
.end method
