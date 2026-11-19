.class public final synthetic Lwa/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f;


# instance fields
.field public final synthetic a:Lwa/m0;


# direct methods
.method public synthetic constructor <init>(Lwa/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa/i0;->a:Lwa/m0;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lwa/i0;->a:Lwa/m0;

    invoke-virtual {v0, p1}, Lwa/m0;->e(Ljava/lang/Exception;)V

    return-void
.end method
