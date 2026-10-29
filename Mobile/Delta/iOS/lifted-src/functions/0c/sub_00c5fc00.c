/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5fc00..0xc5fe28 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5fc00_0 {
    unsigned long long field_0;
} st_c5fc00_0;

extern unsigned long long g_f0a660;
extern st_c5fc00_0 *g_f0b240;

void sub_c5fc00(void)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v0 = "stdoutfailed to write whole bufferstack backtrace:\nnote: Some details are omitted, run with `RUST_BACKTRACE=full` for a verbose backtrace.\nuse of std::thread::current() is not possible after the thread's local data has been destroyedfatal runtime error: init_current() was re-entrant, which indicates a bug in the Rust threading implementation, aborting\nfailed to generate random datafatal runtime error: the System allocator may not use TLS with destructors, aborting\nstrerror_r failurefailed to generate unique thread ID: bitspace exhaustedWouldBlockthread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInva";
    v1 = 6;
    /* unsupported instruction */;
    if (g_f0a660)
    {
        sub_c79e14();
        g_f0b240();
    }
    g_f0b240();
}
