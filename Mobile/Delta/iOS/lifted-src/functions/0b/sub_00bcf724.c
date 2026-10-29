/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcf724..0xbcf85c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcf724_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_bcf724_0;


unsigned long long sub_bcf724(long long a0, unsigned long a1, unsigned long a2, st_bcf724_0 *a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char v0;  // [bp-0x88]
    long long v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x58], Other Possible Types: unsigned long
    long long v6;  // [bp-0x50], Other Possible Types: unsigned long
    char v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = sub_bcf4ec(&v5, a0, a1);
    if (v5 >= 1)
        v10 = _free(v6);
    if (a4 > a1)
    {
        v2 = a1;
        v3 = a4 - 1;
        v4 = 0;
        sub_b9ebec(&v5, a3->field_8, a3->field_10);
        v10 = sub_bce9f4(&v0, a0, &v2, &v5);
        if (v0 >= 1)
            v10 = _free(v1);
    }
    if (a2 > a5)
    {
        v5 = a5 + 1;
        v6 = a2;
        v7 = 0;
        v11 = sub_bce9f4(&v2, a0, &v5, a3);
        if ((long long)v2 < 1)
            return v11;
        return _free(v3);
    }
    else if (a3->field_0)
    {
        return _free();
    }
    else
    {
        return v10;
    }
}
