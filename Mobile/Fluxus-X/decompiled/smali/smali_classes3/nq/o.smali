.class public final synthetic Lnq/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnq/q;

.field public final synthetic b:Loq/c;


# direct methods
.method public synthetic constructor <init>(Lnq/q;Loq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/o;->a:Lnq/q;

    iput-object p2, p0, Lnq/o;->b:Loq/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnq/o;->a:Lnq/q;

    iget-object v1, p0, Lnq/o;->b:Loq/c;

    invoke-static {v0, v1}, Lnq/q;->r(Lnq/q;Loq/c;)V

    return-void
.end method
