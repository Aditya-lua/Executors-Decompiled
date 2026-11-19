.class public Lei/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lei/a;


# direct methods
.method public constructor <init>(Lei/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lei/a$c;->a:Lei/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lei/a;Lei/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lei/a$c;-><init>(Lei/a;)V

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

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lei/a$c;->a:Lei/a;

    invoke-static {v0}, Lei/a;->F2(Lei/a;)Lei/a$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lei/a$c;->a:Lei/a;

    invoke-static {v0}, Lei/a;->F2(Lei/a;)Lei/a$g;

    move-result-object v0

    invoke-interface {v0, p1}, Lei/a$g;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
