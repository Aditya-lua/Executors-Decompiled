/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7ccc0..0xb7d3e8 (1832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7ccc0_0 {
    char padding_0[8];
    uint128_t field_8;
} st_b7ccc0_0;

extern long long g_ef7fc0;
extern long long g_ef7fd8;

double sub_b7ccc0(void* a0, long long a1, unsigned long long a2)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x22
    unsigned int v19;  // w8
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // 4118
    unsigned int v22;  // w8
    unsigned long long v23;  // x8
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x9
    unsigned long long v13;  // x27
    unsigned long long v29;  // x1
    unsigned long long v30;  // x22
    unsigned long long ptr;  // x0
    unsigned long long v32;  // x8
    unsigned long long v33;  // x9
    unsigned short v34;  // x10
    unsigned long long v35;  // w8
    unsigned long long v36;  // x25
    unsigned long long v37;  // x22
    unsigned long long v38;  // x8
    unsigned long long v39;  // x26
    char *v40;  // x27
    unsigned long long iter;  // x23
    unsigned long long v42;  // x8
    unsigned long long n;  // x19
    void* v44;  // x10
    uint128_t v45;  // q0
    void* v46;  // x9
    uint128_t *v47;  // x8
    unsigned long long v14;  // x25
    unsigned long long v15;  // x23
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // w26
    uint128_t *v0;  // [bp-0xe0]
    unsigned long long v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc0]
    unsigned long long v3;  // [bp-0xb8]
    uint128_t v4;  // [bp-0xb0]
    unsigned long long v5;  // [bp-0xa0]
    st_b7ccc0_0 v6;  // [bp-0x98]
    uint128_t v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = 0;
    v12 = 0;
    v3 = a1 + a2;
    *(unsigned long long *)&v4 = 0x8000000000000000;
    v0 = (v6.padding_0)[1];
    v13 = a1;
    while (1)
    {
        if (v12 & 1)
        {
            v16 = v11;
            v17 = v13;
            v13 = v15;
            v11 = v2;
            if (v15)
                goto LABEL_b7cd74;
            goto LABEL_b7d2cc;
        }
        if (v13 == v3 || (v17 = v13 + 1, v16 = v11 + 1, !v13))
        {
LABEL_b7d2cc:
            if (*(unsigned long long *)&v4 == 0x8000000000000000)
            {
                v17 = &v6;
                sub_be8f00(&v6, a1, a2);
                if (v6.padding_0 == 1)
                    goto LABEL_b7d3a8;
                v44 = a0;
                *(unsigned long long *)&v44[8] = *(unsigned long long *)((void*)&v6 + 8);
                *(unsigned long long *)&v44[16] = *(unsigned long long *)((void*)&v6 + 16);
                *(unsigned long *)v44 = 0x8000000000000000;
                break;
            }
            else
            {
                v45 = v4;
                v46 = a0;
                *(uint128_t *)v46 = v45;
                *(unsigned long long *)&v46[16] = v5;
                break;
            }
        }
LABEL_b7cd74:
        v18 = *(char *)v13;
        if (v18 != 32)
        {
            v19 = v18 - 127;
            v20 = v19;
            v21 = arm64g_calculate_condition(49, v19, 94, 0);
            if (!(v21 & 1))
            {
                v22 = v18 - 0x22;
                v23 = 1 << ((char)v22 & 63) & 288230376151711777;
                if (v22 <= 58)
                {
                    v24 = arm64g_calculate_condition(145, v20, 94, 0);
                    v25 = arm64g_calculate_condition(4, (v24 & 1 ? v23 : 0x40000000), 0, 0);
                    if (!(v25 & 1))
                        goto LABEL_b7cde8;
                }
                else
                {
                    v26 = arm64g_calculate_condition(145, v20, 94, 0);
                    v27 = arm64g_calculate_condition(0, (v26 & 1 ? v23 : 0x40000000), 0, 0);
                    if (!(v27 & 1))
                        goto LABEL_b7cde8;
                }
            }
            else
            {
LABEL_b7cde8:
                v29 = *(unsigned long long *)&v4;
                if (v29 == 0x8000000000000000)
                {
                    v30 = a2 - v11;
                    if (a2 < v11)
                    {
                        sub_c73bb0(0, v11, a2, &g_ef7fd8);
LABEL_b7d360:
                        v47 = v0;
                        goto LABEL_b7d370;
                    }
                    sub_be8f00(&v6, a1, v11);
                    if (v6.padding_0 == 1)
                        goto LABEL_b7d360;
                    v11 = *(unsigned long long *)((void*)&v6 + 16);
                    if ((long long)v11 < 0)
                    {
                        sub_c6b970(0, v1);
                    }
                    else if (v11)
                    {
                        ptr = _malloc(v11);
                        if (!ptr)
                            goto LABEL_b7d39c;
                        _memcpy();
                        v1 = ptr;
                        v29 = v11;
                        v4 = CONCAT(v1, v11);
                        v5 = v11;
                        if (v30 * 2 > 0)
                            goto LABEL_b7d180;
                        goto LABEL_b7ce94;
                    }
                    else
                    {
                        v29 = 0;
                        v1 = 1;
                        v4 = CONCAT(1, 0);
                        v5 = 0;
                        if (0xffffffffffffffff < v30 * 2)
                        {
LABEL_b7d180:
                            sub_c6c0cc(&v4, v11);
                            v29 = *(unsigned long long *)&v4;
                            if (v29 == 0x8000000000000000)
                            {
                                while (1)
                                {
                                    sub_c73c64(&g_ef7fc0);
LABEL_b7d39c:
                                    sub_c6b970(1, v11);
LABEL_b7d3a8:
                                    v47 = v17 + 8;
LABEL_b7d370:
                                    v8 = *v47;
                                    sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43);
                                }
                            }
                        }
                    }
                    goto LABEL_b7d2cc;
                }
LABEL_b7ce94:
                if (v18 > 12)
                {
                    if (38 >= v18)
                    {
                        switch (v18)
                        {
                        case 13:
                            v32 = v5;
                            if (v29 - v32 <= 1)
                            {
                                sub_c6c0cc(&v4, v32, 2, 1, 1);
                                v32 = v5;
                            }
                            v33 = *(unsigned long long *)((void*)&v4 + 8);
                            v34 = 29276;
                            break;
                        case 34:
                            v32 = v5;
                            if (v29 - v32 <= 1)
                            {
                                sub_c6c0cc(&v4, v32, 2, 1, 1);
                                v32 = v5;
                            }
                            v33 = *(unsigned long long *)((void*)&v4 + 8);
                            v34 = 8796;
                            break;
                        default:
LABEL_b7cf3c:
                            if (v18 >= 10)
                            {
LABEL_b7cf44:
                                v35 = 5243 * v18 >> 19;
                                *(short *)&v6.padding_0[1] = *(short *)(2 * v18 + 0x1ffffff38 * v35 + 14721940);
                                v36 = 1;
                                if (v18)
                                    goto LABEL_b7cfe0;
                                goto LABEL_b7cfe4;
                            }
LABEL_b7cfd4:
                            v35 = v18;
                            v36 = 3;
                            if (v18)
                            {
LABEL_b7cfe0:
                                if (!v35)
                                    goto LABEL_b7cff4;
                            }
LABEL_b7cfe4:
                            v36 -= 1;
                            v6.padding_0[v36] = (char)v35 + 48;
LABEL_b7cff4:
                            v37 = v5;
                            v38 = v37;
                            if (v29 == v38)
                            {
                                sub_c6c0cc(&v4);
                                v38 = v5;
                            }
                            *(char *)(*(unsigned long long *)((void*)&v4 + 8) + v38) = 92;
                            v39 = v37 + 1;
                            v5 = v39;
                            v12 = v36 != 0;
                            if (!v36)
                            {
                                v11 = v16;
                                v13 = v17;
                                n = 3;
                                if (*(unsigned long long *)&v4 - v39 < 3)
                                    goto LABEL_b7d138;
                            }
                            else if (v17 != v3)
                            {
                                v40 = v17;
                                v13 = v40 + 1;
                                v11 = v16 + 1;
                                if (9 >= *v40 - 48)
                                {
                                    if (*(unsigned long long *)&v4 - v39 < v36)
                                    {
                                        sub_c6c0cc(&v4, v39, v36, 1, 1);
                                        v39 = v5;
                                    }
                                    iter = v36;
                                    do
                                    {
                                        v42 = v39;
                                        if (v42 == *(unsigned long long *)&v4)
                                        {
                                            sub_c6c0cc(&v4, v39, 1, 1, 1);
                                            v42 = v5;
                                        }
                                    } while ((*(char *)(*(unsigned long long *)((void*)&v4 + 8) + v42) = 48, v39 += 1, v5 = v39, iter -= 1, iter));
                                }
                                v15 = v17;
                                v2 = v16;
                                n = v36 ^ 3;
                                if (n > *(unsigned long long *)&v4 - v39)
                                    goto LABEL_b7d138;
                            }
                            else
                            {
                                v15 = 0;
                                v11 = v16;
                                v13 = a1 + a2;
                                n = v36 ^ 3;
                                if (n > *(unsigned long long *)&v4 - v39)
                                {
LABEL_b7d138:
                                    sub_c6c0cc(&v4, v39, v36 ^ 3, 1, 1);
                                    v39 = v5;
                                    if (v36 != 3)
                                    {
LABEL_b7d0f0:
                                        _memcpy(*(unsigned long long *)((void*)&v4 + 8) + v39, &v6.padding_0[v36], n);
                                    }
LABEL_b7d108:
                                    v14 = v39 + n;
                                    v5 = v14;
                                    continue;
                                }
                            }
                            if (v36 != 3)
                                goto LABEL_b7d0f0;
                            goto LABEL_b7d108;
                        }
                    }
                    else
                    {
                        switch (v18)
                        {
                        case 39:
                            v32 = v5;
                            if (v29 - v32 <= 1)
                            {
                                sub_c6c0cc(&v4, v32, 2, 1, 1);
                                v32 = v5;
                            }
                            v33 = *(unsigned long long *)((void*)&v4 + 8);
                            v34 = 10076;
                            break;
                        case 92:
                            v32 = v5;
                            if (v29 - v32 <= 1)
                            {
                                sub_c6c0cc(&v4, v32, 2, 1, 1);
                                v32 = v5;
                            }
                            v33 = *(unsigned long long *)((void*)&v4 + 8);
                            v34 = 0x5c5c;
                            break;
                        default:
LABEL_b7cf3c:
                            if (v18 < 10)
                                goto LABEL_b7cfd4;
                            goto LABEL_b7cf44;
                        }
                    }
                }
                else
                {
                    if (v18 == 9)
                    {
                        v32 = v5;
                        if (v29 - v32 <= 1)
                        {
                            sub_c6c0cc(&v4, v32, 2, 1, 1);
                            v32 = v5;
                        }
                        v33 = *(unsigned long long *)((void*)&v4 + 8);
                        v34 = 29788;
                    }
                    else if (v18 != 10)
                    {
                        if (v18 != 12)
                            goto LABEL_b7cf3c;
                        v32 = v5;
                        if (v29 - v32 <= 1)
                        {
                            sub_c6c0cc(&v4, v32, 2, 1, 1);
                            v32 = v5;
                        }
                        v33 = *(unsigned long long *)((void*)&v4 + 8);
                        v34 = 26204;
                    }
                    else
                    {
                        v32 = v5;
                        if (v29 - v32 <= 1)
                        {
                            sub_c6c0cc(&v4, v32, 2, 1, 1);
                            v32 = v5;
                        }
                        v33 = *(unsigned long long *)((void*)&v4 + 8);
                        v34 = 28252;
                    }
                }
                *(unsigned short *)(v33 + v32) = v34;
                v14 = v32 + 2;
                goto LABEL_b7cd34;
            }
        }
        v12 = 0;
        v11 = v16;
        v13 = v17;
        if (*(unsigned long long *)&v4 == 0x8000000000000000)
            continue;
        v28 = v14;
        if (*(unsigned long long *)&v4 == v28)
        {
            sub_c6c0cc(&v4, v14, 1, 1, 1);
            v28 = v5;
        }
        *(char *)(*(unsigned long long *)((void*)&v4 + 8) + v28) = v18;
        v14 += 1;
        v12 = 0;
LABEL_b7cd34:
        v5 = v14;
        v11 = v16;
        v13 = v17;
    }
    return *(unsigned long long *)&v45;
}
