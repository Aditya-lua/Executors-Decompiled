.class public Lf2/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/j;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf2/j;


# direct methods
.method public constructor <init>(Lf2/j;)V
    .locals 0

    iput-object p1, p0, Lf2/j$a;->a:Lf2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lf2/j$a;->a:Lf2/j;

    invoke-static {v0}, Lf2/j;->D(Lf2/j;)Lf2/j$b;

    move-result-object v0

    invoke-virtual {v0}, Lf2/j$b;->a()V

    return-void
.end method
