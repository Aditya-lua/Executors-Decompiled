/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999cbc..0x999d14 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_999cbc_0 {
    char padding_0[4072];
    unsigned int field_fe8;
} st_999cbc_0;


st_999cbc_0 * sub_999cbc(st_999cbc_0 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x10
    unsigned long long v10;  // 4105
    unsigned long long v11;  // 4105
    unsigned long long v2;  // x11
    unsigned long long v3;  // x12
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // x13
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // x9

    v0 = a0->field_fe8;
    v1 = "read header";
    v2 = "unknown";
    v3 = "read body";
    v4 = v0;
    if (v0 != 241)
    {
        v5 = "unknown";
        v6 = arm64g_calculate_condition(19, v4, 241, 0);
        if (!(v6 & 1))
            goto LABEL_999cf2;
LABEL_999cf1:
    }
    else
    {
        v5 = "RB";
        v7 = arm64g_calculate_condition(19, v4, 241, 0);
        if (v7 & 1)
            goto LABEL_999cf1;
LABEL_999cf2:
        v2 = v3;
    }
    v8 = v0;
    if (v0 == 240)
    {
        v9 = "RH";
        v10 = arm64g_calculate_condition(3, v8, 240, 0);
        if (!(v10 & 1))
            goto LABEL_999cfe;
LABEL_999cfd:
        v2 = v1;
    }
    else
    {
        v9 = v5;
        v11 = arm64g_calculate_condition(3, v8, 240, 0);
        if (v11 & 1)
            goto LABEL_999cfd;
LABEL_999cfe:
    }
    if (a1)
        *a1 = v9;
    if (a2)
        *a2 = v2;
    return a0;
}
