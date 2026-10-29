.class public final Le/p0$a;
.super Lo4/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Le/p0$a;",
        "Lo4/h;",
        "<init>",
        "(Le/p0;)V",
        "",
        "hasEnabledHandlers",
        "",
        "j",
        "(Z)V",
        "m",
        "()V",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic c:Le/p0;


# direct methods
.method public constructor <init>(Le/p0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Le/p0$a;->c:Le/p0;

    invoke-direct {p0}, Lo4/h;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Z)V
    .locals 1

    iget-object v0, p0, Le/p0$a;->c:Le/p0;

    invoke-static {v0, p1}, Le/p0;->c(Le/p0;Z)V

    iget-object v0, p0, Le/p0$a;->c:Le/p0;

    invoke-static {v0}, Le/p0;->b(Le/p0;)Lx2/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lx2/a;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 0

    invoke-virtual {p0}, Lo4/h;->b()V

    return-void
.end method
