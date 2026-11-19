.class public final synthetic Lfm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/g;


# instance fields
.field public final synthetic a:Lfm/j;


# direct methods
.method public synthetic constructor <init>(Lfm/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/f;->a:Lfm/j;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lfm/f;->a:Lfm/j;

    check-cast p1, Lvd/c$c;

    invoke-static {v0, p1}, Lfm/j;->d(Lfm/j;Lvd/c$c;)V

    return-void
.end method
