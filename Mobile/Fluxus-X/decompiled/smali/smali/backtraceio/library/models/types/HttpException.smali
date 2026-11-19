.class public Lbacktraceio/library/models/types/HttpException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private httpStatus:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lbacktraceio/library/models/types/HttpException;->setHttpStatus(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method private setHttpStatus(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/types/HttpException;->httpStatus:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getHttpStatus()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/types/HttpException;->httpStatus:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
