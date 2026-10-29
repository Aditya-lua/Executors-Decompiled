/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x385b8..0x38650 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_385b8_0 {
    char field_0;
} st_385b8_0;

extern unsigned long long g_e66538;
extern unsigned long long g_e66540;

void sub_385b8(unsigned long a0, unsigned long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w0
    unsigned long long *v15;  // x8
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4105
    unsigned long long v18;  // 4105
    st_385b8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_385b8_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = sub_42480();
    v15 = &g_e66540;
    v16 = v14 & 0x80000000;
    if (v14 & 0x80000000)
    {
        v17 = arm64g_calculate_condition(25, v16, 0, 0);
        if (!(v17 & 1))
            goto LABEL_38602;
LABEL_38601:
    }
    else
    {
        v18 = arm64g_calculate_condition(25, v16, 0, 0);
        if (v18 & 1)
            goto LABEL_38601;
LABEL_38602:
        v15 = &g_e66538;
    }
    goto *((void *)(*v15));
}
