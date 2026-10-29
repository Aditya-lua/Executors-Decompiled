/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4a7f8..0xc4a854 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c4a7f8(long long *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long *v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0 + 1;
    do
    {
        v13 = a1;
        if (*(long long *)((char *)v12 - 8))
            _free(*v12);
    } while ((v12 += 3, a1 = v13 - 1, v13 != 1));
    _free();
    return;
}
