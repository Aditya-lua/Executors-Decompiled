/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66bf0..0x66c70 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_66bf0(unsigned long long a0, uint128_t *a1, long long a2)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    unsigned long long v15;  // x0
    char v0;  // [bp-0x50]
    uint128_t v1;  // [bp-0x40], Other Possible Types: char
    uint128_t v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a1)
        return a0;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v15 = sub_66dc4(a1);
    if ((unsigned int)v15)
    {
        sub_66d5c(&v0, a0, a2);
        sub_611d8(&v1, &v0);
        v2 = *a1;
        *a1 = v1;
        sub_611fc(&v2);
        v15 = sub_60b78(&v0);
    }
    return v15;
}
