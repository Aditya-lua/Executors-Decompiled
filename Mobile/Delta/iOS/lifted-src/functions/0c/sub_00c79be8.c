/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc79be8..0xc79d40 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c79be8_0 {
    unsigned long long field_0;
} st_c79be8_0;

extern long long g_efd548;
extern st_c79be8_0 *g_f0b228;

void sub_c79be8(unsigned long a0)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long v0;  // [bp-0x50]
    char v1;  // [bp-0x31]
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
    if (!a0)
        g_f0b228();
    if (a0 == 1)
    {
        v0 = sub_c40a18(&v1, "fatal runtime error: init_current() was re-entrant, which indicates a bug in the Rust threading implementation, aborting\nfailed to generate random datafatal runtime error: the System allocator may not use TLS with destructors, aborting\nstrerror_r failurefailed to generate unique thread ID: bitspace exhaustedWouldBlockthread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescri", 243);
        sub_c769bc(sub_c40ab4(&v0));
    }
    sub_c799e4(sub_c73b38("use of std::thread::current() is not possible after the thread's local data has been destroyed", 189, &g_efd548), 189, &g_efd548);
    __debugbreak();
}
