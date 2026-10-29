/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dbad4..0x9dbbc8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9dbad4(unsigned long long *iter, unsigned long long *node, unsigned long long *a2, unsigned long long i)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // 4222
    unsigned long long v11;  // x8
    unsigned long v12;  // 4229
    unsigned long long v13;  // 4243
    unsigned long v14;  // x10
    unsigned long v15;  // 4255
    unsigned long long v16;  // x8
    unsigned long v17;  // 4262
    unsigned long long v18;  // 4276
    unsigned long long v19;  // 4289
    unsigned long long v2;  // x10
    unsigned long long v20;  // w3
    unsigned long long *v21;  // x1
    unsigned long long v22;  // x10
    unsigned long long *v23;  // x2
    unsigned long long v24;  // 4130
    unsigned long v25;  // x11
    unsigned long long v26;  // 4141
    unsigned long long v3;  // 4179
    unsigned long v4;  // x11
    unsigned long v5;  // 4189
    unsigned long long v6;  // x8
    unsigned long v7;  // 4196
    unsigned long long v8;  // 4210
    unsigned long v9;  // x10

    if (i < 1)
        return 0;
    if (4 > i)
    {
        v0 = 0;
    }
    else
    {
        v0 = 0;
        do
        {
            v1 = *node;
            v2 = v1 + v0;
            v3 = arm64g_calculate_condition(50, v2, *a2, 0);
            v4 = !(v3 & 1);
            *iter = v2 + *a2;
            v5 = arm64g_calculate_flag_c(2, v1, v0, 0);
            v6 = node[1] + v4 + v5;
            v7 = arm64g_calculate_flags_nzcv(6, node[1], v4, v5);
            v8 = arm64g_calculate_condition(50, v6, a2[1], 0);
            v9 = !(v8 & 1);
            iter[1] = v6 + a2[1];
            v10 = arm64g_calculate_flag_c(0, v7 & 0xffffffff & 0xf0000000, 0, 0);
            v11 = node[2] + v9 + v10;
            v12 = arm64g_calculate_flags_nzcv(6, node[2], v9, v10);
            v13 = arm64g_calculate_condition(50, v11, a2[2], 0);
            v14 = !(v13 & 1);
            iter[2] = v11 + a2[2];
            v15 = arm64g_calculate_flag_c(0, v12 & 0xffffffff & 0xf0000000, 0, 0);
            v16 = node[3] + v14 + v15;
            v17 = arm64g_calculate_flags_nzcv(6, node[3], v14, v15);
            v18 = arm64g_calculate_condition(50, v16, a2[3], 0);
            v0 = !(v18 & 1);
            v19 = arm64g_calculate_condition(48, v17 & 0xffffffff & 0xf0000000, 0, 0);
            if (!(v19 & 1))
                v0 += 1;
            iter[3] = v16 + a2[3];
            node += 4;
            a2 += 4;
            iter += 4;
            i -= 4;
        } while (4 <= i);
        if (!i)
            return v0;
    }
    do
    {
        v20 = i;
        v21 = node + 1;
        v22 = *node + v0;
        v23 = a2 + 1;
        v24 = arm64g_calculate_condition(50, v22, *a2, 0);
        v25 = !(v24 & 1);
        v26 = arm64g_calculate_condition(50, *node, v0, 0);
        if (v26 & 1)
            v0 = v25;
        else
            v0 = v25 + 1;
        *iter = v22 + *a2;
        iter += 1;
        i = v20 - 1;
        node = v21;
        a2 = v23;
    } while (i);
    return v0;
}
