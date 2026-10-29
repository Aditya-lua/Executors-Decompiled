/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b16ac..0x1b185c (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b16ac_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[52];
    unsigned long long field_40;
    char padding_48[16];
    unsigned long long field_58;
    unsigned long long field_60;
} st_1b16ac_1;

typedef struct st_1b16ac_0 {
    char field_0;
} st_1b16ac_0;


long long sub_1b16ac(st_1b16ac_1 *a0, unsigned long ptr, unsigned long a2)
{
    unsigned long v12;  // x22
    unsigned long long *v13;  // x23
    unsigned long v14;  // x9
    unsigned long v15;  // x0
    st_1b16ac_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1b16ac_0 *v1;  // [bp-0x88]
    char *v2;  // [bp-0x80]
    char *v3;  // [bp-0x78]
    char *v4;  // [bp-0x70]
    char *v5;  // [bp-0x68]
    unsigned int v6;  // [bp-0x5c]
    unsigned long v7;  // [bp-0x58]
    unsigned long v8;  // [bp-0x50]
    unsigned int v9;  // [bp-0x44]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    if (a2 < 0x7fffffffffffffff)
        v12 = a2;
    else
        v12 = 0x7fffffffffffffff;
    v13 = &a0->field_58;
    v14 = a0->field_60 - a0->field_58;
    if (a0->field_60 > a0->field_58)
    {
        if (v12 >= v14)
            v12 = v14;
        _memcpy();
        a0->field_58 = a0->field_58 + v12;
        return v12;
    }
    else if (sub_1bdfd0(a0))
    {
        *v13 = 0;
        v13[1] = 0;
        if (0xfff < a2)
        {
            v9 = a0->field_8;
            v7 = v12;
            v8 = ptr;
            v6 = 0;
            v2 = &v9;
            v3 = &v8;
            v4 = &v7;
            v5 = &v6;
            return sub_1b5e8c(&v2);
        }
        v9 = a0->field_8;
        v7 = 0x1000;
        v8 = a0->field_40;
        v6 = 0;
        v2 = &v9;
        v3 = &v8;
        v4 = &v7;
        v5 = &v6;
        v15 = sub_1b5e8c(&v2);
        if ((long long)v15 < 1)
        {
            return v15;
        }
        else if (v15 > a2)
        {
            _memcpy(ptr);
            a0->field_58 = v12;
            a0->field_60 = v15;
            return a2;
        }
        else
        {
            _memcpy(ptr);
            return v15;
        }
    }
    else
    {
        return 0xffffffffffffffff;
    }
}
