/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeaa1c..0xbeac70 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beaa1c_1 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_beaa1c_1;

typedef struct st_beaa1c_0 {
    char field_0;
} st_beaa1c_0;

extern unsigned long long g_be766c;
extern unsigned long long g_beac70;
extern unsigned long long g_bead18;
extern unsigned long long g_bef1c8;
extern long long g_cb92cd;
extern long long g_cb92f9;
extern long long g_cb9344;
extern unsigned long long g_e08056;

void sub_beaa1c(char *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, long long a4)
{
    unsigned long long v23;  // x30
    unsigned long long v24;  // x8
    unsigned long long v33;  // 4122
    unsigned long long v34;  // x3
    unsigned long long v35;  // 4119
    st_beaa1c_1 *v36;  // x9
    unsigned long v37;  // x8
    unsigned int v38;  // w10
    unsigned long long v39;  // x8
    unsigned int v40;  // w8
    unsigned int v41;  // w11
    unsigned int v42;  // w8
    unsigned long long v25;  // x9
    unsigned int v43;  // w8
    unsigned int v44;  // w8
    unsigned long long v26;  // x8
    unsigned long long v27;  // x8
    unsigned long long v28;  // 4119
    unsigned long v29;  // cc_dep1
    unsigned long long v30;  // 4105
    unsigned long long v31;  // 4105
    unsigned long long v32;  // x3
    unsigned long v0;  // [bp-0xb0]
    unsigned long v1;  // [bp-0xa8]
    char *v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    unsigned long v6;  // [bp-0x80]
    unsigned int v7;  // [bp-0x74]
    unsigned long v8;  // [bp-0x70]
    unsigned long long v9;  // [bp-0x68]
    char *v10;  // [bp-0x60]
    unsigned long long v11;  // [bp-0x58]
    st_beaa1c_0 **v12;  // [bp-0x50], Other Possible Types: char *
    unsigned long long v13;  // [bp-0x48]
    st_beaa1c_0 **v14;  // [bp-0x40], Other Possible Types: char *
    unsigned long long v15;  // [bp-0x38]
    char *v16;  // [bp-0x30], Other Possible Types: st_beaa1c_0 **
    unsigned long long v17;  // [bp-0x28]
    char *v18;  // [bp-0x20]
    unsigned long long v19;  // [bp-0x18]
    char *v20;  // [bp-0x10]
    unsigned long long v21;  // [bp-0x8]
    char v22;  // [bp+0x0]

    v20 = &v22;
    v21 = v23;
    v0 = a2;
    v1 = a3;
    if (0x101 > a1)
    {
        v24 = 0;
        v2 = a0;
        v3 = a1;
        v25 = 1;
    }
    else
    {
        v26 = 0x100;
        do
        {
            v27 = v26;
            v28 = arm64g_calculate_condition(193, a0[v27], 65, 0);
        } while (!(v28 & 1) && (v26 = v27 - 1, v27 != 1));
        v2 = a0;
        v3 = v26;
        v29 = v26;
        if (v26 < a1)
        {
            v25 = &g_e08056;
            v30 = arm64g_calculate_condition(52, v29, a1, 0);
            if (!(v30 & 1))
                goto LABEL_beaa76;
            v24 = 5;
LABEL_beaa75:
        }
        else
        {
            v25 = 1;
            v31 = arm64g_calculate_condition(52, v29, a1, 0);
            if (v31 & 1)
                goto LABEL_beaa75;
LABEL_beaa76:
            v24 = 0;
        }
    }
    v4 = v25;
    v5 = v24;
    if (a1 >= a2)
    {
        if (a1 >= a3)
        {
            if (a3 < a2)
                goto LABEL_beac2c;
            v32 = a3;
            if (a2)
            {
                v32 = a3;
                if (a1 > a2)
                {
                    v33 = arm64g_calculate_condition(193, a0[a2], 65, 0);
                    if (v33 & 1)
                        v32 = a3;
                    else
                        v32 = a2;
                }
            }
            v6 = v32;
            if (a1 > v32)
            {
                if (v32)
                {
                    do
                    {
                        v34 = v32;
                        v35 = arm64g_calculate_condition(193, a0[v34], 65, 0);
                    } while (!(v35 & 1) && (v32 = v34 - 1, v34 != 1));
                }
                if (v32 != a1)
                    goto LABEL_beaae0;
            }
            a0 = sub_c73c64(a4);
LABEL_beaae0:
            v36 = &a0[v32];
            v37 = v36->field_0;
            v38 = (unsigned int)v37 & 0xff;
            if (!(v37 >> 31 & 1))
            {
                v7 = v38;
                v39 = 1;
            }
            else
            {
                v40 = v36->field_1 & 63;
                if (v38 > 223)
                {
                    v41 = v38 & 31;
                    v42 = v36->field_2 & 63 | v40 * 64;
                    if (v38 >= 240)
                    {
                        v43 = v36->field_3 & 63 | v42 * 64;
                        v44 = v43 & 0xffe00000 | (v43 & 0xffe3ffff | (v41 * 0x40000 | v41 >> 14) & 0x1c0000) & 0x1fffff;
                        v7 = v44;
                        if (v44 >= 128)
                            goto LABEL_beab6c;
                    }
                    else
                    {
                        v44 = v42 | v41 * 0x1000;
                        v7 = v44;
                        if (v44 >= 128)
                            goto LABEL_beab6c;
                    }
LABEL_beab54:
                    v39 = 1;
                }
                else
                {
                    v44 = (v40 & 63 | (v38 * 64 | v38 >> 26) & 1984) & 0x7ff;
                    v7 = v44;
                    if (128 > v44)
                        goto LABEL_beab54;
LABEL_beab6c:
                    v39 = 3;
                    if (v44 >= 0x10000)
                        v39 = 4;
                    if (v44 < 0x800)
                        v39 = 2;
                }
            }
            v8 = v32;
            v9 = v39 + v32;
            v10 = &v6;
            v11 = &g_bef1c8;
            v12 = &v7;
            v13 = &g_beac70;
            v14 = &v8;
            v15 = &g_bead18;
            v16 = &v2;
            v17 = &g_be766c;
            v18 = &v4;
            v19 = &g_be766c;
            sub_c73b38(&g_cb92f9, &v10, a4);
            a3 = v32;
        }
        a2 = a3;
    }
    v8 = a2;
    v10 = &v8;
    v11 = &g_bef1c8;
    v12 = &v2;
    v13 = &g_be766c;
    v14 = &v4;
    v15 = &g_be766c;
    sub_c73b38(&g_cb9344, &v10, a4);
LABEL_beac2c:
    v10 = &v0;
    v11 = &g_bef1c8;
    v12 = &v1;
    v13 = &g_bef1c8;
    v14 = &v2;
    v15 = &g_be766c;
    v16 = &v4;
    v17 = &g_be766c;
    sub_c73b38(&g_cb92cd, &v10, a4);
}
