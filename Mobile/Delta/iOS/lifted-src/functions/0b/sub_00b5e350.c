/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e350..0xb5e3a8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5e350(long long a0, long long a1, unsigned long long *a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b5dfd0(a0, a1, a2, 0, 0);
    if (!(unsigned int)v3)
        return v3;
    *a2 = 0;
    return 1;
}
