.class Lbacktraceio/library/models/metrics/UniqueEvent$1;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/models/metrics/UniqueEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/models/metrics/UniqueEvent;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/metrics/UniqueEvent;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/metrics/UniqueEvent$1;->this$0:Lbacktraceio/library/models/metrics/UniqueEvent;

    iput-object p2, p0, Lbacktraceio/library/models/metrics/UniqueEvent$1;->val$name:Ljava/lang/String;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method
