.class public Ly3/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly3/a$d;-><init>(Ly3/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly3/a$d;


# direct methods
.method public constructor <init>(Ly3/a$d;)V
    .locals 0

    iput-object p1, p0, Ly3/a$d$a;->a:Ly3/a$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 0

    iget-object p1, p0, Ly3/a$d$a;->a:Ly3/a$d;

    iget-object p1, p1, Ly3/a$c;->a:Ly3/a$a;

    invoke-virtual {p1}, Ly3/a$a;->a()V

    return-void
.end method
