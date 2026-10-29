package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p169he.C6384n;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class C2167l1 {

    /* JADX INFO: renamed from: a */
    public static final Method f8385a;

    /* JADX INFO: renamed from: b */
    public static final Method f8386b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        f8385a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f8386b = declaredMethod2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX INFO: renamed from: a */
    public static int m10348a(Context context, JobInfo jobInfo, String str, String str2) {
        int iIntValue;
        JobScheduler jobScheduler = (JobScheduler) C6384n.m27928l((JobScheduler) context.getSystemService("jobscheduler"));
        if (f8385a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method = f8386b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        } else {
            iIntValue = 0;
        }
        Method method2 = f8385a;
        if (method2 != null) {
            try {
                Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    return num2.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e11) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e11);
            }
        }
        return jobScheduler.schedule(jobInfo);
    }
}
