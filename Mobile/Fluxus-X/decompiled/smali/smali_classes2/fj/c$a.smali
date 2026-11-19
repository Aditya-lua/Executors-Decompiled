.class public Lfj/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh/d0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/c;->c(Landroidx/lifecycle/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/v;

.field public final synthetic b:Lfj/c;


# direct methods
.method public constructor <init>(Lfj/c;Lf4/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/c$a;->b:Lfj/c;

    iput-object p2, p0, Lfj/c$a;->a:Lf4/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lfj/c$a;->b:Lfj/c;

    iget-object v1, p0, Lfj/c$a;->a:Lf4/v;

    invoke-static {v0, v1}, Lfj/c;->a(Lfj/c;Landroid/app/Activity;)V

    return-void
.end method
