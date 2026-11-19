.class public final synthetic Lng/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/d0;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng/n;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lng/n;->a:Ljava/lang/String;

    invoke-static {v0}, Lng/v;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
