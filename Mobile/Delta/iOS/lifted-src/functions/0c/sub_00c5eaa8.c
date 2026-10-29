/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5eaa8..0xc5ecc8 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5eaa8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c5eaa8_0;

typedef struct st_c5eaa8_1 {
    char padding_0[40];
    unsigned long long field_28;
} st_c5eaa8_1;

extern long long g_efd1c8;
extern long long g_efd2b0;
extern long long g_efd668;

st_c5eaa8_1 * sub_c5eaa8(unsigned long a0, st_c5eaa8_0 *a1)
{
    unsigned long long v6;  // x8
    unsigned long long v7;  // x20
    unsigned long long ptr;  // x0
    st_c5eaa8_1 *v17;  // x21
    unsigned long long v18;  // x0
    st_c5eaa8_0 *v8;  // x22
    unsigned long long v9;  // x9
    unsigned long v10;  // x10
    unsigned long long iter;  // x12
    unsigned long long v12;  // x11
    unsigned long long v13;  // x11
    unsigned long long v14;  // x12
    unsigned long long v15;  // x13
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1->field_0;
    if (v6 == 0x8000000000000000)
    {
        v7 = 0;
        a1 = v8;
    }
    else
    {
        v9 = a1->field_8;
        v10 = a1->field_10;
        if (15 < v10)
        {
            v12 = v9 + 7 & 0xfffffffffffffff8;
            v13 = v12 - v9;
            if (v12 == v9)
            {
                v14 = v10 - 16;
            }
            else
            {
                iter = 0;
                do
                {
                    if (!*(char *)(v9 + iter))
                    {
                        v0 = v6;
                        v1 = v9;
                        v2 = v10;
                        v3 = iter;
                        sub_c73d64("thread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", 47, &v0, &g_efd1c8, &g_efd668);
                        __debugbreak();
                    }
                } while ((iter += 1, v13 != iter));
                v14 = v10 - 16;
                if (v14 < v13)
                    goto LABEL_c5eb7c;
            }
            do
            {
            } while (!(~((0x101010101010100 - *(long long *)(v9 + v13) | *(long long *)(v9 + v13)) & (0x101010101010100 - *(long long *)(v9 + v13 + 8) | *(long long *)(v9 + v13 + 8))) & 0x8080808080808080) && (v13 += 16, v13 <= v14));
LABEL_c5eb7c:
            if (v10 != v13)
            {
                v15 = 0;
                do
                {
                    if (!*(char *)(v9 + v13 + v15))
                    {
                        v0 = v6;
                        v1 = v9;
                        v2 = v10;
                        v3 = v15 + v13;
                        sub_c73d64("thread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", 47, &v0, &g_efd1c8, &g_efd668);
                        __debugbreak();
                    }
                } while ((v15 += 1, v10 - v13 != v15));
            }
        }
        else if (v10)
        {
            iter = 0;
            do
            {
                if (!*(char *)(v9 + iter))
                {
                    v0 = v6;
                    v1 = v9;
                    v2 = v10;
                    v3 = iter;
                    sub_c73d64("thread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", 47, &v0, &g_efd1c8, &g_efd668);
                    __debugbreak();
                }
            } while ((iter += 1, v10 != iter));
        }
        v0 = v6;
        v1 = v9;
        v2 = v10;
        v7 = sub_b71dcc(&v0);
    }
    ptr = _malloc(56);
    if (!ptr)
    {
        sub_c6ba70(8, 56);
        __debugbreak();
    }
    v17 = ptr;
    *(uint128_t *)ptr = CONCAT(1, 1);
    *(unsigned long long *)(ptr + 24) = v7;
    *(st_c5eaa8_0 **)(ptr + 32) = a1;
    *(unsigned long *)(ptr + 16) = a0;
    v18 = _dispatch_semaphore_create(0);
    if (v18)
    {
        v17->field_28 = v18;
        v17[1].padding_0[0] = 0;
        return v17;
    }
    sub_c73b38("failed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock count overflow in reentrant mutexadvancing io slices beyond their lengthadvancing IoSlic", 125, &g_efd2b0);
    __debugbreak();
}
