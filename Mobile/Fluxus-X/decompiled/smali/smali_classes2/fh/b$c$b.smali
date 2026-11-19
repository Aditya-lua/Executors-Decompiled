.class public Lfh/b$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh/b$c;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbm/a;

.field public final synthetic b:Lfh/b$c;


# direct methods
.method public constructor <init>(Lfh/b$c;Lbm/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfh/b$c$b;->b:Lfh/b$c;

    iput-object p2, p0, Lfh/b$c$b;->a:Lbm/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfh/b$c$b;->b:Lfh/b$c;

    iget-object v0, v0, Lfh/b$c;->a:Lfh/b;

    invoke-static {v0}, Lfh/b;->a(Lfh/b;)Lfh/b$d;

    move-result-object v0

    iget-object v1, p0, Lfh/b$c$b;->a:Lbm/a;

    invoke-interface {v0, v1}, Lfh/b$d;->g(Lbm/a;)V

    return-void
.end method
