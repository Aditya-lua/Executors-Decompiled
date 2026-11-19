.class public final synthetic Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:Lg0/c;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Ln0/j2$a;


# direct methods
.method public synthetic constructor <init>(Lg0/c;Ljava/util/concurrent/Executor;Ln0/j2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/a;->a:Lg0/c;

    iput-object p2, p0, Lg0/a;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lg0/a;->c:Ln0/j2$a;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 3

    iget-object v0, p0, Lg0/a;->a:Lg0/c;

    iget-object v1, p0, Lg0/a;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lg0/a;->c:Ln0/j2$a;

    invoke-static {v0, v1, v2, p1}, Lg0/c;->a(Lg0/c;Ljava/util/concurrent/Executor;Ln0/j2$a;Landroid/media/ImageReader;)V

    return-void
.end method
