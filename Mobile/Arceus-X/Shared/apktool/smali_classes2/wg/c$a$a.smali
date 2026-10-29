.class public Lwg/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/c$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnl/a;

.field public final synthetic b:Lwg/c$a;


# direct methods
.method public constructor <init>(Lwg/c$a;Lnl/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwg/c$a$a;->b:Lwg/c$a;

    iput-object p2, p0, Lwg/c$a$a;->a:Lnl/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lwg/c$a$a;->b:Lwg/c$a;

    iget-object v0, v0, Lwg/c$a;->a:Lwg/c;

    invoke-static {v0}, Lwg/c;->a(Lwg/c;)Lwg/c$d;

    move-result-object v0

    iget-object v1, p0, Lwg/c$a$a;->a:Lnl/a;

    invoke-interface {v0, v1}, Lwg/c$d;->g(Lnl/a;)V

    return-void
.end method
