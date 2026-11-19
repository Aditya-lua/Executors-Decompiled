.class public final synthetic Lj8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lk8/c;


# direct methods
.method public synthetic constructor <init>(Lk8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/h;->a:Lk8/c;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj8/h;->a:Lk8/c;

    invoke-interface {v0}, Lk8/c;->c()Lf8/a;

    move-result-object v0

    return-object v0
.end method
