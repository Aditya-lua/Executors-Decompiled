.class public Lwg/c$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/c$c;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnl/a;

.field public final synthetic b:Lwg/c$c;


# direct methods
.method public constructor <init>(Lwg/c$c;Lnl/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwg/c$c$b;->b:Lwg/c$c;

    iput-object p2, p0, Lwg/c$c$b;->a:Lnl/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lwg/c$c$b;->b:Lwg/c$c;

    iget-object v0, v0, Lwg/c$c;->a:Lwg/c;

    invoke-static {v0}, Lwg/c;->a(Lwg/c;)Lwg/c$d;

    move-result-object v0

    iget-object v1, p0, Lwg/c$c$b;->a:Lnl/a;

    invoke-interface {v0, v1}, Lwg/c$d;->d(Lnl/a;)V

    return-void
.end method
