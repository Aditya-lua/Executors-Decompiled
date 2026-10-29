/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2060..0xbe2154 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be2060(long long a0, unsigned long a1, long long a2)
{
    unsigned long long v5;  // x24
    long long v6;  // x22
    unsigned long long v7;  // x21
    char v0;  // [bp-0x68]
    long long *v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_b76800(&v0, a0, a0 + a1 * 64);
    v5 = 0;
    do
    {
        if (v2 * 8 == v5)
        {
            v7 = 2;
            if (!v0)
                return 2;
        }
    } while ((v6 = *(long long *)((char *)v1 + v5), v7 = sub_be2154(a2, 0, v6) & 0xff, (unsigned int)v7 == 2 && (v7 = sub_bd3c48(v6, a2) & 0xff, (unsigned int)v7 == 2 && (v7 = sub_be2154(a2, 1, v6) & 0xff, v5 += 8, (unsigned int)v7 == 2))));
    if (!v0)
        return v7;
    _free(v1);
    return v7;
}
