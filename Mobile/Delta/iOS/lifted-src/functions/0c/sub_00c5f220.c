/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f220..0xc5f2b4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f220_0 {
    long long field_0;
    unsigned long long field_8;
} st_c5f220_0;

typedef struct st_c5f220_2 {
    char padding_0[16];
    char field_10;
    char field_11;
} st_c5f220_2;

typedef struct st_c5f220_1 {
    struct st_c5f220_0 *field_0;
    long long field_8;
    struct st_c5f220_2 *field_10;
} st_c5f220_1;

extern long long g_efd158;
extern long long g_efd190;

void sub_c5f220(st_c5f220_1 *a0)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    long long v0;  // [bp-0x40], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x38]
    st_c5f220_1 *v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    if (!(a0->field_0->field_8 & 1))
    {
        v2 = a0;
        v0 = 0x8000000000000000;
        sub_c40110(&v0, &g_efd190, a0->field_8, a0->field_10->field_10, a0->field_10->field_11);
        __debugbreak();
    }
    v0 = a0->field_0->field_0;
    v1 = a0->field_0->field_8 >> 1;
    sub_c40110(&v0, &g_efd158, a0->field_8, a0->field_10->field_10, a0->field_10->field_11);
    if (v0 >= 1)
        _free(v1);
    __Unwind_Resume();
}
