/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bbad0..0x1bbc10 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bbad0_1 {
    char padding_0[40];
    struct st_1bbad0_2 *field_28;
} st_1bbad0_1;

typedef struct st_1bbad0_6 {
    unsigned long long field_0;
    struct st_1bbad0_3 *field_8;
    char field_10;
    char padding_11[7];
    uint128_t field_18;
} st_1bbad0_6;

typedef struct st_1bbad0_3 {
    unsigned long long field_0;
    struct st_1bbad0_3 *field_8;
    char field_10;
    char padding_11[7];
    uint128_t field_18;
    char field_28;
} st_1bbad0_3;

typedef struct st_1bbad0_4 {
    char padding_0[8];
    struct st_1bbad0_5 *field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[28];
    struct st_1bbad0_3 *field_38;
} st_1bbad0_4;

typedef struct st_1bbad0_2 {
    unsigned long long field_0;
} st_1bbad0_2;

typedef struct st_1bbad0_5 {
    struct st_1bbad0_1 *field_0;
} st_1bbad0_5;

typedef struct st_1bbad0_0 {
    char field_0;
} st_1bbad0_0;

extern char g_e6fbb8;
extern char g_e6fbe8;
extern char g_e6fc18;

double sub_1bbad0(st_1bbad0_4 *a0, char a1)
{
    unsigned long v4;  // x8
    st_1bbad0_3 *v5;  // x0
    st_1bbad0_3 *v6;  // x8
    st_1bbad0_3 *v7;  // x10
    unsigned long v8;  // d0
    st_1bbad0_3 *v9;  // x21
    st_1bbad0_3 *v10;  // x8
    st_1bbad0_1 **v11;  // q0
    st_1bbad0_6 *v12;  // x0
    st_1bbad0_3 *v13;  // x8
    st_1bbad0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bbad0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_18;
    if (!(v4 & 1))
    {
        if (!(v4 >> 3 & 1))
        {
            v5 = operatornew(24);
            v6 = a0->field_38;
            v7 = v6->field_8;
            v5->field_0 = &g_e6fc18;
            v5->field_8 = v7;
            v5->field_10 = a1;
            v6->field_8 = v5;
            a0->field_38 = v5;
            return v8;
        }
        v9 = operatornew(48);
        v10 = a0->field_38->field_8;
        v9->field_0 = &g_e6fbe8;
        v9->field_8 = v10;
        std::__1::locale::locale(&v9->field_10, a0);
        v11 = (st_1bbad0_1 **)*(int128_t *)&a0->field_8;
        *(uint128_t *)(v9->padding_11)[1] = (uint128_t)v11;
        *((char *)&v9->field_18 + 8) = a1;
        a0->field_38->field_8 = v9;
        a0->field_38 = v9;
        return (unsigned long long)v11;
    }
    v12 = operatornew(48);
    v13 = a0->field_38->field_8;
    v12->field_0 = &g_e6fbb8;
    v12->field_8 = v13;
    std::__1::locale::locale(&v12->field_10, a0);
    *(int128_t *)(v12->padding_11)[1] = *(int128_t *)&a0->field_8;
    (*(long long *)(*(long long *)a0->field_8 + 40))();
}
