/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4108c..0xc412ac (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4108c_1 {
    char padding_0[7];
    struct st_c4108c_0 *field_7;
} st_c4108c_1;

typedef struct st_c4108c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_c4108c_0;

extern unsigned long long g_b7a7fc;
extern unsigned long long g_be766c;
extern unsigned long long g_bed91c;
extern long long g_cbaf2b;
extern unsigned long long g_e0e2f8[4];
extern long long g_efd620;
extern unsigned long long g_efdbc0[4];

unsigned long long sub_c4108c(st_c4108c_1 **a0, long long *a1)
{
    st_c4108c_1 *v19;  // x9
    unsigned long long v20;  // x8
    unsigned long long v22;  // x19
    unsigned long long ptr;  // x0
    unsigned long long v24;  // x0
    long long v25;  // x0
    unsigned int v26;  // w8
    unsigned int v0;  // [bp-0x104]
    uint128_t v1;  // [bp-0x100], Other Possible Types: unsigned long long
    long long v2;  // [bp-0xf8]
    unsigned long long v3;  // [bp-0xf0]
    char *v4;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0xd8]
    char *v6;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0xc8]
    unsigned long long v8;  // [bp-0xc0]
    unsigned long long v9;  // [bp-0xb0]
    unsigned long long v10;  // [bp-0xa0]
    unsigned long long v11;  // [bp-0x90]
    unsigned long long v12;  // [bp-0x80]
    unsigned long long v13;  // [bp-0x70]
    uint128_t v14;  // [bp-0x58], Other Possible Types: unsigned long
    unsigned long v15;  // [bp-0x50]
    unsigned long long v16;  // [bp-0x48]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = *a0;
    v20 = v19 & 3;
    if (1 >= (long long)v20)
    {
        if (v20)
            goto *((void *)(*(long long *)(*(long long *)(v19->padding_0)[1] + 32)));
    }
    else
    {
        if (v20 == 2)
        {
            v0 = v19 >> 32;
            v12 = 0;
            v13 = 0;
            v10 = 0;
            v11 = 0;
            v8 = 0;
            v9 = 0;
            v4 = 0;
            v6 = 0;
            if (!(_strerror_r(v0, &v4, 128) >> 31 & 1))
            {
                sub_b71bb0(&v14, &v4, _strlen(&v4));
                if (*(unsigned long long *)&v14 == 0x8000000000000000)
                {
                    v22 = v16;
                    if (v22)
                    {
                        ptr = _malloc(v22);
                        if (!ptr)
                            goto LABEL_c41284;
                        _memcpy();
                    }
                    else
                    {
                        ptr = 1;
                    }
                    v1 = CONCAT(ptr, v22);
                    v3 = v22;
                }
                else
                {
                    v1 = v14;
                    v3 = v16;
                }
                v4 = &v1;
                v5 = &g_b7a7fc;
                v6 = &v0;
                v7 = &g_bed91c;
                v24 = sub_be769c(*a1, a1[1], &g_cbaf2b, &v4);
                if (!*(unsigned long long *)&v1)
                    return v24;
                _free(*(unsigned long long *)((void*)&v1 + 8));
                return v24;
            }
            sub_c73b38("strerror_r failurefailed to generate unique thread ID: bitspace exhaustedWouldBlockthread name may not contain interior null bytesfatal runtime error: tried to drop node in intrusive list., aborting\ncannot panic during the backtrace functionoverflow when adding duration to instantOsmessageErrorCustomerrorConnectionRefusedConnectionResetHostUnreachableNetworkUnreachableConnectionAbortedNotConnectedAddrInUseNetworkDownBrokenPipeAlreadyExistsNotADirectoryIsADirectoryDirectoryNotEmptyReadOnlyFilesystemFilesystemLoopStaleNetworkFileHandleInvalidInputInvalidDataWriteZeroStorageFullNotSeekableQuotaExceededFileTooLargeResourceBusyExecutableFileBusyCrossesDevicesTooManyLinksInvalidFilenameArgumentListTooLongInterruptedUnsupportedUnexpectedEofOutOfMemoryInProgressOtherUncategorizeddescription() is deprecated; use Display", 37, &g_efd620);
LABEL_c41284:
            v25 = sub_c6b970(1, v22);
            if (v1)
                _free(v2);
            __Unwind_Resume(v25);
        }
        else
        {
            v26 = v19 >> 32;
            if (v26 >= 42)
                v26 = 42;
            v14 = g_efdbc0[v26];
            v15 = g_e0e2f8[v26];
            v4 = &v14;
            v5 = &g_be766c;
            return sub_be769c();
        }
    }
}
