/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b0f0..0x6b164 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6b0f0(long long a0, long long a1, unsigned int a2, long long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a2)
    {
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = v12;
        v6 = &v8;
        v7 = v13;
        v0 = sub_a0c8(a1);
        v1 = sub_6b08(a1);
        return sub_6b578(a0, &v0, 1, a3);
    }
}
