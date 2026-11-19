.class public Lel/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel/b$a;->a(Lsw/d;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Throwable;

.field public final synthetic b:Lel/b$a;


# direct methods
.method public constructor <init>(Lel/b$a;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lel/b$a$b;->b:Lel/b$a;

    iput-object p2, p0, Lel/b$a$b;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lel/b$a$b;->b:Lel/b$a;

    invoke-static {v0}, Lel/b$a;->c(Lel/b$a;)Lsw/f;

    move-result-object v0

    iget-object v1, p0, Lel/b$a$b;->b:Lel/b$a;

    iget-object v1, v1, Lel/b$a;->c:Lel/b;

    iget-object v2, p0, Lel/b$a$b;->a:Ljava/lang/Throwable;

    invoke-interface {v0, v1, v2}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V

    return-void
.end method
