.class public Lxk/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxk/b$a;->b(Ljv/d;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Throwable;

.field public final synthetic b:Lxk/b$a;


# direct methods
.method public constructor <init>(Lxk/b$a;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxk/b$a$b;->b:Lxk/b$a;

    iput-object p2, p0, Lxk/b$a$b;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lxk/b$a$b;->b:Lxk/b$a;

    invoke-static {v0}, Lxk/b$a;->c(Lxk/b$a;)Ljv/f;

    move-result-object v0

    iget-object v1, p0, Lxk/b$a$b;->b:Lxk/b$a;

    iget-object v1, v1, Lxk/b$a;->c:Lxk/b;

    iget-object v2, p0, Lxk/b$a$b;->a:Ljava/lang/Throwable;

    invoke-interface {v0, v1, v2}, Ljv/f;->b(Ljv/d;Ljava/lang/Throwable;)V

    return-void
.end method
