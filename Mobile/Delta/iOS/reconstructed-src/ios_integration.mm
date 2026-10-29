// High-confidence iOS integration reconstruction.
// This is evidence-based pseudocode, not original Objective-C++ source.

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <objc/runtime.h>
#import <Security/Security.h>

namespace delta_reconstructed {

// Native range 0x3a1d60..0x3a3870 builds this class at runtime.  The class
// name and Objective-C type encoding are plaintext evidence; the protected
// selector bytes are intentionally left address-labelled until fully decoded.
Class register_app_lifecycle_observer(SEL handler_selector, IMP handler) {
    Class existing = objc_getClass("AppLifecycleObserver");
    if (existing)
        return existing;
    Class cls = objc_allocateClassPair([NSObject class],
                                       "AppLifecycleObserver", 0);
    if (!cls)
        return Nil;
    if (!class_addMethod(cls, handler_selector, handler, "v@:@"))
        return Nil;
    objc_registerClassPair(cls);
    return cls;
}

void observe_application_activation(id observer, SEL selector) {
    [[NSNotificationCenter defaultCenter]
        addObserver:observer
           selector:selector
               name:UIApplicationDidBecomeActiveNotification
             object:nil];
}

// Native 0x3afcd0 calls SecItemAdd and, on the duplicate-item path,
// SecItemUpdate.  Dictionary keys and account/service values are protected and
// therefore kept as recovered CFDictionary objects instead of guessed names.
OSStatus keychain_add_or_update(CFDictionaryRef add_query,
                                CFDictionaryRef match_query,
                                CFDictionaryRef update_values) {
    OSStatus status = SecItemAdd(add_query, nullptr);
    if (status == errSecDuplicateItem)
        status = SecItemUpdate(match_query, update_values);
    return status;
}

// Native 0x3bafec calls SecItemCopyMatching and returns the copied result to
// its caller through the protected bridge layer.
CFTypeRef keychain_copy_matching(CFDictionaryRef query, OSStatus* out_status) {
    CFTypeRef value = nullptr;
    const OSStatus status = SecItemCopyMatching(query, &value);
    if (out_status)
        *out_status = status;
    if (status != errSecSuccess) {
        if (value)
            CFRelease(value);
        return nullptr;
    }
    return value;
}

} // namespace delta_reconstructed
