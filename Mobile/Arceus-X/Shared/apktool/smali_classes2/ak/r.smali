.class public final synthetic Lak/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lak/x;


# direct methods
.method public synthetic constructor <init>(Lak/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/r;->a:Lak/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lak/r;->a:Lak/x;

    invoke-static {v0}, Lak/x;->d(Lak/x;)V

    return-void
.end method
