/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafce20..0xafcec0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ec2f18;

long long sub_afce20(long long a0, long long a1, unsigned long long *a2, long long *a3)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b5b0e4();
    *a3 = v2;
    if (v2)
    {
        v3 = sub_a67f7c(a0, a1);
        if (v3)
        {
            sub_b5b108(*a3, v3);
            sub_b5b114(*a3, a0);
            *a2 = &g_ec2f18;
            return 1;
        }
    }
    sub_a67ea4(0);
    sub_a67ea4(sub_9f2aec(*a3));
    sub_b5b0f8(*a3);
    *a3 = 0;
    return 0;
}
