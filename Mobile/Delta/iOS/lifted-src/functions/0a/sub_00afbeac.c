/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafbeac..0xafbf08 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_afbeac(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, long long a5)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9cf6d4(*a0);
    if (!(unsigned int)v2)
        return v2;
    if (!a4)
        return 1;
    sub_9c79a0(a0[1], a4, a5);
    sub_9c76f4(a0[1], 0);
    return 1;
}
