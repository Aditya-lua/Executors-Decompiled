/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6c878..0x6c92c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f0d180;

unsigned long long sub_6c878(long long a0, long long a1, long long a2)
{
    unsigned long long v4;  // x0
    unsigned long idx;  // x8
    unsigned long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!(sub_6bb1c(a1) & 1))
    {
        v4 = sub_74f58(a0, 1007, &g_f0d180, 0, 0);
        *(unsigned short *)idx = 0;
        *(unsigned long long *)(idx + 8) = 0;
        *(unsigned long long *)(idx + 16) = 0;
        return v4;
    }
    v0 = sub_a0c8(a1);
    v1 = sub_6b08(a1);
    return sub_6b578(a0, &v0, 0, a2);
}
