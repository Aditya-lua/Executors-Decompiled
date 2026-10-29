.class public Lvg/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lei/m;Ljava/lang/String;)Lei/r;
    .locals 1

    new-instance v0, Lei/r;

    invoke-direct {v0, p1, p2, p3, p4}, Lei/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lei/m;Ljava/lang/String;)V

    return-object v0
.end method
