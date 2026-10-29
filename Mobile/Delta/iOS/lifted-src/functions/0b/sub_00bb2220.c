/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb2220..0xbb29c8 (1960 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb2220_5 {
    unsigned long long field_0;
    struct st_bb2220_4 *field_8;
} st_bb2220_5;

typedef struct st_bb2220_2 {
    char padding_0[8];
    struct st_bb2220_3 *field_8;
} st_bb2220_2;

typedef struct st_bb2220_4 {
    char padding_0[16];
    unsigned long long field_10;
} st_bb2220_4;

typedef struct st_bb2220_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char *field_10;
} st_bb2220_0;

typedef struct st_bb2220_1 {
    char padding_0[24];
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    unsigned long long field_100;
} st_bb2220_1;

typedef struct st_bb2220_6 {
    char padding_0[8];
    unsigned long long field_8;
    uint128_t field_10;
} st_bb2220_6;

typedef struct st_bb2220_3 {
    unsigned long long field_0;
} st_bb2220_3;

extern long long g_ef8e90;
extern long long g_ef9588;
extern long long g_ef95a0;
extern long long g_ef95b8;
extern long long g_ef95d0;
extern long long g_ef95e8;
extern long long g_ef9600;

unsigned long long sub_bb2220(unsigned long long *a0, long long a1)
{
    unsigned long long v53;  // x28
    st_bb2220_0 *v54;  // x23
    unsigned long long v63;  // 4102
    unsigned long long v64;  // 4102
    unsigned long v65;  // x26
    unsigned int v66;  // w24
    unsigned long long ptr;  // x0
    st_bb2220_5 *v68;  // x21
    st_bb2220_4 *v69;  // x0
    unsigned long long ptr1;  // x0
    unsigned long long *v71;  // x21
    unsigned long long v72;  // x22
    unsigned long long idx;  // x8
    unsigned long v73;  // x1
    st_bb2220_1 *v74;  // x8
    st_bb2220_6 *v75;  // x8
    unsigned long long ptr2;  // x0
    unsigned long long j;  // x22
    unsigned long long v79;  // x8
    unsigned long long i;  // x24
    unsigned long v57;  // x21
    unsigned long v58;  // x22
    unsigned long long v59;  // x24
    unsigned long long v60;  // x9
    char *v61;  // x8
    char *v62;  // x8
    unsigned long long v0;  // [bp-0x358]
    unsigned long long v1;  // [bp-0x354]
    char v2;  // [bp-0x350]
    unsigned int v3;  // [bp-0x344]
    st_bb2220_2 *v4;  // [bp-0x338]
    unsigned int v5;  // [bp-0x32c]
    uint512_t v6;  // [bp-0x320]
    uint128_t v7;  // [bp-0x2e0]
    uint128_t v8;  // [bp-0x2d0]
    unsigned long long v9;  // [bp-0x2c8]
    uint128_t v10;  // [bp-0x2c0]
    uint128_t v11;  // [bp-0x2b0]
    uint128_t v12;  // [bp-0x2a0]
    uint128_t v13;  // [bp-0x290]
    uint128_t v14;  // [bp-0x280]
    uint128_t v15;  // [bp-0x270]
    uint128_t v16;  // [bp-0x260]
    uint128_t v17;  // [bp-0x250]
    uint128_t v18;  // [bp-0x240]
    uint128_t v19;  // [bp-0x230]
    uint128_t v20;  // [bp-0x220]
    uint128_t v21;  // [bp-0x210]
    uint128_t v22;  // [bp-0x200]
    uint128_t v23;  // [bp-0x1f0]
    unsigned long v24;  // [bp-0x1e0]
    uint192_t v25;  // [bp-0x1d8]
    uint128_t v26;  // [bp-0x1c0], Other Possible Types: char, unsigned long long
    st_bb2220_6 *v27;  // [bp-0x1b8], Other Possible Types: long long
    uint128_t v28;  // [bp-0x1b0], Other Possible Types: unsigned long long
    char v29;  // [bp-0x198]
    long long v30;  // [bp-0x190]
    unsigned long long v31;  // [bp-0x188]
    uint128_t v32;  // [bp-0x180], Other Possible Types: uint288_t, unsigned long long
    st_bb2220_6 *v33;  // [bp-0x178], Other Possible Types: unsigned long, unsigned long long
    uint128_t v34;  // [bp-0x170], Other Possible Types: unsigned long, unsigned long long
    st_bb2220_6 *v35;  // [bp-0x168], Other Possible Types: unsigned long long
    uint128_t v36;  // [bp-0x160]
    uint128_t v37;  // [bp-0x150]
    uint128_t v38;  // [bp-0x140]
    uint128_t v39;  // [bp-0x130]
    uint128_t v40;  // [bp-0x120]
    uint128_t v41;  // [bp-0x110]
    uint128_t v42;  // [bp-0x100]
    uint128_t v43;  // [bp-0xf0]
    uint128_t v44;  // [bp-0xe0]
    uint128_t v45;  // [bp-0xd0]
    uint128_t v46;  // [bp-0xc0]
    uint128_t v47;  // [bp-0xb0]
    uint128_t v48;  // [bp-0xa0]
    uint128_t v49;  // [bp-0x90]
    unsigned long v50;  // [bp-0x80]
    char *v51;  // [bp-0x10]
    char v52;  // [bp+0x0]

    v51 = &v52;
    v53 = a1 & 0xffffffff;
    if (a0[5] > v53 && !(v54 = a0[4] + v53 * 32, v54->field_0 == 0x8000000000000000))
    {
        if (!v54->field_10 || *(long long *)(v54->field_8 + 264 * v54->field_10 - 240) != 16 || !(sub_bd8d30(&v2, a0, a1), idx = v2, idx && v3 == v5 && (i = *(long long *)(idx + 16), i == v4[1].padding_0)))
            return 0;
        if (i)
        {
            v57 = v4->field_8 + 1;
            v58 = *(long long *)(idx + 8) + 8;
            do
            {
                v59 = i;
                if (*(long long *)(v58 - 8) != *(long long *)(v57 - 8))
                    return 0;
                if (!(sub_bd12f8(v58, v57) & 1))
                    return 0;
                v57 += 72;
                v58 += 72;
                i = v59 - 1;
            } while (i);
        }
        v60 = 0x8000000000000000;
        if (v54->field_0 != 0x8000000000000000)
        {
            v61 = v54->field_10;
            if (v61)
            {
                v62 = v61 - 1;
                v54->field_10 = v62;
                v61 = v54->field_8 + 264 * v62;
                v60 = *(long long *)&v61[24];
                v8 = *(int128_t *)&v61[48];
                v10 = *(int128_t *)&v61[64];
                v11 = *(int128_t *)&v61[80];
                v12 = *(int128_t *)&v61[96];
                v7 = *(int128_t *)&v61[32];
                if (v60 != 16 && v60 != 33)
                    goto LABEL_bb2718;
                v37 = v11;
                v38 = v12;
                v34 = v8;
                v36 = v10;
                v32 = v7;
                *(uint128_t *)&v6 = v32;
                *(uint128_t *)((char *)&v6 + 16) = v34;
                *(uint128_t *)((char *)&v6 + 32) = v36;
                *(uint128_t *)((char *)&v6 + 48) = v37;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v63 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v63 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec(&v38);
                }
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v64 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v64 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec((char *)&v38 + 8);
                }
                v65 = *(unsigned long long *)&v6;
                if (v65 == 3)
                {
                    v10 = *(uint128_t *)((void*)&v6 + 8);
                    v11 = *(uint128_t *)((void*)&v6 + 24);
                    v12 = *(uint128_t *)((void*)&v6 + 40);
                    *(unsigned long long *)&v13 = *(unsigned long long *)((void*)&v6 + 56);
                    v9 = 14;
                    v66 = 1;
                    v0 = 1;
                    v1 = 0;
                    goto LABEL_bb252c;
                }
                if (v65 == 2)
                {
                    v10 = *(uint128_t *)((void*)&v6 + 8);
                    v11 = *(uint128_t *)((void*)&v6 + 24);
                    v9 = 13;
                    v66 = 1;
                    v0 = 0;
                    v1 = 1;
                    goto LABEL_bb252c;
                }
                if (sub_bb31a4(&v6) & 1)
                {
                    ptr = _malloc(24);
                    if (ptr)
                    {
                        v68 = ptr;
                        v69 = sub_bb35fc();
                        *(uint128_t *)v69->padding_0 = 1;
                        v69->field_10 = 0x8000000000000000;
                        v68->field_0 = 0x8000000000000000;
                        v68->field_8 = v69;
                        v32 = CONCAT(v68, 1);
                        *(unsigned long long *)&v34 = 1;
                        ptr1 = _malloc(64);
                        if (ptr1)
                        {
                            v66 = 0;
                            v0 = 0;
                            *(uint128_t *)ptr1 = *(uint128_t *)&v6;
                            *(uint128_t *)(ptr1 + 16) = *(uint128_t *)((void*)&v6 + 16);
                            *(uint128_t *)(ptr1 + 32) = *(uint128_t *)((void*)&v6 + 32);
                            *(uint128_t *)(ptr1 + 48) = *(uint128_t *)((void*)&v6 + 48);
                            v9 = 15;
                            v11 = CONCAT(1, *(unsigned long long *)&v34);
                            v12 = CONCAT(1, ptr1);
                            *(unsigned short *)&v13 = 1;
                            v10 = v32;
LABEL_bb252c:
                            if (a0[5] <= v53 || (v71 = a0[4] + v53 * 32, *v71 == 0x8000000000000000))
                                goto LABEL_bb27f4;
                            _memcpy(&v32, &v7, 264);
                            v72 = *(unsigned long long *)((void*)&v34 + 8);
                            v73 = v71[2];
                            if (*v71 - v73 < (v72 != 33))
                            {
                                sub_c736c8(v71);
                                v73 = v71[2];
                                if (v72 != 33)
                                {
LABEL_bb2584:
                                    v74 = v71[1] + 264 * v73;
                                    v74->field_18 = v72;
                                    v74->field_70 = v15;
                                    v74->field_80 = v16;
                                    v74->field_50 = v13;
                                    v74->field_60 = v14;
                                    v74->field_b0 = v19;
                                    v74->field_c0 = v20;
                                    v74->field_90 = v17;
                                    v74->field_a0 = v18;
                                    v74->field_100 = v24;
                                    v74->field_e0 = v22;
                                    v74->field_f0 = v23;
                                    v74->field_d0 = v21;
                                    v74->field_30 = v11;
                                    v74->field_40 = v12;
                                    v74->field_20 = v10;
                                    v73 += 1;
                                }
                            }
                            else if (!(v72 == 33))
                            {
                                goto LABEL_bb2584;
                            }
                            v71[2] = v73;
                            sub_bd8948(&v26, a0, a1);
                            v75 = v27;
                            v32 = _INSERT(CONCAT(v32, 0), 0, v75);
                            v33 = v75;
                            v34 = v26;
                            v35 = (char *)v75 + 40 * v28;
                            if (!v28 || (v33 = &v75[1].field_8, v75->field_8 == 0x8000000000000000))
                                goto LABEL_bb2810;
                            v25 = CONCAT(v75->field_10, v75->field_8);
                            sub_be6f68(&v32);
                            v28 = _INSERT(CONCAT(v28, 0), 8, 0);
                            v26 = 0;
                            v27 = 8;
                            sub_b9f1a4(8, 0);
                            v26 = *(uint128_t *)&v25;
                            *(unsigned long long *)&v28 = *(unsigned long long *)((void*)&v25 + 16);
                            ptr2 = _malloc(40);
                            if (ptr2)
                            {
                                *(uint128_t *)((char *)&v32 + 4) = v26;
                                *(uint128_t *)((char *)&v32 + 20) = v28;
                                *(uint128_t *)(ptr2 + 4) = *(uint128_t *)&v32;
                                *(unsigned int *)ptr2 = v3;
                                *(uint128_t *)(ptr2 + 20) = *(uint128_t *)((void*)&v32 + 16);
                                *(unsigned int *)(ptr2 + 36) = *(unsigned int *)((void*)&v32 + 32);
                                v32 = 1;
                                v33 = ptr2;
                                v34 = 1;
                                sub_bd9184(&v29, a0, a1, &v32);
                                for (j = v31 + 1; j != 1; j -= 1)
                                {
                                    sub_b9dd40();
                                }
                                if (v29)
                                    _free(v30);
                                if ((v65 & 14) != 2)
                                    v79 = v66 ^ 1;
                                else
                                    v79 = 1;
                                if (v79 & 1)
                                    return 1;
                                sub_bb3264(&v6);
                                return 1;
                            }
                            sub_c6ba70(8, 40);
                        }
                        else
                        {
                            sub_c6ba70(8, 64);
                        }
                    }
                    else
                    {
                        sub_c6ba70(8, 24);
                    }
                }
                else
                {
                    v9 = 33;
                    v66 = 1;
                    v0 = 1;
                    v1 = 1;
                    goto LABEL_bb252c;
                }
            }
            else
            {
                sub_c73c64(&g_ef95b8);
LABEL_bb2718:
                v32 = *(int128_t *)v61;
                v34 = *(long long *)&v61[16];
                v35 = v60;
                v36 = *(int128_t *)&v61[32];
                v39 = *(int128_t *)&v61[80];
                v40 = *(int128_t *)&v61[96];
                v37 = *(int128_t *)&v61[48];
                v38 = *(int128_t *)&v61[64];
                v45 = *(int128_t *)&v61[176];
                v46 = *(int128_t *)&v61[192];
                v43 = *(int128_t *)&v61[144];
                v44 = *(int128_t *)&v61[160];
                v50 = *(long long *)&v61[0x100];
                v48 = *(int128_t *)&v61[224];
                v49 = *(int128_t *)&v61[240];
                v47 = *(int128_t *)&v61[208];
                v41 = *(int128_t *)&v61[112];
                v42 = *(int128_t *)&v61[128];
                sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v32, &g_ef8e90, &g_ef95d0);
            }
        }
        else
        {
            sub_c73c64(&g_ef95a0);
LABEL_bb2810:
            sub_c73c64(&g_ef9600);
        }
    }
    else
    {
        sub_c73c64(&g_ef9588);
LABEL_bb27f4:
        sub_c73c64(&g_ef95e8);
    }
    __debugbreak();
}
