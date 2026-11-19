.class public final Lsp/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsp/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lsp/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsp/e;

    invoke-direct {v0}, Lsp/e;-><init>()V

    sput-object v0, Lsp/e$a;->a:Lsp/e;

    return-void
.end method
