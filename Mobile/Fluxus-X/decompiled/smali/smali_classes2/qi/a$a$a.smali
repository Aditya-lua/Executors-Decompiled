.class public Lqi/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqi/a$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lqi/a$a;


# direct methods
.method public constructor <init>(Lqi/a$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lqi/a$a$a;->b:Lqi/a$a;

    iput-object p2, p0, Lqi/a$a$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lqi/a$a$a;->b:Lqi/a$a;

    iget-object v0, v0, Lqi/a$a;->a:Lqi/a;

    iget-object v1, p0, Lqi/a$a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqi/a;->b(Ljava/lang/String;)V

    return-void
.end method
