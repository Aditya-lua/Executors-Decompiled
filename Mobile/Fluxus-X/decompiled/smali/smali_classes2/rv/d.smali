.class public final synthetic Lrv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmv/h;

.field public final synthetic b:Lmv/x;

.field public final synthetic c:Lmv/a;


# direct methods
.method public synthetic constructor <init>(Lmv/h;Lmv/x;Lmv/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/d;->a:Lmv/h;

    iput-object p2, p0, Lrv/d;->b:Lmv/x;

    iput-object p3, p0, Lrv/d;->c:Lmv/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrv/d;->a:Lmv/h;

    iget-object v1, p0, Lrv/d;->b:Lmv/x;

    iget-object v2, p0, Lrv/d;->c:Lmv/a;

    invoke-static {v0, v1, v2}, Lrv/f;->i(Lmv/h;Lmv/x;Lmv/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
