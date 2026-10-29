/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd3928..0xbd3a2c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_bd3928(unsigned long long *a0, long long a1)
{
    unsigned long long v9;  // x24
    long long v10;  // x22
    unsigned long v11;  // x21
    char v0;  // [bp-0xb8]
    long long *v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0xa0]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 2;
    v4 = 2;
    v5 = a0[1];
    v6 = a0[1] + a0[2] * 128;
    sub_b73064(&v0, &v3);
    v9 = 0;
    do
    {
        if (v2 * 8 == v9)
        {
            v11 = 2;
            if (!v0)
                return 2;
        }
    } while ((v10 = *(long long *)((char *)v1 + v9), v11 = sub_bd33a0(a1, 0, v10) & 0xff, (unsigned int)v11 == 2 && (v11 = sub_bd36a8(v10, a1) & 0xff, (unsigned int)v11 == 2 && (v11 = sub_bd33a0(a1, 1, v10) & 0xff, v9 += 8, (unsigned int)v11 == 2))));
    if (!v0)
        return v11;
    _free(v1);
    return v11;
}
