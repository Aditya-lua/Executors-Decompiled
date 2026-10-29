/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989ea4..0x989f20 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_989f20;

long long sub_989ea4(long long *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_977398(a1))
    {
        *a0 = a1;
        a0[3] = 0;
        v2 = sub_ad9428();
        a0[1] = v2;
        if (v2)
        {
            v3 = sub_ad9530(&g_989f20, a0, 1);
            a0[2] = v3;
            if (v3)
                return 1;
            sub_ad94ec(a0 + 1);
        }
    }
    return 0;
}
