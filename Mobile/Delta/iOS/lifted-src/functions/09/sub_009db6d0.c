/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db6d0..0x9db7cc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9db6d0(unsigned long long *iter, void* node, unsigned long long i, unsigned long long a3)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v10;  // 4340
    unsigned long long v11;  // x9
    unsigned long long v12;  // x10
    unsigned long v13;  // x12
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4341
    unsigned long v16;  // 4346
    unsigned long long v17;  // x8
    unsigned long long v18;  // x9
    unsigned long long v19;  // x8
    unsigned long v2;  // x12
    unsigned long long v20;  // 4348
    unsigned long v21;  // 4352
    unsigned long long v22;  // w2
    void* v23;  // x1
    unsigned long long v24;  // x9
    unsigned long long v25;  // x8
    unsigned long long v26;  // 4168
    unsigned long v27;  // 4172
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4330
    unsigned long v5;  // 4334
    unsigned long long v6;  // x9
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4336

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
            v1 = a3 * *(long long *)node;
            v2 = iter[1];
            v3 = *iter + v0;
            v4 = arm64g_calculate_condition(50, *iter, v0, 0);
            v5 = arm64g_calculate_flag_c(2, v3, v1, 0);
            v6 = !(v4 & 1) + (*(long long *)node * a3 >> 64) + v5;
            *iter = v3 + v1;
            v7 = a3 * (long long)node[8];
            v8 = v6 + v2;
            v9 = arm64g_calculate_condition(50, v6, v2, 0);
            v10 = arm64g_calculate_flag_c(2, v8, v7, 0);
            v11 = !(v9 & 1) + ((long long)node[8] * a3 >> 64) + v10;
            iter[1] = v8 + v7;
            v12 = a3 * (long long)node[16];
            v13 = iter[3];
            v14 = v11 + iter[2];
            v15 = arm64g_calculate_condition(50, v11, iter[2], 0);
            v16 = arm64g_calculate_flag_c(2, v14, v12, 0);
            v17 = !(v15 & 1) + ((long long)node[16] * a3 >> 64) + v16;
            iter[2] = v14 + v12;
            v18 = a3 * (long long)node[24];
            v19 = v17 + v13;
            v20 = arm64g_calculate_condition(50, v17, v13, 0);
            v21 = arm64g_calculate_flag_c(2, v19, v18, 0);
            v0 = !(v20 & 1) + ((long long)node[24] * a3 >> 64) + v21;
            iter[3] = v19 + v18;
            node += 32;
            iter += 4;
            i -= 4;
        } while (4 <= i);
        if (!i)
            return v0;
    }
    do
    {
        v22 = i;
        v23 = node + 8;
        v24 = a3 * *(long long *)node;
        v25 = *iter + v0;
        v26 = arm64g_calculate_condition(50, *iter, v0, 0);
        v27 = arm64g_calculate_flag_c(2, v25, v24, 0);
        v0 = !(v26 & 1) + (*(long long *)node * a3 >> 64) + v27;
        *iter = v25 + v24;
        iter += 1;
        i = v22 - 1;
        node = v23;
    } while (i);
    return v0;
}
