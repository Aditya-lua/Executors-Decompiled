.class public final synthetic Lpm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f;


# instance fields
.field public final synthetic a:Lpm/m$a;


# direct methods
.method public synthetic constructor <init>(Lpm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm/c;->a:Lpm/m$a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lpm/c;->a:Lpm/m$a;

    invoke-static {v0, p1}, Lpm/m;->l(Lpm/m$a;Ljava/lang/Exception;)V

    return-void
.end method
