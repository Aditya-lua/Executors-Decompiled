/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc21dac..0xc22470 (1732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c21dac_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char *field_10;
} st_c21dac_0;

extern char g_e06b3c;
extern long long g_efc0a0;
extern long long g_efc0b8;
extern long long g_efc0d0;
extern long long g_efc0e8;
extern long long g_efc100;
extern long long g_efc640;

unsigned int sub_c21dac(unsigned long long *a0, long long a1)
{
    unsigned long long v33;  // x27
    st_c21dac_0 *v34;  // x21
    long long v43;  // x0
    unsigned long long v35;  // x9
    char *v36;  // x8
    char *v37;  // x8
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4102
    long long v40;  // x0
    unsigned long v41;  // x26
    unsigned long v42;  // x24
    unsigned int v0;  // [bp-0x304]
    char v1;  // [bp-0x300], Other Possible Types: unsigned int
    unsigned int v2;  // [bp-0x2f4]
    unsigned int v3;  // [bp-0x2dc]
    uint128_t v4;  // [bp-0x2d0]
    uint128_t v5;  // [bp-0x2c0]
    uint128_t v6;  // [bp-0x2b0]
    uint128_t v7;  // [bp-0x2a0]
    uint128_t v8;  // [bp-0x290]
    uint128_t v9;  // [bp-0x280]
    uint128_t v10;  // [bp-0x270]
    uint128_t v11;  // [bp-0x260]
    uint128_t v12;  // [bp-0x250]
    uint128_t v13;  // [bp-0x170]
    uint128_t v14;  // [bp-0x160], Other Possible Types: unsigned long
    unsigned long long v15;  // [bp-0x158]
    uint128_t v16;  // [bp-0x150]
    uint128_t v17;  // [bp-0x140]
    uint128_t v18;  // [bp-0x130]
    uint128_t v19;  // [bp-0x120]
    uint128_t v20;  // [bp-0x110]
    uint128_t v21;  // [bp-0x100]
    uint128_t v22;  // [bp-0xf0]
    uint128_t v23;  // [bp-0xe0]
    uint128_t v24;  // [bp-0xd0]
    uint128_t v25;  // [bp-0xc0]
    uint128_t v26;  // [bp-0xb0]
    uint128_t v27;  // [bp-0xa0]
    uint128_t v28;  // [bp-0x90]
    uint128_t v29;  // [bp-0x80]
    unsigned long v30;  // [bp-0x70]
    char *v31;  // [bp-0x10]
    char v32;  // [bp+0x0]

    v31 = &v32;
    v33 = a1 & 0xffffffff;
    if (a0[5] <= v33 || (v34 = a0[4] + v33 * 32, v34->field_0 == 0x8000000000000000))
    {
        sub_c73c64(&g_efc0a0);
        sub_c73c64(&g_efc100);
    }
    else if (!v34->field_10)
    {
        return 0;
    }
    else if (*(long long *)(v34->field_8 + 264 * v34->field_10 - 240) == 16)
    {
        sub_bd8d30(&v1, a0, a1);
        if (!v1)
        {
            return 0;
        }
        else if (v2 == v3)
        {
            v35 = 0x8000000000000000;
            if (v34->field_0 != 0x8000000000000000)
            {
                v36 = v34->field_10;
                if (v36)
                {
                    v37 = v36 - 1;
                    v34->field_10 = v37;
                    v36 = v34->field_8 + 264 * v37;
                    v35 = *(long long *)&v36[24];
                    v9 = *(int128_t *)&v36[48];
                    v10 = *(int128_t *)&v36[64];
                    v11 = *(int128_t *)&v36[80];
                    v12 = *(int128_t *)&v36[96];
                    v8 = *(int128_t *)&v36[32];
                    if (v35 == 16 || v35 == 33)
                    {
                        v17 = v11;
                        v18 = v12;
                        v14 = v9;
                        v16 = v10;
                        v13 = v8;
                        v4 = v13;
                        v5 = v14;
                        v6 = v16;
                        v7 = v17;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v38 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v38 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b869ec(&v18);
                        }
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v39 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v39 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b869ec((char *)&v18 + 8);
                        }
                        goto *((void *)(sub_c21f38 + (&g_e06b3c)[*(unsigned long long *)&v4] * 4));
                    }
                }
                else
                {
                    sub_c73c64(&g_efc0d0);
                }
                v13 = *(int128_t *)v36;
                v14 = *(long long *)&v36[16];
                v15 = v35;
                v16 = *(int128_t *)&v36[32];
                v19 = *(int128_t *)&v36[80];
                v20 = *(int128_t *)&v36[96];
                v17 = *(int128_t *)&v36[48];
                v18 = *(int128_t *)&v36[64];
                v25 = *(int128_t *)&v36[176];
                v26 = *(int128_t *)&v36[192];
                v23 = *(int128_t *)&v36[144];
                v24 = *(int128_t *)&v36[160];
                v30 = *(long long *)&v36[0x100];
                v28 = *(int128_t *)&v36[224];
                v29 = *(int128_t *)&v36[240];
                v27 = *(int128_t *)&v36[208];
                v21 = *(int128_t *)&v36[112];
                v22 = *(int128_t *)&v36[128];
                sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v13, &g_efc640, &g_efc0e8);
            }
            else
            {
                v40 = sub_c73c64(&g_efc0b8);
                if (v33 != 33)
                    sub_c259a4(&v13);
                if (v41 & 1)
                {
                    if ((unsigned long long)v4 != 2)
                    {
                        if ((unsigned long long)v4 != 3)
                        {
                            sub_c172f8(&(unsigned long long)v4);
                        }
                        else if (v0 & 1)
                        {
                            sub_c170d4(&(unsigned long long)v4 | 8);
                        }
                    }
                    else
                    {
                        if (v42 & 1)
                            sub_c16ff8(&(unsigned long long)v4 | 8);
                    }
                }
                v43 = __Unwind_Resume(v40);
                sub_c73e0c(v43);
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
    __debugbreak();
}
