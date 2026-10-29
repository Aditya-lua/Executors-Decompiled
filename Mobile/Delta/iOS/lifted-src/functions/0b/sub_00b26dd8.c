/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26dd8..0xb26e60 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b26dd8(unsigned long a0, unsigned long a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long v5;  // x9
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_afd760();
    if (!v3)
        return 0;
    v4 = sub_9c0690();
    if (!(v4 >> 31 & 1))
    {
        v5 = *(long long *)v0;
        *a2 = *(long long *)(v0 + 8);
        *a3 = v5;
        sub_a6c2e4(v0, "providers/implementations/encode_decode/endecoder_common.c", 99);
    }
    sub_9d3c28(v3);
    return ~(unsigned int)v4 >> 31;
}
