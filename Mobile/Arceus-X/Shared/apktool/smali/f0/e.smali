.class public final synthetic Lf0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf0/g;


# direct methods
.method public synthetic constructor <init>(Lf0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/e;->a:Lf0/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf0/e;->a:Lf0/g;

    invoke-static {v0}, Lf0/g;->d(Lf0/g;)V

    return-void
.end method
