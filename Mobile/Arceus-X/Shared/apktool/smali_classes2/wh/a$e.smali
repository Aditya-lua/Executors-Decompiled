.class public Lwh/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lwh/a;


# direct methods
.method public constructor <init>(Lwh/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lwh/a$e;->a:Lwh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwh/a;Lwh/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwh/a$e;-><init>(Lwh/a;)V

    return-void
.end method


# virtual methods
.method public a()Lsg/x0;
    .locals 1

    iget-object v0, p0, Lwh/a$e;->a:Lwh/a;

    return-object v0
.end method
