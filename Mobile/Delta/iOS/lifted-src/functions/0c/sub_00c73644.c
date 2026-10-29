/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73644..0xc736c8 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c73644_0 {
    char field_0;
    char padding_1[15];
    char field_10;
} st_c73644_0;

extern long long g_efd5d8;

st_c73644_0 * sub_c73644(st_c73644_0 *a0, char a1)
{
    unsigned long v4;  // x8
    char v5;  // q0
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_10 & 1)
        return a0;
    if (!a1 || (v4 = *(int *)a1, v5 = *(int128_t *)(a1 + 8), *(unsigned long long *)a1 = 0, !(*(int *)a1 & 1)))
    {
        v0 = 0;
        v1 = _CCRandomGenerateBytes(&v0, 16);
        if (v1)
            sub_c76cd8(&v1, "failed to generate random datafatal runtime error: the System allocator may not use TLS with destructors, aborting\nstrerror_r failurefailed to generate unique thread ID: bitspace exhaustedWouldBlockthread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", &g_efd5d8);
        v5 = v0;
    }
    *(uint128_t *)&a0->field_0 = v5;
    a0->field_10 = 1;
    return a0;
}
