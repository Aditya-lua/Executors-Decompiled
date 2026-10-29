.class public final synthetic Lnb/oc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/tc;


# direct methods
.method public synthetic constructor <init>(Lnb/tc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/oc;->a:Lnb/tc;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lnb/oc;->a:Lnb/tc;

    invoke-virtual {v0}, Lnb/tc;->F()V

    return-void
.end method
