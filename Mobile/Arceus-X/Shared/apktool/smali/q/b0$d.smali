.class public Lq/b0$d;
.super Lq/b0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic c:Lq/b0;


# direct methods
.method public constructor <init>(Lq/b0;)V
    .locals 0

    iput-object p1, p0, Lq/b0$d;->c:Lq/b0;

    invoke-direct {p0, p1}, Lq/b0$c;-><init>(Lq/b0;)V

    return-void
.end method


# virtual methods
.method public c(IF)V
    .locals 1

    iget-object v0, p0, Lq/b0$d;->c:Lq/b0;

    invoke-static {v0, p1, p2}, Lq/b0;->i(Lq/b0;IF)V

    return-void
.end method
