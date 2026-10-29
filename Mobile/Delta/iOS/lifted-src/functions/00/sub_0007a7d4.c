/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a7d4..0x7a918 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7a7d4_0 {
    char field_0;
} st_7a7d4_0;


unsigned long long sub_7a7d4(long long a0, long long a1, unsigned long long a2, unsigned int a3, long long a4, unsigned long a5)
{
    long long v5;  // x0
    long long v6;  // x22
    long long v7;  // x23
    long long v8;  // x21
    unsigned long long v9;  // x0
    st_7a7d4_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_7a7d4_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a5;
    v0 = &v1;
    v5 = sub_7ad24(a4, &v2, 4);
    if (19 > v2 >> 8)
    {
        return 0xffffffffffffffbe;
    }
    else if ((unsigned int)a2 > 0xff)
    {
        return 0xffffffffffffffd2;
    }
    else
    {
        if (!a3)
            v6 = 11;
        else
            v6 = a3;
        v7 = v5;
        _bzero();
        sub_79a34(v7 + 8, a1, a2, v7 + 0x1000);
        v8 = sub_79ec8(v7 + 8, a2);
        v9 = sub_7c358(v7 + 8, v8, v6);
        if ((unsigned int)v9 <= 12)
        {
            sub_795b0(a0, v7 + 8, v8, a2, v9);
            return v9 & 0xffffffff;
        }
        return 0xffffffffffffffff;
    }
}
