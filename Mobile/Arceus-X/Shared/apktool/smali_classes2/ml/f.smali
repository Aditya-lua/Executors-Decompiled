.class public final synthetic Lml/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lml/f;->a:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-wide v0, p0, Lml/f;->a:J

    check-cast p1, Lml/a;

    invoke-static {v0, v1, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->a(JLml/a;)Lml/a;

    move-result-object p1

    return-object p1
.end method
