/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c419c..0x1c4218 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c419c_1 {
    char padding_0[24];
    struct st_1c419c_0 *field_18;
} st_1c419c_1;

typedef struct st_1c419c_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
} st_1c419c_0;

extern char g_e70728;

st_1c419c_1 * sub_1c419c(st_1c419c_1 *a0, uint128_t *a1)
{
    st_1c419c_0 *v6;  // x0
    uint128_t v7;  // q0
    st_1c419c_0 *v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    a0->field_18 = 0;
    v6 = sub_166ec(&v3, 1);
    v2 = 1;
    v6->field_0 = &g_e70728;
    v7 = *a1;
    *(uint128_t *)((char *)&v6->field_8 + 8) = a1[1];
    v0 = 0;
    v1 = &v3;
    *(uint128_t *)&(&v6->field_0)[1] = v7;
    a0->field_18 = v6;
    sub_2217c(&v0, 0);
    return a0;
}
