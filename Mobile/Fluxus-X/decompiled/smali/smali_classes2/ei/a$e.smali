.class public Lei/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lei/a;


# direct methods
.method public constructor <init>(Lei/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lei/a$e;->a:Lei/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lei/a;Lei/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lei/a$e;-><init>(Lei/a;)V

    return-void
.end method


# virtual methods
.method public a()Lbh/x0;
    .locals 1

    iget-object v0, p0, Lei/a$e;->a:Lei/a;

    return-object v0
.end method
