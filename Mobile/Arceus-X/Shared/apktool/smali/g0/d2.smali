.class public final synthetic Lg0/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/j2$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/f;

.field public final synthetic b:Ln0/j2$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;Ln0/j2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/d2;->a:Landroidx/camera/core/f;

    iput-object p2, p0, Lg0/d2;->b:Ln0/j2$a;

    return-void
.end method


# virtual methods
.method public final a(Ln0/j2;)V
    .locals 2

    iget-object v0, p0, Lg0/d2;->a:Landroidx/camera/core/f;

    iget-object v1, p0, Lg0/d2;->b:Ln0/j2$a;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/f;->a(Landroidx/camera/core/f;Ln0/j2$a;Ln0/j2;)V

    return-void
.end method
