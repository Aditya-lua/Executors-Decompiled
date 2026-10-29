.class public final Lnb/e9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/e9;->a:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lnb/e9;->a:Lnb/qa;

    iget-object v0, v0, Lnb/qa;->r:Lnb/cf;

    invoke-virtual {v0}, Lnb/cf;->a()V

    return-void
.end method
