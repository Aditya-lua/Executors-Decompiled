.class public Lw7/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/b$l;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lw7/b$q;Lw7/g$l0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/b$l;->a:Ljava/lang/String;

    return-object v0
.end method
