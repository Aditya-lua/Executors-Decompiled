.class public final synthetic Lhv/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhv/h;


# direct methods
.method public synthetic constructor <init>(Lhv/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhv/g;->a:Lhv/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhv/g;->a:Lhv/h;

    invoke-static {v0}, Lhv/h;->a(Lhv/h;)V

    return-void
.end method
