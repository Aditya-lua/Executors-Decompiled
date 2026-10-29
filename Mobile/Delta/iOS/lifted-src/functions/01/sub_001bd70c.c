/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd70c..0x1bd7f8 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bd70c_3 {
    long long field_0;
    unsigned long long field_8;
    char field_10;
} st_1bd70c_3;

typedef struct st_1bd70c_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
} st_1bd70c_2;

typedef struct st_1bd70c_1 {
    unsigned int field_0;
    char padding_4[12];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[32];
    unsigned long long field_50;
} st_1bd70c_1;

typedef struct st_1bd70c_0 {
    char field_0;
} st_1bd70c_0;


st_1bd70c_2 * sub_1bd70c(st_1bd70c_2 *a0, st_1bd70c_1 *a1)
{
    unsigned long long v4;  // x8
    st_1bd70c_3 *v5;  // x8
    st_1bd70c_2 *v6;  // x0
    long long v7;  // x19
    long long v8;  // x20
    st_1bd70c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bd70c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_10;
    if (((long long)(a1->field_28 - a1->field_20) >> 3) * 12297829382473034411 >= v4)
    {
        v5 = a1->field_20 + ((unsigned int)v4 - 1) * 24;
        v6 = a0;
        if (v5->field_10 == 1)
        {
            v7 = v5->field_8 - v5->field_0;
            v8 = a1->field_10;
            v6 = a0;
            if ((long long)(a1->field_18 - v8) >= v7)
            {
                v6 = _memcmp(v5->field_0, v8, v7);
                a1 = a1;
                if (!(unsigned int)v6)
                {
                    a1->field_0 = 0xfffffc1e;
                    a1->field_10 = v8 + v7;
                    a1->field_50 = a0->field_8;
                    return v6;
                }
            }
        }
        a1->field_0 = 0xfffffc1f;
        a1->field_50 = 0;
        return v6;
    }
    sub_1b1564();
}
