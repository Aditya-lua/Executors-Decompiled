// Evidence-based reconstruction of the 0xe0-byte state built by 0x2b21ec.
// This is not the vendor's original header.

#pragma once

struct NativeDispatch {
    void* signal_fn;                 // +0x00
    void* realloc_fn;                // +0x08
    void* ftell_fn;                  // +0x10
    void* reserved_18;               // +0x18
    void* pread_fn;                  // +0x20
    void* dlopen_fn;                 // +0x28
    void* dladdr_fn;                 // +0x30
    void* reserved_38;               // +0x38
    void* mprotect_fn;               // +0x40
    void* memcpy_fn;                 // +0x48
    void* memset_fn;                 // +0x50
    void* fclose_fn;                 // +0x58
    void* sysconf_fn;                // +0x60
    void* remove_fn;                 // +0x68
    void* fread_fn;                  // +0x70
    void* malloc_fn;                 // +0x78
    void* dyld_image_count_fn;       // +0x80
    void* chmod_fn;                  // +0x88
    void* stat_fn;                   // +0x90
    void* dlsym_fn;                  // +0x98
    void* fgets_fn;                  // +0xa0
    void* fseek_fn;                  // +0xa8
    void* fwrite_fn;                 // +0xb0
    void* fopen_fn;                  // +0xb8
    void* dyld_get_image_name_fn;    // +0xc0
    void* free_fn;                   // +0xc8
    void* dyld_get_image_slide_fn;   // +0xd0
    void* mmap_fn;                   // +0xd8
};

static_assert(sizeof(NativeDispatch) == 0xe0);
