.class public final synthetic Lbm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lbm/m$a;


# direct methods
.method public synthetic constructor <init>(Lbm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/c;->a:Lbm/m$a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lbm/c;->a:Lbm/m$a;

    invoke-static {v0, p1}, Lbm/m;->l(Lbm/m$a;Ljava/lang/Exception;)V

    return-void
.end method
