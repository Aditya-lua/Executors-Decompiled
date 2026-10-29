/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c328..0x3c904 (1500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c328_1 {
    char padding_0[1532];
    unsigned int field_5fc;
} st_3c328_1;

typedef struct st_3c328_2 {
    char padding_0[28];
    unsigned int field_1c;
} st_3c328_2;

typedef struct st_3c328_0 {
    char field_0;
} st_3c328_0;

extern unsigned long long g_e66ab0;
extern char g_10002b0;

long long sub_3c328(st_3c328_1 *a0, st_3c328_2 *a1, unsigned long a2)
{
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4106
    unsigned long long v29;  // 4106
    unsigned int v30;  // w10
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4106
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4106
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    unsigned int v25;  // w8
    st_3c328_0 **v0;  // [bp-0xb8], Other Possible Types: char
    st_3c328_0 *v1;  // [bp-0xb0]
    st_3c328_1 *v2;  // [bp-0x90]
    unsigned int v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = &v15;
    v14 = v24;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = a0;
    v3 = a0->field_5fc;
    v25 = a1->field_1c;
    v26 = v25;
    v27 = 16;
    if (v25 < 7)
    {
        v27 = 0x88;
        v28 = arm64g_calculate_condition(3, v26, 7, 0);
        if (!(v28 & 1))
            goto LABEL_3c396;
LABEL_3c395:
        v27 = 352;
    }
    else
    {
        v29 = arm64g_calculate_condition(3, v26, 7, 0);
        if (v29 & 1)
            goto LABEL_3c395;
LABEL_3c396:
    }
    v30 = v25 & 0xfffffffe;
    if ((v25 & 0xfffffffc) != 8)
    {
        v31 = arm64g_calculate_condition(19, v26, 7, 0);
        v32 = arm64g_calculate_condition(3, (v31 & 1 ? v30 : 0x40000000), (v31 & 1 ? 12 : 0), 0);
        if (!(v32 & 1))
            goto LABEL_3c3ae;
        v27 = 64;
LABEL_3c3ad:
    }
    else
    {
        v33 = arm64g_calculate_condition(19, v26, 7, 0);
        v34 = arm64g_calculate_condition(0, (v33 & 1 ? v30 : 0x40000000), (v33 & 1 ? 12 : 0), 0);
        if (v34 & 1)
            goto LABEL_3c3ad;
LABEL_3c3ae:
    }
    if (v30 == 14)
        v27 = 120;
    goto *((void *)(*(long long *)((char *)&g_e66ab0 + v27)));
}
