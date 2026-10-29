/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16c50..0xa16d00 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_e8ef40;
extern unsigned int g_e8ef50;
extern unsigned int g_e8ef60;

long long sub_a16c50(long long a0, long long a1)
{
    long long v2;  // x20
    unsigned int *v3;  // x8
    unsigned long long v4;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (!a1)
    {
        sub_a198f0(a0, 0x6000);
        sub_a197a8(a0, v2);
        return 1;
    }
    if (!sub_a6e200(v2, "default"))
    {
        v3 = &g_e8ef40;
    }
    else if (!sub_a6e200(v2, "named"))
    {
        v3 = &g_e8ef50;
    }
    else if (!sub_a6e200(v2, "named-nist"))
    {
        v3 = &g_e8ef60;
    }
    else
    {
        return 0;
    }
    v2 = *v3;
    v4 = arm64g_calculate_condition(1, v2 & 0xffffffff, 1, 0);
    if (v4 & 1)
        return 0;
    sub_a198f0(a0, 0x6000);
    sub_a197a8(a0, v2);
    return 1;
}
