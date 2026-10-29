/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01ef4..0xb01f58 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b01ef4(unsigned long long *a0, unsigned long long *a1)
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

    *a0 = 0;
    if (!*a1)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a4bc70();
    *a0 = v8;
    if (v8 && sub_a4de68())
        return 1;
    sub_a4bca0();
    *a0 = 0;
    return 0;
}
