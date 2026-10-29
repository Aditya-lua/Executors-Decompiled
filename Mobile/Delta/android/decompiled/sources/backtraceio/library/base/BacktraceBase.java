package backtraceio.library.base;

import android.content.Context;
import backtraceio.library.BacktraceDatabase;
import backtraceio.library.common.CollectionUtils;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Client;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.Metrics;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.services.BacktraceApi;
import backtraceio.library.services.BacktraceMetrics;
import backtraceio.library.services.ReportExceptionTransformer;
import j6.b;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceBase implements Client {
    private static final String LOG_TAG = "BacktraceBase";
    public static String version = "3.10.3";
    public final List<String> attachments;
    public final Map<String, Object> attributes;
    private Api backtraceApi;
    private OnBeforeSendEventListener beforeSendEventListener;
    protected Context context;
    private final b credentials;
    public final Database database;
    private boolean isProguardEnabled;
    public Metrics metrics;
    private final ReportExceptionTransformer reportExceptionTransformer;

    static {
        NativeLibraryLoader.load();
    }

    public BacktraceBase(Context context, b bVar) {
        this(context, bVar, (Database) null);
    }

    private void addReportAttachments(BacktraceReport backtraceReport) {
        List<String> list = this.attachments;
        if (list != null) {
            backtraceReport.attachmentPaths.addAll(list);
        }
    }

    private OnServerResponseEventListener getDatabaseCallback(final BacktraceDatabaseRecord backtraceDatabaseRecord, final OnServerResponseEventListener onServerResponseEventListener) {
        return new OnServerResponseEventListener() { // from class: backtraceio.library.base.BacktraceBase.1
            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                BacktraceDatabaseRecord backtraceDatabaseRecord2;
                BacktraceDatabaseRecord backtraceDatabaseRecord3 = backtraceDatabaseRecord;
                if (backtraceDatabaseRecord3 != null) {
                    backtraceDatabaseRecord3.close();
                }
                if (backtraceResult != null && (backtraceDatabaseRecord2 = backtraceDatabaseRecord) != null && backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceBase.this.database.delete(backtraceDatabaseRecord2);
                }
                OnServerResponseEventListener onServerResponseEventListener2 = onServerResponseEventListener;
                if (onServerResponseEventListener2 != null) {
                    onServerResponseEventListener2.onEvent(backtraceResult);
                }
            }
        };
    }

    private boolean isBreadcrumbsAvailable() {
        Database database = this.database;
        return (database == null || database.getBreadcrumbs() == null) ? false : true;
    }

    private void setBacktraceApi(Api api) {
        this.backtraceApi = api;
        Database database = this.database;
        if (database != null) {
            database.setApi(api);
        }
    }

    @Override // backtraceio.library.interfaces.Client
    public void addAttribute(String str, Object obj) {
        this.attributes.put(str, obj);
        Database database = this.database;
        if (database == null) {
            return;
        }
        database.addNativeAttribute(str, obj);
    }

    public boolean addBreadcrumb(String str) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str);
        }
        return false;
    }

    public boolean clearBreadcrumbs() {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().clearBreadcrumbs();
        }
        return false;
    }

    public native void crash();

    public void disableNativeIntegration() {
        this.database.disableNativeIntegration();
    }

    public native void dumpWithoutCrash(String str);

    public native void dumpWithoutCrash(String str, boolean z10);

    public boolean enableBreadcrumbs(Context context) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().enableBreadcrumbs(context);
        }
        return false;
    }

    @Override // backtraceio.library.interfaces.Client
    public void enableNativeIntegration() {
        this.database.setupNativeIntegration(this, this.credentials);
    }

    public void enableProguard() {
        this.isProguardEnabled = true;
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public void nativeCrash() {
        crash();
    }

    @Override // backtraceio.library.interfaces.Client
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    public void sendInnerExceptions(boolean z10) {
        this.reportExceptionTransformer.sendInnerExceptions(z10);
    }

    public void sendSuppressedExceptions(boolean z10) {
        this.reportExceptionTransformer.sendSuppressedExceptions(z10);
    }

    public void setOnBeforeSendEventListener(OnBeforeSendEventListener onBeforeSendEventListener) {
        this.beforeSendEventListener = onBeforeSendEventListener;
    }

    public void setOnRequestHandler(RequestHandler requestHandler) {
        this.backtraceApi.setRequestHandler(requestHandler);
    }

    public void setOnServerErrorEventListener(OnServerErrorEventListener onServerErrorEventListener) {
        this.backtraceApi.setOnServerError(onServerErrorEventListener);
    }

    public BacktraceBase(Context context, b bVar, List<String> list) {
        this(context, bVar, (Database) null, list);
    }

    public void enableNativeIntegration(boolean z10) {
        this.database.setupNativeIntegration(this, this.credentials, z10);
    }

    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        Breadcrumbs breadcrumbs = this.database.getBreadcrumbs();
        for (BacktraceReport backtraceReport2 : this.reportExceptionTransformer.transformReportWithInnerExceptions(backtraceReport)) {
            if (breadcrumbs != null) {
                breadcrumbs.processReportBreadcrumbs(backtraceReport2);
            }
            addReportAttachments(backtraceReport2);
            BacktraceData backtraceData = new BacktraceData(this.context, backtraceReport2, this.attributes);
            boolean z10 = this.isProguardEnabled;
            backtraceData.symbolication = z10 ? "proguard" : null;
            BacktraceDatabaseRecord backtraceDatabaseRecordAdd = this.database.add(backtraceReport2, this.attributes, z10);
            OnBeforeSendEventListener onBeforeSendEventListener = this.beforeSendEventListener;
            if (onBeforeSendEventListener != null) {
                backtraceData = onBeforeSendEventListener.onEvent(backtraceData);
            }
            this.backtraceApi.send(backtraceData, getDatabaseCallback(backtraceDatabaseRecordAdd, onServerResponseEventListener));
        }
    }

    public BacktraceBase(Context context, b bVar, Map<String, Object> map) {
        this(context, bVar, (Database) null, map);
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbLevel);
        }
        return false;
    }

    public boolean enableBreadcrumbs(Context context, int i10) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().enableBreadcrumbs(context, i10);
        }
        return false;
    }

    public void enableNativeIntegration(boolean z10, UnwindingMode unwindingMode) {
        this.database.setupNativeIntegration(this, this.credentials, z10, unwindingMode);
    }

    public BacktraceBase(Context context, b bVar, Map<String, Object> map, List<String> list) {
        this(context, bVar, (Database) null, map, list);
    }

    @Override // backtraceio.library.interfaces.Client
    public void addAttribute(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            addAttribute(entry.getKey(), entry.getValue());
        }
    }

    public BacktraceBase(Context context, b bVar, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this(context, bVar, new BacktraceDatabase(context, backtraceDatabaseSettings));
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, map);
        }
        return false;
    }

    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().enableBreadcrumbs(context, enumSet);
        }
        return false;
    }

    public BacktraceBase(Context context, b bVar, BacktraceDatabaseSettings backtraceDatabaseSettings, List<String> list) {
        this(context, bVar, new BacktraceDatabase(context, backtraceDatabaseSettings), list);
    }

    public BacktraceBase(Context context, b bVar, BacktraceDatabaseSettings backtraceDatabaseSettings, Map<String, Object> map) {
        this(context, bVar, new BacktraceDatabase(context, backtraceDatabaseSettings), map);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbLevel);
        }
        return false;
    }

    public boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet, int i10) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().enableBreadcrumbs(context, enumSet, i10);
        }
        return false;
    }

    public BacktraceBase(Context context, b bVar, BacktraceDatabaseSettings backtraceDatabaseSettings, Map<String, Object> map, List<String> list) {
        this(context, bVar, new BacktraceDatabase(context, backtraceDatabaseSettings), map, list);
    }

    public BacktraceBase(Context context, b bVar, Database database) {
        this(context, bVar, database, (Map<String, Object>) null);
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbType);
        }
        return false;
    }

    public BacktraceBase(Context context, b bVar, Database database, List<String> list) {
        this(context, bVar, database, (Map<String, Object>) null, list);
    }

    public BacktraceBase(Context context, b bVar, Database database, Map<String, Object> map) {
        this(context, bVar, database, map, (List<String>) null);
    }

    public boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
        }
        return false;
    }

    public BacktraceBase(Context context, b bVar, Database database, Map<String, Object> map, List<String> list) {
        this.reportExceptionTransformer = new ReportExceptionTransformer();
        this.metrics = null;
        this.beforeSendEventListener = null;
        this.isProguardEnabled = false;
        this.context = context;
        this.credentials = bVar;
        Map<String, Object> mapCopyMap = CollectionUtils.copyMap(map);
        this.attributes = mapCopyMap;
        this.attachments = CollectionUtils.copyList(list);
        database = database == null ? new BacktraceDatabase() : database;
        this.database = database;
        setBacktraceApi(new BacktraceApi(this.context, bVar));
        database.start();
        this.metrics = new BacktraceMetrics(context, mapCopyMap, this.backtraceApi, bVar);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbType);
        }
        return false;
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        if (isBreadcrumbsAvailable()) {
            return this.database.getBreadcrumbs().addBreadcrumb(str, map, backtraceBreadcrumbType, backtraceBreadcrumbLevel);
        }
        return false;
    }
}
