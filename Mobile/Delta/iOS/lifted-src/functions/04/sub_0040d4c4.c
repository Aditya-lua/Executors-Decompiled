/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40d4c4..0x40d5f8 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40d4c4_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned int field_28;
} st_40d4c4_1;

typedef struct st_40d4c4_0 {
    char field_0;
} st_40d4c4_0;


unsigned long long sub_40d4c4(double a0)
{
    unsigned long v4;  // x11
    unsigned long long v5;  // x9
    unsigned long long v14;  // x0
    unsigned int v15;  // w23
    unsigned long long v16;  // x1
    unsigned long long v17;  // x0
    st_40d4c4_1 *v18;  // x8
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x20
    unsigned int v9;  // w10
    unsigned long long v10;  // x21
    char v11;  // x25
    unsigned long long v12;  // x24
    unsigned long v13;  // x1
    st_40d4c4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_40d4c4_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = __double_as_longlong(a0);
    v5 = (v4 & 0xfff0000000000000 ^ 0xfff0000000000001 ^ v4 + 0xfffffffffffff) + ((v4 & 0xfff0000000000000 ^ 0xfff0000000000001) & v4 + 0xfffffffffffff) * 2;
    v6 = v4 >> 52;
    if (!v6)
    {
        v7 = v5 * 2;
        v8 = 0xfffffbce;
        v9 = 0xfffffbce;
        goto LABEL_40d56c;
    }
    else
    {
        v10 = v5 + 0x10000000000000;
        v9 = ((unsigned int)v6 | 1) + 0xfffffbcc + (((unsigned int)v4 * 0x1000 | (unsigned int)(v4 >> 52)) & 0xfffff001 & 1);
        v8 = v9;
        v7 = v10 * 2;
        if (v4 > 0x1fffffffffffff && !v5)
        {
            v11 = v9 - 2;
            v12 = 0x3fffffffffffff;
            v5 = v10;
        }
        else
        {
            v5 = v10;
LABEL_40d56c:
            v11 = (v9 | 1) + (v9 & 1) - 2;
            v12 = v7 - 1;
        }
    }
    v13 = ~(unsigned int)v8 + (unsigned int)v8 * 2;
    v14 = sub_41e848(v7 | 1, v13);
    v15 = v13;
    v16 = v8;
    v17 = sub_41e848(v5, v16);
    v18->field_0 = v17;
    v18->field_8 = v16;
    v18->field_10 = v12 << ((v11 ^ (char)-v15) + (char)(v11 - v15 - (v11 | -v15 & 0xff)) * 2 & 63);
    v18->field_18 = v15;
    v18->field_20 = v14;
    v18->field_28 = v15;
    return v17;
}
