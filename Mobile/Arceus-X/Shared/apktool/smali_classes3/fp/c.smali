.class public final synthetic Lfp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt7/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lfp/c;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lt7/b;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfp/c;->a:I

    invoke-static {v0, p1}, Lfp/f;->k2(ILt7/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
