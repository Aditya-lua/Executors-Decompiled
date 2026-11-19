.class public final synthetic Lbv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lav/n;

.field public final synthetic b:Lbv/f;


# direct methods
.method public synthetic constructor <init>(Lav/n;Lbv/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbv/d;->a:Lav/n;

    iput-object p2, p0, Lbv/d;->b:Lbv/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbv/d;->a:Lav/n;

    iget-object v1, p0, Lbv/d;->b:Lbv/f;

    invoke-static {v0, v1}, Lbv/f;->c0(Lav/n;Lbv/f;)V

    return-void
.end method
