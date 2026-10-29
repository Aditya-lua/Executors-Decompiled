// Control-flow-normalized pseudocode for protected initializer 0x50c658.
// This is not the vendor's original source.

#include "native_dispatch.hpp"

extern NativeDispatch* build_native_dispatch();  // native 0x2b21ec
extern const char* find_loaded_image(const char*); // native 0x3a8258
extern long image_slide_for_path(const char*);

NativeDispatch* g_native_dispatch; // native global slot 0xf0d3e0

void reconstructed_bootstrap() {
    g_native_dispatch = build_native_dispatch();

    // The literal is assembled from XORed 128-bit constants in the native
    // function and exists only transiently on the stack.
    const char image_name[] = "RobloxLib";
    if (const char* path = find_loaded_image(image_name))
        (void)image_slide_for_path(path);
}
