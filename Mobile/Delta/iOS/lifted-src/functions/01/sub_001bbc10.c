/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bbc10..0x1bbc88 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bbc10_1 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
} st_1bbc10_1;

typedef struct st_1bbc10_0 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
} st_1bbc10_0;

extern char g_e70800;

st_1bbc10_0 * sub_1bbc10(st_1bbc10_1 *a0)
{
    st_1bbc10_0 *v6;  // x0
    uint128_t v7;  // q0
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_1e5a4(&v3, 1);
    v2 = 1;
    v6->field_0 = &g_e70800;
    v7 = *(int128_t *)(a0->padding_0)[1];
    v0 = 0;
    v1 = &v3;
    *(long long *)((char *)&v6->field_8 + 8) = *(long long *)((char *)&a0->field_8 + 8);
    *(uint128_t *)&(&v6->field_0)[1] = v7;
    sub_2217c(&v0, 0);
    return v6;
}
