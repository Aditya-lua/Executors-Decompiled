/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x291e0..0x2973c (1372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_291e0_0 {
    char field_0;
} st_291e0_0;

extern unsigned long long g_e63618;

long long sub_291e0(void* *a0)
{
    void* v9;  // x8
    void* v10;  // x9
    unsigned long long v19;  // 4106
    unsigned int v20;  // w11
    unsigned long v21;  // cc_dep1
    unsigned int v22;  // w11
    unsigned long v23;  // 4112
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned int v27;  // w11
    unsigned long long v28;  // 4118
    long long i;  // x20
    unsigned long v29;  // 4112
    unsigned long long v30;  // 4118
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4105
    unsigned long v12;  // x0
    unsigned int v13;  // w20
    unsigned int v14;  // x10
    unsigned long v15;  // cc_dep1
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4106
    unsigned long long v18;  // 4112
    st_291e0_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_291e0_0 *v1;  // [bp-0xa0]
    char *v2;  // [bp-0x98], Other Possible Types: long long
    long long v3;  // [bp-0x90]
    long long v4;  // [bp-0x88]
    char v5;  // [bp-0x80]
    long long *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v2 = 0;
    sub_2fc4c(&v5, (long long)(a0[7] - a0[6]) >> 2, &v2);
    v9 = a0[6];
    v10 = a0[7];
    if (v10 != v9)
    {
        i = 0;
        do
        {
            v12 = *((char *)v9 + 4 * i);
            *(char *)(v5 + i) = 1;
            i += sub_2d3c0(v12);
            v9 = a0[6];
            v10 = a0[7];
        } while ((unsigned long long)i < (long long)(a0[7] - v9) >> 2);
    }
    v2 = 0;
    v3 = 0;
    v4 = 0;
    if (v10 == v9)
    {
        v6 = &v2;
        sub_30030(&v6);
        v2 = &v5;
        return sub_30030(&v2);
    }
    v13 = *(int *)v9 & 0xff;
    v14 = 584;
    if (v13 == 89)
        v14 = 160;
    if (v13 == 0x55)
        v14 = 488;
    if (v13 == 84)
        v14 = 344;
    if (v13 == 5)
        v14 = 432;
    if (v13 == 83)
        v14 = 344;
    if (v13 - 7 < 2)
        v14 = 56;
    if (v13 == 86)
        v14 = 424;
    if (v13 == 70)
        v14 = 456;
    if (v13 == 11)
        v14 = 264;
    if (v13 == 12)
        v14 = 112;
    if (v13 == 75)
        v14 = 448;
    if (v13 == 66)
        v14 = 296;
    if (v13 - 15 < 2)
        v14 = 360;
    if (v13 == 64)
        v14 = 384;
    if (v13 == 63)
        v14 = 312;
    if (v13 == 19)
        v14 = 232;
    v15 = v13;
    if (v13 == 20)
        v14 = 216;
    if (v13 != 21)
    {
        v16 = arm64g_calculate_condition(19, v15, 20, 0);
        v17 = arm64g_calculate_condition(3, (v16 & 1 ? v13 : 0x40000000), (v16 & 1 ? 87 : 0), 0);
        if (!(v17 & 1))
            goto LABEL_29382;
LABEL_29381:
        v14 = 504;
    }
    else
    {
        v18 = arm64g_calculate_condition(19, v15, 20, 0);
        v19 = arm64g_calculate_condition(0, (v18 & 1 ? v13 : 0x40000000), (v18 & 1 ? 87 : 0), 0);
        if (v19 & 1)
            goto LABEL_29381;
LABEL_29382:
    }
    if (v13 == 22)
        v14 = 200;
    if (v13 == 55)
        v14 = 248;
    if (v13 == 54)
        v14 = 408;
    if (v13 - 47 < 2)
        v14 = 128;
    v20 = v13 - 71;
    v21 = v20;
    if (v20 < 2)
        v14 = 80;
    v22 = v13 - 43;
    if (v13 != 82)
    {
        v23 = arm64g_calculate_condition(19, v21, 2, 0);
        v24 = 3;
        v25 = (v23 & 1 ? v22 : 0);
        v26 = (v23 & 1 ? 2 : 0);
        v27 = v13 - 41;
        v28 = arm64g_calculate_condition(35, v25, v26, 0);
        if (!(v28 & 1))
            goto LABEL_293da;
LABEL_293d9:
        v31 = arm64g_calculate_condition(v24 | 32, v25, v26, 0);
        v32 = arm64g_calculate_condition(0x33, (v31 & 1 ? v27 : 0), (v31 & 1 ? 2 : 0), 0);
        if (!(v32 & 1))
            goto LABEL_293de;
LABEL_293dd:
        v14 = 64;
    }
    else
    {
        v29 = arm64g_calculate_condition(19, v21, 2, 0);
        v24 = 0;
        v25 = (v29 & 1 ? v22 : 0);
        v26 = (v29 & 1 ? 2 : 0);
        v27 = v13 - 41;
        v30 = arm64g_calculate_condition(32, v25, v26, 0);
        if (v30 & 1)
            goto LABEL_293d9;
LABEL_293da:
        v33 = arm64g_calculate_condition(v24 | 32, v25, v26, 0);
        v34 = arm64g_calculate_condition(48, (v33 & 1 ? v27 : 0), (v33 & 1 ? 2 : 0), 0);
        if (v34 & 1)
            goto LABEL_293dd;
LABEL_293de:
    }
    if (v13 == 79)
        v14 = 376;
    if (v13 == 80)
        v14 = 240;
    if (v13 - 39 < 2)
        v14 = 64;
    goto *((void *)(*(long long *)((char *)&g_e63618 + v14)));
}
