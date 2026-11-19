.class public Lal/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lal/d$c;->executeRoblox(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lal/d$c;


# direct methods
.method public constructor <init>(Lal/d$c;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lal/d$c$a;->b:Lal/d$c;

    iput-object p2, p0, Lal/d$c$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lal/d$c$a;->b:Lal/d$c;

    iget-object v0, v0, Lal/d$c;->a:Lal/d;

    iget-object v1, p0, Lal/d$c$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lal/d;->e(Ljava/lang/String;)V

    return-void
.end method
