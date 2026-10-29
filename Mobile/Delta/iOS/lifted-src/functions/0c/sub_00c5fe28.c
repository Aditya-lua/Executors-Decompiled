/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5fe28..0xc600a0 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd700;
extern long long g_efd750;

unsigned long long sub_c5fe28(unsigned long long *a0, char *a1, unsigned long long a2)
{
    unsigned long long n;  // x20
    char *iter;  // x21
    unsigned long long n1;  // x22
    unsigned long long v13;  // x1
    unsigned long long *v14;  // x12
    unsigned long v15;  // x12
    unsigned long long v16;  // x1
    unsigned long long v17;  // x20
    unsigned long v18;  // x23
    unsigned long long v19;  // x0
    unsigned long v20;  // x22
    unsigned long long v4;  // x9
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    unsigned long long v7;  // x0
    unsigned long long v8;  // x10
    unsigned long long v9;  // x9
    unsigned long long v10;  // x10
    unsigned long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0[3])
    {
        n = a2;
        iter = a1;
        a0[3] = 0xffffffffffffffff;
        v4 = (a1 + 7 & 0xfffffffffffffff8) - a1;
        v5 = a2;
        if (v5 >= v4)
        {
            v6 = n - v4 & 15;
            a2 = n - v6;
            if (n < v6)
                goto LABEL_c60044;
            v5 = v4;
        }
        v7 = a2;
        v8 = n - v7;
        v9 = n - 1;
        while (1)
        {
            v10 = v8;
            v11 = v9;
            if (!v10)
                break;
            v8 = v10 - 1;
            v9 = v11 - 1;
            if (iter[v11] == 10)
            {
                n1 = v10 + v7;
                goto LABEL_c5ff28;
            }
        }
        do
        {
            v13 = v7;
        } while (v7 > v5 && (v7 = v13 - 16, v14 = &iter[v13], v15 = *(long long *)((char *)v14 - 8) ^ 0xa0a0a0a0a0a0a0a, !(~((0x101010101010100 - (*(long long *)((char *)v14 - 16) ^ 0xa0a0a0a0a0a0a0a) | *(long long *)((char *)v14 - 16)) & (0x101010101010100 - (*(long long *)((char *)v14 - 8) ^ 0xa0a0a0a0a0a0a0a) | *(long long *)((char *)v14 - 8) ^ 0xa0a0a0a0a0a0a0a)) & 0x8080808080808080)));
        if (n >= v13)
        {
            do
            {
                v16 = v13;
                if (!v16)
                {
                    v20 = a0[6];
                    if (v20 && *(char *)(a0[5] + v20 - 1) == 10)
                    {
                        v19 = sub_c5f940(a0 + 4);
                        if (v19)
                        {
                            a0[3] = a0[3] + 1;
                            return v19;
                        }
                        v20 = a0[6];
                    }
                    v17 = n;
                    if (v17 >= a0[4] - v20)
                    {
                        v19 = sub_c79d80(a0 + 4, iter, v17);
                        a0[3] = a0[3] + 1;
                        return v19;
                    }
                    _memcpy(a0[5] + v20, iter, n);
                    a0[6] = v20 + n;
                    a0[3] = a0[3] + 1;
                    return 0;
                }
            } while ((n1 = v16, v13 = v16 - 1, *(&iter[v16] - 1) != 10));
LABEL_c5ff28:
            v17 = n - n1;
            if (n >= n1)
            {
                v18 = a0[6];
                if (v18)
                {
                    if (a0[4] - v18 > n1)
                    {
                        _memcpy(a0[5] + v18, iter, n1);
                        a0[6] = v18 + n1;
                    }
                    else
                    {
                        v19 = sub_c79d80(a0 + 4, iter, n1);
                        if (v19)
                        {
                            a0[3] = a0[3] + 1;
                            return v19;
                        }
                    }
                    v19 = sub_c5f940(a0 + 4);
                }
                else
                {
                    v19 = sub_c5fafc(iter, n1);
                }
                if (v19)
                {
                    a0[3] = a0[3] + 1;
                    return v19;
                }
                iter = &iter[n1];
                n = v17;
                if (a0[4] - a0[6] <= n)
                {
                    v19 = sub_c79d80(a0 + 4, iter, v17);
                    a0[3] = a0[3] + 1;
                    return v19;
                }
                _memcpy(a0[5] + a0[6], iter, n);
                a0[6] = a0[6] + n;
                a0[3] = a0[3] + 1;
                return 0;
            }
            sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd700);
            __debugbreak();
        }
    }
    else
    {
        sub_c73cd4(&g_efd750);
LABEL_c60044:
    }
    sub_c73bb0();
    __debugbreak();
}
