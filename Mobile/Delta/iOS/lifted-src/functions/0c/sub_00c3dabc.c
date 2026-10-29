/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3dabc..0xc3dd60 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3dabc_1 {
    char field_0;
    char field_1;
} st_c3dabc_1;

typedef struct st_c3dabc_0 {
    struct st_c3dabc_1 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_c3dabc_0;

typedef struct st_c3dabc_2 {
    char field_0;
} st_c3dabc_2;

extern unsigned long long g_bef1c8;
extern unsigned long long g_c3de74;
extern unsigned long long g_c3df24;
extern long long g_cba152;
extern long long g_efca08;
extern long long g_efca20;
extern long long g_efca38;

unsigned long long sub_c3dabc(st_c3dabc_0 *a0)
{
    unsigned long long v16;  // x9
    unsigned long long v17;  // x8
    char *iter;  // x12
    char *v27;  // x9
    unsigned long long v28;  // x10
    unsigned int v29;  // w10
    unsigned int v30;  // w10
    unsigned int v31;  // w14
    unsigned int v32;  // w14
    unsigned long long v33;  // 4128
    char *v34;  // x0
    char *v35;  // x9
    char *v18;  // x10
    unsigned long v36;  // x10
    char *v37;  // x9
    unsigned long long v38;  // x8
    unsigned int v39;  // w11
    unsigned int v40;  // w10
    unsigned int v41;  // w11
    unsigned int v42;  // w8
    unsigned int v19;  // w11
    unsigned int v20;  // w11
    unsigned int v21;  // w12
    unsigned int v22;  // w12
    unsigned long long v23;  // x12
    unsigned long long v24;  // x2
    unsigned int v25;  // x11
    char *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char v2;  // [bp-0x5c]
    unsigned int v3;  // [bp-0x5b]
    unsigned int v4;  // [bp-0x59]
    char *v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    st_c3dabc_2 **v8;  // [bp-0x40], Other Possible Types: char
    char *v9;  // [bp-0x38], Other Possible Types: unsigned long long
    char **v10;  // [bp-0x30], Other Possible Types: unsigned long long
    unsigned long long v11;  // [bp-0x28]
    char *v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a0->field_20;
    v17 = a0->field_8 - v16;
    if (v16 > a0->field_8)
        return 1114113;
    v18 = &a0->field_0->field_0;
    a0->field_0 = &v18[v16];
    a0->field_8 = v17;
    if (v16 != 2)
    {
LABEL_c3dcf4:
        sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efca20);
LABEL_c3dd0c:
        v0 = v0;
        v5 = v5;
        v7 = sub_c3de30();
        v8 = &v0;
        v9 = &g_c3de74;
        v10 = &v5;
        v11 = &g_c3df24;
        v12 = &v7;
        v13 = &g_bef1c8;
        sub_c73b38(&g_cba152, &v8, &g_efca08);
    }
    v19 = *v18;
    if (57 < v19)
        v20 = (v19 - 65 & 0xffffffdf) + 10;
    else
        v20 = v19 - 48;
    if (15 < v20)
    {
LABEL_c3dce8:
        sub_c73c64(&g_efca38);
        goto LABEL_c3dcf4;
    }
    v21 = v18[1];
    if (57 < v21)
        v22 = (v21 - 65 & 0xffffffdf) + 10;
    else
        v22 = v21 - 48;
    if (16 <= v22)
        goto LABEL_c3dce8;
    v23 = v22 | v20 * 16;
    if (!(v23 >> 7 & 1))
    {
        v2 = v23;
        v3 = 0;
        v4 = 0;
        v0 = &v2;
        v1 = 1;
        goto LABEL_c3db60;
    }
    if (192 > (unsigned int)v23)
        return 0x110000;
    if (224 > (unsigned int)v23)
    {
        v24 = 2;
        goto LABEL_c3dc20;
    }
    if (240 > (unsigned int)v23)
    {
        v24 = 3;
        goto LABEL_c3dc20;
    }
    if (248 > (unsigned int)v23)
    {
        v24 = 4;
LABEL_c3dc20:
        v25 = 0;
        v2 = v23;
        iter = &v3;
        v3 = 0;
        v4 = 0;
        v27 = v18 + 4;
        v0 = &v2;
        v1 = v24;
        while (1)
        {
            v28 = v17 + v25;
            if (v28 < 2)
                break;
            a0->field_0 = v27;
            a0->field_8 = v28 - 2;
            v29 = *(v27 - 2);
            if (57 < v29)
                v30 = (v29 - 65 & 0xffffffdf) + 10;
            else
                v30 = v29 - 48;
            if (15 < v30)
                goto LABEL_c3dce8;
            v31 = *(v27 - 1);
            if (57 < v31)
                v32 = (v31 - 65 & 0xffffffdf) + 10;
            else
                v32 = v31 - 48;
            if (16 <= v32)
                goto LABEL_c3dce8;
            v27 += 2;
            *iter = (char)v32 | (char)v30 * 16;
            iter += 1;
            v25 -= 2;
            v33 = arm64g_calculate_condition(18, v24 * 2 - 2, v25, 0);
            if (!(v33 & 1))
            {
LABEL_c3db60:
                sub_be8f00(&v8, &v2);
                if (!(v8 & 1))
                {
                    v34 = v9;
                    v5 = v34;
                    v6 = v10;
                    if (!v10)
                    {
                        v0 = v0;
                        v5 = v5;
                        v7 = sub_c3de30();
                        v8 = &v0;
                        v9 = &g_c3de74;
                        v10 = &v5;
                        v11 = &g_c3df24;
                        v12 = &v7;
                        v13 = &g_bef1c8;
                        sub_c73b38(&g_cba152, &v8, &g_efca08);
                    }
                    v35 = v34;
                    v36 = *v35;
                    v37 = v35 + 1;
                    v38 = (unsigned int)v36 & 0xff;
                    if (v36 >> 31 & 1)
                    {
                        v39 = v34[1] & 63;
                        if ((unsigned int)v38 >= 224)
                        {
                            v40 = (unsigned int)v38 & 31;
                            v41 = v34[2] & 63 | v39 * 64;
                            if ((unsigned int)v38 >= 240)
                            {
                                v37 = v34 + 4;
                                v42 = v34[3] & 63 | v41 * 64;
                                v38 = v42 & 0xffe00000 | (v42 & 0xffe3ffff | __ROL__(v40, 18) & 0x1c0000) & 0x1fffff;
                            }
                            else
                            {
                                v37 = v34 + 3;
                                v38 = v41 | v40 * 0x1000;
                            }
                        }
                        else
                        {
                            v37 = v34 + 2;
                            v38 = (v39 & 63 | __ROL__((unsigned int)v38, 6) & 1984) & 0x7ff;
                        }
                    }
                    if (v37 == &v34[v10])
                    {
                        if ((unsigned int)v38 != 0x110000)
                            return v38;
                        v0 = v0;
                        v5 = v5;
                        v7 = sub_c3de30();
                        v8 = &v0;
                        v9 = &g_c3de74;
                        v10 = &v5;
                        v11 = &g_c3df24;
                        v12 = &v7;
                        v13 = &g_bef1c8;
                        sub_c73b38(&g_cba152, &v8, &g_efca08);
                    }
                    goto LABEL_c3dd0c;
                }
            }
        }
    }
    return 0x110000;
}
