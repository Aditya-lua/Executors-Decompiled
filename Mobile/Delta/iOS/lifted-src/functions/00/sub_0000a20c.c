/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20c..0xa2d8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20c_3 {
    struct st_a20c_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_a20c_3;

typedef struct st_a20c_1 {
    struct st_a20c_2 *field_0;
} st_a20c_1;

typedef struct st_a20c_2 {
    struct st_a20c_1 *field_0;
} st_a20c_2;

typedef struct st_a20c_0 {
    char field_0;
} st_a20c_0;


long long sub_a20c(st_a20c_3 *a0)
{
    unsigned long v4;  // x13
    unsigned long v5;  // x9
    unsigned int v6;  // w8
    unsigned long v7;  // x11
    unsigned long v8;  // x10
    char *v9;  // x12
    st_a20c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_a20c_0 *v1;  // [bp-0x18]
    st_a20c_2 **v2;  // [bp-0x10]
    st_a20c_2 **v3;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    v4 = a0->field_10;
    v5 = a0->field_8;
    if (v5 > v4)
    {
        v6 = *(char *)&a0->field_0[v4];
        v7 = (unsigned int)v4 + 1;
        a0->field_10 = v7;
        v2 = &v3;
        v3 = &v2;
        if (v5 <= v7)
            goto LABEL_a2ac;
LABEL_a258:
        v8 = 0;
        v9 = a0->field_0;
        do
        {
            if (v9[v7] != 61)
            {
                if (v6 == v9[v7])
                    return v8 & 0xffffffff;
                return ~(unsigned int)v8;
            }
        } while ((v7 = (unsigned int)v4 + 2 + v8, a0->field_10 = v7, v8 = (unsigned int)v8 + 1, v2 = &v3, v3 = &v2, v7 < v5));
    }
    else
    {
        v6 = 0;
        v7 = (unsigned int)v4 + 1;
        a0->field_10 = v7;
        v2 = &v3;
        v3 = &v2;
        if (v7 < v5)
            goto LABEL_a258;
LABEL_a2ac:
        v8 = 0;
    }
    if (v6)
        return ~(unsigned int)v8;
    return v8 & 0xffffffff;
}
