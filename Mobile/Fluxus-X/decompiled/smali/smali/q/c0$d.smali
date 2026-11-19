.class public Lq/c0$d;
.super Lq/c0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic c:Lq/c0;


# direct methods
.method public constructor <init>(Lq/c0;)V
    .locals 0

    iput-object p1, p0, Lq/c0$d;->c:Lq/c0;

    invoke-direct {p0, p1}, Lq/c0$c;-><init>(Lq/c0;)V

    return-void
.end method


# virtual methods
.method public c(IF)V
    .locals 1

    iget-object v0, p0, Lq/c0$d;->c:Lq/c0;

    invoke-static {v0, p1, p2}, Lq/c0;->i(Lq/c0;IF)V

    return-void
.end method
