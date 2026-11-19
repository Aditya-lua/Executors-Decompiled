.class public final synthetic Lob/tc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/yc;


# direct methods
.method public synthetic constructor <init>(Lob/yc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/tc;->a:Lob/yc;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lob/tc;->a:Lob/yc;

    invoke-virtual {v0}, Lob/yc;->F()V

    return-void
.end method
