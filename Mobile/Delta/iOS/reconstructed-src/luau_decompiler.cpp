// Evidence-based interface reconstruction for native 0xb6cca8 and its paired
// result destructor at 0xb71828. This is not the vendor's original source.

#include <cstddef>
#include <cstdint>
#include <cstdlib>
#include <cstring>

// The third native argument is the Luau opcode encoding key. This is confirmed
// by the multiply at 0xb6de74..0xb6de7c and by the recovered Medal-compatible
// Rust interface `decompile_bytecode(bytecode: &[u8], encode_key: u8)`.
// Roblox client bytecode conventionally passes 203; ordinary Luau bytecode
// passes 1.
//
// The returned text is a NUL-terminated heap allocation. Native 0xb71828 is
// the corresponding destructor.
extern "C" char* reconstructed_decompile_luau(const std::uint8_t* bytecode,
                                               std::size_t length,
                                               std::uint8_t encode_key) {
    if (!bytecode || !length)
        return nullptr;

    const std::uint8_t version = bytecode[0];
    if (version < 4 || version > 9) {
        // Native code creates a structured "Unsupported bytecode version"
        // deserialization error and ultimately returns an error C string.
        return nullptr;
    }

    // Native stages, reconstructed from Rust source-path, public Medal source,
    // and panic-path evidence:
    //   deserialize chunk -> constants/functions/instructions
    //   lift control/data model -> render decompiled Luau
    // During instruction decoding the native path computes:
    //   decoded_opcode = uint8_t(encoded_opcode * encode_key)
    // The complete updated Rust implementation is represented by the binary
    // lift. `recovered-open-source/medal2-baseline` supplies the closest public
    // source scaffold, but that baseline supports only bytecode versions 4..6,
    // while this binary's private/updated fork supports versions 4..9.
    (void)encode_key;
    return nullptr;
}

extern "C" void reconstructed_free_decompile_result(char* result) {
    if (!result)
        return;

    // 0xb71828 measures the string, clears its first byte, and frees the same
    // allocation. The SIZE_MAX branch is preserved here for fidelity even
    // though a successful strlen cannot normally produce it.
    const std::size_t length = std::strlen(result);
    result[0] = '\0';
    if (length != static_cast<std::size_t>(-1))
        std::free(result);
}
