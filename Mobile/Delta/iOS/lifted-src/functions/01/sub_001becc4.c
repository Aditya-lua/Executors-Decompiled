/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1becc4..0x1bed44 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1becc4_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_1becc4_0;

typedef struct st_1becc4_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_1becc4_1;

extern char g_e70848;

st_1becc4_0 * sub_1becc4(st_1becc4_1 *a0)
{
    st_1becc4_0 *v6;  // x0
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_174c0(&v3, 1);
    v2 = 1;
    v6->field_0 = &g_e70848;
    v7 = *(int128_t *)((char *)&a0->field_8 + 8);
    v8 = *(int128_t *)(a0->padding_0)[1];
    *(long long *)((char *)&v6->field_18 + 8) = *(long long *)((char *)&a0->field_18 + 8);
    v0 = 0;
    v1 = &v3;
    *(uint128_t *)&(&v6->field_0)[1] = v8;
    *(uint128_t *)((char *)&v6->field_8 + 8) = v7;
    sub_2217c(&v0, 0);
    return v6;
}
