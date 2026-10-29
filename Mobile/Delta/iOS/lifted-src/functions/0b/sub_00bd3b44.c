/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd3b44..0xbd3c48 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd3b44(unsigned long long *a0, long long a1)
{
    unsigned long long v9;  // x24
    long long v10;  // x22
    unsigned long long v11;  // x21
    char v0;  // [bp-0x88]
    long long *v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 1;
    v4 = a0[6];
    v5 = a0[4];
    v6 = a0[4] + a0[5] * 64;
    sub_b76920(&v0, &v3);
    v9 = 0;
    do
    {
        if (v2 * 8 == v9)
        {
            v11 = 2;
            if (!v0)
                return 2;
        }
    } while ((v10 = *(long long *)((char *)v1 + v9), v11 = sub_bd33a0(a1, 0, v10) & 0xff, (unsigned int)v11 == 2 && (v11 = sub_bd3c48(v10, a1) & 0xff, (unsigned int)v11 == 2 && (v11 = sub_bd33a0(a1, 1, v10) & 0xff, v9 += 8, (unsigned int)v11 == 2))));
    if (!v0)
        return v11;
    _free(v1);
    return v11;
}
