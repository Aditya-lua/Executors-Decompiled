.class public abstract Lw7/h$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "j"
.end annotation


# instance fields
.field public final synthetic a:Lw7/h;


# direct methods
.method public constructor <init>(Lw7/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw7/h$j;->a:Lw7/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw7/h;Lw7/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lw7/h$j;-><init>(Lw7/h;)V

    return-void
.end method


# virtual methods
.method public a(Lw7/g$y0;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public abstract b(Ljava/lang/String;)V
.end method
