.class public final synthetic Lpw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpw/e;


# direct methods
.method public synthetic constructor <init>(Lpw/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpw/c;->a:Lpw/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lpw/c;->a:Lpw/e;

    invoke-virtual {v0}, Lpw/e;->z()V

    return-void
.end method
