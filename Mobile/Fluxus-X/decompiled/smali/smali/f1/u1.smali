.class public final synthetic Lf1/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/z1;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u1;->a:Lf1/z1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/u1;->a:Lf1/z1;

    invoke-static {v0}, Lf1/z1;->d(Lf1/z1;)V

    return-void
.end method
