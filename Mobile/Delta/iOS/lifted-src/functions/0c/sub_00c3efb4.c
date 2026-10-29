/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3efb4..0xc3fb20 (2924 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3efb4_3 {
    char padding_0[8];
    struct st_c3efb4_1 *field_8;
    unsigned int field_10;
} st_c3efb4_3;

typedef struct st_c3efb4_1 {
    char padding_0[24];
    struct st_c3efb4_2 *field_18;
} st_c3efb4_1;

typedef struct st_c3efb4_2 {
    unsigned long long field_0;
} st_c3efb4_2;

typedef struct st_c3efb4_0 {
    void* field_0;
} st_c3efb4_0;

extern long long g_efcab8;
extern long long g_efcc80;
extern long long g_efccc8;

unsigned long long sub_c3efb4(st_c3efb4_0 **a0, st_c3efb4_3 *a1)
{
    void* *v11;  // x8
    void* iter;  // x22
    unsigned int v21;  // w14
    char *v22;  // x15
    unsigned int v23;  // w13
    unsigned int v24;  // w13
    unsigned int v25;  // w9
    unsigned long long v26;  // 4121
    unsigned long long v27;  // x3
    unsigned long long v28;  // 4119
    unsigned long long v29;  // x11
    unsigned long long v30;  // x11
    unsigned long long v13;  // x23
    unsigned long long v31;  // x3
    unsigned long long v32;  // x11
    void* v33;  // x10
    unsigned int v34;  // w12
    unsigned long long v35;  // x12
    unsigned int v36;  // w12
    unsigned long long v37;  // x13
    unsigned long long v38;  // 4119
    unsigned long long v39;  // 4119
    unsigned long long v40;  // 4121
    unsigned long long v14;  // x11
    unsigned long long v41;  // 4102
    void* iter1;  // x10
    void* v44;  // x12
    unsigned long v45;  // x13
    unsigned long long v46;  // w11
    unsigned int v47;  // w13
    unsigned int v48;  // w12
    unsigned int v49;  // w13
    unsigned int v50;  // w11
    unsigned long long v15;  // x10
    unsigned long long i;  // w11
    unsigned long long v52;  // x8
    unsigned long long v56;  // x25
    unsigned long long v16;  // x1
    unsigned long long v17;  // x9
    void* v18;  // x24
    unsigned long long v19;  // x13
    unsigned int v20;  // w13
    unsigned int v0;  // [bp-0xa4]
    unsigned long long v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x98]
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x80]
    st_c3efb4_3 *v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    char v8;  // [bp-0x61]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = *a0;
    iter = *v11;
    if (!iter)
    {
        v2 = v11[1];
        v3 = v11[2];
        v4 = 0;
        v5 = 0;
        v6 = a1;
        v7 = 0;
        return sub_c3b0e8(&v2, 1);
    }
    v13 = v11[1];
    v0 = 0xffef0800;
    v1 = v11[2];
    if (!v1)
    {
LABEL_c3f954:
        return 0;
    }
    if (v13)
    {
        v14 = 0;
        v15 = *(char *)iter;
        v16 = v13;
        v17 = v15;
    }
    else
    {
LABEL_c3f9e4:
        sub_c73c64(&g_efcc80);
LABEL_c3f9f0:
    }
    while (1)
    {
        v18 = iter + v14;
        v19 = v17;
        if (v19 >> 7 & 1)
        {
            v20 = (char)v18[1] & 63;
            if ((unsigned int)v17 >= 224)
            {
                v21 = (unsigned int)v17 & 31;
                v22 = iter + v14;
                v23 = v22[2] & 63 | v20 * 64;
                if ((unsigned int)v17 >= 240)
                {
                    v24 = v22[3] & 63 | v23 * 64;
                    v19 = v24 & 0xffe00000 | (v24 & 0xffe3ffff | __ROL__(v21, 18) & 0x1c0000) & 0x1fffff;
                }
                else
                {
                    v19 = v23 | v21 * 0x1000;
                }
            }
            else
            {
                v19 = (v20 & 63 | __ROL__((unsigned int)v17, 6) & 1984) & 0x7ff;
            }
        }
        if (10 <= (unsigned int)v19 - 48)
            break;
        if (v13 - 1 == v14)
            goto LABEL_c3f9e4;
        v25 = *((char *)iter + v14 + 1);
        v26 = arm64g_calculate_condition(209, v25, 65, 0);
        if (v26 & 1)
            goto LABEL_c3f9f0;
        v17 = v25 & 0xff;
        v16 -= 1;
        v14 += 1;
    }
    v27 = v13 - v16;
    if (v13 == v16)
    {
LABEL_c3fa28:
        v29 = 0;
        goto LABEL_c3f9b0;
    }
    v28 = arm64g_calculate_condition(209, *((char *)iter + v27), 65, 0);
    if (v28 & 1)
    {
        v16 = v13;
        goto LABEL_c3fa20;
    }
    if (v27 == 1 && (v29 = 1, (unsigned int)v15 == 43 || (unsigned int)v15 == 45))
        goto LABEL_c3f9b0;
    if ((unsigned int)v15 == 43)
        iter += 1;
    v30 = v27 - ((unsigned int)v15 == 43);
    if (0x11 <= v30)
    {
        v31 = 0;
        while (1)
        {
            if (!v30)
                goto LABEL_c3f128;
            v35 = *(char *)iter;
            iter += 1;
            if (v31 * 10 <= 0xffffffffffffffff)
            {
                v36 = (unsigned int)v35 - 48;
                if (10 <= v36)
                    goto LABEL_c3fa08;
                v37 = v31 * 10;
                v31 = v37 + v36;
                v30 -= 1;
                v38 = arm64g_calculate_condition(50, v37, v36, 0);
                if (!(v38 & 1))
                {
                    v29 = 2;
                    break;
                }
            }
            else
            {
                if (10 <= (unsigned int)v35 - 48)
                    v29 = 1;
                else
                    v29 = 2;
                break;
            }
        }
        goto LABEL_c3f9b0;
    }
    if (!v30)
        goto LABEL_c3f194;
    v31 = 0;
    do
    {
        v32 = v30;
        v33 = iter + 1;
        v34 = *(char *)iter - 48;
        if (9 < v34)
            goto LABEL_c3fa08;
    } while ((v31 = 10 * v31 + (v34 & 0xff), v30 = v32 - 1, iter = v33, v32 != 1));
LABEL_c3f128:
    if (!v31)
    {
LABEL_c3f194:
        v16 = 0;
        if (0)
            goto LABEL_c3f290;
        goto LABEL_c3f2ac;
    }
    if (v16 > v31)
    {
        v39 = arm64g_calculate_condition(209, *((char *)v18 + v31), 65, 0);
        if (v39 & 1)
            goto LABEL_c3fa30;
        v40 = arm64g_calculate_condition(209, *((char *)v18 + v31), 65, 0);
        if (!(v40 & 1))
        {
            v16 = v31;
            goto LABEL_c3f1b4;
        }
        else
        {
            iter = v18;
LABEL_c3fa20:
            sub_c73cc8(iter, v16, 0);
            goto LABEL_c3fa28;
        }
    }
    v41 = arm64g_calculate_condition(20, v16, v31, 0);
    if (v41 & 1)
    {
LABEL_c3fa30:
        sub_c73cc8();
LABEL_c3fa08:
        v29 = 1;
LABEL_c3f9b0:
        v8 = v29;
        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v8, &g_efcab8, &g_efccc8);
        return v56;
    }
LABEL_c3f1b4:
    if (v1 == 1 && a1->field_10 >> 23 & 1 && (unsigned int)v17 == 104)
    {
        iter1 = v18 + 1;
        do
        {
            if (iter1 == v18 + v16)
                goto LABEL_c3f954;
            v44 = iter1;
            v45 = *(char *)v44;
            v46 = (unsigned int)v45 & 0xff;
            if (!(v45 >> 31 & 1))
            {
                iter1 = v44 + 1;
                continue;
            }
            else
            {
                v47 = (char)iter1[1] & 63;
                if (v46 >= 224)
                {
                    v48 = v46 & 31;
                    v49 = (char)iter1[2] & 63 | v47 * 64;
                    if (v46 >= 240)
                    {
                        v50 = (char)iter1[3] & 63 | v49 * 64;
                        v46 = v50 & 0xffe00000 | (v50 & 0xffe3ffff | (v48 * 0x40000 | v48 >> 14) & 0x1c0000) & 0x1fffff;
                        if (v46 == 0x110000)
                            goto LABEL_c3f954;
                        iter1 += 4;
                        continue;
                    }
                    else
                    {
                        iter1 += 3;
                        v46 = v49 | v48 * 0x1000;
                        continue;
                    }
                }
                else
                {
                    iter1 += 2;
                    v46 = (v47 & 63 | __ROL__(v46, 6) & 1984) & 0x7ff;
                }
            }
            if (57 < v46)
                i = (v46 - 65 & 0xffffffde) + 10;
            else
                i = v46 - 48;
        } while (i <= 15);
    }
    if (0)
    {
LABEL_c3f290:
        a1->field_8->field_18();
    }
LABEL_c3f2ac:
    v52 = v16 - 1;
    if (v16 > 1 && *(short *)v18 == 9311)
        goto LABEL_0xc3f2c4;
    else
        goto LABEL_0xc3f2dc;
}
