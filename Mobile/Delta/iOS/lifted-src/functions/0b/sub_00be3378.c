/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe3378..0xbe3484 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be3378(unsigned long long *a0, long long a1)
{
    unsigned long long v9;  // x10
    unsigned long long v10;  // x10
    unsigned long long v11;  // x24
    long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v0;  // [bp-0x88]
    long long *v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    if (*a0 == 12)
        v9 = 0;
    else
        v9 = a0;
    v10 = v9;
    v5 = a0[9];
    v6 = a0[9] + a0[10] * 64;
    v3 = 1;
    v4 = v10;
    sub_b76b48();
    v11 = 0;
    do
    {
        if (v2 * 8 == v11)
        {
            v13 = 2;
            if (!v0)
                return 2;
        }
    } while ((v12 = *(long long *)((char *)v1 + v11), v13 = sub_be2154(a1, 0, v12) & 0xff, (unsigned int)v13 == 2 && (v13 = sub_bd3c48(v12, a1) & 0xff, (unsigned int)v13 == 2 && (v13 = sub_be2154(a1, 1, v12) & 0xff, v11 += 8, (unsigned int)v13 == 2))));
    if (!v0)
        return v13;
    _free(v1);
    return v13;
}
