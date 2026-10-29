.class public final Lnb/wc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/me;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lnb/bd;Lnb/me;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lnb/wc;->a:Lnb/me;

    iput-object p3, p0, Lnb/wc;->b:Ljava/lang/Runnable;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/wc;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    iget-object v1, p0, Lnb/wc;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lnb/me;->D(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lnb/me;->r()V

    return-void
.end method
