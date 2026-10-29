.class public final synthetic Lwh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lne/e0;


# direct methods
.method public synthetic constructor <init>(Lne/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/c;->a:Lne/e0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lwh/c;->a:Lne/e0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lwh/f;->d(Lne/e0;Ljava/lang/String;)V

    return-void
.end method
