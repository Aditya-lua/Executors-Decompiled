.class public Lwh/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lwh/a;


# direct methods
.method public constructor <init>(Lwh/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lwh/a$c;->a:Lwh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwh/a;Lwh/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwh/a$c;-><init>(Lwh/a;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAppReady() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppShellFragment"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/a$c;->a:Lwh/a;

    invoke-static {v0}, Lwh/a;->F2(Lwh/a;)Lwh/a$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/a$c;->a:Lwh/a;

    invoke-static {v0}, Lwh/a;->F2(Lwh/a;)Lwh/a$g;

    move-result-object v0

    invoke-interface {v0, p1}, Lwh/a$g;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
