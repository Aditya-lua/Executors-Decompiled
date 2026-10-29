.class public final Lnb/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/ne;

.field public final synthetic b:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;Lnb/ne;)V
    .locals 0

    iput-object p2, p0, Lnb/ae;->a:Lnb/ne;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ae;->b:Lnb/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/ae;->b:Lnb/me;

    iget-object v1, p0, Lnb/ae;->a:Lnb/ne;

    invoke-virtual {v0, v1}, Lnb/me;->u0(Lnb/ne;)V

    invoke-virtual {v0}, Lnb/me;->A0()V

    return-void
.end method
