// Control-flow-normalized sketch of function 0x2c8a9c.
// This is not the vendor's original source and deliberately omits executable
// loader behavior. The native path is classified as an anti-analysis decoy.

struct DecoyLoaderEvidence {
    const char* probe_path = "/hi";
    const char* library_name = "libstuff.so";
    const char* symbol_name = "init";
    bool is_static_initializer = false;
    bool uses_flattened_jump_table = true;
};

DecoyLoaderEvidence describe_decoy_loader() {
    return {};
}
