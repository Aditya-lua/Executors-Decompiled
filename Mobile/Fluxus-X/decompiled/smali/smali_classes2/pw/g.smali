.class public final synthetic Lpw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpw/h;


# direct methods
.method public synthetic constructor <init>(Lpw/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpw/g;->a:Lpw/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lpw/g;->a:Lpw/h;

    invoke-static {v0}, Lpw/h;->a(Lpw/h;)V

    return-void
.end method
