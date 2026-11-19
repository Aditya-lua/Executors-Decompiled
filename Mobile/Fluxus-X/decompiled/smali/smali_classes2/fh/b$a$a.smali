.class public Lfh/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh/b$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbm/a;

.field public final synthetic b:Lfh/b$a;


# direct methods
.method public constructor <init>(Lfh/b$a;Lbm/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfh/b$a$a;->b:Lfh/b$a;

    iput-object p2, p0, Lfh/b$a$a;->a:Lbm/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfh/b$a$a;->b:Lfh/b$a;

    iget-object v0, v0, Lfh/b$a;->a:Lfh/b;

    invoke-static {v0}, Lfh/b;->a(Lfh/b;)Lfh/b$d;

    move-result-object v0

    iget-object v1, p0, Lfh/b$a$a;->a:Lbm/a;

    invoke-interface {v0, v1}, Lfh/b$d;->d(Lbm/a;)V

    return-void
.end method
