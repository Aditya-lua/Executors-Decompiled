/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa165e8..0xa16638 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a165e8(long long a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1079, "i2d_ECParameters");
        sub_a36abc(16, 0xc0102, 0);
        return 0;
    }
}
