/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f2ec..0xc5f3d0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f2ec_1 {
    long long field_0;
    long long field_8;
} st_c5f2ec_1;

typedef struct st_c5f2ec_0 {
    struct st_c5f2ec_0 *field_0;
    unsigned long long field_8;
    struct st_c5f2ec_0 *field_10;
} st_c5f2ec_0;

typedef struct st_c5f2ec_2 {
    struct st_c5f2ec_0 *field_0;
    unsigned long long field_8;
    struct st_c5f2ec_0 *field_10;
    struct st_c5f2ec_3 *field_18;
} st_c5f2ec_2;

typedef struct st_c5f2ec_3 {
    struct st_c5f2ec_1 *field_0;
} st_c5f2ec_3;

extern long long g_efd110;

int sub_c5f2ec(st_c5f2ec_2 *a0)
{
    st_c5f2ec_0 *v6;  // x21
    unsigned long v7;  // x20
    st_c5f2ec_0 *v8;  // x22
    st_c5f2ec_0 *ptr;  // x0
    st_c5f2ec_0 *v0;  // [bp-0x60]
    st_c5f2ec_0 *v1;  // [bp-0x50]
    st_c5f2ec_0 *v2;  // [bp-0x48]
    st_c5f2ec_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_0;
    if (v6 == 0x8000000000000000)
    {
        v2 = CONCAT(1, 0);
        v3 = 0;
        sub_be769c(&v2, &g_efd110, *(long long *)*(long long *)a0->field_18, *(long long *)(*(long long *)a0->field_18 + 8));
        v0 = v2;
        v1 = v3;
        *(uint128_t *)&a0->field_0 = (uint128_t)v2;
        a0->field_10 = v3;
        v6 = a0->field_0;
    }
    v7 = a0->field_8;
    v8 = a0->field_10;
    a0->field_0 = 0;
    a0->field_8 = 1;
    a0->field_10 = 0;
    ptr = _malloc(24);
    if (ptr)
    {
        ptr->field_0 = v6;
        ptr->field_8 = v7;
        ptr->field_10 = v8;
        return (unsigned int)ptr;
    }
    sub_c6ba70(8, 24);
    __debugbreak();
}
