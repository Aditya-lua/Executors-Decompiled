.class public final synthetic Lva/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lva/l0;


# direct methods
.method public synthetic constructor <init>(Lva/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva/h0;->a:Lva/l0;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lva/h0;->a:Lva/l0;

    invoke-virtual {v0, p1}, Lva/l0;->e(Ljava/lang/Exception;)V

    return-void
.end method
