/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb659ec..0xb65a28 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

int sub_b659ec(unsigned long long a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    return _malloc(a2 * a1 & 0xffffffff);
}
