/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49a218..0x49a360 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_49a218_1 {
    struct st_49a218_2 *field_0;
    struct st_49a218_2 *field_8;
    struct st_49a218_2 *field_10;
    struct st_49a218_2 *field_18;
} st_49a218_1;

typedef struct st_49a218_2 {
    unsigned long long field_0;
} st_49a218_2;

typedef struct st_49a218_0 {
    char field_0;
} st_49a218_0;

extern unsigned long long g_e80260;

st_49a218_1 * sub_49a218(st_49a218_1 *a0, unsigned long long *a1)
{
    unsigned long long *v6;  // x1
    st_49a218_1 *v7;  // x0
    unsigned long long *v8;  // x1
    unsigned long long *v9;  // x8
    unsigned long long *v10;  // q2
    unsigned long long *v11;  // q3
    st_49a218_1 *v12;  // x0
    st_49a218_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_49a218_0 *v1;  // [bp-0x68]
    unsigned long long *v2;  // [bp-0x60], Other Possible Types: char
    unsigned long long *v3;  // [bp-0x50]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_10;
    v7 = a0;
    if (v6 == v7->field_18)
    {
        if (a0->field_8 > a0->field_0)
            (g_e80260 - 0x12118200)();
        sub_ec54();
        v8 = a0->field_8;
        v9 = a0->field_10;
        sub_3dabd0(&v2, v8, (long long)(v9 + v8 + ((char *)v9 + (-v8 | ~v9) + (-v8 & ~v9)) * 2 + 2) >> 3);
        v10 = (unsigned long long *)*(int128_t *)&a0->field_0;
        v11 = (unsigned long long *)*(int128_t *)&a0->field_10;
        *(uint128_t *)&a0->field_0 = v2;
        *(uint128_t *)&a0->field_10 = (uint128_t)v3;
        v2 = v10;
        v3 = v11;
        v7 = sub_3db3b4(&v2);
        v6 = a0->field_10;
    }
    v12 = v7;
    *v6 = *a1;
    a0->field_10 = v6 + 1;
    return v12;
}
