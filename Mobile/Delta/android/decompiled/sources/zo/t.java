package zo;

import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "b", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "a", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    @NotNull
    public static final ErrorCode a(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorCode.CameraCompatibilityError;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorCode.IntegrationError;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                return ErrorCode.CameraPermissionError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                return ErrorCode.SdkConfigurationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                return ErrorCode.NoDiskSpaceError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                return ErrorCode.WebRtcIntegrationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
                return ErrorCode.InvalidOneTimeLinkCode;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
                return ErrorCode.UnexpectedError;
            }
            throw new jt.l();
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        if (responseError instanceof ErrorResponse.Error.RateLimitExceededError) {
            return ErrorCode.RateLimitExceeded;
        }
        if (responseError instanceof ErrorResponse.Error.UnauthenticatedError) {
            return ErrorCode.SessionTokenError;
        }
        if ((responseError instanceof ErrorResponse.Error.FieldNotFoundError) || (responseError instanceof ErrorResponse.Error.InactiveTemplateError) || (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) || (responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) || (responseError instanceof ErrorResponse.Error.InvalidConfigError) || (responseError instanceof ErrorResponse.Error.UnknownError) || (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) || responseError == null) {
            return networkErrorInfo.getCode() == 401 ? ErrorCode.SessionTokenError : ErrorCode.NetworkError;
        }
        throw new jt.l();
    }

    @NotNull
    public static final String b(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return "Unable to find a suitable camera.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return "The SDK is misconfigured.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return "There was a problem reaching the server.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return "There was an issue with camera permissions.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return "The device has no available disk space.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
            return "Invalid one time link code.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return "An otherwise unexpected error occurred.";
        }
        throw new jt.l();
    }
}
