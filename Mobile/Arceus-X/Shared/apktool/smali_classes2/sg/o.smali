.class public final synthetic Lsg/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;


# instance fields
.field public final synthetic c:Lpi/m;


# direct methods
.method public synthetic constructor <init>(Lpi/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/o;->c:Lpi/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lsg/o;->c:Lpi/m;

    invoke-virtual {v0, p1}, Lpi/m;->f(Ljava/lang/String;)V

    return-void
.end method
