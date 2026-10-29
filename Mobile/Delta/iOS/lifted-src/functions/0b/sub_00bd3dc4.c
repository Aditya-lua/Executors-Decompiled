/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd3dc4..0xbd3ec8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd3dc4(unsigned long long *a0, long long a1)
{
    unsigned long long v9;  // x21
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
    v4 = a0[3];
    v5 = a0[1];
    v6 = a0[1] + a0[2] * 64;
    sub_b76920(&v0, &v3);
    if (v2 * 8)
    {
        v9 = sub_bd33a0(a1, 0, *v1) & 0xff;
        if ((unsigned int)v9 == 2)
        {
            sub_bd3c48(*v1, a1);
        }
        else if (!v0)
        {
            return v9;
        }
    }
    else
    {
        v9 = 2;
        if (!v0)
            return 2;
    }
    _free(v1);
    return v9;
}
