.class public Lq/c0$c;
.super Lq/c0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lq/c0;


# direct methods
.method public constructor <init>(Lq/c0;)V
    .locals 0

    iput-object p1, p0, Lq/c0$c;->b:Lq/c0;

    invoke-direct {p0, p1}, Lq/c0$b;-><init>(Lq/c0;)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    iget-object v0, p0, Lq/c0$c;->b:Lq/c0;

    invoke-static {v0, p1}, Lq/c0;->h(Lq/c0;I)V

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lq/c0$c;->b:Lq/c0;

    invoke-static {v0, p1}, Lq/c0;->f(Lq/c0;I)V

    return-void
.end method
