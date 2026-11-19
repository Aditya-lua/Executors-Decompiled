.class public final synthetic Lz/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# instance fields
.field public final synthetic a:Lz/z4;


# direct methods
.method public synthetic constructor <init>(Lz/z4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/y4;->a:Lz/z4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/y4;->a:Lz/z4;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lz/z4;->j(Lz/z4;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
