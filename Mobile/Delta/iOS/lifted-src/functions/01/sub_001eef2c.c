/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eef2c..0x1ef004 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eef2c_2 {
    struct st_1eef2c_1 *field_0;
    char padding_8[120];
    unsigned long long field_80;
} st_1eef2c_2;

typedef struct st_1eef2c_1 {
    char padding_0[4];
    char field_4;
} st_1eef2c_1;

typedef struct st_1eef2c_0 {
    char field_0;
} st_1eef2c_0;

extern unsigned long long g_e76f38;
extern unsigned long long g_e76f48;
extern unsigned long long g_e76f58;

long long sub_1eef2c(st_1eef2c_2 *a0, unsigned long long *a1)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v22;  // w0
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4108
    unsigned long long v25;  // 4108
    unsigned long long *v26;  // x8
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x9
    st_1eef2c_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1eef2c_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x41]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0->field_4 - 1;
    v19 = a1[20];
    if (a1[21] <= v19)
        return sub_1eefe8(v19);
    v20 = sub_ca18(v19, a1[21] - v19, &v2);
    if (v20)
    {
        v21 = a0->field_80;
        a1[4] = a1[22];
        a1[5] = v20;
        a1[19] = v20;
        a1[20] = v20 + 1;
        a1[15] = v21;
        v22 = (unsigned int)sub_1eda40(a0, a1);
        v23 = v22;
        if (!v22)
        {
            v24 = arm64g_calculate_condition(3, v23, 0, 0);
            if (!(v24 & 1))
                goto LABEL_1eefce;
LABEL_1eefcd:
            v26 = &g_e76f38;
        }
        else
        {
            v25 = arm64g_calculate_condition(3, v23, 0, 0);
            if (v25 & 1)
                goto LABEL_1eefcd;
            v26 = &g_e76f48;
LABEL_1eefce:
        }
        goto *((void *)(*v26));
    }
    else
    {
        goto *((void *)(g_e76f58));
    }
}
