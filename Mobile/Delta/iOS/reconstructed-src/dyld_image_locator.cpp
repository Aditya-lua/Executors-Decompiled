// Control-flow-normalized reconstruction of native 0x3a8258.
// Evidence-based pseudocode; not original vendor source.

#include <cstdint>
#include <cstring>

using ImageCount = std::uint32_t (*)();
using ImageName = const char* (*)(std::uint32_t);

// In the native function these callbacks are loaded through the 0xe0-byte
// dispatch block at global 0xf0d3e0, and the protected arithmetic used to
// address the fields has been collapsed here.
const char* reconstructed_find_loaded_image_containing(const char* needle,
                                                        ImageCount image_count,
                                                        ImageName image_name) {
    if (!needle || !image_count || !image_name)
        return nullptr;
    const std::uint32_t count = image_count();
    for (std::uint32_t index = 0; index < count; ++index) {
        const char* path = image_name(index);
        if (path && std::strstr(path, needle))
            return path;
    }
    return nullptr;
}
