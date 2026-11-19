.class public Lei/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/f;->p(Lei/f$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lei/f$h;

.field public final synthetic b:Lei/f;


# direct methods
.method public constructor <init>(Lei/f;Lei/f$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lei/f$b;->b:Lei/f;

    iput-object p2, p0, Lei/f$b;->a:Lei/f$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Lei/f$b;->b:Lei/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lei/f;->e(Lei/f;Z)V

    :cond_0
    iget-object v0, p0, Lei/f$b;->a:Lei/f$h;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lei/f$h;->a(I)V

    :cond_1
    return-void
.end method
