/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ede0..0x1ef30 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ede0_1 {
    char padding_0[128];
    unsigned int field_80;
    char padding_84[20];
    long long field_98;
} st_1ede0_1;

typedef struct st_1ede0_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_1ede0_3;

typedef struct st_1ede0_2 {
    struct st_1ede0_0 *field_0;
} st_1ede0_2;

typedef struct st_1ede0_0 {
    char field_0;
} st_1ede0_0;


unsigned long long sub_1ede0(st_1ede0_1 *a0, unsigned long long *a1)
{
    unsigned int v6;  // w0
    long long v7;  // x0
    st_1ede0_3 *v16;  // x8
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    st_1ede0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1ede0_0 *v1;  // [bp-0x48]
    st_1ede0_0 **v2;  // [bp-0x40], Other Possible Types: st_1ede0_2 **, char
    st_1ede0_0 *v3;  // [bp-0x38], Other Possible Types: st_1ede0_2 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_b19c(&a0->field_80);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&a0[7].padding_0[40], a0->field_98, v6);
    if (a1)
    {
        v3 = &v2;
        v2 = &v3;
        v7 = sub_a0c8(&a0[7].padding_0[40]);
        v8 = sub_201a0(a0, v7, sub_6b08(&a0[7].padding_0[40]) + 1);
        v9 = sub_6b08(&a0[7].padding_0[40]);
        *a1 = v8;
        a1[1] = v9;
    }
    if (a0->field_80 != 279 && a0->field_80 != 269)
    {
        sub_c294(&a0[7].padding_0[40]);
    }
    else if (!(sub_b2b0(&a0[7].padding_0[40]) & 1))
    {
        v10 = sub_f8d0(a0);
        *(char *)&v16->field_0 = 0;
        v16->field_10 = 0;
        return v10;
    }
    v3 = &v2;
    v2 = &v3;
    v12 = sub_a0c8(&a0[7].padding_0[40]);
    v13 = sub_201a0(a0, v12, sub_6b08(&a0[7].padding_0[40]) + 1);
    v14 = sub_6b08(&a0[7].padding_0[40]);
    v15 = sub_f8d0(a0);
    v16->field_0 = v13;
    v16->field_8 = v14;
    v16->field_10 = 1;
    return v15;
}
