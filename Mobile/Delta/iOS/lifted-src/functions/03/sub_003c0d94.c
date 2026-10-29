/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c0d94..0x3c0ecc (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c0d94_0 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_3c0d94_0;

typedef struct st_3c0d94_2 {
    struct st_3c0d94_1 *field_0;
} st_3c0d94_2;

typedef struct st_3c0d94_1 {
    char field_0;
} st_3c0d94_1;


unsigned long long sub_3c0d94(st_3c0d94_0 *a0, long long a1, unsigned long a2, long long a3)
{
    long long v4;  // x21
    long long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    long long v9;  // x8
    long long v10;  // x22
    long long v11;  // x20
    st_3c0d94_1 *v0;  // [bp-0x50], Other Possible Types: st_3c0d94_2 **, st_3c0d94_1 **, char
    st_3c0d94_1 **v1;  // [bp-0x48], Other Possible Types: st_3c0d94_2 **, st_3c0d94_1 *
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_0;
    if ((unsigned long long)a3 > (long long)(a0->field_10 - v4) >> 2)
    {
        sub_239b0(a0);
        sub_24db0(a0, sub_a1b0(a0, a3));
        v1 = &v0;
        v0 = &v1;
        v6 = a2 - a1;
        v7 = sub_2bc3c(a0->field_8, a1, v6 >> 2);
        v8 = a0->field_8 + v6;
    }
    else
    {
        v9 = a0->field_8 - v4;
        if ((unsigned long long)a3 <= (unsigned long long)(v9 >> 2))
        {
            v1 = &v0;
            v0 = &v1;
            sub_2bc3c(v4);
            return sub_c84c(a0, v4 + a2 - a1);
        }
        v10 = a1 + v9;
        v0 = &v1;
        v1 = &v0;
        sub_2bc3c(v4);
        v0 = &v1;
        v1 = &v0;
        v11 = a2 - v10;
        v7 = sub_2bc3c(a0->field_8, v10, v11 >> 2);
        v8 = a0->field_8 + v11;
    }
    a0->field_8 = v8;
    return v7;
}
