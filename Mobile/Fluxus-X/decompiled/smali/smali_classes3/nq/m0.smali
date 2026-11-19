.class public final synthetic Lnq/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnq/k0;

.field public final synthetic b:Lsn/i;


# direct methods
.method public synthetic constructor <init>(Lnq/k0;Lsn/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/m0;->a:Lnq/k0;

    iput-object p2, p0, Lnq/m0;->b:Lsn/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnq/m0;->a:Lnq/k0;

    iget-object v1, p0, Lnq/m0;->b:Lsn/i;

    invoke-static {v0, v1}, Lnq/k0$c;->a(Lnq/k0;Lsn/i;)V

    return-void
.end method
