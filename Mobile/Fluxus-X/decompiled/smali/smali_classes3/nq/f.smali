.class public final synthetic Lnq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnq/q;


# direct methods
.method public synthetic constructor <init>(Lnq/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/f;->a:Lnq/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lnq/f;->a:Lnq/q;

    invoke-static {v0}, Lnq/q;->A(Lnq/q;)V

    return-void
.end method
