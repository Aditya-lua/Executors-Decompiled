/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14fd4..0xb150b4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b14fd4(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v4 = sub_afd760(*a0);
    if (!v4)
        return v4;
    v5 = sub_9c0690();
    sub_9d3c28(v4);
    if (v5 >> 31 & 1)
        return 1;
    sub_a6c2e4(v1, "providers/implementations/encode_decode/decode_epki2pki.c", 107);
    sub_9f2aec(*a0);
    v0 = a0 + 1;
    v6 = sub_b14c7c(*(long long *)(v1 + 8), *(long long *)v1);
    sub_a6c2e4(*(long long *)(v1 + 8), "providers/implementations/encode_decode/decode_epki2pki.c", 112);
    return v6;
}
