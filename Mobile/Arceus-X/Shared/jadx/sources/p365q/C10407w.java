package p365q;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0591d;
import androidx.core.view.C0625o0;

/* JADX INFO: renamed from: q.w */
/* JADX INFO: loaded from: classes.dex */
public final class C10407w {

    /* JADX INFO: renamed from: q.w$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m40065a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0625o0.m3020c0(textView, new C0591d.a(dragEvent.getClipData(), 3).m2832a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        /* JADX INFO: renamed from: b */
        public static boolean m40066b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0625o0.m3020c0(view, new C0591d.a(dragEvent.getClipData(), 3).m2832a());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40062a(@NonNull View view, @NonNull DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C0625o0.m2982C(view) != null) {
            Activity activityM40064c = m40064c(view);
            if (activityM40064c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m40065a(dragEvent, (TextView) view, activityM40064c) : a.m40066b(dragEvent, view, activityM40064c);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40063b(@NonNull TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || C0625o0.m2982C(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0625o0.m3020c0(textView, new C0591d.a(primaryClip, 1).m2834c(i10 != 16908322 ? 1 : 0).m2832a());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static Activity m40064c(@NonNull View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
