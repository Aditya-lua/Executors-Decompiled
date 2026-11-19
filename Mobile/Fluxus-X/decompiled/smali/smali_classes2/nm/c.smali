.class public final synthetic Lnm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnm/e;


# direct methods
.method public synthetic constructor <init>(Lnm/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/c;->a:Lnm/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lnm/c;->a:Lnm/e;

    invoke-static {v0}, Lnm/e;->d(Lnm/e;)V

    return-void
.end method
