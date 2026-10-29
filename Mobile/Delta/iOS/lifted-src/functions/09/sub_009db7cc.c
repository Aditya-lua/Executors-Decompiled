/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db7cc..0x9db89c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9db7cc(unsigned long long *node, void* iter, unsigned long long i, unsigned long long a3)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x9
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x10
    unsigned long long v13;  // x8
    unsigned long long v14;  // w2
    void* v15;  // x1
    unsigned long long v16;  // x10
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4124
    unsigned long long v2;  // x9
    unsigned long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long v5;  // 4178
    unsigned long long v6;  // x10
    unsigned long v7;  // x8
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9

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
            v1 = *(long long *)iter;
            v2 = a3 * *(long long *)iter;
            *node = v0 + v2;
            v3 = (long long)iter[8];
            v4 = a3 * (long long)iter[8];
            v5 = arm64g_calculate_flag_c(2, v0, v2, 0);
            v6 = v4 + (v1 * a3 >> 64) + v5;
            node[1] = v6;
            v7 = (long long)iter[16];
            v8 = a3 * (long long)iter[16];
            v9 = v8 + (v3 * a3 >> 64);
            if (v4 > v6)
                v9 += 1;
            node[2] = v9;
            v10 = (long long)iter[24] * a3 >> 64;
            v11 = a3 * (long long)iter[24];
            v12 = v11 + (v7 * a3 >> 64);
            if (v8 > v9)
                v12 += 1;
            if (v11 <= v12)
                v0 = v10;
            else
                v0 = v10 + 1;
            node[3] = v12;
            iter += 32;
            node += 4;
            i -= 4;
        } while (4 <= i);
        if (!i)
            return v0;
    }
    do
    {
        v13 = v0;
        v14 = i;
        v15 = iter + 8;
        v16 = *(long long *)iter * a3 >> 64;
        v17 = a3 * *(long long *)iter;
        v18 = arm64g_calculate_condition(50, v13, v17, 0);
        if (v18 & 1)
            v0 = v16;
        else
            v0 = v16 + 1;
    } while ((*node = v13 + v17, node += 1, i = v14 - 1, iter = v15, v14 != 1));
    return v0;
}
