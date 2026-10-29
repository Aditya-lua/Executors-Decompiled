/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc689b0..0xc689f4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c689b0(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        *a0 = a1;
        a0[1] = 0;
        a0[5] = sub_a6ee20(sub_a6ee60(), "crypto/packet.c");
    }
}
