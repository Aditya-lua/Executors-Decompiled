.class public Lp5/b0$a;
.super Lp5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/b0;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lp5/q;

.field public final synthetic b:Lp5/b0;


# direct methods
.method public constructor <init>(Lp5/b0;Lp5/q;)V
    .locals 0

    iput-object p1, p0, Lp5/b0$a;->b:Lp5/b0;

    iput-object p2, p0, Lp5/b0$a;->a:Lp5/q;

    invoke-direct {p0}, Lp5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lp5/q;)V
    .locals 1
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lp5/b0$a;->a:Lp5/q;

    invoke-virtual {v0}, Lp5/q;->u0()V

    invoke-virtual {p1, p0}, Lp5/q;->q0(Lp5/q$h;)Lp5/q;

    return-void
.end method
