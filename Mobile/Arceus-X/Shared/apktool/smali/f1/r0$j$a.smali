.class public Lf1/r0$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/r0$j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/r0$j;->u(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lf1/r0$j;


# direct methods
.method public constructor <init>(Lf1/r0$j;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/r0$j$a;->b:Lf1/r0$j;

    iput-object p2, p0, Lf1/r0$j$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li1/a;Ljava/util/concurrent/Executor;)Li1/n;
    .locals 2

    new-instance v0, Li1/n;

    iget-object v1, p0, Lf1/r0$j$a;->a:Landroid/content/Context;

    invoke-direct {v0, p1, p2, v1}, Li1/n;-><init>(Li1/a;Ljava/util/concurrent/Executor;Landroid/content/Context;)V

    return-object v0
.end method
