/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14c30..0xb14c7c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b14c30(long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b27108(*a0);
    if (!v2)
        return v2;
    *a0 = *a0 + a1;
    return v2;
}
