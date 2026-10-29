/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81cf0..0x81d6c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81cf0_2 {
    struct st_81cf0_1 *field_0;
    struct st_81cf0_1 *field_8;
    char padding_10[56];
    unsigned int field_48;
    unsigned int field_4c;
} st_81cf0_2;

typedef struct st_81cf0_1 {
    char padding_0[6];
    unsigned short field_6;
} st_81cf0_1;

typedef struct st_81cf0_0 {
    char field_0;
} st_81cf0_0;


long long sub_81cf0(st_81cf0_2 *a0)
{
    st_81cf0_1 *v2;  // x11
    unsigned long v3;  // x8
    long long v4;  // x10
    unsigned long v5;  // x9
    unsigned short *v6;  // x11
    long long v7;  // x10
    unsigned short *v8;  // x11
    unsigned long v9;  // x13
    st_81cf0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_81cf0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    if (a0->field_8 == v2)
        return 0;
    v3 = 0;
    v4 = (long long)(a0->field_8 - v2) >> 3;
    v5 = a0->field_4c;
    if (1 >= (unsigned long long)v4)
        v4 = 1;
    v6 = &v2->field_6;
    do
    {
        v7 = v4;
        v8 = v6 + 4;
        v3 = v3 + *v6 + 3;
        if (!v5)
        {
            v9 = v3 + 0x10000;
            if (a0->field_48 == 2)
                v3 = v9;
        }
    } while ((v5 -= 1, v4 = v7 - 1, v6 = v8, v7 != 1));
    return v3;
}
