/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2cd98..0x2ce6c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2cd98_0 {
    char field_0;
} st_2cd98_0;


unsigned long long sub_2cd98(unsigned int a0, unsigned int a1)
{
    unsigned long long v4;  // x21
    unsigned int v5;  // w0
    st_2cd98_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2cd98_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0 & 0xff;
    if (sub_2db2c(v4))
    {
        return a1 + ((int)(a0) >> 16) + 1;
    }
    else if (sub_2b304(v4))
    {
        return a1 + (a0 >> 24) + 2;
    }
    else
    {
        v5 = sub_30588(v4);
        if (a0 > 0xffffff && v5)
            return a1 + (a0 >> 24) + 1;
        if ((unsigned int)v4 == 67)
            return a1 + ((int)(a0) >> 8) + 1;
        return 0xffffffff;
    }
}
