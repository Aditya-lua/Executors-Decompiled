// Evidence-based pseudocode. This is not the vendor's original source.

#include <cstdint>

using Initializer = void (*)(void*);

// The protected wrappers store two unrelated-looking 64-bit constants in
// separate regions. Their unsigned difference is the real internal target.
static Initializer decode_target(std::uintptr_t encoded_a,
                                 std::uintptr_t encoded_b) {
    return reinterpret_cast<Initializer>(encoded_b - encoded_a);
}

void reconstructed_wrapper(void* scratch,
                           std::uintptr_t encoded_a,
                           std::uintptr_t encoded_b) {
    decode_target(encoded_a, encoded_b)(scratch);
}
