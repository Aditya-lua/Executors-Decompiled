.class public La6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La6/a;->a(Lg6/j0;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg6/j0;

.field public final synthetic b:La6/a;


# direct methods
.method public constructor <init>(La6/a;Lg6/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, La6/a$a;->b:La6/a;

    iput-object p2, p0, La6/a$a;->a:Lg6/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object v0

    sget-object v1, La6/a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scheduling work "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La6/a$a;->a:Lg6/j0;

    iget-object v3, v3, Lg6/j0;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ly5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, La6/a$a;->b:La6/a;

    iget-object v0, v0, La6/a;->a:Lz5/u;

    iget-object v1, p0, La6/a$a;->a:Lg6/j0;

    filled-new-array {v1}, [Lg6/j0;

    move-result-object v1

    invoke-interface {v0, v1}, Lz5/u;->e([Lg6/j0;)V

    return-void
.end method
