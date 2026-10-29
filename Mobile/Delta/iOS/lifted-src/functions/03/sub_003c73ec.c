/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c73ec..0x3c7590 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c73ec_1 {
    struct st_3c73ec_2 *field_0;
    struct st_3c73ec_2 *field_8;
    struct st_3c73ec_2 *field_10;
    struct st_3c73ec_2 *field_18;
    long long field_20;
} st_3c73ec_1;

typedef struct st_3c73ec_2 {
    unsigned long long field_0;
} st_3c73ec_2;

typedef struct st_3c73ec_0 {
    char field_0;
} st_3c73ec_0;


long long sub_3c73ec(st_3c73ec_1 *a0)
{
    unsigned long long *v12;  // x8
    st_3c73ec_1 *v13;  // x0
    unsigned long long *i;  // x20
    unsigned long long *v15;  // q2
    st_3c73ec_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3c73ec_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    st_3c73ec_1 *v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    unsigned long long *v6;  // [bp-0x50]
    unsigned long long *v7;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long long *v8;  // [bp-0x48]
    unsigned long long *v9;  // [bp-0x40]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)a0->field_20 >= 0x200)
    {
        a0->field_20 = a0->field_20 - 0x200;
    }
    else
    {
        v12 = a0->field_18;
        if (v12 - a0->field_0 > a0->field_10 - a0->field_8)
        {
            v13 = a0;
            if (v12 != a0->field_10)
            {
                v7 = sub_12a38(v13, 0x200);
                return sub_3c6d18(a0, &v7);
            }
            v7 = sub_12a38(v13, 0x200);
            sub_3c653c(a0, &v7);
        }
        else
        {
            sub_ec54();
            v3 = sub_12a38(a0, 0x200);
            v4 = a0;
            v5 = 0x200;
            v2 = v3;
            sub_3c6adc(&v7, &v2);
            v3 = 0;
            i = a0->field_10;
            while (i != a0->field_8)
            {
                sub_3c6914(&v7, (char *)i - 8);
            }
            v6 = a0->field_0;
            v8 = a0->field_8;
            v15 = (unsigned long long *)*(int128_t *)&a0->field_10;
            *(uint128_t *)&a0->field_0 = (uint128_t)v7;
            *(uint128_t *)&a0->field_10 = (uint128_t)v9;
            v9 = v15;
            sub_2217c(&v3, 0);
            return sub_1089c(&v6);
        }
    }
    v7 = *(long long *)a0->field_8;
    a0->field_8 = a0->field_8 + 1;
    return sub_3c6794(a0, &v7);
}
