.class public Lv2/h$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/h$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx2/a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lv2/h$c;


# direct methods
.method public constructor <init>(Lv2/h$c;Lx2/a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/h$c$a;->c:Lv2/h$c;

    iput-object p2, p0, Lv2/h$c$a;->a:Lx2/a;

    iput-object p3, p0, Lv2/h$c$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lv2/h$c$a;->a:Lx2/a;

    iget-object v1, p0, Lv2/h$c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
