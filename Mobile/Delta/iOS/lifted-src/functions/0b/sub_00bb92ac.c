/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb92ac..0xbb9324 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bb92ac(unsigned long long *a0, long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long dst;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[2];
    if (v2 == *a0)
        sub_c6c42c(a0);
    dst = _memcpy(a0[1] + 264 * v2, a1, 264);
    a0[2] = v2 + 1;
    return dst;
}
