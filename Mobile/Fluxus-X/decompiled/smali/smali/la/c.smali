.class public final synthetic Lla/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lla/d;


# direct methods
.method public synthetic constructor <init>(Lla/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/c;->a:Lla/d;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lla/c;->a:Lla/d;

    invoke-virtual {v0}, Lla/d;->c()V

    return-void
.end method
