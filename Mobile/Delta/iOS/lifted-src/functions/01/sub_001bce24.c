/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bce24..0x1bce94 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bce24_1 {
    char padding_0[8];
    uint128_t field_8;
} st_1bce24_1;

typedef struct st_1bce24_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1bce24_0;

extern char g_e70608;

st_1bce24_0 * sub_1bce24(st_1bce24_1 *a0)
{
    st_1bce24_0 *v6;  // x0
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_10a00(&v3, 1);
    v2 = 1;
    v6->field_0 = &g_e70608;
    v0 = 0;
    v1 = &v3;
    *(int128_t *)&(&v6->field_0)[1] = *(int128_t *)(a0->padding_0)[1];
    sub_2217c(&v0, 0);
    return v6;
}
