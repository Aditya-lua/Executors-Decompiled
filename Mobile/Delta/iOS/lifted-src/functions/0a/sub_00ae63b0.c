/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae63b0..0xae6520 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_ae63b0(unsigned long a0, int *a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (*(long long *)a1)
        sub_ae7138(a2);
    if (a1[2] >= 1)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sOnly User Certificates\n");
    }
    if (a1[3] >= 1)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sOnly CA Certificates\n");
    }
    if (a1[6] >= 1)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sIndirect CRL\n");
    }
    if (*(long long *)&a1[4])
        sub_ae7210(a2, "Only Some Reasons");
    if (a1[7] >= 1)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sOnly Attribute Certificates\n");
    }
    if (!*(long long *)a1 && 0 >= a1[2] && 0 >= a1[3] && 0 >= a1[6] && !*(long long *)&a1[4] && 0 >= a1[7])
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*s<EMPTY>\n");
    }
    return 1;
}
