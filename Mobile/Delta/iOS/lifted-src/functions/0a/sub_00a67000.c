/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67000..0xa67060 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a67000(char *iter, unsigned long long a1)
{
    unsigned long long v0;  // x2
    unsigned long long v1;  // x1
    unsigned long long v2;  // x3
    unsigned long long v3;  // 4104
    unsigned long long i;  // x1
    unsigned long long v5;  // x2

    v0 = 0;
    do
    {
        v1 = a1;
        if (!v1)
            goto LABEL_0xa67060;
        v2 = 0;
        v3 = arm64g_calculate_condition(4, v1, 0, 0);
        if (v3 & 1)
            goto LABEL_0xa67060;
        a1 = v1;
    } while ((long long)a1 >= 8 && (*(unsigned long long *)iter = 0, iter += 8, v0 += 8, a1 = v1 - 8, 8 <= (long long)v1));
    do
    {
        i = a1;
        v5 = v0;
        *iter = v2;
        v2 >>= 8;
        iter += 1;
        v0 = v5 + 1;
        a1 = i - 1;
    } while (1 < (long long)i);
    return v5 + 1;
}
