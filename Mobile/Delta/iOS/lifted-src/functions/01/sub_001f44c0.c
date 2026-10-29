/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f44c0..0x1f451c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_1f44c0(unsigned int *a0, unsigned int *a1)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4118
    unsigned long long v10;  // 4128
    unsigned long long v11;  // 4147
    unsigned int v12;  // w9
    unsigned int v13;  // w8
    unsigned int v2;  // w9
    unsigned long long v3;  // 4128
    unsigned long long v4;  // 4147
    unsigned int v5;  // w9
    unsigned int v6;  // w8
    unsigned int v7;  // w8
    unsigned long long v8;  // 4118
    unsigned int v9;  // w9

    v0 = *a0;
    v1 = arm64g_calculate_condition(1, v0, 1, 0);
    if (!(v1 & 1))
    {
        v2 = *a1;
        v3 = arm64g_calculate_condition(0x11, v2, 1, 0);
        v4 = arm64g_calculate_condition(49, v2, v0, 0);
        if (v4 & 1)
            v5 = !(v3 & 1);
        else
            v5 = 1;
        if (!v5)
            v6 = v2 + v0;
        else
            v6 = 0xffffffff;
        *a0 = v6;
    }
    v7 = a0[1];
    v8 = arm64g_calculate_condition(1, v7, 1, 0);
    if (v8 & 1)
        return a0;
    v9 = a1[1];
    v10 = arm64g_calculate_condition(0x11, v9, 1, 0);
    v11 = arm64g_calculate_condition(49, v9, v7, 0);
    if (v11 & 1)
        v12 = !(v10 & 1);
    else
        v12 = 1;
    if (!v12)
        v13 = v9 + v7;
    else
        v13 = 0xffffffff;
    a0[1] = v13;
    return a0;
}
