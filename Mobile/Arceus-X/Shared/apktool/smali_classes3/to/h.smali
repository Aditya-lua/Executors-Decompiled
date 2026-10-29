.class public final synthetic Lto/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/i;

.field public final synthetic b:J

.field public final synthetic c:Lto/j;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;


# direct methods
.method public synthetic constructor <init>(Lno/i;JLto/j;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/h;->a:Lno/i;

    iput-wide p2, p0, Lto/h;->b:J

    iput-object p4, p0, Lto/h;->c:Lto/j;

    iput-object p5, p0, Lto/h;->d:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lto/h;->a:Lno/i;

    iget-wide v1, p0, Lto/h;->b:J

    iget-object v3, p0, Lto/h;->c:Lto/j;

    iget-object v4, p0, Lto/h;->d:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    invoke-static {v0, v1, v2, v3, v4}, Lto/j;->i(Lno/i;JLto/j;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
