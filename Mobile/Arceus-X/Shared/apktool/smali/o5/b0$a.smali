.class public Lo5/b0$a;
.super Lo5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/b0;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo5/q;

.field public final synthetic b:Lo5/b0;


# direct methods
.method public constructor <init>(Lo5/b0;Lo5/q;)V
    .locals 0

    iput-object p1, p0, Lo5/b0$a;->b:Lo5/b0;

    iput-object p2, p0, Lo5/b0$a;->a:Lo5/q;

    invoke-direct {p0}, Lo5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/b0$a;->a:Lo5/q;

    invoke-virtual {v0}, Lo5/q;->q0()V

    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    return-void
.end method
