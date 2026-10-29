/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9dd34..0xa9ddf0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9dd34(unsigned long long *a0, long long a1, long long a2, unsigned long a3, long long a4, long long a5)
{
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    if (!sub_a9c07c(&v1, &v0, 0, a1, a2, a4, a5))
        return 0;
    v2 = v1;
    a0();
}
