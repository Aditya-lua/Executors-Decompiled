/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea3a0..0xaea454 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_aea3a0(unsigned long a0, long long *a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a3;
    v1 = &g_c7c2eb;
    sub_9d524c(a2, "%*s");
    if (*a1)
    {
        sub_9d3fec(a2, "Not Before: ", 12);
        sub_9c0ef0(a2, *a1);
        if (a1[1])
            sub_9d3fec(a2, ", ", 2);
    }
    if (!a1[1])
        return 1;
    sub_9d3fec(a2, "Not After: ", 11);
    sub_9c0ef0(a2, a1[1]);
    return 1;
}
