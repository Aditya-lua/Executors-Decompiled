.class public Lwg/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/c$b;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwg/c$b;


# direct methods
.method public constructor <init>(Lwg/c$b;)V
    .locals 0

    iput-object p1, p0, Lwg/c$b$a;->a:Lwg/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lwg/c$b$a;->a:Lwg/c$b;

    iget-object v0, v0, Lwg/c$b;->a:Lwg/c;

    invoke-static {v0}, Lwg/c;->a(Lwg/c;)Lwg/c$d;

    move-result-object v0

    invoke-interface {v0}, Lwg/c$d;->e()V

    return-void
.end method
