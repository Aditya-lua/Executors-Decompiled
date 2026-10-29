package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt.l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\u00050\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "renderProps", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Ljava/lang/String;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "renderState", "", "a", "(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "document_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void a(@NotNull pq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull DocumentWorkflow.Input renderProps, @NotNull DocumentWorkflow.State renderState) {
        pq.b bVar;
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        if (renderState.getCaptureState() == DocumentWorkflow.State.a.CameraRunning) {
            bVar = pq.b.d.f28811a;
        } else if (renderState instanceof DocumentWorkflow.State.Start) {
            bVar = pq.b.C0505b.f28809a;
        } else if ((renderState instanceof DocumentWorkflow.State.ReviewCaptures) || (renderState instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId)) {
            bVar = pq.b.c.f28810a;
        } else {
            if (!(renderState instanceof DocumentWorkflow.State.UploadDocument)) {
                throw new l();
            }
            bVar = pq.b.a.f28808a;
        }
        externalEventLogger.c(new pq.i.b(renderProps.getFromStep(), bVar));
        TrackingEventsLogger.logInquiryPageViewEvent$default(trackingEventsLogger, renderProps.getFromStep(), bVar.toString(), false, 4, null);
    }

    @NotNull
    public static final List<DocumentFile> b(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DocumentFile.Local((String) it.next(), CaptureMethod.UPLOAD, 0, 4, null));
        }
        return arrayList;
    }

    @NotNull
    public static final String c(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse, @NotNull Context context, @NotNull DocumentWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(documentErrorResponse, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) {
            GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError disabledFileTypeError = (GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) documentErrorResponse;
            String string = context.getString(vp.g.f33392g, disabledFileTypeError.getDetails().getUploadedFileType(), CollectionsKt.m0(disabledFileTypeError.getDetails().getEnabledFileTypes(), ", ", null, null, 0, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError) {
            String string2 = context.getString(vp.g.f33393h);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) {
            String string3 = context.getString(vp.g.f33397l, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) documentErrorResponse).getDetails().getPageLimit()));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError) {
            String string4 = context.getString(vp.g.f33395j);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError) {
            String string5 = context.getString(vp.g.f33395j);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError) {
            String string6 = context.getString(vp.g.f33396k);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            String string7 = context.getString(vp.g.f33394i, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (!(documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError)) {
            if (!(documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)) {
                throw new l();
            }
            String string8 = context.getString(vp.g.f33398m);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            return string8;
        }
        String largeFileErrorPrompt = renderProps.getLargeFileErrorPrompt();
        if (largeFileErrorPrompt != null) {
            return largeFileErrorPrompt;
        }
        String string9 = context.getString(vp.g.f33398m);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        return string9;
    }
}
