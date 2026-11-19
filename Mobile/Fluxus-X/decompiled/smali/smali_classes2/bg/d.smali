.class public final synthetic Lbg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbg/g;


# direct methods
.method public synthetic constructor <init>(Lbg/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/d;->a:Lbg/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbg/d;->a:Lbg/g;

    invoke-static {v0}, Lbg/g;->d(Lbg/g;)V

    return-void
.end method
