.class public Lr3/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lr3/c;


# direct methods
.method public constructor <init>(Lr3/c;)V
    .locals 0

    iput-object p1, p0, Lr3/c$b;->a:Lr3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lr3/c$b;->a:Lr3/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr3/c;->E(I)V

    return-void
.end method
