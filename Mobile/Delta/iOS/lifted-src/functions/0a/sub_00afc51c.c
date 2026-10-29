/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc51c..0xafc5f0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ebadd0;

unsigned long long sub_afc51c(unsigned long a0, unsigned long long *a1, long long a2)
{
    unsigned long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v6;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    if (a0 && *(long long *)a0)
        v3 = 1;
    else
        v3 = 0;
    v4 = sub_9cae2c(a0, &v0, a2, &g_ebadd0);
    if (!v4)
        return v4;
    v5 = v0;
    if ((long long)(*a1 - v5 + a2) >= 1)
    {
        v6 = v4;
        if (sub_afc7e4(v4 + 336, &v0))
        {
            v4 = v6;
            v5 = v0;
        }
        else if (v3 & 1)
        {
            return 0;
        }
        else
        {
            sub_9cd960(v6, &g_ebadd0);
            if (a0)
            {
                *(unsigned long long *)a0 = 0;
                return 0;
            }
            return 0;
        }
    }
    *a1 = v5;
    return v4;
}
