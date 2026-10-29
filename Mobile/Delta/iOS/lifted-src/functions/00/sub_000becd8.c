/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbecd8..0xbed64 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_becd8_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[224];
    unsigned int field_110;
} st_becd8_1;

typedef struct st_becd8_0 {
    char field_0;
} st_becd8_0;


st_becd8_1 * sub_becd8(st_becd8_1 *a0, unsigned long a1, long long a2)
{
    unsigned long long v4;  // x22
    unsigned long v5;  // x24
    st_becd8_1 *v6;  // x0
    st_becd8_1 *v7;  // x0
    st_becd8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_becd8_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1 - a0->field_8;
    v5 = a0->field_2c;
    v6 = a0;
    if ((unsigned int)v4 > (unsigned int)v5)
    {
        do
        {
            v6 = sub_b570c(a0, a0->field_8 + (v5 & 0xffffffff), a2, v4, a0->field_110, 0);
            v5 = &v6->padding_0[v5];
        } while ((unsigned int)v5 < (unsigned int)v4);
    }
    v7 = v6;
    a0->field_2c = v4;
    return v7;
}
