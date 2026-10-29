/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86bf4..0xb86c48 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b86bf4(unsigned long long *a0)
{
    unsigned long long v11;  // x9
    unsigned long long v12;  // x8
    unsigned long long v0;  // [bp-0x58]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = *a0;
    if (v11)
    {
        v12 = a0[2];
        v1 = 0;
        v2 = v11;
        v3 = a0[1];
        v5 = 0;
        v6 = v11;
        v7 = a0[1];
        v11 = 1;
    }
    else
    {
        v12 = 0;
    }
    v0 = v11;
    v4 = v11;
    v8 = v12;
    return sub_b86c48(&v0);
}
