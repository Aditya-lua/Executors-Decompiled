.class public Lq/b0$c;
.super Lq/b0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lq/b0;


# direct methods
.method public constructor <init>(Lq/b0;)V
    .locals 0

    iput-object p1, p0, Lq/b0$c;->b:Lq/b0;

    invoke-direct {p0, p1}, Lq/b0$b;-><init>(Lq/b0;)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    iget-object v0, p0, Lq/b0$c;->b:Lq/b0;

    invoke-static {v0, p1}, Lq/b0;->h(Lq/b0;I)V

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lq/b0$c;->b:Lq/b0;

    invoke-static {v0, p1}, Lq/b0;->f(Lq/b0;I)V

    return-void
.end method
