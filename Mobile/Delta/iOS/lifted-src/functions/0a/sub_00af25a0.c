/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf25a0..0xaf25fc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af25a0(long long a0, unsigned long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_af2b00(a0, sub_adc09c());
    if (!v8)
        return v8;
    return (int)sub_af27a0() > 0;
}
