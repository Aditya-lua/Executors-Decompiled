package backtraceio.library.anr;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p146g6.C6032l;

/* JADX INFO: loaded from: classes.dex */
public class ActivityManagerExitInfoProvider implements ProcessExitInfoProvider {
    private final ActivityManager activityManager;

    public ActivityManagerExitInfoProvider(Context context) {
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    @Override // backtraceio.library.anr.ProcessExitInfoProvider
    public List<ExitInfo> getHistoricalExitInfo(String str, int i10, int i11) {
        List<ApplicationExitInfo> historicalProcessExitReasons = this.activityManager.getHistoricalProcessExitReasons(str, i10, i11);
        if (historicalProcessExitReasons.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExitInfoAdapter(C6032l.m26834a(it.next())));
        }
        return arrayList;
    }

    @Override // backtraceio.library.anr.ProcessExitInfoProvider
    public List<Integer> getSupportedTypesOfExitInfo() {
        return Collections.singletonList(6);
    }
}
