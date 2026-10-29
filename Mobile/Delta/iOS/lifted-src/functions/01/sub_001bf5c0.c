/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bf5c0..0x1bf79c (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bf5c0_0 {
    char field_0;
} st_1bf5c0_0;

extern unsigned long long g_e70c20;

char * sub_1bf5c0(unsigned long a0, char *a1, char *a2)
{
    unsigned int v4;  // w8
    unsigned long long v5;  // x9
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4106
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4106
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4113
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4113
    st_1bf5c0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bf5c0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = *a1;
    v5 = 144;
    if (v4 == 46)
        v5 = 96;
    if (v4 == 92)
        v5 = 128;
    if (v4 == 91)
        v5 = 48;
    v6 = v4 & 0xff;
    if (v4 == 40)
        v5 = 112;
    if ((v4 & 254) != 42)
    {
        v7 = arm64g_calculate_condition(19, v6, 40, 0);
        v8 = 3;
        v9 = (v7 & 1 ? v4 & 0xff : 0x40000000);
        v10 = (v7 & 1 ? 63 : 0);
        v11 = arm64g_calculate_condition(19, v9, v10, 0);
        if (!(v11 & 1))
            goto LABEL_1bf63e;
LABEL_1bf63d:
        v14 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
        v15 = arm64g_calculate_condition(3, (v14 & 1 ? v4 & 0xff : 0x40000000), (v14 & 1 ? 123 : 0), 0);
        if (!(v15 & 1))
            goto LABEL_1bf646;
        v5 = 152;
LABEL_1bf645:
    }
    else
    {
        v12 = arm64g_calculate_condition(19, v6, 40, 0);
        v8 = 0;
        v9 = (v12 & 1 ? v4 & 0xff : 0x40000000);
        v10 = (v12 & 1 ? 63 : 0);
        v13 = arm64g_calculate_condition(16, v9, v10, 0);
        if (v13 & 1)
            goto LABEL_1bf63d;
LABEL_1bf63e:
        v16 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v4 & 0xff : 0x40000000), (v16 & 1 ? 123 : 0), 0);
        if (v17 & 1)
            goto LABEL_1bf645;
LABEL_1bf646:
    }
    goto *((void *)(*(long long *)((char *)&g_e70c20 + v5)));
}
