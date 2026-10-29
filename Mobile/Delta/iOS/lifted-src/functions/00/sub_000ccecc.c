/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xccecc..0xccf54 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ccecc_0 {
    char field_0;
} st_ccecc_0;


unsigned int sub_ccecc(unsigned long a0, unsigned int a1, unsigned int a2)
{
    unsigned int fp;  // x0
    unsigned int v5;  // w8
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4105
    unsigned int v6;  // x11
    unsigned int v7;  // x13
    unsigned long v8;  // cc_dep1
    unsigned int v9;  // w12
    unsigned long long v10;  // 4105
    unsigned long long v11;  // 4105
    unsigned long v12;  // cc_dep1
    unsigned int v13;  // x9
    st_ccecc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_ccecc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    fp = 0;
    v1 = &v0;
    v0 = &v1;
    v5 = a2 & 3;
    v6 = (unsigned int)"r+b";
    v7 = (unsigned int)"wb";
    if (!(a2 & 8))
        v7 = 0;
    v8 = a2 & 4;
    if (a2 & 4)
    {
        v9 = 1;
        v10 = arm64g_calculate_condition(25, v8, 0, 0);
        if (!(v10 & 1))
            goto LABEL_ccf26;
LABEL_ccf25:
        v7 = v6;
    }
    else
    {
        v9 = (a2 & 8) >> 3;
        v11 = arm64g_calculate_condition(25, v8, 0, 0);
        if (v11 & 1)
            goto LABEL_ccf25;
LABEL_ccf26:
    }
    v12 = v5;
    if (v5 == 1)
    {
        v13 = 1;
        v14 = arm64g_calculate_condition(3, v12, 1, 0);
        if (!(v14 & 1))
            goto LABEL_ccf32;
LABEL_ccf31:
        v7 = (unsigned int)"rb";
    }
    else
    {
        v13 = v9;
        v15 = arm64g_calculate_condition(3, v12, 1, 0);
        if (v15 & 1)
            goto LABEL_ccf31;
LABEL_ccf32:
    }
    if (a1 && v13 & 1)
        fp = _fopen(a1, v7);
    return fp;
}
