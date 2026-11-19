package backtraceio.library.models;

import android.content.Context;
import backtraceio.library.common.FileHelper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDataAttachmentsFileHelper {
    public static List<String> getValidAttachments(Context context, BacktraceData backtraceData) {
        return FileHelper.filterOutFiles(context, backtraceData.getAttachmentPaths());
    }
}
