/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22974..0xb229b8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b22974(unsigned long a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w0
    unsigned int v9;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_ab1cb0();
    if (v8)
        v9 = 0;
    else
        v9 = a1 == 6;
    if (v8 != 0x1000)
        return v9;
    return a1 == 912;
}
