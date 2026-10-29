/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23c58..0xb23cb4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long sub_b23c58(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a198c4();
    sub_a198cc(a0, (unsigned int)v2 | 1);
    v3 = sub_a1633c(a0, a1);
    sub_a198cc(a0, v2);
    return v3;
}
