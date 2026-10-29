package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class InputConnectionCompat {
    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i10, Bundle bundle);
    }

    static boolean handlePerformPrivateCommand(@Nullable String action, @NonNull Bundle data, @NonNull OnCommitContentListener onCommitContentListener) {
        if (!TextUtils.equals(COMMIT_CONTENT_ACTION, action) || data == null) {
            return false;
        }
        ResultReceiver resultReceiver = null;
        try {
            resultReceiver = (ResultReceiver) data.getParcelable(COMMIT_CONTENT_RESULT_RECEIVER);
            Uri contentUri = (Uri) data.getParcelable(COMMIT_CONTENT_CONTENT_URI_KEY);
            ClipDescription description = (ClipDescription) data.getParcelable(COMMIT_CONTENT_DESCRIPTION_KEY);
            Uri linkUri = (Uri) data.getParcelable(COMMIT_CONTENT_LINK_URI_KEY);
            int flags = data.getInt(COMMIT_CONTENT_FLAGS_KEY);
            Bundle opts = (Bundle) data.getParcelable(COMMIT_CONTENT_OPTS_KEY);
            InputContentInfoCompat inputContentInfo = new InputContentInfoCompat(contentUri, description, linkUri);
            boolean result = onCommitContentListener.onCommitContent(inputContentInfo, flags, opts);
            if (resultReceiver != null) {
                resultReceiver.send(result ? 1 : 0, null);
            }
            return result;
        } catch (Throwable th2) {
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th2;
        }
    }

    public static boolean commitContent(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull InputContentInfoCompat inputContentInfo, int flags, @Nullable Bundle opts) {
        ClipDescription description = inputContentInfo.getDescription();
        boolean supported = false;
        for (String mimeType : EditorInfoCompat.getContentMimeTypes(editorInfo)) {
            if (description.hasMimeType(mimeType)) {
                supported = true;
                break;
            }
        }
        if (!supported) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent((InputContentInfo) inputContentInfo.unwrap(), flags, opts);
        }
        Bundle params = new Bundle();
        params.putParcelable(COMMIT_CONTENT_CONTENT_URI_KEY, inputContentInfo.getContentUri());
        params.putParcelable(COMMIT_CONTENT_DESCRIPTION_KEY, inputContentInfo.getDescription());
        params.putParcelable(COMMIT_CONTENT_LINK_URI_KEY, inputContentInfo.getLinkUri());
        params.putInt(COMMIT_CONTENT_FLAGS_KEY, flags);
        params.putParcelable(COMMIT_CONTENT_OPTS_KEY, opts);
        return inputConnection.performPrivateCommand(COMMIT_CONTENT_ACTION, params);
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull final OnCommitContentListener onCommitContentListener) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (onCommitContentListener == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, z10) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
                    if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), flags, opts)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, flags, opts);
                }
            };
        }
        String[] contentMimeTypes = EditorInfoCompat.getContentMimeTypes(editorInfo);
        if (contentMimeTypes.length == 0) {
            return inputConnection;
        }
        return new InputConnectionWrapper(inputConnection, z10) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String action, Bundle data) {
                if (InputConnectionCompat.handlePerformPrivateCommand(action, data, onCommitContentListener)) {
                    return true;
                }
                return super.performPrivateCommand(action, data);
            }
        };
    }

    @Deprecated
    public InputConnectionCompat() {
    }
}
