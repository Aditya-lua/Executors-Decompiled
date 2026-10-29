/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff790..0xaff83c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aff790(long long *a0, long long a1, long long a2, unsigned long a3, long long a4, long long a5)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_954340(a0 + 2))
    {
        v2 = sub_afe0c8(a0 + 2, *a0, "SM3", 0);
        if (!v2)
            return v2;
    }
    if (!a1)
        return sub_ac6d0c(a4, a5, a2) != 0;
}
