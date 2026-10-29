/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41380..0x413c0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_41380(long long *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_2e560(*a0, a2, a3);
    if (v2 & 1)
        return v2;
    sub_45808(a1 + 12, "Exceeded jump distance limit; simplify the code to compile");
}
