/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10e6c..0x11094 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10e6c_1 {
    char padding_0[96];
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    unsigned long long field_84;
} st_10e6c_1;

typedef struct st_10e6c_0 {
    char field_0;
} st_10e6c_0;


unsigned long long sub_10e6c(st_10e6c_1 *a0, char *a1, unsigned int a2)
{
    unsigned int v8;  // w8
    unsigned long v9;  // x22
    st_10e6c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_10e6c_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned int v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x44]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = a0->field_80;
    if (v8 != 33 && v8 != 124 && v8 != 38)
        return 0;
    v9 = *(long long *)&(&a0->field_80)[1];
    sub_b1a4(&a0->field_60);
    if (a0->field_80 == 38 && v4 == 38 && sub_dd5c((char *)&a0->field_84 + 4, &v4 | 4) && a1[28] > a2)
    {
        sub_f8d0(a0);
        v2 = v9;
        v3 = v5;
        sub_1db64(a0, &v2, "Unexpected '&&'; did you mean 'and'?");
        return 4294967310;
    }
    if (a0->field_80 == 124 && v4 == 124 && sub_dd5c((char *)&a0->field_84 + 4, &v4 | 4) && a1[30] > a2)
    {
        sub_f8d0(a0);
        v2 = v9;
        v3 = v5;
        sub_1db64(a0, &v2, "Unexpected '||'; did you mean 'or'?");
        return 4294967311;
    }
    if (a0->field_80 != 33)
    {
        return 0;
    }
    else if (v4 == 61)
    {
        if (!sub_dd5c((char *)&a0->field_84 + 4, &v4 | 4) || a1[16] <= a2)
            return 0;
        sub_f8d0(a0);
        v2 = v9;
        v3 = v5;
        sub_1db64(a0, &v2, "Unexpected '!='; did you mean '~='?");
        return 4294967304;
        return 0;
    }
    else
    {
        return 0;
    }
}
