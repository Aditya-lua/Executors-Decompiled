.class public final synthetic Lnb/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/qa;


# direct methods
.method public synthetic constructor <init>(Lnb/qa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/af;->a:Lnb/qa;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lnb/af;->a:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->u0()V

    return-void
.end method
