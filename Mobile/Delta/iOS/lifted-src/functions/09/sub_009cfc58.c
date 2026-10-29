/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cfc58..0x9cfccc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9cfc58(long long *a0, unsigned int a1)
{
    long long v2;  // x19
    unsigned int iter;  // x20
    unsigned int v4;  // w0
    unsigned int v5;  // w0
    unsigned long long v6;  // 4129
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!v2)
        return 0xffffffff;
    iter = a1;
    v4 = sub_9e46a8(v2);
    if (iter)
    {
        if (!(v4 & 7))
        {
            *(char *)iter = 0;
            iter += 1;
        }
        sub_9e5350(v2, iter);
    }
    v5 = sub_9e46a8(v2);
    v6 = arm64g_calculate_condition(177, v5, 7, 0);
    return (!(v4 & 7)) + ((int)((v6 & 1 ? v5 + 14 : v5 + 7)) >> 3);
}
