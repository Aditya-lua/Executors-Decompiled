/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb16324..0xb163c0 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b16324(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v5;  // x0
    unsigned long v0;  // [bp-0x60]
    long long v1;  // [bp-0x50]
    long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!sub_b26dd8(*a0))
        return 1;
    sub_9f2aec(*a0);
    v0 = a0 + 1;
    v5 = sub_b16098(v2, v1);
    sub_a6c2e4(v2, "providers/implementations/encode_decode/decode_spki2typespki.c", 92);
    return v5;
}
